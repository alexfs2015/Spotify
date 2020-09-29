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

/* renamed from: ibv reason: default package */
public final class ibv implements ibu {
    public a a;
    private final WeakReference<Fragment> b;
    private final hyi c;
    private final iil d;
    private final ibw e;
    private final iin f;
    private final fqa g;
    private final szp h;
    private final fqn i;

    /* renamed from: ibv$a */
    public interface a {
        void a();
    }

    public ibv(Fragment fragment, hyi hyi, iil iil, ibw ibw, iin iin, fqa fqa, szp szp, fqn fqn) {
        this.b = new WeakReference<>(fragment);
        this.c = hyi;
        this.d = iil;
        this.e = ibw;
        this.f = iin;
        this.g = fqa;
        this.h = szp;
        this.i = fqn;
    }

    /* renamed from: a */
    public final void accept(Ad ad, Long l) {
        Fragment fragment = (Fragment) this.b.get();
        if (!(fragment == null || fbo.a(ad.clickUrl()) || fragment.p() == null)) {
            this.f.a("clicked", ad.id(), null, l != null ? l.longValue() : -1, null);
            String clickUrl = ad.clickUrl();
            if (!iil.a(ad)) {
                if (jva.a(clickUrl).b == LinkType.ADS_MIC_PERMISSIONS) {
                    iil iil = this.d;
                    if (VERSION.SDK_INT >= 23) {
                        String str = "android.permission.RECORD_AUDIO";
                        if (!iil.a.a(fragment.n(), str)) {
                            iil.a.a(1, fragment, Sets.a((E[]) new String[]{str}));
                        }
                    }
                } else if (jva.h(clickUrl)) {
                    a aVar = this.a;
                    if (aVar != null) {
                        aVar.a();
                    }
                    this.h.a(clickUrl);
                } else {
                    this.c.a((Activity) fragment.p(), this.g, Uri.parse(clickUrl));
                }
            } else if (!this.i.b(hyn.h) && ViewUris.t.b(clickUrl)) {
                this.e.a(PlayerTrack.create(clickUrl, Collections.singletonMap(Metadata.MFT_UNPLAYABLE_POLICY, "ignore")));
            }
        }
    }
}
