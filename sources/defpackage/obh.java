package defpackage;

import android.content.Context;

/* renamed from: obh reason: default package */
public final class obh implements wig<obg> {
    private final wzi<Context> a;

    private obh(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static obh a(wzi<Context> wzi) {
        return new obh(wzi);
    }

    public final /* synthetic */ Object get() {
        return new obg((Context) this.a.get());
    }
}
