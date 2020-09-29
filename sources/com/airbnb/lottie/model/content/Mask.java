package com.airbnb.lottie.model.content;

public final class Mask {
    public final MaskMode a;
    public final zy b;
    public final zu c;

    public enum MaskMode {
        MaskModeAdd,
        MaskModeSubtract,
        MaskModeIntersect
    }

    public Mask(MaskMode maskMode, zy zyVar, zu zuVar) {
        this.a = maskMode;
        this.b = zyVar;
        this.c = zuVar;
    }
}
