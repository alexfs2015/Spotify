package defpackage;

import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper;

/* renamed from: nzl reason: default package */
public final class nzl implements vua<nzk> {
    private final wlc<nzo> a;
    private final wlc<nze> b;
    private final wlc<jry> c;
    private final wlc<b> d;
    private final wlc<PartnerAccountLinkingSessionHelper> e;
    private final wlc<nzi> f;
    private final wlc<hec> g;

    private nzl(wlc<nzo> wlc, wlc<nze> wlc2, wlc<jry> wlc3, wlc<b> wlc4, wlc<PartnerAccountLinkingSessionHelper> wlc5, wlc<nzi> wlc6, wlc<hec> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static nzl a(wlc<nzo> wlc, wlc<nze> wlc2, wlc<jry> wlc3, wlc<b> wlc4, wlc<PartnerAccountLinkingSessionHelper> wlc5, wlc<nzi> wlc6, wlc<hec> wlc7) {
        nzl nzl = new nzl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return nzl;
    }

    public final /* synthetic */ Object get() {
        nzk nzk = new nzk((nzo) this.a.get(), (nze) this.b.get(), (jry) this.c.get(), (b) this.d.get(), (PartnerAccountLinkingSessionHelper) this.e.get(), (nzi) this.f.get(), (hec) this.g.get());
        return nzk;
    }
}
