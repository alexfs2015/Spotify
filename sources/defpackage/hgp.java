package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.Map;

/* renamed from: hgp reason: default package */
public final class hgp implements wig<Observable<Map<String, String>>> {
    private final wzi<hgi> a;
    private final wzi<Scheduler> b;

    private hgp(wzi<hgi> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hgp a(wzi<hgi> wzi, wzi<Scheduler> wzi2) {
        return new hgp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(((hgi) this.a.get()).a().a(1).a().a((Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
