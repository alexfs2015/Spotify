package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsLoaderImpl;

/* renamed from: qzd reason: default package */
public final class qzd implements vua<RecsLoaderImpl> {
    private final wlc<gkz> a;
    private final wlc<rnf> b;

    private qzd(wlc<gkz> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qzd a(wlc<gkz> wlc, wlc<rnf> wlc2) {
        return new qzd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new RecsLoaderImpl((gkz) this.a.get(), (rnf) this.b.get());
    }
}
