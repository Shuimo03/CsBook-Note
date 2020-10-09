public class Test {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        while(true){
            boolean isFlag = myThread.isFlag();
            if(isFlag == true){
                System.out.println("success");
            }
        }
    }
}

class MyThread implements Runnable{

    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag = "  + flag);
    }
}