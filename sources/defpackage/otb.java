package defpackage;

import android.content.Context;

/* renamed from: otb reason: default package */
public final class otb implements wig<osz> {
    private final wzi<Context> a;

    private otb(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static otb a(wzi<Context> wzi) {
        return new otb(wzi);
    }

    public final /* synthetic */ Object get() {
        return new osz((Context) this.a.get());
    }
}
