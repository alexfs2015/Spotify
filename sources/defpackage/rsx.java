package defpackage;

import android.content.Context;
import com.spotify.music.libs.hubslocalcache.HubsCachedFeature;

/* renamed from: rsx reason: default package */
public final class rsx implements vua<rsw> {
    private final wlc<Context> a;
    private final wlc<String> b;
    private final wlc<rnf> c;
    private final wlc<HubsCachedFeature> d;

    private rsx(wlc<Context> wlc, wlc<String> wlc2, wlc<rnf> wlc3, wlc<HubsCachedFeature> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rsx a(wlc<Context> wlc, wlc<String> wlc2, wlc<rnf> wlc3, wlc<HubsCachedFeature> wlc4) {
        return new rsx(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rsw((Context) this.a.get(), (String) this.b.get(), (rnf) this.c.get(), (HubsCachedFeature) this.d.get());
    }
}
