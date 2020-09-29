package defpackage;

import com.google.android.gms.internal.ads.zzae;

/* renamed from: ecb reason: default package */
public final class ecb<T> {
    public final T a;
    public final dho b;
    public final zzae c;
    public boolean d;

    ecb(zzae zzae) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = zzae;
    }

    private ecb(T t, dho dho) {
        this.d = false;
        this.a = t;
        this.b = dho;
        this.c = null;
    }

    public static <T> ecb<T> a(T t, dho dho) {
        return new ecb<>(t, dho);
    }
}
