package defpackage;

import com.spotify.cosmos.android.FireAndForgetResolver;

/* renamed from: giq reason: default package */
public final class giq implements wig<gip> {
    private final wzi<FireAndForgetResolver> a;
    private final wzi<rwl> b;

    private giq(wzi<FireAndForgetResolver> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static giq a(wzi<FireAndForgetResolver> wzi, wzi<rwl> wzi2) {
        return new giq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new gip((FireAndForgetResolver) this.a.get(), (rwl) this.b.get());
    }
}
