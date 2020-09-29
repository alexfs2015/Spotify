package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;

/* renamed from: mfk reason: default package */
public final class mfk implements wig<gwr> {
    private final wzi<sso> a;
    private final wzi<mfc> b;
    private final wzi<gwm> c;
    private final wzi<Context> d;

    private mfk(wzi<sso> wzi, wzi<mfc> wzi2, wzi<gwm> wzi3, wzi<Context> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mfk a(wzi<sso> wzi, wzi<mfc> wzi2, wzi<gwm> wzi3, wzi<Context> wzi4) {
        return new mfk(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(HubsGlueViewBinderFactories.a((sso) this.a.get()).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) (mfc) this.b.get()).a((gwm) this.c.get(), (Context) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
