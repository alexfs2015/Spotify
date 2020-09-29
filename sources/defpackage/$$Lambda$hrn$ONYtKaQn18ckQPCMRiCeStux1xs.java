package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$hrn$ONYtKaQn18ckQPCMRiCeStux1xs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hrn$ONYtKaQn18ckQPCMRiCeStux1xs implements SingleOnSubscribe {
    private final /* synthetic */ hrn f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;
    private final /* synthetic */ hrk f$3;

    public /* synthetic */ $$Lambda$hrn$ONYtKaQn18ckQPCMRiCeStux1xs(hrn hrn, String str, String str2, hrk hrk) {
        this.f$0 = hrn;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = hrk;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, singleEmitter);
    }
}
