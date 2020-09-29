package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$set$QMRl2lvZFFCYJ3fknKTk1PyuJtE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$set$QMRl2lvZFFCYJ3fknKTk1PyuJtE implements Function {
    private final /* synthetic */ sgh f$0;

    public /* synthetic */ $$Lambda$set$QMRl2lvZFFCYJ3fknKTk1PyuJtE(sgh sgh) {
        this.f$0 = sgh;
    }

    public final Object apply(Object obj) {
        return Logger.d((Throwable) obj, "Search offline request failed for query = %s", this.f$0.b());
    }
}
