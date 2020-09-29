package defpackage;

import android.content.Context;

/* renamed from: tgm reason: default package */
public final class tgm implements wig<tgl> {
    private final wzi<Context> a;
    private final wzi<hit> b;

    private tgm(wzi<Context> wzi, wzi<hit> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tgm a(wzi<Context> wzi, wzi<hit> wzi2) {
        return new tgm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tgl((Context) this.a.get(), (hit) this.b.get());
    }
}
