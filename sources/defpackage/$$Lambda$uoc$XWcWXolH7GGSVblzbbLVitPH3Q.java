package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uoc$XW-cWXolH7GGSVblzbbLVitPH3Q reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoc$XWcWXolH7GGSVblzbbLVitPH3Q implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ Picasso f$2;
    private final /* synthetic */ a f$3;

    public /* synthetic */ $$Lambda$uoc$XWcWXolH7GGSVblzbbLVitPH3Q(Scheduler scheduler, Context context, Picasso picasso, a aVar) {
        this.f$0 = scheduler;
        this.f$1 = context;
        this.f$2 = picasso;
        this.f$3 = aVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a(this.f$0).h(new $$Lambda$uoc$JN9gesc1EWJPsbURS8lCk0_KbiY(this.f$1, this.f$2, this.f$3, this.f$0)).c((Function<? super T, ? extends R>) $$Lambda$G6mwTCvHCk6ONRb_yzV32OrF70c.INSTANCE);
    }
}
