package defpackage;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$lrp$1$1JI5ABikayYMuRk42k6sagfAb7s reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lrp$1$1JI5ABikayYMuRk42k6sagfAb7s implements Callable {
    private final /* synthetic */ lrf f$0;
    private final /* synthetic */ lqv f$1;

    public /* synthetic */ $$Lambda$lrp$1$1JI5ABikayYMuRk42k6sagfAb7s(lrf lrf, lqv lqv) {
        this.f$0 = lrf;
        this.f$1 = lqv;
    }

    public final Object call() {
        return Observable.b(this.f$0.a(this.f$1));
    }
}
