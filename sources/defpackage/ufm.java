package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.connection.OfflineState;
import com.spotify.music.connection.OfflineState.State;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: ufm reason: default package */
public final class ufm {
    public final Observable<OfflineState> a;
    private final gky<OfflineState> b;
    private final Scheduler c;
    private final SerialDisposable d;
    private final Consumer<OfflineState> e;
    private final Consumer<Throwable> f;

    public ufm(gkz gkz, Scheduler scheduler) {
        this(gkz.a(OfflineState.class), scheduler);
    }

    private ufm(gky<OfflineState> gky, Scheduler scheduler) {
        this.e = $$Lambda$ufm$2xgJhFCZL_oQa9kuBJkW3_HKB3g.INSTANCE;
        this.f = $$Lambda$ufm$DdY4oqeKgIG07Cf9GKwPvXbEs8.INSTANCE;
        this.b = gky;
        this.c = scheduler;
        this.d = new SerialDisposable();
        this.a = vun.b(this.b.resolve(new Request(Request.SUB, "sp://offline/v1/connection"))).a(scheduler).a(Functions.a()).a(1).a();
    }

    public final void a(boolean z) {
        try {
            this.d.a(vun.b(this.b.resolve(RequestBuilder.put("sp://offline/v1/connection", OfflineState.create(State.ONLINE)).build())).a(this.c).a(this.e, this.f));
        } catch (ParserException e2) {
            Assertion.a("Failed to parse OfflineState object!", (Throwable) e2);
        }
    }
}
