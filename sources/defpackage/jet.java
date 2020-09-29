package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;

/* renamed from: jet reason: default package */
public abstract class jet {

    /* renamed from: jet$a */
    public static final class a extends jet {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AuthorizationTimeoutSignal{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<g, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct4.apply(this);
        }
    }

    /* renamed from: jet$b */
    public static final class b extends jet {
        final jea a;

        b(jea jea) {
            this.a = (jea) gcr.a(jea);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GotAuthorizationResponse{authorizationResponse=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<g, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct7.apply(this);
        }
    }

    /* renamed from: jet$c */
    public static final class c extends jet {
        final String a;

        public c(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GotBakeryError{bakeryError=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<g, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct6.apply(this);
        }
    }

    /* renamed from: jet$d */
    public static final class d extends jet {
        final jem a;

        d(jem jem) {
            this.a = (jem) gcr.a(jem);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GotBakeryResponse{cookie=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<g, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct5.apply(this);
        }
    }

    /* renamed from: jet$e */
    public static final class e extends jet {
        final boolean a;

        e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof e) && ((e) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GotGoogleAppFlipFlag{isEnabled=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<g, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct3.apply(this);
        }
    }

    /* renamed from: jet$f */
    public static final class f extends jet {
        final AuthorizationRequest a;
        final ProtocolVersion b;
        final boolean c;
        final boolean d;

        f(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, boolean z, boolean z2) {
            this.a = (AuthorizationRequest) gcr.a(authorizationRequest);
            this.b = (ProtocolVersion) gcr.a(protocolVersion);
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.b == this.b && fVar.c == this.c && fVar.d == this.d && fVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Boolean.valueOf(this.c).hashCode()) * 31) + Boolean.valueOf(this.d).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestReceived{request=");
            sb.append(this.a);
            sb.append(", protocolVersion=");
            sb.append(this.b);
            sb.append(", isConnectedToInternet=");
            sb.append(this.c);
            sb.append(", isDebug=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<g, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct.apply(this);
        }
    }

    /* renamed from: jet$g */
    public static final class g extends jet {
        final SessionState a;

        g(SessionState sessionState) {
            this.a = (SessionState) gcr.a(sessionState);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SessionStateChanged{sessionState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<g, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<f, R_> gct, gct<g, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7);

    jet() {
    }

    public static jet a(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, boolean z, boolean z2) {
        return new f(authorizationRequest, protocolVersion, z, false);
    }

    public static jet a(SessionState sessionState) {
        return new g(sessionState);
    }

    public static jet a(boolean z) {
        return new e(z);
    }

    public static jet a(jem jem) {
        return new d(jem);
    }

    public static jet a(jea jea) {
        return new b(jea);
    }
}
