package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.Map;

/* renamed from: kwl reason: default package */
public final class kwl {
    public static AuthorizationRequest a(kxn kxn, ClientIdentity clientIdentity) {
        return AuthorizationRequest.a(kxn.a(), ResponseType.TOKEN, (String) fbp.a(((Map) fbp.a(kxn.b())).get("redirect_uri")), clientIdentity, null, (String[]) kxm.a(kxn).toArray(new String[0]), false);
    }
}
