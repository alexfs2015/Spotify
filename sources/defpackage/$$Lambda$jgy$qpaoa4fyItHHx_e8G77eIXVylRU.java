package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.net.HttpCookie;

/* renamed from: -$$Lambda$jgy$qpaoa4fyItHHx_e8G77eIXVylRU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jgy$qpaoa4fyItHHx_e8G77eIXVylRU implements SingleOnSubscribe {
    private final /* synthetic */ jgy f$0;
    private final /* synthetic */ AuthorizationRequest f$1;
    private final /* synthetic */ HttpCookie f$2;

    public /* synthetic */ $$Lambda$jgy$qpaoa4fyItHHx_e8G77eIXVylRU(jgy jgy, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        this.f$0 = jgy;
        this.f$1 = authorizationRequest;
        this.f$2 = httpCookie;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, singleEmitter);
    }
}
