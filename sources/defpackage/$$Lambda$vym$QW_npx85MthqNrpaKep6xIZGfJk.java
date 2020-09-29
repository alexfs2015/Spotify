package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vym$QW_npx85MthqNrpaKep6xIZGfJk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vym$QW_npx85MthqNrpaKep6xIZGfJk implements ObservableTransformer {
    private final /* synthetic */ vyu f$0;

    public /* synthetic */ $$Lambda$vym$QW_npx85MthqNrpaKep6xIZGfJk(vyu vyu) {
        this.f$0 = vyu;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$_qtQysx_vae_g56xTRni_f7uHIg.INSTANCE).a(this.f$0.a()).c((Function<? super T, ? extends R>) $$Lambda$PjJBr5l7xUv_Vpq0XhscKden5Tg.INSTANCE);
    }
}
