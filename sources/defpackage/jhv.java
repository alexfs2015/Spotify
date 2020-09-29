package defpackage;

import android.content.Context;

/* renamed from: jhv reason: default package */
public final class jhv implements vua<jhu> {
    private final wlc<Context> a;
    private final wlc<hgi> b;

    private jhv(wlc<Context> wlc, wlc<hgi> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jhv a(wlc<Context> wlc, wlc<hgi> wlc2) {
        return new jhv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new jhu((Context) this.a.get(), (hgi) this.b.get());
    }
}
