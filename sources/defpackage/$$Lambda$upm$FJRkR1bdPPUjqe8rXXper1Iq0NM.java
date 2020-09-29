package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$FJRkR1bdPPUjqe8rXXper1Iq0NM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$FJRkR1bdPPUjqe8rXXper1Iq0NM implements ObservableTransformer {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$FJRkR1bdPPUjqe8rXXper1Iq0NM(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$upm$0iE8WWESNZrUJtG6LygYFjmg5A0<Object,Object>(this.f$0, this.f$1), false);
    }
}
