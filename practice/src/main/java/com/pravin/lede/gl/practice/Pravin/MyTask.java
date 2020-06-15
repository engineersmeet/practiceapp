package com.pravin.lede.gl.practice.Pravin;

public class MyTask {

    public static void main(String[] a){

        NumberGeneratorStatusListener listener = new NumberGeneratorStatusListener() {
            @Override
            public void onStart() {
                System.out.println("Number processing has started..");
            }

            @Override
            public void onComplete() {
                System.out.println("Number processing has completed..");
            }

            @Override
            public void progress(int number) {
                System.out.println("Number currently processing is "+ number);
            }
        };

        NumberProcessing processing =  new NumberProcessing(0, 10);

        processing.SetListener(listener);

        processing.generateNumber();

    }

}
