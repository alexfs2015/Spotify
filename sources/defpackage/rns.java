package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: rns reason: default package */
public final class rns implements wig<gwr> {
    private final wzi<Context> a;
    private final wzi<Fragment> b;
    private final wzi<sso> c;
    private final wzi<gwm> d;

    private rns(wzi<Context> wzi, wzi<Fragment> wzi2, wzi<sso> wzi3, wzi<gwm> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rns a(wzi<Context> wzi, wzi<Fragment> wzi2, wzi<sso> wzi3, wzi<gwm> wzi4) {
        return new rns(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(HubsGlueViewBinderFactories.a((sso) this.c.get()).a(HeaderPolicy.SPLIT_LANDSCAPE).a((Fragment) this.b.get()).a((gwm) this.d.get(), (Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
