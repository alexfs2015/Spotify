package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$mcy$jJiksKbjfmxRxcgQo7ohYbNxHqo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mcy$jJiksKbjfmxRxcgQo7ohYbNxHqo implements Function {
    private final /* synthetic */ mce f$0;

    public /* synthetic */ $$Lambda$mcy$jJiksKbjfmxRxcgQo7ohYbNxHqo(mce mce) {
        this.f$0 = mce;
    }

    public final Object apply(Object obj) {
        return Logger.a("%s completed", this.f$0.toString());
    }
}
