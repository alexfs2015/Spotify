package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

/* renamed from: iqd reason: default package */
public final class iqd implements vua<iqa> {
    private final wlc<CollectionStateProvider> a;
    private final wlc<iqf> b;
    private final wlc<sih> c;

    private iqd(wlc<CollectionStateProvider> wlc, wlc<iqf> wlc2, wlc<sih> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static iqd a(wlc<CollectionStateProvider> wlc, wlc<iqf> wlc2, wlc<sih> wlc3) {
        return new iqd(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new iqa((CollectionStateProvider) this.a.get(), (iqf) this.b.get(), (sih) this.c.get());
    }
}
