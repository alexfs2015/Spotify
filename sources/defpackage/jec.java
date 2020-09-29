package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.List;

/* renamed from: jec reason: default package */
public final class jec extends AuthorizationRequest {
    private final String a;
    private final String b;
    private final List<String> c;
    private final ResponseType d;
    private final ClientIdentity e;
    private final String f;
    private final boolean g;

    public jec(String str, String str2, List<String> list, ResponseType responseType, ClientIdentity clientIdentity, String str3, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (list != null) {
                    this.c = list;
                    if (responseType != null) {
                        this.d = responseType;
                        this.e = clientIdentity;
                        this.f = str3;
                        this.g = z;
                        return;
                    }
                    throw new NullPointerException("Null responseType");
                }
                throw new NullPointerException("Null scopesList");
            }
            throw new NullPointerException("Null clientId");
        }
        throw new NullPointerException("Null redirectUri");
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final List<String> d() {
        return this.c;
    }

    public final ResponseType e() {
        return this.d;
    }

    public final ClientIdentity f() {
        return this.e;
    }

    public final String g() {
        return this.f;
    }

    public final boolean h() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationRequest{redirectUri=");
        sb.append(this.a);
        sb.append(", clientId=");
        sb.append(this.b);
        sb.append(", scopesList=");
        sb.append(this.c);
        sb.append(", responseType=");
        sb.append(this.d);
        sb.append(", clientIdentity=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", showDialog=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AuthorizationRequest) {
            AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
            if (this.a.equals(authorizationRequest.b()) && this.b.equals(authorizationRequest.c()) && this.c.equals(authorizationRequest.d()) && this.d.equals(authorizationRequest.e())) {
                ClientIdentity clientIdentity = this.e;
                if (clientIdentity != null ? clientIdentity.equals(authorizationRequest.f()) : authorizationRequest.f() == null) {
                    String str = this.f;
                    if (str != null ? str.equals(authorizationRequest.g()) : authorizationRequest.g() == null) {
                        if (this.g == authorizationRequest.h()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        ClientIdentity clientIdentity = this.e;
        int i = 0;
        int hashCode2 = (hashCode ^ (clientIdentity == null ? 0 : clientIdentity.hashCode())) * 1000003;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ (this.g ? 1231 : 1237);
    }
}
