package test.TestException;
public class TestException1 {
    /**
     *异常可以作为一种信息传递机制,在service层抛出,在controller层捕获
     * */
    public static void main(String[]args){
        try {
            f();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{}
    }

    public static  void f() throws Exception{
        if(1>0){
            throw new RuntimeException("你好");
        }
    }

}
