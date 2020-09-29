package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: kqj reason: default package */
public final class kqj implements wut<gzz, gzz> {
    private static gzq a = HubsImmutableComponentBundle.builder().a("verified", true).a();

    /* renamed from: a */
    public final gzz call(gzz gzz) {
        a builder = gzz.toBuilder();
        gzt header = gzz.header();
        if (header != null && header.custom().boolValue("verified", false)) {
            a builder2 = header.toBuilder();
            gzs images = header.images();
            a builder3 = images.toBuilder();
            gzw main = images.main();
            header = builder2.a(builder3.a(main != null ? main.toBuilder().b(a).a() : null).a()).a();
        }
        return builder.a(header).a();
    }
}
