package defpackage;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: lxc reason: default package */
public final class lxc implements wig<gwr> {
    private final wzi<a> a;
    private final wzi<Fragment> b;
    private final wzi<gwm> c;
    private final wzi<Activity> d;

    private lxc(wzi<a> wzi, wzi<Fragment> wzi2, wzi<gwm> wzi3, wzi<Activity> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static lxc a(wzi<a> wzi, wzi<Fragment> wzi2, wzi<gwm> wzi3, wzi<Activity> wzi4) {
        return new lxc(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(HubsGlueViewBinderFactories.a(((a) this.a.get()).ae_()).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) this.b.get()).a((gwm) this.c.get(), (Activity) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
