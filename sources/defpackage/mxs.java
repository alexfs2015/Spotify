package defpackage;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: mxs reason: default package */
public final class mxs implements vua<gur> {
    private final wlc<a> a;
    private final wlc<mwl> b;
    private final wlc<gum> c;
    private final wlc<Activity> d;

    private mxs(wlc<a> wlc, wlc<mwl> wlc2, wlc<gum> wlc3, wlc<Activity> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mxs a(wlc<a> wlc, wlc<mwl> wlc2, wlc<gum> wlc3, wlc<Activity> wlc4) {
        return new mxs(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (gur) vuf.a(HubsGlueViewBinderFactories.a(((a) this.a.get()).ae_()).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) (mwl) this.b.get()).a((gum) this.c.get(), (Activity) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
