package defpackage;

import android.content.Context;
import com.spotify.music.libs.hubslocalcache.HubsCachedFeature;

/* renamed from: sce reason: default package */
public final class sce implements wig<scd> {
    private final wzi<Context> a;
    private final wzi<String> b;
    private final wzi<rwl> c;
    private final wzi<HubsCachedFeature> d;

    private sce(wzi<Context> wzi, wzi<String> wzi2, wzi<rwl> wzi3, wzi<HubsCachedFeature> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static sce a(wzi<Context> wzi, wzi<String> wzi2, wzi<rwl> wzi3, wzi<HubsCachedFeature> wzi4) {
        return new sce(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new scd((Context) this.a.get(), (String) this.b.get(), (rwl) this.c.get(), (HubsCachedFeature) this.d.get());
    }
}
