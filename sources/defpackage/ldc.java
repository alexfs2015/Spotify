package defpackage;

import android.content.res.Resources;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;

/* renamed from: ldc reason: default package */
public final class ldc implements vua<teb> {
    private final wlc<tch> a;
    private final wlc<Resources> b;
    private final wlc<Boolean> c;
    private final wlc<tdx> d;
    private final wlc<uxc> e;
    private final wlc<HeaderPolicy> f;
    private final wlc<rxa> g;
    private final wlc<Boolean> h;

    public static teb a(tch tch, Resources resources, boolean z, tdx tdx, uxc uxc, HeaderPolicy headerPolicy, rxa rxa, boolean z2) {
        return (teb) vuf.a(CC.a(tch, resources, z, tdx, uxc, headerPolicy, rxa, z2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((tch) this.a.get(), (Resources) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (tdx) this.d.get(), (uxc) this.e.get(), (HeaderPolicy) this.f.get(), (rxa) this.g.get(), ((Boolean) this.h.get()).booleanValue());
    }
}
