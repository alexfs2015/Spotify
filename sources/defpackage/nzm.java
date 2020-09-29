package defpackage;

import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper;

/* renamed from: nzm reason: default package */
public final class nzm implements vua<PartnerAccountLinkingSessionHelper> {
    private final wlc<hvl> a;

    private nzm(wlc<hvl> wlc) {
        this.a = wlc;
    }

    public static nzm a(wlc<hvl> wlc) {
        return new nzm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new PartnerAccountLinkingSessionHelper((hvl) this.a.get());
    }
}
