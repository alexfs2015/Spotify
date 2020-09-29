package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: -$$Lambda$obs$-6L8bifLW43OOLAGEpT61AG9o9c reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$obs$6L8bifLW43OOLAGEpT61AG9o9c implements Function {
    private final /* synthetic */ obs f$0;
    private final /* synthetic */ AuthorizationRequest f$1;

    public /* synthetic */ $$Lambda$obs$6L8bifLW43OOLAGEpT61AG9o9c(obs obs, AuthorizationRequest authorizationRequest) {
        this.f$0 = obs;
        this.f$1 = authorizationRequest;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (HttpCookie) obj);
    }
}
