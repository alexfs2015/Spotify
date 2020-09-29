package defpackage;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.features.placebobanner.BannerConfigurationRequester;

/* renamed from: ojy reason: default package */
public final class ojy implements wig<BannerConfigurationRequester> {
    private final wzi<Context> a;
    private final wzi<ObjectMapper> b;
    private final wzi<RxResolver> c;
    private final wzi<jtz> d;

    public static BannerConfigurationRequester a(Context context, ObjectMapper objectMapper, RxResolver rxResolver, jtz jtz) {
        return new BannerConfigurationRequester(context, objectMapper, rxResolver, jtz);
    }

    public final /* synthetic */ Object get() {
        return new BannerConfigurationRequester((Context) this.a.get(), (ObjectMapper) this.b.get(), (RxResolver) this.c.get(), (jtz) this.d.get());
    }
}
