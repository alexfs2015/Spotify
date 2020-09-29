package defpackage;

import com.google.android.gms.internal.ads.zzae;

/* renamed from: ecs reason: default package */
public final class ecs<T> {
    public final T a;
    public final dif b;
    public final zzae c;
    public boolean d;

    ecs(zzae zzae) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = zzae;
    }

    private ecs(T t, dif dif) {
        this.d = false;
        this.a = t;
        this.b = dif;
        this.c = null;
    }

    public static <T> ecs<T> a(T t, dif dif) {
        return new ecs<>(t, dif);
    }
}
