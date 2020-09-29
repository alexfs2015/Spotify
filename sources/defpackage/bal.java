package defpackage;

import android.text.Layout.Alignment;

/* renamed from: bal reason: default package */
final class bal {
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

    public final bal a(boolean z) {
        bcu.b(true);
        this.f = z ? 1 : 0;
        return this;
    }

    public final bal b(boolean z) {
        bcu.b(true);
        this.g = z ? 1 : 0;
        return this;
    }

    public final bal a(int i2) {
        bcu.b(true);
        this.b = i2;
        this.c = true;
        return this;
    }

    public final bal b(int i2) {
        this.d = i2;
        this.e = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public bal a(bal bal, boolean z) {
        if (bal != null) {
            if (!this.c && bal.c) {
                a(bal.b);
            }
            if (this.h == -1) {
                this.h = bal.h;
            }
            if (this.i == -1) {
                this.i = bal.i;
            }
            if (this.a == null) {
                this.a = bal.a;
            }
            if (this.f == -1) {
                this.f = bal.f;
            }
            if (this.g == -1) {
                this.g = bal.g;
            }
            if (this.m == null) {
                this.m = bal.m;
            }
            if (this.j == -1) {
                this.j = bal.j;
                this.k = bal.k;
            }
            if (!this.e && bal.e) {
                b(bal.d);
            }
        }
        return this;
    }
}
