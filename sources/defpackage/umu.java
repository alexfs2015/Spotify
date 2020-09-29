package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: umu reason: default package */
public final class umu {
    boolean a;
    private final Scheduler b;
    private final Observable<ho<String, PlayerTrack>> c;
    private final who<Player> d;
    private Disposable e = Disposables.b();
    private unc f;
    private String g = "";
    private boolean h;
    private ObservableEmitter<Boolean> i;

    public umu(Scheduler scheduler, Observable<ho<String, PlayerTrack>> observable, who<Player> who) {
        this.b = scheduler;
        this.c = observable;
        this.d = who;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.i = observableEmitter;
    }

    private void a(Boolean bool) {
        ObservableEmitter<Boolean> observableEmitter = this.i;
        if (observableEmitter != null) {
            observableEmitter.a(bool);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ho hoVar) {
        String str2 = (String) fbp.a(hoVar.a);
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(hoVar.b);
        boolean z = true;
        if (!this.h || !(!this.g.equals(str2))) {
            z = false;
        }
        if (z) {
            ((Player) this.d.get()).pause();
            c();
            a(Boolean.FALSE);
        }
        this.h = playerTrack.uri().equals(str);
        this.g = str2;
    }

    private void c() {
        this.a = false;
        this.h = false;
        this.f = null;
        this.e.bd_();
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$umu$9lpECUGKc8Z_RBs_ib9Ebmost44<T>(this)).e(Boolean.valueOf(this.a));
    }

    public final void a(String str, unc unc) {
        c();
        a(Boolean.TRUE);
        this.f = unc;
        this.a = true;
        this.e = this.c.a(Functions.a()).a(this.b).a((Consumer<? super T>) new $$Lambda$umu$C_o7HykUC1mhpSU4QpVwvRccoY<Object>(this, str), (Consumer<? super Throwable>) $$Lambda$umu$huExeHB1P3sqPkIPRtxXQdpXgwg.INSTANCE);
    }

    public final void b() {
        c();
        a(Boolean.FALSE);
    }
}
