package com.company;

public class forLoop {

/*    public void countDown() {

         do {
            counter--;
            System.out.println("Count: " + counter);
        }
        while (counter > 0);

        int counter;
        for (counter = 10; counter > 0; counter--) {
            System.out.println("Counter: " + counter);
        }
        System.out.println(counter);
    }*/
int counter;
    public void loop1 () {
        for (counter = 0; counter <= 9; counter++) {
            System.out.println("Counter: " + counter);
        }
    }

    public void loop2 (){
        for (counter = 1; counter <=10; counter++){
            System.out.println("Counter: " + counter);
        }
    }

    public void loop3 (){
        for (counter = 0; counter <=11; counter++){
            System.out.println("Counter: " + counter);
        }
    }

    public void loop4 (){
        for(counter = 10; counter >= 0; counter--){
            System.out.println("Counter: " + counter);
        }
        System.out.println("Liftoff");
    }

    public void loop5(){
        for (counter = 1;counter<=19;counter = counter + 2){
            System.out.println("Counter: " + counter);
        }
    }

    public void loop6(){
    for (counter = 1; counter <= 16777216; counter *= 2){
        System.out.println("Counter: " + counter);
    }
    }

    public void loop7(){
        for (counter = 111; counter <= 138; counter += 3){
            System.out.println("Counter: " + counter);
        }
    }

    public void loop8(){
        for (counter = 100; counter >= 0; counter -= 10){
            System.out.println("Counter: " + counter);
        }
    }

    public void loop9(){
        for (counter = 999; counter >= 0; counter -= 11){
            System.out.println("Counter: " + counter);
        }
    }
    public static void main(String[] args) {
        forLoop obj = new forLoop();
//        obj.loop1();
//        obj.loop2();
//        obj.loop3();
//        obj.loop4();
//        obj.loop5();
//        obj.loop6();
//        obj.loop7();
//        obj.loop8();
        obj.loop9();



    }
}
