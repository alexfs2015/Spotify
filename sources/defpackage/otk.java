package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: otk reason: default package */
public final class otk implements vua<Boolean> {
    private final wlc<Context> a;

    private otk(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static otk a(wlc<Context> wlc) {
        return new otk(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!jtc.c((Context) this.a.get()) && VERSION.SDK_INT >= 23);
    }
}
