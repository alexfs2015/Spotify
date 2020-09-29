package defpackage;

import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: kml reason: default package */
final class kml {
    private final wlc<kmy> a;
    private final wlc<knf> b;

    kml(wlc<kmy> wlc, wlc<knf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    /* access modifiers changed from: 0000 */
    public final kmk a(PartnerType partnerType) {
        if (partnerType == PartnerType.GOOGLE_MAPS) {
            return (kmk) this.a.get();
        }
        if (partnerType == PartnerType.WAZE) {
            return (kmk) this.b.get();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(partnerType);
        sb.append("not implemented");
        throw new IllegalArgumentException(sb.toString());
    }
}
