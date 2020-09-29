package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: kaq reason: default package */
public final class kaq implements wig<kbf> {
    private final wzi<RxResolver> a;
    private final wzi<Scheduler> b;
    private final wzi<Scheduler> c;
    private final wzi<jzn> d;
    private final wzi<List<kci>> e;
    private final wzi<Boolean> f;
    private final wzi<rwl> g;
    private final wzi<gcb> h;

    private kaq(wzi<RxResolver> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3, wzi<jzn> wzi4, wzi<List<kci>> wzi5, wzi<Boolean> wzi6, wzi<rwl> wzi7, wzi<gcb> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static kaq a(wzi<RxResolver> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3, wzi<jzn> wzi4, wzi<List<kci>> wzi5, wzi<Boolean> wzi6, wzi<rwl> wzi7, wzi<gcb> wzi8) {
        kaq kaq = new kaq(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return kaq;
    }

    public final /* synthetic */ Object get() {
        RxResolver rxResolver = (RxResolver) this.a.get();
        Scheduler scheduler = (Scheduler) this.b.get();
        Scheduler scheduler2 = (Scheduler) this.c.get();
        jzn jzn = (jzn) this.d.get();
        who b2 = wif.b(this.e);
        boolean booleanValue = ((Boolean) this.f.get()).booleanValue();
        rwl rwl = (rwl) this.g.get();
        gcb gcb = (gcb) this.h.get();
        ArrayList arrayList = new ArrayList((Collection) b2.get());
        if (booleanValue) {
            arrayList.add(new gdb(jtp.a, new jzw()));
        }
        kbf kbf = new kbf(rxResolver, scheduler, scheduler2, jzn, arrayList, rwl);
        return (kbf) wil.a(kbf, "Cannot return null from a non-@Nullable @Provides method");
    }
}
