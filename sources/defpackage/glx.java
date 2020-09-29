package defpackage;

import android.os.Parcelable;

/* renamed from: glx reason: default package */
public final class glx<T extends Parcelable> {
    public final T a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public glx(T t, long j, long j2, int i, String str) {
        fay.a(t);
        boolean z = true;
        fay.b(j > 0);
        fay.b(j2 >= j);
        if (i <= 0) {
            z = false;
        }
        fay.b(z);
        fay.a(str);
        this.a = t;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = str;
    }
}
