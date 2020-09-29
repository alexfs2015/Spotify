package defpackage;

import android.os.Parcelable;

/* renamed from: gnm reason: default package */
public final class gnm<T extends Parcelable> {
    public final T a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public gnm(T t, long j, long j2, int i, String str) {
        fbp.a(t);
        boolean z = true;
        fbp.b(j > 0);
        fbp.b(j2 >= j);
        if (i <= 0) {
            z = false;
        }
        fbp.b(z);
        fbp.a(str);
        this.a = t;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = str;
    }
}
