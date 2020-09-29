package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

/* renamed from: riy reason: default package */
public final class riy implements vua<rix> {
    private final wlc<Picasso> a;
    private final wlc<HubsGlueImageDelegate> b;

    private riy(wlc<Picasso> wlc, wlc<HubsGlueImageDelegate> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static riy a(wlc<Picasso> wlc, wlc<HubsGlueImageDelegate> wlc2) {
        return new riy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rix((Picasso) this.a.get(), (HubsGlueImageDelegate) this.b.get());
    }
}
