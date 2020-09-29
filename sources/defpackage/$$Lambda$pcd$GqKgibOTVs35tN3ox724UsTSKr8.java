package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pcd$GqKgibOTVs35tN3ox724UsTSKr8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pcd$GqKgibOTVs35tN3ox724UsTSKr8 implements Function {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$pcd$GqKgibOTVs35tN3ox724UsTSKr8(String str) {
        this.f$0 = str;
    }

    public final Object apply(Object obj) {
        return Logger.e((Throwable) obj, "Failed to load web token for abuse url. Skip token.", new Object[0]);
    }
}
