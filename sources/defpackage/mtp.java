package defpackage;

import android.os.Bundle;

/* renamed from: mtp reason: default package */
public final class mtp implements vua<Boolean> {
    private final wlc<msm> a;

    private mtp(wlc<msm> wlc) {
        this.a = wlc;
    }

    public static mtp a(wlc<msm> wlc) {
        return new mtp(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Bundle) fay.a(((msm) this.a.get()).i)).getBoolean("is_autoplay_uri"));
    }
}
