package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: gmh reason: default package */
public final class gmh implements wig<gmg> {
    private final wzi<RxResolver> a;
    private final wzi<ObjectMapper> b;
    private final wzi<Scheduler> c;

    private gmh(wzi<RxResolver> wzi, wzi<ObjectMapper> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static gmh a(wzi<RxResolver> wzi, wzi<ObjectMapper> wzi2, wzi<Scheduler> wzi3) {
        return new gmh(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new gmg((RxResolver) this.a.get(), (ObjectMapper) this.b.get(), (Scheduler) this.c.get());
    }
}
