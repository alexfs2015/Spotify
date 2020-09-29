package defpackage;

import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;

/* renamed from: hul reason: default package */
public final class hul implements vua<huk> {
    private final wlc<wud<OfflineProgressModel>> a;
    private final wlc<wug> b;

    private hul(wlc<wud<OfflineProgressModel>> wlc, wlc<wug> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hul a(wlc<wud<OfflineProgressModel>> wlc, wlc<wug> wlc2) {
        return new hul(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new huk((wud) this.a.get(), (wug) this.b.get());
    }
}
