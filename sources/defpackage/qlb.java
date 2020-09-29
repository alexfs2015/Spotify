package defpackage;

import android.content.Context;

/* renamed from: qlb reason: default package */
public final class qlb implements wig<qla> {
    private final wzi<Context> a;
    private final wzi<qlc> b;

    private qlb(wzi<Context> wzi, wzi<qlc> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qlb a(wzi<Context> wzi, wzi<qlc> wzi2) {
        return new qlb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qla((Context) this.a.get(), (qlc) this.b.get());
    }
}
