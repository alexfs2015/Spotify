package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: mkn reason: default package */
public final class mkn implements vua<gur> {
    private final wlc<sih> a;
    private final wlc<gum> b;
    private final wlc<Context> c;
    private final wlc<mkc> d;

    private mkn(wlc<sih> wlc, wlc<gum> wlc2, wlc<Context> wlc3, wlc<mkc> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mkn a(wlc<sih> wlc, wlc<gum> wlc2, wlc<Context> wlc3, wlc<mkc> wlc4) {
        return new mkn(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (gur) vuf.a(HubsGlueViewBinderFactories.a((sih) this.a.get()).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) (mkc) this.d.get()).a((gum) this.b.get(), (Context) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
