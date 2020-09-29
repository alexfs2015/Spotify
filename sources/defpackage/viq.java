package defpackage;

import com.spotify.cosmos.router.RxRouter;

/* renamed from: viq reason: default package */
public final class viq implements wig<vip> {
    private final wzi<RxRouter> a;
    private final wzi<rwl> b;

    private viq(wzi<RxRouter> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vip a(RxRouter rxRouter, rwl rwl) {
        return new vip(rxRouter, rwl);
    }

    public static viq a(wzi<RxRouter> wzi, wzi<rwl> wzi2) {
        return new viq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vip((RxRouter) this.a.get(), (rwl) this.b.get());
    }
}
