package defpackage;

import android.content.Context;

/* renamed from: uml reason: default package */
public final class uml implements wig<umk> {
    private final wzi<Context> a;

    private uml(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static uml a(wzi<Context> wzi) {
        return new uml(wzi);
    }

    public final /* synthetic */ Object get() {
        return new umk((Context) this.a.get());
    }
}
