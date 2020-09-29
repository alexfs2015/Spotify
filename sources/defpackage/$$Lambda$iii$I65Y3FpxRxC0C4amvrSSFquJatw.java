package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ImageIdentifier;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$iii$I65Y3FpxRxC0C4amvrSSFquJatw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$I65Y3FpxRxC0C4amvrSSFquJatw implements SingleOnSubscribe {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ ImageIdentifier f$1;
    private final /* synthetic */ int f$2;
    private final /* synthetic */ int f$3;
    private final /* synthetic */ boolean f$4;

    public /* synthetic */ $$Lambda$iii$I65Y3FpxRxC0C4amvrSSFquJatw(iii iii, ImageIdentifier imageIdentifier, int i, int i2, boolean z) {
        this.f$0 = iii;
        this.f$1 = imageIdentifier;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = z;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, singleEmitter);
    }
}
