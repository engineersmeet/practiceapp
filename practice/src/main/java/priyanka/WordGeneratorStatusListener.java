package priyanka;

public interface WordGeneratorStatusListener {
    void onStart();

    void onComplete();

    void progress(String word);

}
