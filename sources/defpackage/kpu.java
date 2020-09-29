package defpackage;

import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: kpu reason: default package */
final class kpu {
    private final wzi<kqh> a;
    private final wzi<kqo> b;

    kpu(wzi<kqh> wzi, wzi<kqo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    /* access modifiers changed from: 0000 */
    public final kpt a(PartnerType partnerType) {
        if (partnerType == PartnerType.GOOGLE_MAPS) {
            return (kpt) this.a.get();
        }
        if (partnerType == PartnerType.WAZE) {
            return (kpt) this.b.get();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(partnerType);
        sb.append("not implemented");
        throw new IllegalArgumentException(sb.toString());
    }
}
