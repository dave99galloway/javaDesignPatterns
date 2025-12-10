package com.designpatterns.structural.adapter;

/**
 * Adaptee interface for advanced media players.
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);

    void playMp4(String fileName);
}
