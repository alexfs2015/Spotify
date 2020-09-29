package defpackage;

import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;

/* renamed from: lng reason: default package */
public final class lng implements wig<PartnerUserIdEndpoint> {
    private final wzi<gix> a;

    private lng(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static lng a(wzi<gix> wzi) {
        return new lng(wzi);
    }

    public final /* synthetic */ Object get() {
        return (PartnerUserIdEndpoint) wil.a((PartnerUserIdEndpoint) ((gix) this.a.get()).a(PartnerUserIdEndpoint.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
