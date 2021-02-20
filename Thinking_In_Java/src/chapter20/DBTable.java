package chapter20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
public @interface DBTable {
    public String name() default "";
}
