package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.net.HttpCookie;

/* renamed from: nvk reason: default package */
public abstract class nvk {

    /* renamed from: nvk$a */
    public static final class a extends nvk {
        public final AuthorizationRequest a;
        private final PartnerType b;
        private final HttpCookie c;

        a(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
            this.b = (PartnerType) gcr.a(partnerType);
            this.a = (AuthorizationRequest) gcr.a(authorizationRequest);
            this.c = (HttpCookie) gcr.a(httpCookie);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.b == this.b && aVar.a.equals(this.a) && aVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.b.hashCode() + 0) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AuthorizePartnerIntegration{partner=");
            sb.append(this.b);
            sb.append(", authorizationRequest=");
            sb.append(this.a);
            sb.append(", cookie=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nvk$b */
    public static final class b extends nvk {
        public final PartnerType a;

        b(PartnerType partnerType) {
            this.a = (PartnerType) gcr.a(partnerType);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectAccount{partnerType=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nvk$c */
    public static final class c extends nvk {
        public final PartnerType a;

        c(PartnerType partnerType) {
            this.a = (PartnerType) gcr.a(partnerType);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InstallApp{partnerType=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nvk$d */
    public static final class d extends nvk {
        public final boolean a;

        d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof d) && ((d) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SaveMasterTogglePreference{enabled=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nvk$e */
    public static final class e extends nvk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StopPartnerService{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    nvk() {
    }
}
