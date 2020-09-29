package defpackage;

import android.content.res.Resources;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;

/* renamed from: lgq reason: default package */
public final class lgq implements wig<tol> {
    private final wzi<tmo> a;
    private final wzi<Resources> b;
    private final wzi<Boolean> c;
    private final wzi<toh> d;
    private final wzi<vje> e;
    private final wzi<HeaderPolicy> f;
    private final wzi<sgk> g;
    private final wzi<Boolean> h;

    public static tol a(tmo tmo, Resources resources, boolean z, toh toh, vje vje, HeaderPolicy headerPolicy, sgk sgk, boolean z2) {
        return (tol) wil.a(CC.a(tmo, resources, z, toh, vje, headerPolicy, sgk, z2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((tmo) this.a.get(), (Resources) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (toh) this.d.get(), (vje) this.e.get(), (HeaderPolicy) this.f.get(), (sgk) this.g.get(), ((Boolean) this.h.get()).booleanValue());
    }
}
