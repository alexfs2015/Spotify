package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: nzh reason: default package */
public final class nzh implements wig<gwr> {
    private final wzi<sso> a;
    private final wzi<gwm> b;
    private final wzi<Context> c;
    private final wzi<nzs> d;

    private nzh(wzi<sso> wzi, wzi<gwm> wzi2, wzi<Context> wzi3, wzi<nzs> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nzh a(wzi<sso> wzi, wzi<gwm> wzi2, wzi<Context> wzi3, wzi<nzs> wzi4) {
        return new nzh(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(HubsGlueViewBinderFactories.a((sso) this.a.get()).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) (nzs) this.d.get()).a((gwm) this.b.get(), (Context) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
