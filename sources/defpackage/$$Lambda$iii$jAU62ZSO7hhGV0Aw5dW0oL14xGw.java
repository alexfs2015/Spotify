package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Uri;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$iii$jAU62ZSO7hhGV0Aw5dW0oL14xGw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$jAU62ZSO7hhGV0Aw5dW0oL14xGw implements SingleOnSubscribe {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$iii$jAU62ZSO7hhGV0Aw5dW0oL14xGw(iii iii, Uri uri) {
        this.f$0 = iii;
        this.f$1 = uri;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}
