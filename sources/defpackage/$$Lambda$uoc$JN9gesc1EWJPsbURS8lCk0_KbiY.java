package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uoc$JN9gesc1EWJPsbURS8lCk0_KbiY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uoc$JN9gesc1EWJPsbURS8lCk0_KbiY implements Function {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ Picasso f$1;
    private final /* synthetic */ a f$2;
    private final /* synthetic */ Scheduler f$3;

    public /* synthetic */ $$Lambda$uoc$JN9gesc1EWJPsbURS8lCk0_KbiY(Context context, Picasso picasso, a aVar, Scheduler scheduler) {
        this.f$0 = context;
        this.f$1 = picasso;
        this.f$2 = aVar;
        this.f$3 = scheduler;
    }

    public final Object apply(Object obj) {
        return uoc.a(this.f$0, this.f$1, this.f$2, this.f$3, (a) obj);
    }
}
