package defpackage;

import com.google.android.gms.internal.ads.zzae;

/* renamed from: dnf reason: default package */
public final class dnf implements cdj {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public dnf() {
        this(0);
    }

    private dnf(byte b2) {
        this.a = 2500;
        this.c = 1;
        this.d = 1.0f;
    }

    public final int a() {
        return this.a;
    }

    public final void a(zzae zzae) {
        boolean z = true;
        this.b++;
        int i = this.a;
        this.a = (int) (((float) i) + ((float) i));
        if (this.b > 1) {
            z = false;
        }
        if (!z) {
            throw zzae;
        }
    }

    public final int b() {
        return this.b;
    }
}
