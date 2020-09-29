package defpackage;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.features.placebobanner.BannerConfigurationRequester;

/* renamed from: ocs reason: default package */
public final class ocs implements vua<BannerConfigurationRequester> {
    private final wlc<Context> a;
    private final wlc<ObjectMapper> b;
    private final wlc<RxResolver> c;
    private final wlc<jrp> d;

    public static BannerConfigurationRequester a(Context context, ObjectMapper objectMapper, RxResolver rxResolver, jrp jrp) {
        return new BannerConfigurationRequester(context, objectMapper, rxResolver, jrp);
    }

    public final /* synthetic */ Object get() {
        return new BannerConfigurationRequester((Context) this.a.get(), (ObjectMapper) this.b.get(), (RxResolver) this.c.get(), (jrp) this.d.get());
    }
}
