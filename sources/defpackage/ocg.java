package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: ocg reason: default package */
public final class ocg {
    private final gvk a;
    private final hgy b;
    private final ocj c;

    public ocg(gvk gvk, hgy hgy, ocj ocj) {
        this.a = gvk;
        this.b = hgy;
        this.c = ocj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return bool.booleanValue() ? this.a.a : Observable.c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(fqn fqn) {
        return Boolean.valueOf(fqn.a(sen.a) == RolloutFlag.ENABLED);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableSource<? extends T1>) this.b.a().j().c((Function<? super T, ? extends R>) $$Lambda$ocg$Hw7e0WpBq65B5U9UySpmRX8cnCs.INSTANCE), (ObservableSource<? extends T2>) this.c.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$ocg$7OSlppU7RKhaWZLv7x5cERQQZ8k.INSTANCE).h(new $$Lambda$ocg$bxdL8PNj1EvViqC7IZv4bytGlTc(this));
    }
}
