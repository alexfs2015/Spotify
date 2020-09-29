package defpackage;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: mxh reason: default package */
public final class mxh implements vua<gur> {
    private final wlc<a> a;
    private final wlc<Fragment> b;
    private final wlc<gum> c;
    private final wlc<Activity> d;

    private mxh(wlc<a> wlc, wlc<Fragment> wlc2, wlc<gum> wlc3, wlc<Activity> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mxh a(wlc<a> wlc, wlc<Fragment> wlc2, wlc<gum> wlc3, wlc<Activity> wlc4) {
        return new mxh(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (gur) vuf.a(HubsGlueViewBinderFactories.a(((a) this.a.get()).ae_()).a(HeaderPolicy.ALWAYS_ON_TOP).a(false).a((Fragment) this.b.get()).a((gum) this.c.get(), (Activity) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
