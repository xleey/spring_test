package beforeAfter;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    public void getMessage() {
        System.out.println("我的消息是："+message);
    }
    public void init(){
        System.out.println("HelloWorld类初始化");
    }
    public void destroy(){
        System.out.println("HelloWorld类实体销毁");
    }
}
