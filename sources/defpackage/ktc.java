package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.Map;

/* renamed from: ktc reason: default package */
public final class ktc {
    public static AuthorizationRequest a(kue kue, ClientIdentity clientIdentity) {
        return AuthorizationRequest.a(kue.a(), ResponseType.TOKEN, (String) fay.a(((Map) fay.a(kue.b())).get("redirect_uri")), clientIdentity, null, (String[]) kud.a(kue).toArray(new String[0]), false);
    }
}
