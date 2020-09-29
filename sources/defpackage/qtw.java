package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader;

/* renamed from: qtw reason: default package */
public final class qtw implements vua<BansLoader> {
    private final wlc<gkz> a;

    private qtw(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static qtw a(wlc<gkz> wlc) {
        return new qtw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new BansLoader((gkz) this.a.get());
    }
}
