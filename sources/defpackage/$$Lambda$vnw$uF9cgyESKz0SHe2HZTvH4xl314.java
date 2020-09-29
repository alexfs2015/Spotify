package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vnw$uF9cgyESKz0SHe2HZTvH-4xl314 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vnw$uF9cgyESKz0SHe2HZTvH4xl314 implements ObservableTransformer {
    private final /* synthetic */ voi f$0;

    public /* synthetic */ $$Lambda$vnw$uF9cgyESKz0SHe2HZTvH4xl314(voi voi) {
        this.f$0 = voi;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vnw$XxXoXHAohA9E2Em4rAJFuunnue0<Object,Object>(this.f$0), false);
    }
}
