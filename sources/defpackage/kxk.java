package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: kxk reason: default package */
public final class kxk implements kxj {
    private final jlr a;
    private final Map<String, String> b = new HashMap();

    public kxk(jlr jlr) {
        this.a = jlr;
    }

    private String b(String str) {
        String str2 = (String) this.b.get(str);
        if (str2 == null) {
            return UUID.randomUUID().toString();
        }
        this.b.remove(str2);
        return str2;
    }

    public final void a(AuthorizationRequest authorizationRequest, boolean z, boolean z2) {
        String uuid = UUID.randomUUID().toString();
        this.b.put(authorizationRequest.f().a, uuid);
        t tVar = new t(authorizationRequest.c(), authorizationRequest.e().name(), authorizationRequest.b(), Arrays.asList(authorizationRequest.a()), z, authorizationRequest.f().a, z2, uuid);
        this.a.a(tVar);
    }

    public final void a(String str) {
        this.a.a(new u(b(str)));
    }

    public final void a(String str, String str2) {
        this.a.a(new s(str2, 0, b(str)));
    }
}
