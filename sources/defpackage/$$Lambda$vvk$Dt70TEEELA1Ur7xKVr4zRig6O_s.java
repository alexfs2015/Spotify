package defpackage;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$vvk$Dt70TEEELA1Ur7xKVr4zRig6O_s reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vvk$Dt70TEEELA1Ur7xKVr4zRig6O_s implements Cancellable {
    private final /* synthetic */ vvk f$0;
    private final /* synthetic */ Disposable f$1;
    private final /* synthetic */ String f$2;
    private final /* synthetic */ vvl f$3;

    public /* synthetic */ $$Lambda$vvk$Dt70TEEELA1Ur7xKVr4zRig6O_s(vvk vvk, Disposable disposable, String str, vvl vvl) {
        this.f$0 = vvk;
        this.f$1 = disposable;
        this.f$2 = str;
        this.f$3 = vvl;
    }

    public final void cancel() {
        this.f$0.a(this.f$1, this.f$2, this.f$3);
    }
}
