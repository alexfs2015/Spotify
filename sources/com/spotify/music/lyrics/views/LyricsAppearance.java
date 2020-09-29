package com.spotify.music.lyrics.views;

public enum LyricsAppearance {
    FULLSCREEN(2132017669, 32),
    WIDGET(2132017669, 32),
    LYRICS_CJK(2132017669, 40);
    
    public final int mLineHeight;
    public final int mTextStyle;

    private LyricsAppearance(int i, int i2) {
        this.mTextStyle = i;
        this.mLineHeight = i2;
    }
}
