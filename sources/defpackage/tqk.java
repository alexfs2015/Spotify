package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Action;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: tqk reason: default package */
public final class tqk implements fui {
    private final SpeedControlInteractor a;
    private final List<Emitter<Integer>> b = new CopyOnWriteArrayList();
    private final fui c;

    public tqk(SpeedControlInteractor speedControlInteractor, fui fui) {
        this.a = speedControlInteractor;
        this.c = fui;
    }

    public final void onMenuItemClick(fug fug) {
        Integer a2 = tqj.a(fug.h());
        if (a2 != null) {
            this.a.a(a2.intValue()).a((Action) new $$Lambda$tqk$PJV3Wj4TePf_NmEILiGrEf4DYJ8(this, fug), (Consumer<? super Throwable>) new $$Lambda$tqk$i7Ohks08Lq_NSJGforqLngA5WA<Object>(this));
        } else {
            a((Throwable) new RuntimeException("The selected item is not mapped to a supported speed"));
        }
        fui fui = this.c;
        if (fui != null) {
            fui.onMenuItemClick(fug);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fug fug) {
        Integer valueOf = Integer.valueOf(fug.h());
        for (Emitter a2 : this.b) {
            a2.a(valueOf);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th, "Can not save speed preference", new Object[0]);
        a(th);
    }

    private void a(Throwable th) {
        for (Emitter a2 : this.b) {
            a2.a(th);
        }
    }

    public final Observable<Integer> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$tqk$42z6nXIfneHx11le2ORd5PhVIqI<T>(this)).c((Function<? super T, ? extends R>) $$Lambda$GtnULJTaLUugBb32HVTwrUS2Ofg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        observableEmitter.a((Cancellable) new $$Lambda$tqk$s6mKb23qwSo8XlT_iMCrpQaMOM(this, observableEmitter));
        this.b.add(observableEmitter);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ObservableEmitter observableEmitter) {
        this.b.remove(observableEmitter);
    }
}
