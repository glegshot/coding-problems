package org.challenges;

public class DriverLambda {

    public void greet(Greeter greeter){
        greeter.perform();
    }

    public static void main(String[] args) {

        //lambda expression
        Greeter greeterWithLamda = () -> System.out.println("Hello World!");

        //anonymous inner class implementaion
        Greeter greeterWithAnonymous = new Greeter(){
            public void perform(){
                System.out.println("Hello World!");
            }
        };

        //invoking anonymous inner class instance method
        greeterWithAnonymous.perform();
        //invoking lambda function
        greeterWithLamda.perform();

        //example of passing anonymous class instance and lambda function as parameter
        DriverLambda driverLambda = new DriverLambda();
        driverLambda.greet(greeterWithAnonymous);
        driverLambda.greet(greeterWithLamda);

    }

}
