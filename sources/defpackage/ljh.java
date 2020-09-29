package defpackage;

import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;

/* renamed from: ljh reason: default package */
public final class ljh implements vua<PartnerUserIdEndpoint> {
    private final wlc<ghm> a;

    private ljh(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static ljh a(wlc<ghm> wlc) {
        return new ljh(wlc);
    }

    public final /* synthetic */ Object get() {
        return (PartnerUserIdEndpoint) vuf.a((PartnerUserIdEndpoint) ((ghm) this.a.get()).a(PartnerUserIdEndpoint.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
