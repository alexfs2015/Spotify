package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ImageIdentifier;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$ikv$hupm4liUfqaRI38-L3Kd7nk1u6E reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$hupm4liUfqaRI38L3Kd7nk1u6E implements SingleOnSubscribe {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ ImageIdentifier f$1;
    private final /* synthetic */ int f$2;
    private final /* synthetic */ int f$3;
    private final /* synthetic */ boolean f$4;

    public /* synthetic */ $$Lambda$ikv$hupm4liUfqaRI38L3Kd7nk1u6E(ikv ikv, ImageIdentifier imageIdentifier, int i, int i2, boolean z) {
        this.f$0 = ikv;
        this.f$1 = imageIdentifier;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = z;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, singleEmitter);
    }
}
