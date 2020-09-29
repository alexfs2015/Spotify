package defpackage;

import android.content.Context;
import android.view.animation.Interpolator;

/* renamed from: -$$Lambda$lze$XjLIJQtn8MKfAS4PEKzRQ4rrXxM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lze$XjLIJQtn8MKfAS4PEKzRQ4rrXxM implements fvu {
    private final /* synthetic */ lze f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ Interpolator f$2;

    public /* synthetic */ $$Lambda$lze$XjLIJQtn8MKfAS4PEKzRQ4rrXxM(lze lze, Context context, Interpolator interpolator) {
        this.f$0 = lze;
        this.f$1 = context;
        this.f$2 = interpolator;
    }

    public final void onScroll(float f) {
        this.f$0.a(this.f$1, this.f$2, f);
    }
}
