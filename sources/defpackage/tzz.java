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

/* renamed from: tzz reason: default package */
public final class tzz {
    boolean a;
    private final Scheduler b;
    private final Observable<ho<String, PlayerTrack>> c;
    private final vti<Player> d;
    private Disposable e = Disposables.b();
    private uah f;
    private String g = "";
    private boolean h;
    private ObservableEmitter<Boolean> i;

    public tzz(Scheduler scheduler, Observable<ho<String, PlayerTrack>> observable, vti<Player> vti) {
        this.b = scheduler;
        this.c = observable;
        this.d = vti;
    }

    public final void a(String str, uah uah) {
        c();
        a(Boolean.TRUE);
        this.f = uah;
        this.a = true;
        this.e = this.c.a(Functions.a()).a(this.b).a((Consumer<? super T>) new $$Lambda$tzz$ItETpDhUR5jOFTBH71ET7DREOKQ<Object>(this, str), (Consumer<? super Throwable>) $$Lambda$tzz$GY9hWS8y2i2W0HUoXoCtt177Oxw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ho hoVar) {
        String str2 = (String) fay.a(hoVar.a);
        PlayerTrack playerTrack = (PlayerTrack) fay.a(hoVar.b);
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

    public final Observable<Boolean> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$tzz$og1HZcCc7ABMlMSrDpbur2yNxSo<T>(this)).e(Boolean.valueOf(this.a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.i = observableEmitter;
    }

    public final void b() {
        c();
        a(Boolean.FALSE);
    }

    private void c() {
        this.a = false;
        this.h = false;
        this.f = null;
        this.e.bf_();
    }

    private void a(Boolean bool) {
        ObservableEmitter<Boolean> observableEmitter = this.i;
        if (observableEmitter != null) {
            observableEmitter.a(bool);
        }
    }
}
