package defpackage;

import com.squareup.picasso.Picasso;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$sys$WdpqzHCvvOZN6xUpWov5-qSmuSw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sys$WdpqzHCvvOZN6xUpWov5qSmuSw implements Cancellable {
    private final /* synthetic */ Picasso f$0;
    private final /* synthetic */ syr f$1;

    public /* synthetic */ $$Lambda$sys$WdpqzHCvvOZN6xUpWov5qSmuSw(Picasso picasso, syr syr) {
        this.f$0 = picasso;
        this.f$1 = syr;
    }

    public final void cancel() {
        this.f$0.d(this.f$1);
    }
}
