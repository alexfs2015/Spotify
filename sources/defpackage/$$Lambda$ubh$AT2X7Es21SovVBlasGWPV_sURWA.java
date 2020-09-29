package defpackage;

import android.content.Context;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$ubh$AT2X7Es21SovVBlasGWPV_sURWA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ubh$AT2X7Es21SovVBlasGWPV_sURWA implements ObservableTransformer {
    private final /* synthetic */ uau f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ uwj f$2;
    private final /* synthetic */ Context f$3;

    public /* synthetic */ $$Lambda$ubh$AT2X7Es21SovVBlasGWPV_sURWA(uau uau, Scheduler scheduler, uwj uwj, Context context) {
        this.f$0 = uau;
        this.f$1 = scheduler;
        this.f$2 = uwj;
        this.f$3 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$ubh$J0mbIq39RBXCwb75foOKbJh8G6s(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}
