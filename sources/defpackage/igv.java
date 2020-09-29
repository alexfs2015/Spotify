package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: igv reason: default package */
public final class igv {
    final iin a;
    private final hyi b;
    private final szp c;
    private final fqa d;

    public igv(iin iin, hyi hyi, szp szp, fqa fqa) {
        this.a = iin;
        this.b = hyi;
        this.c = szp;
        this.d = fqa;
    }

    /* access modifiers changed from: protected */
    public final void a(Ad ad, Activity activity) {
        if (jva.h(ad.clickUrl())) {
            this.c.a(ad.clickUrl());
        } else {
            this.b.a(activity, this.d, ad.advertiser(), Uri.parse(ad.clickUrl()));
        }
        this.a.a("clicked", ad.id());
    }
}
