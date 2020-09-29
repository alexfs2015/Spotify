package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

/* renamed from: lxa reason: default package */
public final class lxa implements vua<luz> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<HubsGlueImageDelegate> c;

    private lxa(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<HubsGlueImageDelegate> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lxa a(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<HubsGlueImageDelegate> wlc3) {
        return new lxa(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (luz) vuf.a(new luz((HubsGlueImageDelegate) this.c.get(), (Picasso) this.b.get(), uur.a((Context) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
