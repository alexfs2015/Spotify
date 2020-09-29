package defpackage;

import android.content.Context;

/* renamed from: riz reason: default package */
public final class riz implements wig<riy> {
    private final wzi<Context> a;

    private riz(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static riz a(wzi<Context> wzi) {
        return new riz(wzi);
    }

    public final /* synthetic */ Object get() {
        return new riy((Context) this.a.get());
    }
}
