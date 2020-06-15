package com.pravin.lede.gl.practice.Pravin;

public class NumberProcessing {

    int startNumber;
    int endNumber;

    NumberGeneratorStatusListener listener;

    public NumberProcessing(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public void SetListener(NumberGeneratorStatusListener listener){
        this.listener = listener;
    }

    public void generateNumber() {

        for (int i = startNumber; i <= endNumber; i++) {

            if(i==startNumber){
                listener.onStart();
            }else if(i==endNumber){
                listener.onComplete();
            }else {
                listener.progress(i);
            }

        }

    }

}
