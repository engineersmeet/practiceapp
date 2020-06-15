package com.pravin.lede.gl.practice.Pravin;

public interface NumberGeneratorStatusListener {

    void onStart();

    void onComplete();

    void progress(int number);

}
