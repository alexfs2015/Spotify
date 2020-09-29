package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ubh$J0mbIq39RBXCwb75foOKbJh8G6s reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ubh$J0mbIq39RBXCwb75foOKbJh8G6s implements Function {
    private final /* synthetic */ uau f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ uwj f$2;
    private final /* synthetic */ Context f$3;

    public /* synthetic */ $$Lambda$ubh$J0mbIq39RBXCwb75foOKbJh8G6s(uau uau, Scheduler scheduler, uwj uwj, Context context) {
        this.f$0 = uau;
        this.f$1 = scheduler;
        this.f$2 = uwj;
        this.f$3 = context;
    }

    public final Object apply(Object obj) {
        return ubh.a(this.f$0, this.f$1, this.f$2, this.f$3, (b) obj);
    }
}
