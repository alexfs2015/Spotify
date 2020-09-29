package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.util.ui.BadgesFactory;

/* renamed from: gzz reason: default package */
public final class gzz implements wig<a> {
    private final wzi<HubsGlueImageDelegate> a;
    private final wzi<BadgesFactory> b;

    private gzz(wzi<HubsGlueImageDelegate> wzi, wzi<BadgesFactory> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gzz a(wzi<HubsGlueImageDelegate> wzi, wzi<BadgesFactory> wzi2) {
        return new gzz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new a((HubsGlueImageDelegate) this.a.get(), (BadgesFactory) this.b.get());
    }
}
