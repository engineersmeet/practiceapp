package priyanka;

import com.pravin.lede.gl.practice.Pravin.NumberGeneratorStatusListener;
import com.pravin.lede.gl.practice.Pravin.NumberProcessing;

public class Task {
    public static void main(String[] a){
        WordGeneratorStatusListener listener = new WordGeneratorStatusListener() {
            @Override
            public void onStart() {
                System.out.println("Word processing has started..");
            }

            @Override
            public void onComplete() {
                System.out.println("Word processing has finished..");
            }

            @Override
            public void progress(String word) {
                System.out.println("Currently processing word is: " + word);
            }
        };

        WordProcessing processing =  new WordProcessing("I am Priyanka");

        processing.SetListener(listener);

        processing.generateWord();

    }

}


