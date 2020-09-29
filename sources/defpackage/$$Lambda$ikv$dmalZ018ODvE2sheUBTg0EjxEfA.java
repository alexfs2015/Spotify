package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Uri;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ikv$dmalZ018ODvE2sheUBTg0EjxEfA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$dmalZ018ODvE2sheUBTg0EjxEfA implements Function {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$ikv$dmalZ018ODvE2sheUBTg0EjxEfA(ikv ikv, Uri uri) {
        this.f$0 = ikv;
        this.f$1 = uri;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (PlayerState) obj);
    }
}
