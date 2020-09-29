package defpackage;

import android.content.Context;

/* renamed from: otx reason: default package */
public final class otx implements vua<otw> {
    private final wlc<Context> a;

    private otx(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static otx a(wlc<Context> wlc) {
        return new otx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new otw((Context) this.a.get());
    }
}
