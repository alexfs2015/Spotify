package defpackage;

import android.content.Context;

/* renamed from: pld reason: default package */
public final class pld implements wig<plc> {
    private final wzi<gwt> a;
    private final wzi<gwm> b;
    private final wzi<itf> c;
    private final wzi<Context> d;

    private pld(wzi<gwt> wzi, wzi<gwm> wzi2, wzi<itf> wzi3, wzi<Context> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pld a(wzi<gwt> wzi, wzi<gwm> wzi2, wzi<itf> wzi3, wzi<Context> wzi4) {
        return new pld(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new plc((gwt) this.a.get(), (gwm) this.b.get(), (itf) this.c.get(), (Context) this.d.get());
    }
}
