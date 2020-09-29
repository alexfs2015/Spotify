package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: igr reason: default package */
public final class igr implements kai {
    private final wlc<jrp> a;
    private final wlc<iga> b;
    private final wlc<idq> c;
    private final kct d;
    private final igu e;

    public igr(wlc<jrp> wlc, wlc<iga> wlc2, wlc<idq> wlc3, kct kct, igu igu) {
        this.a = (wlc) fay.a(wlc);
        this.b = (wlc) fay.a(wlc2);
        this.c = wlc3;
        this.d = kct;
        this.e = igu;
    }

    public final Optional<kah> a(jya jya, jxx jxx, jyc jyc, String str, jyd jyd) {
        if (!((PlayerTrackUtil.isAdInMetadata(jya.e()) || PlayerTrackUtil.isInterruptionFromAds(jzg.b(jya), jya.e())) && PlayerTrackUtil.hasAdId(jya.e()) && PlayerTrackUtil.hasManifestId(jya.e()))) {
            return Optional.e();
        }
        igq igq = new igq(jya, jyc, (jrp) this.a.get(), (iga) this.b.get(), (idq) this.c.get(), this.d, this.e);
        return Optional.b(igq);
    }
}
