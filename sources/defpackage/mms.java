package defpackage;

import android.content.Context;

/* renamed from: mms reason: default package */
public final class mms implements wig<mmr> {
    private final wzi<Context> a;
    private final wzi<mmo> b;

    private mms(wzi<Context> wzi, wzi<mmo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mms a(wzi<Context> wzi, wzi<mmo> wzi2) {
        return new mms(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mmr((Context) this.a.get(), (mmo) this.b.get());
    }
}
