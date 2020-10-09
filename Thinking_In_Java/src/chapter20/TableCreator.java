package chapter20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现注解处理器
 * @author wuliang
 * @date 2020/8/12
 */
public class TableCreator {


    /**
     *  instanceof判断这些注解是否为指定类型，比如是否为@SQLInteger或者@SQLstring
     *  instanceof是检查引用变量是否有给定类型对象的引用关键字
     */
    public static void main(String[]args) throws Exception{

        if(args.length < 1){
            System.out.println("arguments : annotated classes");
            System.exit(0);
        }

        for(String className : args){

            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if(dbTable == null){
                System.out.println("No DBTable annotations in class"+className);
                continue;
            }
            String tableName = dbTable.name();
            if(tableName.length() < 1){
                tableName = cl.getName().toUpperCase();
            }
            List<String> columnDefs = new ArrayList<String>();
            for(Field field : cl.getFields()){
                String columnName = null;
                Annotation[] annotations = field.getDeclaredAnnotations();
                if ((annotations.length < 1)){
                    continue;
                }

                if (annotations[0] instanceof SQLInteger){
                    SQLInteger sqlInteger = (SQLInteger) annotations[0];

                    if (sqlInteger.name().length() < 1){
                        columnName = field.getName().toUpperCase();
                    }
                    else {
                        columnName = sqlInteger.name();
                    }
                    columnDefs.add(columnName + "INT" + getConstraints(sqlInteger.constraints()));
                }

                if(annotations[0] instanceof SQLString){
                    SQLString sqlString = (SQLString) annotations[0];
                    if(sqlString.name().length() < 1){
                        columnName = field.getName().toUpperCase();
                    }
                    else{
                        columnName = sqlString.name();
                        columnDefs.add(columnName + "VARCHAR("+sqlString.value()+")"+
                                getConstraints(sqlString.constraints()));
                    }

                    StringBuffer createCommand = new StringBuffer(
                            "CREATE TABLE"+tableName + "("
                    );

                    for (String columnDef : columnDefs){
                        createCommand.append("" +
                                "n      " +columnDef+",");
                    }

                    String tableCreate = createCommand.substring(
                            0,createCommand.length()-1)+")";
                    System.out.println("Table Creation SQL for "+className+" is :\n"+tableCreate);
                }
            }
        }
    }

    private static String getConstraints(Constraints con){
        String constraints = "";
        if(!con.allowNull()){
            constraints += "NOT NULL";
        }
        if(con.primaryKey()){
            constraints += "PRIMARY KEY";
        }
        if(con.unique()){
            constraints += "UNIQUE";
        }
        return constraints;
    }
}
