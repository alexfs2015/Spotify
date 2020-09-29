package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.fragment.app.Fragment;
import com.google.common.collect.Sets;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: hzj reason: default package */
public final class hzj implements hzi {
    public a a;
    private final WeakReference<Fragment> b;
    private final hvw c;
    private final ify d;
    private final hzk e;
    private final iga f;
    private final fpg g;
    private final spi h;
    private final fpt i;

    /* renamed from: hzj$a */
    public interface a {
        void a();
    }

    public hzj(Fragment fragment, hvw hvw, ify ify, hzk hzk, iga iga, fpg fpg, spi spi, fpt fpt) {
        this.b = new WeakReference<>(fragment);
        this.c = hvw;
        this.d = ify;
        this.e = hzk;
        this.f = iga;
        this.g = fpg;
        this.h = spi;
        this.i = fpt;
    }

    /* renamed from: a */
    public final void accept(Ad ad, Long l) {
        Fragment fragment = (Fragment) this.b.get();
        if (!(fragment == null || fax.a(ad.clickUrl()) || fragment.p() == null)) {
            this.f.a("clicked", ad.id(), null, l != null ? l.longValue() : -1, null);
            String clickUrl = ad.clickUrl();
            if (!ify.a(ad)) {
                if (jst.a(clickUrl).b == LinkType.ADS_MIC_PERMISSIONS) {
                    ify ify = this.d;
                    if (VERSION.SDK_INT >= 23) {
                        String str = "android.permission.RECORD_AUDIO";
                        if (!ify.a.a(fragment.n(), str)) {
                            ify.a.a(1, fragment, Sets.a((E[]) new String[]{str}));
                        }
                    }
                } else if (jst.h(clickUrl)) {
                    a aVar = this.a;
                    if (aVar != null) {
                        aVar.a();
                    }
                    this.h.a(clickUrl);
                } else {
                    this.c.a((Activity) fragment.p(), this.g, Uri.parse(clickUrl));
                }
            } else if (!this.i.b(hwb.h) && ViewUris.u.b(clickUrl)) {
                this.e.a(PlayerTrack.create(clickUrl, Collections.singletonMap(Metadata.MFT_UNPLAYABLE_POLICY, "ignore")));
            }
        }
    }
}
