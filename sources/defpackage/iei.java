package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: iei reason: default package */
public final class iei {
    final iga a;
    private final hvw b;
    private final spi c;
    private final fpg d;

    public iei(iga iga, hvw hvw, spi spi, fpg fpg) {
        this.a = iga;
        this.b = hvw;
        this.c = spi;
        this.d = fpg;
    }

    /* access modifiers changed from: protected */
    public final void a(Ad ad, Activity activity) {
        if (jst.h(ad.clickUrl())) {
            this.c.a(ad.clickUrl());
        } else {
            this.b.a(activity, this.d, ad.advertiser(), Uri.parse(ad.clickUrl()));
        }
        this.a.a("clicked", ad.id());
    }
}
