package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: kts reason: default package */
public final class kts implements xiy<hcs, hcs> {
    private static hcj a = HubsImmutableComponentBundle.builder().a("verified", true).a();

    /* renamed from: a */
    public final hcs call(hcs hcs) {
        a builder = hcs.toBuilder();
        hcm header = hcs.header();
        if (header != null && header.custom().boolValue("verified", false)) {
            a builder2 = header.toBuilder();
            hcl images = header.images();
            a builder3 = images.toBuilder();
            hcp main = images.main();
            header = builder2.a(builder3.a(main != null ? main.toBuilder().b(a).a() : null).a()).a();
        }
        return builder.a(header).a();
    }
}
