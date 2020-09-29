package defpackage;

import com.spotify.music.ondemandsharing.OnDemandSharingUtils;

/* renamed from: ttn reason: default package */
public final class ttn implements wig<ttm> {
    private final wzi<gwz> a;
    private final wzi<OnDemandSharingUtils> b;

    private ttn(wzi<gwz> wzi, wzi<OnDemandSharingUtils> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ttn a(wzi<gwz> wzi, wzi<OnDemandSharingUtils> wzi2) {
        return new ttn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ttm((gwz) this.a.get(), (OnDemandSharingUtils) this.b.get());
    }
}
