package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: par reason: default package */
public final class par implements wig<Boolean> {
    private final wzi<Context> a;

    private par(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static par a(wzi<Context> wzi) {
        return new par(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!jvi.c((Context) this.a.get()) && VERSION.SDK_INT >= 23);
    }
}
