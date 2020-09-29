package defpackage;

import java.util.Collections;

/* renamed from: lkh reason: default package */
public final class lkh implements vua<geo> {
    private final wlc<lkj> a;
    private final wlc<gej> b;

    private lkh(wlc<lkj> wlc, wlc<gej> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lkh a(wlc<lkj> wlc, wlc<gej> wlc2) {
        return new lkh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (geo) vuf.a(new a().a(Collections.emptyList()).a((gej) new gdn()).a((geb) new gen(new gdn())).a("https://spclient.wg.spotify.com/").a(false).a(Collections.singletonList((lkj) this.a.get())).a((gej) this.b.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
