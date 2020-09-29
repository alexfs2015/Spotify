package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: ija reason: default package */
public final class ija implements kci {
    private final wzi<iin> a;
    private final wzi<igd> b;
    private final keu c;
    private final ijh d;

    public ija(wzi<iin> wzi, wzi<igd> wzi2, keu keu, ijh ijh) {
        this.a = (wzi) fbp.a(wzi);
        this.b = (wzi) fbp.a(wzi2);
        this.c = keu;
        this.d = ijh;
    }

    public final Optional<kch> createEventObserver(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        boolean z = true;
        if ((!PlayerTrackUtil.isAdInMetadata(kaa.e()) && !PlayerTrackUtil.isInterruptionFromAds(kbg.b(kaa), kaa.e())) || !PlayerTrackUtil.hasAdId(kaa.e()) || !(!PlayerTrackUtil.hasManifestId(kaa.e()))) {
            z = false;
        }
        if (!z) {
            return Optional.e();
        }
        iiz iiz = new iiz((iin) this.a.get(), kaa, kac, (igd) this.b.get(), this.c, this.d);
        return Optional.b(iiz);
    }
}
