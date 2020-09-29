package defpackage;

import android.content.Context;

/* renamed from: mvh reason: default package */
public final class mvh implements vua<mvg> {
    private final wlc<Context> a;

    private mvh(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static mvh a(wlc<Context> wlc) {
        return new mvh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mvg((Context) this.a.get());
    }
}
