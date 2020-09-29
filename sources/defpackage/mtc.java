package defpackage;

import android.os.Bundle;

/* renamed from: mtc reason: default package */
public final class mtc implements vua<String> {
    private final wlc<msm> a;

    private mtc(wlc<msm> wlc) {
        this.a = wlc;
    }

    public static mtc a(wlc<msm> wlc) {
        return new mtc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Bundle) fay.a(((msm) this.a.get()).i)).getString("autoplay_track_uri", ""), "Cannot return null from a non-@Nullable @Provides method");
    }
}
