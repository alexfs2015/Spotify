package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

/* renamed from: iqc reason: default package */
public final class iqc implements vua<iqb> {
    private final wlc<CollectionStateProvider> a;
    private final wlc<iqf> b;

    private iqc(wlc<CollectionStateProvider> wlc, wlc<iqf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static iqc a(wlc<CollectionStateProvider> wlc, wlc<iqf> wlc2) {
        return new iqc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new iqb(this.a, this.b);
    }
}
