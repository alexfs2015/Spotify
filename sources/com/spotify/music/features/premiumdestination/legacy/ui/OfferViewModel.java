package com.spotify.music.features.premiumdestination.legacy.ui;

public final class OfferViewModel {
    public final OfferType a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public enum OfferType {
        PREMIUM,
        STUDENT,
        FAMILY
    }

    public OfferViewModel(OfferType offerType, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = offerType;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
    }
}
