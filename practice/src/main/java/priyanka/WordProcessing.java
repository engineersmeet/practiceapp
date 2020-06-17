package priyanka;

import com.pravin.lede.gl.practice.Pravin.NumberGeneratorStatusListener;

public class WordProcessing {
    String sentence;

    WordGeneratorStatusListener listener;

    public WordProcessing(String sentence) {
        this.sentence = sentence;
    }

    public void SetListener(WordGeneratorStatusListener listener) {
        this.listener = listener;
    }

    public void generateWord() {
        listener.onStart();
        String[] word = sentence.split(" ");
        for (String w : word) {
            listener.progress(w);
        }
        listener.onComplete();

    }
}
