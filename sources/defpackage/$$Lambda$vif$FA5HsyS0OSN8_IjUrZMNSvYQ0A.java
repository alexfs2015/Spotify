package defpackage;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$vif$FA5HsyS0OSN8_IjUrZMNSvY-Q0A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vif$FA5HsyS0OSN8_IjUrZMNSvYQ0A implements Cancellable {
    private final /* synthetic */ vif f$0;
    private final /* synthetic */ Disposable f$1;
    private final /* synthetic */ String f$2;
    private final /* synthetic */ vig f$3;

    public /* synthetic */ $$Lambda$vif$FA5HsyS0OSN8_IjUrZMNSvYQ0A(vif vif, Disposable disposable, String str, vig vig) {
        this.f$0 = vif;
        this.f$1 = disposable;
        this.f$2 = str;
        this.f$3 = vig;
    }

    public final void cancel() {
        this.f$0.a(this.f$1, this.f$2, this.f$3);
    }
}
