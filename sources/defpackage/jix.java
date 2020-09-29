package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;

/* renamed from: jix reason: default package */
final class jix {
    private final Disposable a;

    jix(Observable<String> observable, Observable<Boolean> observable2, Observable<Boolean> observable3, kfb kfb, kfm kfm) {
        this.a = Observable.a((ObservableSource<? extends T1>) observable.c((Function<? super T, ? extends R>) new $$Lambda$p1kRuQTEYUf1kYvl8_HS1P7AaE<Object,Object>("car")), (ObservableSource<? extends T2>) observable2, (ObservableSource<? extends T3>) observable3, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$jix$pkS1RGKY0qm2KL39akNQC3aVdbM.INSTANCE).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a(0, Boolean.FALSE).a((Consumer<? super T>) new $$Lambda$jix$T14p3rYgPoe8smY4XiF5KNBNLiA<Object>(kfm, kfb), (Consumer<? super Throwable>) $$Lambda$jix$hHWhpVqnlZ98XPqyAyPooQgoiSg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kfm kfm, kfb kfb, Boolean bool) {
        if (kfm.b()) {
            Logger.b("Starting WazeService after connection to a car %s", bool);
            kfb.a(true, "com.spotify.music.internal.service.waze.WAKE_BY_CAR");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (!this.a.b()) {
            this.a.bd_();
        }
    }
}
