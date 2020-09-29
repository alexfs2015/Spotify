package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;

/* renamed from: jhi reason: default package */
public abstract class jhi {

    /* renamed from: jhi$a */
    public static final class a extends jhi {
        public final <R_> R_ a(gee<f, R_> gee, gee<g, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AuthorizationTimeoutSignal{}";
        }
    }

    /* renamed from: jhi$b */
    public static final class b extends jhi {
        final jgp a;

        b(jgp jgp) {
            this.a = (jgp) gec.a(jgp);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<g, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee7.apply(this);
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
    }

    /* renamed from: jhi$c */
    public static final class c extends jhi {
        final String a;

        public c(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<g, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee6.apply(this);
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
    }

    /* renamed from: jhi$d */
    public static final class d extends jhi {
        final jhb a;

        d(jhb jhb) {
            this.a = (jhb) gec.a(jhb);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<g, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee5.apply(this);
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
    }

    /* renamed from: jhi$e */
    public static final class e extends jhi {
        final boolean a;

        e(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<g, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee3.apply(this);
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
    }

    /* renamed from: jhi$f */
    public static final class f extends jhi {
        final AuthorizationRequest a;
        final ProtocolVersion b;
        final boolean c;
        final boolean d;

        f(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, boolean z, boolean z2) {
            this.a = (AuthorizationRequest) gec.a(authorizationRequest);
            this.b = (ProtocolVersion) gec.a(protocolVersion);
            this.c = z;
            this.d = z2;
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<g, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee.apply(this);
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
    }

    /* renamed from: jhi$g */
    public static final class g extends jhi {
        final SessionState a;

        g(SessionState sessionState) {
            this.a = (SessionState) gec.a(sessionState);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<g, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee2.apply(this);
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
    }

    jhi() {
    }

    public static jhi a(SessionState sessionState) {
        return new g(sessionState);
    }

    public static jhi a(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, boolean z, boolean z2) {
        return new f(authorizationRequest, protocolVersion, z, false);
    }

    public static jhi a(jgp jgp) {
        return new b(jgp);
    }

    public static jhi a(jhb jhb) {
        return new d(jhb);
    }

    public static jhi a(boolean z) {
        return new e(z);
    }

    public abstract <R_> R_ a(gee<f, R_> gee, gee<g, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7);
}
