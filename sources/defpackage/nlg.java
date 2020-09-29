package defpackage;

import android.content.Context;

/* renamed from: nlg reason: default package */
public final class nlg implements wig<Boolean> {
    private final wzi<Context> a;

    private nlg(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static nlg a(wzi<Context> wzi) {
        return new nlg(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jvi.c((Context) this.a.get()));
    }
}
