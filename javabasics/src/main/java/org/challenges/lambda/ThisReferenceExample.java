package org.challenges.lambda;


public class ThisReferenceExample {

    public void doProcess(int a, Process P) {
        P.process(a);
    }


    public void doExecute(){
        doProcess(10, i -> {
            System.out.println(i);
            //this will work here in class member context and will refer to class ThisReferenceExample not Process
            System.out.println(this);
        });

    }

    @Override
    public String toString() {
        return "ThisReferenceExample{}";
    }

    public static void main(String[] args) {

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int a) {
                System.out.println(a);
                //we are using the this reference in anonymous class which will return the toString() return value
                //anonymous class overrides the this reference to its own value
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "this is anonymous inner class";
            }
        });



        thisReferenceExample.doProcess(10, i -> {
            System.out.println(i);
            //non compiling code,cannot use this in lambda,since it is not overriden and the context is still static
            //in this case hence this cannot be invoked from static context
            //System.out.println(this);
        });

        thisReferenceExample.doExecute();

    }

    private interface Process {
        public void process(int a);
    }
}
