package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: qcz reason: default package */
public final class qcz implements wig<gwr> {
    private final wzi<sso> a;
    private final wzi<gwm> b;
    private final wzi<Context> c;
    private final wzi<qdk> d;

    private qcz(wzi<sso> wzi, wzi<gwm> wzi2, wzi<Context> wzi3, wzi<qdk> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qcz a(wzi<sso> wzi, wzi<gwm> wzi2, wzi<Context> wzi3, wzi<qdk> wzi4) {
        return new qcz(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(HubsGlueViewBinderFactories.a((sso) this.a.get()).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) (qdk) this.d.get()).a((gwm) this.b.get(), (Context) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
