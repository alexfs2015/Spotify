package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$HFWacBNH0XteQ81dKjNqkhiQCkU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$HFWacBNH0XteQ81dKjNqkhiQCkU implements ObservableTransformer {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$HFWacBNH0XteQ81dKjNqkhiQCkU(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$upm$S4rbz_scLDxcHh8NEkC3gI4RW34<Object,Object>(this.f$0, this.f$1), false);
    }
}
