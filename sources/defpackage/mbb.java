package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

/* renamed from: mbb reason: default package */
public final class mbb implements wig<lyy> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;
    private final wzi<HubsGlueImageDelegate> c;

    private mbb(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<HubsGlueImageDelegate> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mbb a(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<HubsGlueImageDelegate> wzi3) {
        return new mbb(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (lyy) wil.a(new lyy((HubsGlueImageDelegate) this.c.get(), (Picasso) this.b.get(), vgi.a((Context) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
