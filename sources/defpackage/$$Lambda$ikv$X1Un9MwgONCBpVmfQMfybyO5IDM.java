package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Uri;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$ikv$X1Un9MwgONCBpVmfQMfybyO5IDM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$X1Un9MwgONCBpVmfQMfybyO5IDM implements SingleOnSubscribe {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$ikv$X1Un9MwgONCBpVmfQMfybyO5IDM(ikv ikv, Uri uri) {
        this.f$0 = ikv;
        this.f$1 = uri;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}
