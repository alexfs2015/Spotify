package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$spa$di_tX13ZeQV78UECuTIuIp3L2eU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$spa$di_tX13ZeQV78UECuTIuIp3L2eU implements Function {
    private final /* synthetic */ sqo f$0;

    public /* synthetic */ $$Lambda$spa$di_tX13ZeQV78UECuTIuIp3L2eU(sqo sqo) {
        this.f$0 = sqo;
    }

    public final Object apply(Object obj) {
        return Logger.d((Throwable) obj, "Search offline request failed for query = %s", this.f$0.b());
    }
}
