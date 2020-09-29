package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

/* renamed from: rsa reason: default package */
public final class rsa implements wig<rrz> {
    private final wzi<Picasso> a;
    private final wzi<HubsGlueImageDelegate> b;

    private rsa(wzi<Picasso> wzi, wzi<HubsGlueImageDelegate> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rsa a(wzi<Picasso> wzi, wzi<HubsGlueImageDelegate> wzi2) {
        return new rsa(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rrz((Picasso) this.a.get(), (HubsGlueImageDelegate) this.b.get());
    }
}
