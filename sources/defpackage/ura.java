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

/* renamed from: ura reason: default package */
public final class ura {
    public final Observable<OfflineState> a;
    private final gmm<OfflineState> b;
    private final Scheduler c;
    private final SerialDisposable d;
    private final Consumer<OfflineState> e;
    private final Consumer<Throwable> f;

    private ura(gmm<OfflineState> gmm, Scheduler scheduler) {
        this.e = $$Lambda$ura$oTcqcOzj4n4UscVQavDUwV7tn48.INSTANCE;
        this.f = $$Lambda$ura$06eqJ3oSdzhnKXOh2g57Qg9Zi4.INSTANCE;
        this.b = gmm;
        this.c = scheduler;
        this.d = new SerialDisposable();
        this.a = wit.b(this.b.resolve(new Request(Request.SUB, "sp://offline/v1/connection"))).a(scheduler).a(Functions.a()).a(1).a();
    }

    public ura(gmn gmn, Scheduler scheduler) {
        this(gmn.a(OfflineState.class), scheduler);
    }

    public final void a(boolean z) {
        try {
            this.d.a(wit.b(this.b.resolve(RequestBuilder.put("sp://offline/v1/connection", OfflineState.create(State.ONLINE)).build())).a(this.c).a(this.e, this.f));
        } catch (ParserException e2) {
            Assertion.a("Failed to parse OfflineState object!", (Throwable) e2);
        }
    }
}
