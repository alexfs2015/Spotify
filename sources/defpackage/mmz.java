package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;

/* renamed from: mmz reason: default package */
public final class mmz implements gug {
    final gtb a;
    final mix b;
    final unq c;
    final xok d = new xok();
    final xij<ho<gud, uns>> e = new xij<ho<gud, uns>>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            ho hoVar = (ho) obj;
            gud gud = (gud) fbp.a(hoVar.a);
            mmz.this.b.a(gud.a(), gud.c(), gud.d(), gud.b(), (uns) fbp.a(hoVar.b));
        }
    };
    private final xii<PlayerState> f;
    private final gsw g;
    private final a<ConnectManager> h = new a<ConnectManager>() {
        public final /* synthetic */ void a(Object obj) {
            ((ConnectManager) mmz.this.a.h()).r();
            mmz.this.d.a(xii.a(wit.a((ObservableSource<T>) gsw.a((ConnectManager) mmz.this.a.h()), BackpressureStrategy.BUFFER), mmz.this.c.a(), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$yN2UW7O0411KRQxxHiWMG2V470s.INSTANCE).a(wit.a(((hhc) gih.a(hhc.class)).c())).a(mmz.this.e));
        }

        public final void e() {
        }
    };

    public mmz(gtb gtb, mix mix, Flowable<PlayerState> flowable, gsw gsw, unq unq) {
        this.a = gtb;
        this.b = mix;
        this.f = wit.a((xfk<T>) flowable);
        this.g = gsw;
        this.c = unq;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.b.a(playerState.restrictions().disallowTransferringPlaybackReasons().isEmpty());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.b.a(false);
    }

    public final void a() {
        this.a.a(this.h);
        this.a.a();
        this.d.a(this.f.a(wit.a(((hhc) gih.a(hhc.class)).c())).a((xis<? super T>) new $$Lambda$mmz$7UWJVRQoawVwfvggKJHMUysbIL8<Object>(this), (xis<Throwable>) new $$Lambda$mmz$v0Ke9PkEwwYcX6tGGWdAqJCmI<Throwable>(this)));
    }

    public final void b() {
        this.d.a();
        this.a.b();
        this.a.b(this.h);
    }
}
