package defpackage;

import java.util.Collections;

/* renamed from: loh reason: default package */
public final class loh implements wig<gfz> {
    private final wzi<loj> a;
    private final wzi<gfu> b;

    private loh(wzi<loj> wzi, wzi<gfu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static loh a(wzi<loj> wzi, wzi<gfu> wzi2) {
        return new loh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gfz) wil.a(new a().a(Collections.emptyList()).a((gfu) new gey()).a((gfm) new gfy(new gey())).a("https://spclient.wg.spotify.com/").a(false).a(Collections.singletonList((loj) this.a.get())).a((gfu) this.b.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
