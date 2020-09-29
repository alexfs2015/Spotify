package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.Arrays;

/* renamed from: kww reason: default package */
public final class kww {
    private final jtz a;

    public kww(jtz jtz) {
        this.a = jtz;
    }

    public final kws a(AuthorizationRequest authorizationRequest) {
        ClientIdentity clientIdentity = (ClientIdentity) fbp.a(authorizationRequest.f());
        return kws.a(authorizationRequest.c(), authorizationRequest.b(), Arrays.toString(authorizationRequest.a()), this.a.a(), clientIdentity.a, clientIdentity.b, this.a.a());
    }

    public final kws a(kwt kwt) {
        return kws.a(kwt.a, kwt.b, kwt.c, kwt.d, kwt.e, kwt.f, kwt.g);
    }
}
