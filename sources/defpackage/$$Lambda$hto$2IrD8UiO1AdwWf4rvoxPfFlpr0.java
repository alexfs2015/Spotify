package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$hto$-2IrD8UiO1AdwWf4rvoxPfFlpr0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hto$2IrD8UiO1AdwWf4rvoxPfFlpr0 implements SingleOnSubscribe {
    private final /* synthetic */ hto f$0;
    private final /* synthetic */ huo f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$hto$2IrD8UiO1AdwWf4rvoxPfFlpr0(hto hto, huo huo, String str) {
        this.f$0 = hto;
        this.f$1 = huo;
        this.f$2 = str;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, singleEmitter);
    }
}
