package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vlg$cajNXDWQk58jyd8RkdOXlbnKgyY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vlg$cajNXDWQk58jyd8RkdOXlbnKgyY implements ObservableTransformer {
    private final /* synthetic */ vlo f$0;

    public /* synthetic */ $$Lambda$vlg$cajNXDWQk58jyd8RkdOXlbnKgyY(vlo vlo) {
        this.f$0 = vlo;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$mE0CHAmZqNC_H9DPM28Ng5RVLIo.INSTANCE).a(this.f$0.a()).c((Function<? super T, ? extends R>) $$Lambda$0f1sz9wW9jlcCQebH0pV0FXPxyE.INSTANCE);
    }
}
