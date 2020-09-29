package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: uck reason: default package */
public final class uck {
    public final SerialDisposable a = new SerialDisposable();
    private final Context b;
    private final uau c;
    private final Scheduler d;
    private final hec e;
    private final kyj f;
    private final NotificationManager g;
    private final ToastieManager h;
    private final ucs i;

    public uck(Context context, uau uau, Scheduler scheduler, hec hec, kyj kyj, NotificationManager notificationManager, ToastieManager toastieManager, ucs ucs) {
        this.b = context;
        this.c = uau;
        this.d = scheduler;
        this.e = hec;
        this.f = kyj;
        this.g = notificationManager;
        this.h = toastieManager;
        this.i = ucs;
    }

    public final void a() {
        this.a.a(this.e.a().j().a((Predicate<? super T>) $$Lambda$i33qTocIRf9FcULl8qHblXtgJw.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$EjJZeKrOo9tiXSLxWW9DcIFkDZI.INSTANCE).a(Functions.a()).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).c(1).g().a((ObservableSource<T>) Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$uck$LayBEEGyOEc5NeptvZGuaxtmM<Object>(this))).c((Consumer<? super Disposable>) $$Lambda$uck$NBzFLeOoot6J1sVMJEpPCtKGj4A.INSTANCE).c((Consumer<? super Disposable>) $$Lambda$uck$jUe3JUBNHnng439EinDqO5y_mE.INSTANCE).i());
    }

    /* access modifiers changed from: private */
    public Observable<ucq> b() {
        Observable d2 = Observable.d();
        $$Lambda$ZUPuRYuiMwwLFQqQgIehXWQbl0Y r1 = $$Lambda$ZUPuRYuiMwwLFQqQgIehXWQbl0Y.INSTANCE;
        Context context = this.b;
        uau uau = this.c;
        ucs ucs = this.i;
        ToastieManager toastieManager = this.h;
        NotificationManager notificationManager = this.g;
        kyj kyj = this.f;
        Scheduler scheduler = this.d;
        a b2 = klb.a((kjz<M, E, F>) r1, klb.a().a(a.class, ucr.a(uau)).a(j.class, ucr.a(ucs)).a(k.class, ucr.b(ucs)).a(b.class, ucr.a(context, toastieManager)).a(h.class, ucr.b(context, toastieManager)).a(g.class, ucr.c(context, toastieManager)).a(d.class, ucr.d(context, toastieManager)).a(c.class, ucr.a(context, notificationManager, kyj)).a(i.class, ucr.a(context, toastieManager, scheduler)).a(f.class, ucr.b(context, toastieManager, scheduler)).a(e.class, ucr.e(context, toastieManager)).a(l.class, ucr.a(context, kyj)).a(m.class, ucr.b(context, kyj)).a()).a((kjo<M, F>) $$Lambda$nptFHdoOQdtZEhPBnQHdwwJuLps.INSTANCE).a(kla.a(this.c.a().c((Function<? super T, ? extends R>) $$Lambda$Ay_VymCYVS1oJkJXxBSABoCkds.INSTANCE))).b(new $$Lambda$uck$LbKbj1v9TRYQz0sK8HN50qgVNlY(this));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        DebugFlag debugFlag2 = DebugFlag.SOCIAL_LISTENING_EDUCATION;
        boolean a2 = this.i.c.a(ucs.a, false);
        return d2.a(klb.a((c<M, E, F>) b2, ucq.e().a(uax.a).a(a2).b(this.i.c.a(ucs.b, false)).a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv c() {
        return new kld(this.d);
    }
}
