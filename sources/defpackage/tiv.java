package defpackage;

import com.spotify.music.ondemandsharing.OnDemandSharingUtils;

/* renamed from: tiv reason: default package */
public final class tiv implements vua<tiu> {
    private final wlc<guz> a;
    private final wlc<OnDemandSharingUtils> b;

    private tiv(wlc<guz> wlc, wlc<OnDemandSharingUtils> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tiv a(wlc<guz> wlc, wlc<OnDemandSharingUtils> wlc2) {
        return new tiv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tiu((guz) this.a.get(), (OnDemandSharingUtils) this.b.get());
    }
}
