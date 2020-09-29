package defpackage;

import android.content.Context;

/* renamed from: tvg reason: default package */
public final class tvg implements vua<tvf> {
    private final wlc<Context> a;

    private tvg(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tvg a(wlc<Context> wlc) {
        return new tvg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tvf((Context) this.a.get());
    }
}
