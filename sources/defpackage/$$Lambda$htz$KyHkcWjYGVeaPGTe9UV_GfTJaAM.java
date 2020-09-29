package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$htz$KyHkcWjYGVeaPGTe9UV_GfTJaAM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$htz$KyHkcWjYGVeaPGTe9UV_GfTJaAM implements SingleOnSubscribe {
    private final /* synthetic */ htz f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;
    private final /* synthetic */ htw f$3;

    public /* synthetic */ $$Lambda$htz$KyHkcWjYGVeaPGTe9UV_GfTJaAM(htz htz, String str, String str2, htw htw) {
        this.f$0 = htz;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = htw;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, singleEmitter);
    }
}
