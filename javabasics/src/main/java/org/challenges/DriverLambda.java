package org.challenges;

public class DriverLambda {

    public void greet(Greeter greeter){
        greeter.perform();
    }

    public static void main(String[] args) {

        Greeter greeterWithLamda = () -> System.out.println("Hello World!");

        Greeter greeterWithAnonymous = new Greeter(){
            public void perform(){
                System.out.println("Hello World!");
            }
        };

        greeterWithAnonymous.perform();
        greeterWithLamda.perform();

        DriverLambda driverLambda = new DriverLambda();
        driverLambda.greet(greeterWithAnonymous);
        driverLambda.greet(greeterWithLamda);

    }

}
