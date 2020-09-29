package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: req reason: default package */
public final class req implements vua<gur> {
    private final wlc<Context> a;
    private final wlc<Fragment> b;
    private final wlc<sih> c;
    private final wlc<gum> d;

    private req(wlc<Context> wlc, wlc<Fragment> wlc2, wlc<sih> wlc3, wlc<gum> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static req a(wlc<Context> wlc, wlc<Fragment> wlc2, wlc<sih> wlc3, wlc<gum> wlc4) {
        return new req(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (gur) vuf.a(HubsGlueViewBinderFactories.a((sih) this.c.get()).a(HeaderPolicy.SPLIT_LANDSCAPE).a((Fragment) this.b.get()).a((gum) this.d.get(), (Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
