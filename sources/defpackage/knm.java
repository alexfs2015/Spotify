package defpackage;

import android.os.Looper;

/* renamed from: knm reason: default package */
public final class knm extends knl {
    private knm() {
        super(Looper.getMainLooper());
    }

    public static knm a() {
        return new knm();
    }
}
