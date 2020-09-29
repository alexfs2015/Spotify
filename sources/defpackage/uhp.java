package defpackage;

import android.content.Context;

/* renamed from: uhp reason: default package */
public final class uhp implements wig<uho> {
    private final wzi<Context> a;

    private uhp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static uhp a(wzi<Context> wzi) {
        return new uhp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uho((Context) this.a.get());
    }
}
