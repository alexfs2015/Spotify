package defpackage;

import android.os.Handler;

/* renamed from: ihd reason: default package */
public final class ihd implements vua<ihc> {
    private final wlc<Handler> a;

    private ihd(wlc<Handler> wlc) {
        this.a = wlc;
    }

    public static ihd a(wlc<Handler> wlc) {
        return new ihd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ihc((Handler) this.a.get());
    }
}
