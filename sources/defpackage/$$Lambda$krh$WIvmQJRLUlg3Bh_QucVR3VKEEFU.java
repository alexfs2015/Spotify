package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$krh$WIvmQJRLUlg3Bh_QucVR3VKEEFU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krh$WIvmQJRLUlg3Bh_QucVR3VKEEFU implements ObservableTransformer {
    private final /* synthetic */ krk f$0;

    public /* synthetic */ $$Lambda$krh$WIvmQJRLUlg3Bh_QucVR3VKEEFU(krk krk) {
        this.f$0 = krk;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$krh$DeDtmpAMnP_861wyPHq71wCs(this.f$0)).e((Function<? super Throwable, ? extends T>) $$Lambda$krh$3ayvCAo8XRb6mrj_gOB0XkVJ5p4.INSTANCE);
    }
}
