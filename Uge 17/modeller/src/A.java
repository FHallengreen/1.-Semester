public class A {

    public boolean start(){
        B b = new B();
        b.doThis(10);
        callMe(20);
        return true;
    }

    public void callMe(int value){
        System.out.println(value);
    }
}
