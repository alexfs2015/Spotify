package defpackage;

import android.content.Context;

/* renamed from: shh reason: default package */
public final class shh implements wig<shg> {
    private final wzi<Context> a;

    private shh(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static shh a(wzi<Context> wzi) {
        return new shh(wzi);
    }

    public final /* synthetic */ Object get() {
        return new shg((Context) this.a.get());
    }
}
