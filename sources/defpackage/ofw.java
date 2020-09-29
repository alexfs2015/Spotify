package defpackage;

import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper;

/* renamed from: ofw reason: default package */
public final class ofw implements wig<PartnerAccountLinkingSessionHelper> {
    private final wzi<hxx> a;

    private ofw(wzi<hxx> wzi) {
        this.a = wzi;
    }

    public static ofw a(wzi<hxx> wzi) {
        return new ofw(wzi);
    }

    public final /* synthetic */ Object get() {
        return new PartnerAccountLinkingSessionHelper((hxx) this.a.get());
    }
}
