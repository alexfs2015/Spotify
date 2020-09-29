package defpackage;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: nct reason: default package */
public final class nct implements wig<gwr> {
    private final wzi<a> a;
    private final wzi<nbm> b;
    private final wzi<gwm> c;
    private final wzi<Activity> d;

    private nct(wzi<a> wzi, wzi<nbm> wzi2, wzi<gwm> wzi3, wzi<Activity> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nct a(wzi<a> wzi, wzi<nbm> wzi2, wzi<gwm> wzi3, wzi<Activity> wzi4) {
        return new nct(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(HubsGlueViewBinderFactories.a(((a) this.a.get()).ae_()).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) (nbm) this.b.get()).a((gwm) this.c.get(), (Activity) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
