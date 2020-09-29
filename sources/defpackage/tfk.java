package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.Player.PreparePlayCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSession;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: tfk reason: default package */
public final class tfk {
    public final tfm a;
    final tfg b;
    final szp c;
    public final CompositeDisposable d = new CompositeDisposable();
    private final Flowable<PlayerState> e;
    private final tfc f;
    private final Scheduler g;

    public tfk(Flowable<PlayerState> flowable, tfm tfm, tfc tfc, Scheduler scheduler, tfg tfg, szp szp) {
        this.e = flowable;
        this.f = tfc;
        this.a = tfm;
        this.g = scheduler;
        this.b = tfg;
        this.c = szp;
    }

    /* access modifiers changed from: private */
    public Flowable<tfj> a(ImmutableList<String> immutableList) {
        return this.f.a(immutableList).f($$Lambda$e9ElaAmBlZckfOVmb9lWp1BcbrQ.INSTANCE).c().c(new b()).d((Function<? super Throwable, ? extends T>) $$Lambda$tfk$liBtt4jYD1gds7UnNq96HWjH0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tfj a(Throwable th) {
        return new a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tfo tfo, tfj tfj) {
        if (tfj instanceof c) {
            ImmutableList<tfb> immutableList = ((c) tfj).a;
            this.a.a();
            fdz R_ = immutableList.R_();
            while (R_.hasNext()) {
                tfb tfb = (tfb) R_.next();
                tfm tfm = this.a;
                String d2 = tfb.d();
                tfm.b.preparePlay(tfm.a(d2), null, new PreparePlayCallback(d2) {
                    private /* synthetic */ String a;

                    {
                        this.a = r2;
                    }

                    public final void onPreparePlayFailed() {
                    }

                    public final void onPreparePlaySuccess(PlayerSession playerSession) {
                        synchronized (tfm.this) {
                            tfm.this.a.put(this.a, playerSession);
                        }
                    }
                });
            }
        }
        tfo.a(tfj);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return playerState.track() != null;
    }

    public Disposable a(tfo tfo) {
        return this.e.a((Predicate<? super T>) $$Lambda$tfk$s8Jx9sjDK0UH4c4S1MJSR1iYFV0.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$U_S1wkiXhao7OfLHWgOO6mZ1HoY.INSTANCE).a(Functions.a()).e(new $$Lambda$tfk$IyZK9XYdhJGHyfRn7Yiy99uTs3Y(this)).a(this.g).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$tfk$pkAd1ry9LO40QTwmopWmoXGoE<Object>(this, tfo), (Consumer<? super Throwable>) $$Lambda$tfk$XJDa0VbQM0gy0N4naRtPSkMBlA.INSTANCE);
    }
}
