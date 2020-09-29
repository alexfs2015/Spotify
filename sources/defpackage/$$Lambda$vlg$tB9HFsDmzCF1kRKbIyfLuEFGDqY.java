package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vlg$tB9HFsDmzCF1kRKbIyfLuEFGDqY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vlg$tB9HFsDmzCF1kRKbIyfLuEFGDqY implements ObservableTransformer {
    private final /* synthetic */ vkn f$0;

    public /* synthetic */ $$Lambda$vlg$tB9HFsDmzCF1kRKbIyfLuEFGDqY(vkn vkn) {
        this.f$0 = vkn;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$S7YFqab6Zgbl308oqCGSJTsJog.INSTANCE).a(this.f$0.a()).c((Function<? super T, ? extends R>) $$Lambda$jPgoUaVX920WEgudzOIqGIIKs_M.INSTANCE);
    }
}
