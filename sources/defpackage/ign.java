package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: ign reason: default package */
public final class ign implements kai {
    private final wlc<iga> a;
    private final wlc<idq> b;
    private final kct c;
    private final igu d;

    public ign(wlc<iga> wlc, wlc<idq> wlc2, kct kct, igu igu) {
        this.a = (wlc) fay.a(wlc);
        this.b = (wlc) fay.a(wlc2);
        this.c = kct;
        this.d = igu;
    }

    public final Optional<kah> a(jya jya, jxx jxx, jyc jyc, String str, jyd jyd) {
        boolean z = true;
        if ((!PlayerTrackUtil.isAdInMetadata(jya.e()) && !PlayerTrackUtil.isInterruptionFromAds(jzg.b(jya), jya.e())) || !PlayerTrackUtil.hasAdId(jya.e()) || !(!PlayerTrackUtil.hasManifestId(jya.e()))) {
            z = false;
        }
        if (!z) {
            return Optional.e();
        }
        igm igm = new igm((iga) this.a.get(), jya, jyc, (idq) this.b.get(), this.c, this.d);
        return Optional.b(igm);
    }
}
