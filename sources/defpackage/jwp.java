package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: jwp reason: default package */
public final class jwp implements wig<jwo> {
    private final wzi<RxResolver> a;
    private final wzi<ObjectMapper> b;
    private final wzi<FireAndForgetResolver> c;
    private final wzi<Scheduler> d;

    private jwp(wzi<RxResolver> wzi, wzi<ObjectMapper> wzi2, wzi<FireAndForgetResolver> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static jwp a(wzi<RxResolver> wzi, wzi<ObjectMapper> wzi2, wzi<FireAndForgetResolver> wzi3, wzi<Scheduler> wzi4) {
        return new jwp(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new jwo((RxResolver) this.a.get(), (ObjectMapper) this.b.get(), (FireAndForgetResolver) this.c.get(), (Scheduler) this.d.get());
    }
}
