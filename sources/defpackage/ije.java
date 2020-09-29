package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: ije reason: default package */
public final class ije implements kci {
    private final wzi<jtz> a;
    private final wzi<iin> b;
    private final wzi<igd> c;
    private final keu d;
    private final ijh e;

    public ije(wzi<jtz> wzi, wzi<iin> wzi2, wzi<igd> wzi3, keu keu, ijh ijh) {
        this.a = (wzi) fbp.a(wzi);
        this.b = (wzi) fbp.a(wzi2);
        this.c = wzi3;
        this.d = keu;
        this.e = ijh;
    }

    public final Optional<kch> createEventObserver(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        if (!((PlayerTrackUtil.isAdInMetadata(kaa.e()) || PlayerTrackUtil.isInterruptionFromAds(kbg.b(kaa), kaa.e())) && PlayerTrackUtil.hasAdId(kaa.e()) && PlayerTrackUtil.hasManifestId(kaa.e()))) {
            return Optional.e();
        }
        ijd ijd = new ijd(kaa, kac, (jtz) this.a.get(), (iin) this.b.get(), (igd) this.c.get(), this.d, this.e);
        return Optional.b(ijd);
    }
}
