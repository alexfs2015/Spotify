package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$lyx$SGiIVzeyKb44xvTYzCKlN2OV_MA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lyx$SGiIVzeyKb44xvTYzCKlN2OV_MA implements Function {
    private final /* synthetic */ lyd f$0;

    public /* synthetic */ $$Lambda$lyx$SGiIVzeyKb44xvTYzCKlN2OV_MA(lyd lyd) {
        this.f$0 = lyd;
    }

    public final Object apply(Object obj) {
        return Logger.a("%s completed", this.f$0.toString());
    }
}
