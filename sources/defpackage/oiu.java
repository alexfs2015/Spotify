package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oiu reason: default package */
public final class oiu implements wig<gnx<ohl, ohn>> {
    private final wzi<gnl<ohl>> a;
    private final wzi<gnz<ohl, ohn>> b;
    private final wzi<Scheduler> c;
    private final wzi<ohy> d;
    private final wzi<b> e;
    private final wzi<d> f;

    private oiu(wzi<gnl<ohl>> wzi, wzi<gnz<ohl, ohn>> wzi2, wzi<Scheduler> wzi3, wzi<ohy> wzi4, wzi<b> wzi5, wzi<d> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static oiu a(wzi<gnl<ohl>> wzi, wzi<gnz<ohl, ohn>> wzi2, wzi<Scheduler> wzi3, wzi<ohy> wzi4, wzi<b> wzi5, wzi<d> wzi6) {
        oiu oiu = new oiu(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return oiu;
    }

    public final /* synthetic */ Object get() {
        gnx gnx = new gnx((gnl) this.a.get(), (gnz) this.b.get(), (Scheduler) this.c.get(), (ohy) this.d.get(), (b) this.e.get(), (d) this.f.get());
        return (gnx) wil.a(gnx, "Cannot return null from a non-@Nullable @Provides method");
    }
}
