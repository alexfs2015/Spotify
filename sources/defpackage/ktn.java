package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.Arrays;

/* renamed from: ktn reason: default package */
public final class ktn {
    private final jrp a;

    public ktn(jrp jrp) {
        this.a = jrp;
    }

    public final ktj a(AuthorizationRequest authorizationRequest) {
        ClientIdentity clientIdentity = (ClientIdentity) fay.a(authorizationRequest.f());
        return ktj.a(authorizationRequest.c(), authorizationRequest.b(), Arrays.toString(authorizationRequest.a()), this.a.a(), clientIdentity.a, clientIdentity.b, this.a.a());
    }

    public final ktj a(ktk ktk) {
        return ktj.a(ktk.a, ktk.b, ktk.c, ktk.d, ktk.e, ktk.f, ktk.g);
    }
}
