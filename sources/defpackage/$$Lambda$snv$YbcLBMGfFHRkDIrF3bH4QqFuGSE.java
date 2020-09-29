package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$snv$YbcLBMGfFHRkDIrF3bH4QqFuGSE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$snv$YbcLBMGfFHRkDIrF3bH4QqFuGSE implements Function {
    private final /* synthetic */ sqo f$0;

    public /* synthetic */ $$Lambda$snv$YbcLBMGfFHRkDIrF3bH4QqFuGSE(sqo sqo) {
        this.f$0 = sqo;
    }

    public final Object apply(Object obj) {
        return Logger.a("Offline search for query <%s> completed", this.f$0.a.a.b());
    }
}
