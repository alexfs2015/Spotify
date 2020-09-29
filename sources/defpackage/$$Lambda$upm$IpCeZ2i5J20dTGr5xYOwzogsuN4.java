package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$IpCeZ2i5J20dTGr5xYOwzogsuN4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$IpCeZ2i5J20dTGr5xYOwzogsuN4 implements ObservableTransformer {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$IpCeZ2i5J20dTGr5xYOwzogsuN4(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$upm$yJW60lJmE6hfAP8E3amKWf57C9Y<Object,Object>(this.f$0, this.f$1), false);
    }
}
