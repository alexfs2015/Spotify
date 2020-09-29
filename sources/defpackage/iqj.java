package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.Response;

/* renamed from: iqj reason: default package */
public final class iqj implements vua<CollectionStateProvider> {
    private final wlc<gky<Response>> a;
    private final wlc<rnf> b;

    private iqj(wlc<gky<Response>> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static iqj a(wlc<gky<Response>> wlc, wlc<rnf> wlc2) {
        return new iqj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new CollectionStateProvider((gky) this.a.get(), (rnf) this.b.get());
    }
}
