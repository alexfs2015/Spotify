package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: jhd reason: default package */
public final class jhd implements wig<jhc> {
    private final wzi<RxResolver> a;
    private final wzi<ObjectMapper> b;
    private final wzi<Scheduler> c;

    private jhd(wzi<RxResolver> wzi, wzi<ObjectMapper> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static jhd a(wzi<RxResolver> wzi, wzi<ObjectMapper> wzi2, wzi<Scheduler> wzi3) {
        return new jhd(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new jhc((RxResolver) this.a.get(), (ObjectMapper) this.b.get(), (Scheduler) this.c.get());
    }
}
