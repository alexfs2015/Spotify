package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader;

/* renamed from: qtv reason: default package */
public final class qtv implements vua<qtu> {
    private final wlc<BansLoader> a;

    private qtv(wlc<BansLoader> wlc) {
        this.a = wlc;
    }

    public static qtv a(wlc<BansLoader> wlc) {
        return new qtv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qtu((BansLoader) this.a.get());
    }
}
