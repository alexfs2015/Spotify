package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: upf reason: default package */
public final class upf {
    public final SerialDisposable a = new SerialDisposable();
    private final Context b;
    private final unp c;
    private final Scheduler d;
    private final hgy e;
    private final lbs f;
    private final NotificationManager g;
    private final ToastieManager h;
    private final upn i;

    public upf(Context context, unp unp, Scheduler scheduler, hgy hgy, lbs lbs, NotificationManager notificationManager, ToastieManager toastieManager, upn upn) {
        this.b = context;
        this.c = unp;
        this.d = scheduler;
        this.e = hgy;
        this.f = lbs;
        this.g = notificationManager;
        this.h = toastieManager;
        this.i = upn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Boolean bool) {
        return bool.booleanValue() ? Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$upf$V7OCHEqLjnlfVij0J7QEngaCpo<Object>(this)).c((Consumer<? super Disposable>) $$Lambda$upf$0lk9WkWBOCoYkuIxWnMrKtN8wNc.INSTANCE).a((Action) $$Lambda$upf$cEw5_ohFJm2CoClHf1Jq2EuGOQ.INSTANCE).g() : Completable.a();
    }

    private Observable<Boolean> b() {
        return this.e.a().j().a((Predicate<? super T>) $$Lambda$qTcPNaUa6AH8fr8X7JVMhLzoOTk.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$yKGCaqsUcwCriLUhN2HqW_r3BwM.INSTANCE).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe c() {
        return new kom(this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource e() {
        Observable d2 = Observable.d();
        $$Lambda$qxYnV46_DzqcbFK39Ad3g0R9Noc r1 = $$Lambda$qxYnV46_DzqcbFK39Ad3g0R9Noc.INSTANCE;
        Context context = this.b;
        upn upn = this.i;
        ToastieManager toastieManager = this.h;
        NotificationManager notificationManager = this.g;
        lbs lbs = this.f;
        Scheduler scheduler = this.d;
        a b2 = kok.a((kni<M, E, F>) r1, kok.a().a(i.class, upm.a(upn)).a(j.class, upm.b(upn)).a(a.class, upm.a(context, toastieManager)).a(g.class, upm.b(context, toastieManager)).a(f.class, upm.c(context, toastieManager)).a(c.class, upm.d(context, toastieManager)).a(b.class, upm.a(context, notificationManager, lbs)).a(h.class, upm.a(context, toastieManager, scheduler)).a(e.class, upm.b(context, toastieManager, scheduler)).a(d.class, upm.e(context, toastieManager)).a(k.class, upm.a(context, lbs)).a(l.class, upm.b(context, lbs)).a()).a((kmx<M, F>) $$Lambda$b9BFkPDI6qYKRv_sfyEH1HENEE.INSTANCE).a(koj.a(this.c.a().c((Function<? super T, ? extends R>) $$Lambda$1S6xluDdAqUXr48xZ765cB0FAc.INSTANCE))).b(new $$Lambda$upf$Z0tbMXN0Hq78VNInqaJriuBERHQ(this));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        DebugFlag debugFlag2 = DebugFlag.SOCIAL_LISTENING_EDUCATION;
        boolean a2 = this.i.c.a(upn.a, false);
        return d2.a(kok.a((c<M, E, F>) b2, upl.e().a(uns.a).a(a2).b(this.i.c.a(upn.b, false)).a()));
    }

    public Completable a() {
        return b().i(new $$Lambda$upf$vGL0ty48HzMuxueiHdzhpOZ_lXc(this));
    }
}
