package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: hxt reason: default package */
public final class hxt implements wig<hxs> {
    private final wzi<RxResolver> a;
    private final wzi<jtz> b;
    private final wzi<ObjectMapper> c;
    private final wzi<Scheduler> d;

    private hxt(wzi<RxResolver> wzi, wzi<jtz> wzi2, wzi<ObjectMapper> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hxs a(RxResolver rxResolver, jtz jtz, ObjectMapper objectMapper, Scheduler scheduler) {
        return new hxs(rxResolver, jtz, objectMapper, scheduler);
    }

    public static hxt a(wzi<RxResolver> wzi, wzi<jtz> wzi2, wzi<ObjectMapper> wzi3, wzi<Scheduler> wzi4) {
        return new hxt(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hxs((RxResolver) this.a.get(), (jtz) this.b.get(), (ObjectMapper) this.c.get(), (Scheduler) this.d.get());
    }
}
