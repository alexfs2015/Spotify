package defpackage;

import android.os.Bundle;

/* renamed from: mxi reason: default package */
public final class mxi implements vua<Boolean> {
    private final wlc<mwg> a;

    private mxi(wlc<mwg> wlc) {
        this.a = wlc;
    }

    public static mxi a(wlc<mwg> wlc) {
        return new mxi(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Bundle) fay.a(((mwg) this.a.get()).i)).getBoolean("is_autoplay_uri"));
    }
}
