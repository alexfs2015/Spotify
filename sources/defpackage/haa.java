package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.util.ui.BadgesFactory;

/* renamed from: haa reason: default package */
public final class haa implements wig<b> {
    private final wzi<HubsGlueImageDelegate> a;
    private final wzi<BadgesFactory> b;

    private haa(wzi<HubsGlueImageDelegate> wzi, wzi<BadgesFactory> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static haa a(wzi<HubsGlueImageDelegate> wzi, wzi<BadgesFactory> wzi2) {
        return new haa(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new b((HubsGlueImageDelegate) this.a.get(), (BadgesFactory) this.b.get());
    }
}
