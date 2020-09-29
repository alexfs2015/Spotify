package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ous$7mlH4hg-EIuLAcld06dkG0p6k5Y reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ous$7mlH4hgEIuLAcld06dkG0p6k5Y implements Function {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$ous$7mlH4hgEIuLAcld06dkG0p6k5Y(String str) {
        this.f$0 = str;
    }

    public final Object apply(Object obj) {
        return Logger.e((Throwable) obj, "Failed to load web token for abuse url. Skip token.", new Object[0]);
    }
}
