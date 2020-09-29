package defpackage;

import com.spotify.music.ondemandsharing.OnDemandSharingUtils;

/* renamed from: tiq reason: default package */
public final class tiq implements vua<OnDemandSharingUtils> {
    private final wlc<tis> a;

    private tiq(wlc<tis> wlc) {
        this.a = wlc;
    }

    public static tiq a(wlc<tis> wlc) {
        return new tiq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new OnDemandSharingUtils((tis) this.a.get());
    }
}
