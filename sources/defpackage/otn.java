package defpackage;

import android.content.Context;

/* renamed from: otn reason: default package */
public final class otn implements wig<otm> {
    private final wzi<Context> a;

    private otn(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static otn a(wzi<Context> wzi) {
        return new otn(wzi);
    }

    public final /* synthetic */ Object get() {
        return new otm((Context) this.a.get());
    }
}
