package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.Scheduler;

/* renamed from: rcv reason: default package */
public final class rcv implements vua<rcu> {
    private final wlc<CollectionStateProvider> a;
    private final wlc<ObjectMapper> b;
    private final wlc<Scheduler> c;

    private rcv(wlc<CollectionStateProvider> wlc, wlc<ObjectMapper> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rcv a(wlc<CollectionStateProvider> wlc, wlc<ObjectMapper> wlc2, wlc<Scheduler> wlc3) {
        return new rcv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rcu((CollectionStateProvider) this.a.get(), (ObjectMapper) this.b.get(), (Scheduler) this.c.get());
    }
}
