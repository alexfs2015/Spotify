package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: vip reason: default package */
public final class vip implements Function<Observable<Throwable>, ObservableSource<?>> {
    private final int a;
    private final long b;

    public final /* synthetic */ Object apply(Object obj) {
        return ((Observable) obj).b((ObservableSource<? extends U>) Observable.a(1, this.a + 1), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$tJNt1JtOujgek_HyzHIYtfQnhRI.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vip$kSoHolzQhY4tydVeLi606V1Y64<Object,Object>(this), false);
    }

    vip(int i, long j) {
        this.a = i;
        this.b = j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(ho hoVar) {
        Throwable th = (Throwable) fay.a(hoVar.a);
        long intValue = (long) ((Integer) fay.a(hoVar.b)).intValue();
        if (intValue == ((long) this.a)) {
            return Observable.a(th);
        }
        Logger.b("Failed %d attempt with error: %s, retrying...", Long.valueOf(intValue), th.getMessage());
        return Observable.a(this.b * intValue, TimeUnit.MILLISECONDS);
    }
}
