package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.RootListOptions;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$ikv$_f-SRIGcorr37R57zcFBH-wWNeU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$_fSRIGcorr37R57zcFBHwWNeU implements SingleOnSubscribe {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ RootListOptions f$1;

    public /* synthetic */ $$Lambda$ikv$_fSRIGcorr37R57zcFBHwWNeU(ikv ikv, RootListOptions rootListOptions) {
        this.f$0 = ikv;
        this.f$1 = rootListOptions;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}
