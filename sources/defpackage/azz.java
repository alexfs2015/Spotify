package defpackage;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;

/* renamed from: azz reason: default package */
public class azz {
    public final CharSequence a;
    public final float b;
    public final float c;
    private Alignment d;
    private Bitmap e;
    private int f;
    private int g;
    private int h;
    private float i;
    private float j;
    private boolean k;
    private int l;
    private int m;
    private float n;

    public azz(Bitmap bitmap, float f2, int i2, float f3, int i3, float f4, float f5) {
        this(null, null, bitmap, f3, 0, 0, f2, 0, Integer.MIN_VALUE, Float.MIN_VALUE, f4, f5, false, -16777216);
    }

    public azz(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public azz(CharSequence charSequence, Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, f2, i2, i3, f3, i4, f4, false, -16777216);
    }

    public azz(CharSequence charSequence, Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, int i5, float f5) {
        this(charSequence, null, null, f2, i2, i3, f3, Integer.MIN_VALUE, i5, f5, f4, Float.MIN_VALUE, false, -16777216);
    }

    public azz(CharSequence charSequence, Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5) {
        this(charSequence, alignment, null, f2, i2, i3, f3, i4, Integer.MIN_VALUE, Float.MIN_VALUE, f4, Float.MIN_VALUE, z, i5);
    }

    private azz(CharSequence charSequence, Alignment alignment, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6) {
        this.a = charSequence;
        this.d = alignment;
        this.e = bitmap;
        this.b = f2;
        this.f = i2;
        this.g = i3;
        this.c = f3;
        this.h = i4;
        this.i = f5;
        this.j = f6;
        this.k = z;
        this.l = i6;
        this.m = i5;
        this.n = f4;
    }
}
