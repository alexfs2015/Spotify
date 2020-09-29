package com.airbnb.lottie.model.content;

public final class Mask {
    public final MaskMode a;
    public final zk b;
    public final zg c;

    public enum MaskMode {
        MaskModeAdd,
        MaskModeSubtract,
        MaskModeIntersect
    }

    public Mask(MaskMode maskMode, zk zkVar, zg zgVar) {
        this.a = maskMode;
        this.b = zkVar;
        this.c = zgVar;
    }
}
