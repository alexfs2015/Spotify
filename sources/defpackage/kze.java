package defpackage;

import io.reactivex.Scheduler;

/* renamed from: kze reason: default package */
public final class kze implements wig<kzd> {
    private final wzi<kzb> a;
    private final wzi<kzp> b;
    private final wzi<mip> c;
    private final wzi<Scheduler> d;

    private kze(wzi<kzb> wzi, wzi<kzp> wzi2, wzi<mip> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static kze a(wzi<kzb> wzi, wzi<kzp> wzi2, wzi<mip> wzi3, wzi<Scheduler> wzi4) {
        return new kze(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new kzd((kzb) this.a.get(), (kzp) this.b.get(), (mip) this.c.get(), (Scheduler) this.d.get());
    }
}
