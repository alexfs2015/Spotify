package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;

/* renamed from: jgi reason: default package */
final class jgi {
    private final Disposable a;

    jgi(Observable<String> observable, Observable<Boolean> observable2, Observable<Boolean> observable3, kda kda, kdl kdl) {
        this.a = Observable.a((ObservableSource<? extends T1>) observable.c((Function<? super T, ? extends R>) new $$Lambda$p1kRuQTEYUf1kYvl8_HS1P7AaE<Object,Object>("car")), (ObservableSource<? extends T2>) observable2, (ObservableSource<? extends T3>) observable3, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$jgi$g4_P3KiP0Tl9L8ak9lIQmon5_sQ.INSTANCE).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a(0, Boolean.FALSE).a((Consumer<? super T>) new $$Lambda$jgi$aiokYVeu3dWF7nnRdt0u7dHGI2w<Object>(kdl, kda), (Consumer<? super Throwable>) $$Lambda$jgi$UU268LRy_u4KOo1_BLtSEZIdkLM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kdl kdl, kda kda, Boolean bool) {
        if (kdl.b()) {
            Logger.b("Starting WazeService after connection to a car %s", bool);
            kda.a(true, "com.spotify.music.internal.service.waze.WAKE_BY_CAR");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (!this.a.b()) {
            this.a.bf_();
        }
    }
}
