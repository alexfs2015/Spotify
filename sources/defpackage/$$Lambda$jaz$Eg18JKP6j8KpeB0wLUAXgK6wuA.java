package defpackage;

import android.app.Activity;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$jaz$Eg18JKP6-j8KpeB0wLUAXgK6wuA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jaz$Eg18JKP6j8KpeB0wLUAXgK6wuA implements Function {
    private final /* synthetic */ jaz f$0;
    private final /* synthetic */ ShareEventLogger f$1;
    private final /* synthetic */ izq f$2;
    private final /* synthetic */ jbn f$3;
    private final /* synthetic */ long f$4;
    private final /* synthetic */ Activity f$5;

    public /* synthetic */ $$Lambda$jaz$Eg18JKP6j8KpeB0wLUAXgK6wuA(jaz jaz, ShareEventLogger shareEventLogger, izq izq, jbn jbn, long j, Activity activity) {
        this.f$0 = jaz;
        this.f$1 = shareEventLogger;
        this.f$2 = izq;
        this.f$3 = jbn;
        this.f$4 = j;
        this.f$5 = activity;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Optional) obj);
    }
}
