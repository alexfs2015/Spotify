package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vym$UyJKg-uPr4o8UUlta6KbFYGShHw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vym$UyJKguPr4o8UUlta6KbFYGShHw implements ObservableTransformer {
    private final /* synthetic */ vzh f$0;

    public /* synthetic */ $$Lambda$vym$UyJKguPr4o8UUlta6KbFYGShHw(vzh vzh) {
        this.f$0 = vzh;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$loLnE8kkL1o02lJ5u8Qe9Bm6mas.INSTANCE).a(this.f$0.a()).c((Function<? super T, ? extends R>) $$Lambda$BqTvWOLrt14qSOZd9sXBHygv840.INSTANCE);
    }
}
