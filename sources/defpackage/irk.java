package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;

/* renamed from: irk reason: default package */
public final class irk implements gsg {
    final hip a;
    final men b;
    final uav c;
    final xag d = new xag();
    final wue<ho<gsd, uax>> e = new wue<ho<gsd, uax>>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            ho hoVar = (ho) obj;
            gsd gsd = (gsd) fay.a(hoVar.a);
            irk.this.b.a(gsd.a(), gsd.c(), gsd.d(), gsd.b(), (uax) fay.a(hoVar.b));
        }
    };
    private final wud<PlayerState> f;
    private final gqx g;
    private final a<ConnectManager> h = new a<ConnectManager>() {
        public final void e() {
        }

        public final /* synthetic */ void a(Object obj) {
            ((ConnectManager) irk.this.a.i()).r();
            irk.this.d.a(wud.a(vun.a((ObservableSource<T>) gqx.a((ConnectManager) irk.this.a.i()), BackpressureStrategy.BUFFER), irk.this.c.a(), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$OZx3AXXokTBtKu8xn4m6Ygv0spA.INSTANCE).a(vun.a(((heg) ggw.a(heg.class)).c())).a(irk.this.e));
        }
    };

    public irk(hip hip, men men, Flowable<PlayerState> flowable, gqx gqx, uav uav) {
        this.a = hip;
        this.b = men;
        this.f = vun.a((wrf<T>) flowable);
        this.g = gqx;
        this.c = uav;
    }

    public final void a() {
        this.a.a(this.h);
        this.a.a();
        this.d.a(this.f.a(vun.a(((heg) ggw.a(heg.class)).c())).a((wun<? super T>) new $$Lambda$irk$MivlLGtS87uJBz8hUxPrqI03Bo<Object>(this), (wun<Throwable>) new $$Lambda$irk$ahGvVSJMQX1f8_3fkgmJS2JK3Fw<Throwable>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.b.a(false);
    }

    public final void b() {
        this.d.a();
        this.a.b();
        this.a.b(this.h);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.b.a(playerState.restrictions().disallowTransferringPlaybackReasons().isEmpty());
    }
}
