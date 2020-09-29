package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.net.HttpCookie;

/* renamed from: -$$Lambda$jej$xNUpH-htO6ibklqfWwogoDCw5Z0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jej$xNUpHhtO6ibklqfWwogoDCw5Z0 implements SingleOnSubscribe {
    private final /* synthetic */ jej f$0;
    private final /* synthetic */ AuthorizationRequest f$1;
    private final /* synthetic */ HttpCookie f$2;

    public /* synthetic */ $$Lambda$jej$xNUpHhtO6ibklqfWwogoDCw5Z0(jej jej, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        this.f$0 = jej;
        this.f$1 = authorizationRequest;
        this.f$2 = httpCookie;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, singleEmitter);
    }
}
