package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.Scheduler;

/* renamed from: rlt reason: default package */
public final class rlt implements wig<rls> {
    private final wzi<CollectionStateProvider> a;
    private final wzi<ObjectMapper> b;
    private final wzi<Scheduler> c;
    private final wzi<RxResolver> d;

    private rlt(wzi<CollectionStateProvider> wzi, wzi<ObjectMapper> wzi2, wzi<Scheduler> wzi3, wzi<RxResolver> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rlt a(wzi<CollectionStateProvider> wzi, wzi<ObjectMapper> wzi2, wzi<Scheduler> wzi3, wzi<RxResolver> wzi4) {
        return new rlt(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rls((CollectionStateProvider) this.a.get(), (ObjectMapper) this.b.get(), (Scheduler) this.c.get(), (RxResolver) this.d.get());
    }
}
