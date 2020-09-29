package defpackage;

import android.text.Layout.Alignment;

/* renamed from: bbc reason: default package */
final class bbc {
    String a;
    int b;
    boolean c;
    int d;
    boolean e;
    int f = -1;
    int g = -1;
    int h = -1;
    int i = -1;
    int j = -1;
    float k;
    String l;
    Alignment m;

    public final int a() {
        if (this.h == -1 && this.i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = this.h == 1 ? 1 : 0;
        if (this.i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public final bbc a(int i2) {
        bdl.b(true);
        this.b = i2;
        this.c = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public bbc a(bbc bbc, boolean z) {
        if (bbc != null) {
            if (!this.c && bbc.c) {
                a(bbc.b);
            }
            if (this.h == -1) {
                this.h = bbc.h;
            }
            if (this.i == -1) {
                this.i = bbc.i;
            }
            if (this.a == null) {
                this.a = bbc.a;
            }
            if (this.f == -1) {
                this.f = bbc.f;
            }
            if (this.g == -1) {
                this.g = bbc.g;
            }
            if (this.m == null) {
                this.m = bbc.m;
            }
            if (this.j == -1) {
                this.j = bbc.j;
                this.k = bbc.k;
            }
            if (!this.e && bbc.e) {
                b(bbc.d);
            }
        }
        return this;
    }

    public final bbc a(boolean z) {
        bdl.b(true);
        this.f = z ? 1 : 0;
        return this;
    }

    public final bbc b(int i2) {
        this.d = i2;
        this.e = true;
        return this;
    }

    public final bbc b(boolean z) {
        bdl.b(true);
        this.g = z ? 1 : 0;
        return this;
    }
}
