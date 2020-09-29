package defpackage;

import android.app.Activity;
import android.net.Uri;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hvw$NFmA7kuKZAp1wGBFYALEGlmn2Ww reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hvw$NFmA7kuKZAp1wGBFYALEGlmn2Ww implements Consumer {
    private final /* synthetic */ fpg f$0;
    private final /* synthetic */ Activity f$1;

    public /* synthetic */ $$Lambda$hvw$NFmA7kuKZAp1wGBFYALEGlmn2Ww(fpg fpg, Activity activity) {
        this.f$0 = fpg;
        this.f$1 = activity;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Uri) obj);
    }
}
