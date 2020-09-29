package defpackage;

import io.reactivex.Scheduler;
import java.util.Set;

/* renamed from: hpw reason: default package */
public final class hpw implements wig<hpv> {
    private final wzi<hqy> a;
    private final wzi<Scheduler> b;
    private final wzi<Set<hrw>> c;
    private final wzi<lbi> d;

    private hpw(wzi<hqy> wzi, wzi<Scheduler> wzi2, wzi<Set<hrw>> wzi3, wzi<lbi> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hpw a(wzi<hqy> wzi, wzi<Scheduler> wzi2, wzi<Set<hrw>> wzi3, wzi<lbi> wzi4) {
        return new hpw(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hpv((hqy) this.a.get(), (Scheduler) this.b.get(), (Set) this.c.get(), (lbi) this.d.get());
    }
}
