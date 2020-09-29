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

/* renamed from: ucn reason: default package */
public final class ucn implements fvc {
    private final SpeedControlInteractor a;
    private final List<Emitter<Integer>> b = new CopyOnWriteArrayList();
    private final fvc c;

    public ucn(SpeedControlInteractor speedControlInteractor, fvc fvc) {
        this.a = speedControlInteractor;
        this.c = fvc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fva fva) {
        Integer valueOf = Integer.valueOf(fva.h());
        for (Emitter a2 : this.b) {
            a2.a(valueOf);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        observableEmitter.a((Cancellable) new $$Lambda$ucn$3aEvel2nO_wpROkF1tZ7yNBVns(this, observableEmitter));
        this.b.add(observableEmitter);
    }

    private void a(Throwable th) {
        for (Emitter a2 : this.b) {
            a2.a(th);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ObservableEmitter observableEmitter) {
        this.b.remove(observableEmitter);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th, "Can not save speed preference", new Object[0]);
        a(th);
    }

    public final Observable<Integer> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$ucn$2LZnswnQPkh8Nna7LVjpE_2lX90<T>(this)).c((Function<? super T, ? extends R>) $$Lambda$uAVba3NyvtlMohuTfXbB66VpCs.INSTANCE);
    }

    public final void onMenuItemClick(fva fva) {
        Integer a2 = ucm.a(fva.h());
        if (a2 != null) {
            this.a.a(a2.intValue()).a((Action) new $$Lambda$ucn$j1Tq44VfneyTYcXgfaX9IU0ejwg(this, fva), (Consumer<? super Throwable>) new $$Lambda$ucn$RTbgRpCxpWd6_8oFUdKOZAU7Kjg<Object>(this));
        } else {
            a((Throwable) new RuntimeException("The selected item is not mapped to a supported speed"));
        }
        fvc fvc = this.c;
        if (fvc != null) {
            fvc.onMenuItemClick(fva);
        }
    }
}
