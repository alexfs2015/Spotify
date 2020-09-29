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

/* renamed from: svd reason: default package */
public final class svd {
    public final svf a;
    final suz b;
    final spi c;
    public final CompositeDisposable d = new CompositeDisposable();
    private final Flowable<PlayerState> e;
    private final suv f;
    private final Scheduler g;

    public svd(Flowable<PlayerState> flowable, svf svf, suv suv, Scheduler scheduler, suz suz, spi spi) {
        this.e = flowable;
        this.f = suv;
        this.a = svf;
        this.g = scheduler;
        this.b = suz;
        this.c = spi;
    }

    public Disposable a(svh svh) {
        return this.e.a((Predicate<? super T>) $$Lambda$svd$f6g5GxZIkWdEdz1rFvGXEXeCwV8.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$9Eiwhq_IPhBySe2gl3YhPRxq3DI.INSTANCE).a(Functions.a()).e(new $$Lambda$svd$MDWqA08V1GYfj_DbhYD8NqPq3A(this)).a(this.g).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$svd$_J4irCxWxn73VLBJS7fPsv_V1MY<Object>(this, svh), (Consumer<? super Throwable>) $$Lambda$svd$pGTuDlvSUwJomLPAG4CBlz9L9WM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return playerState.track() != null;
    }

    /* access modifiers changed from: private */
    public Flowable<svc> a(ImmutableList<String> immutableList) {
        return this.f.a(immutableList).f($$Lambda$KNa6bYgrmY9pfqza9z4xREBYP_k.INSTANCE).c().c(new b()).d((Function<? super Throwable, ? extends T>) $$Lambda$svd$d0Ua2zEraM4rOZhBMOhl07nsekc.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ svc a(Throwable th) {
        return new a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(svh svh, svc svc) {
        if (svc instanceof c) {
            ImmutableList<suu> immutableList = ((c) svc).a;
            this.a.a();
            fdh R_ = immutableList.R_();
            while (R_.hasNext()) {
                suu suu = (suu) R_.next();
                svf svf = this.a;
                String d2 = suu.d();
                svf.b.preparePlay(svf.a(d2), null, new PreparePlayCallback(d2) {
                    private /* synthetic */ String a;

                    public final void onPreparePlayFailed() {
                    }

                    {
                        this.a = r2;
                    }

                    public final void onPreparePlaySuccess(PlayerSession playerSession) {
                        synchronized (svf.this) {
                            svf.this.a.put(this.a, playerSession);
                        }
                    }
                });
            }
        }
        svh.a(svc);
    }
}
