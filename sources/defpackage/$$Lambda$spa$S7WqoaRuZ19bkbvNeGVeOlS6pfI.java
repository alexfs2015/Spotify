package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$spa$S7WqoaRuZ19bkbvNeGVeOlS6pfI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$spa$S7WqoaRuZ19bkbvNeGVeOlS6pfI implements Function {
    private final /* synthetic */ sqo f$0;

    public /* synthetic */ $$Lambda$spa$S7WqoaRuZ19bkbvNeGVeOlS6pfI(sqo sqo) {
        this.f$0 = sqo;
    }

    public final Object apply(Object obj) {
        return Logger.d((Throwable) obj, "Search online request failed for query = %s", this.f$0.b());
    }
}
