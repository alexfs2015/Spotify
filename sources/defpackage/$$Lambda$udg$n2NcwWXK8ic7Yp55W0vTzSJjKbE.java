package defpackage;

import io.reactivex.CompletableTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$udg$n2NcwWXK8ic7Yp55W0vTzSJjKbE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$udg$n2NcwWXK8ic7Yp55W0vTzSJjKbE implements Function {
    private final /* synthetic */ uau f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ uwj f$2;
    private final /* synthetic */ ucy f$3;

    public /* synthetic */ $$Lambda$udg$n2NcwWXK8ic7Yp55W0vTzSJjKbE(uau uau, Scheduler scheduler, uwj uwj, ucy ucy) {
        this.f$0 = uau;
        this.f$1 = scheduler;
        this.f$2 = uwj;
        this.f$3 = ucy;
    }

    public final Object apply(Object obj) {
        return this.f$0.b().a(this.f$1).a((CompletableTransformer) new $$Lambda$udg$ySHYC51X1uTFheMxq3YpvoHTZ5A(this.f$2, this.f$3)).a((ObservableSource<T>) Observable.c());
    }
}
