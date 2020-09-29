package defpackage;

import android.content.Context;

/* renamed from: tki reason: default package */
public final class tki implements vua<tkh> {
    private final wlc<Context> a;

    private tki(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tki a(wlc<Context> wlc) {
        return new tki(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tkh((Context) this.a.get());
    }
}
