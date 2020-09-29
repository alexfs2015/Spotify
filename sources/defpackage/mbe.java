package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

/* renamed from: mbe reason: default package */
public final class mbe implements wig<lza> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;
    private final wzi<HubsGlueImageDelegate> c;

    private mbe(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<HubsGlueImageDelegate> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mbe a(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<HubsGlueImageDelegate> wzi3) {
        return new mbe(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (lza) wil.a(new lza((HubsGlueImageDelegate) this.c.get(), (Picasso) this.b.get(), vgi.a((Context) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
