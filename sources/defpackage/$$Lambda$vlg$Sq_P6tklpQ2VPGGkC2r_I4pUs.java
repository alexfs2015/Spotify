package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vlg$Sq_P6tklpQ2VPG-GkC2r_I-4pUs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vlg$Sq_P6tklpQ2VPGGkC2r_I4pUs implements ObservableTransformer {
    private final /* synthetic */ vmb f$0;

    public /* synthetic */ $$Lambda$vlg$Sq_P6tklpQ2VPGGkC2r_I4pUs(vmb vmb) {
        this.f$0 = vmb;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$FFtCWgdswNh0PtdCumhHCcQVk.INSTANCE).a(this.f$0.a()).c((Function<? super T, ? extends R>) $$Lambda$C5wEfxgFPTLiETWqEgB_7EtfYKo.INSTANCE);
    }
}
