package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: mbh reason: default package */
public final class mbh implements vua<gur> {
    private final wlc<sih> a;
    private final wlc<maz> b;
    private final wlc<gum> c;
    private final wlc<Context> d;

    private mbh(wlc<sih> wlc, wlc<maz> wlc2, wlc<gum> wlc3, wlc<Context> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mbh a(wlc<sih> wlc, wlc<maz> wlc2, wlc<gum> wlc3, wlc<Context> wlc4) {
        return new mbh(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (gur) vuf.a(HubsGlueViewBinderFactories.a((sih) this.a.get()).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) (maz) this.b.get()).a((gum) this.c.get(), (Context) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
