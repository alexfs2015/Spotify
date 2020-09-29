package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$sov$MwtmYDXppBhbvcGKGTWGivUu-80 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$sov$MwtmYDXppBhbvcGKGTWGivUu80 implements Function {
    private final /* synthetic */ sqo f$0;

    public /* synthetic */ $$Lambda$sov$MwtmYDXppBhbvcGKGTWGivUu80(sqo sqo) {
        this.f$0 = sqo;
    }

    public final Object apply(Object obj) {
        return Logger.d((Throwable) obj, "Search online request failed for query = %s", this.f$0.b());
    }
}
