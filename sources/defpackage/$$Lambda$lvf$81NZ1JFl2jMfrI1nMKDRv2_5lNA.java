package defpackage;

import android.content.Context;
import android.view.animation.Interpolator;

/* renamed from: -$$Lambda$lvf$81NZ1JFl2jMfrI1nMKDRv2_5lNA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lvf$81NZ1JFl2jMfrI1nMKDRv2_5lNA implements fva {
    private final /* synthetic */ lvf f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ Interpolator f$2;

    public /* synthetic */ $$Lambda$lvf$81NZ1JFl2jMfrI1nMKDRv2_5lNA(lvf lvf, Context context, Interpolator interpolator) {
        this.f$0 = lvf;
        this.f$1 = context;
        this.f$2 = interpolator;
    }

    public final void onScroll(float f) {
        this.f$0.a(this.f$1, this.f$2, f);
    }
}
