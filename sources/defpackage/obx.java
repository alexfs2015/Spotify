package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.net.HttpCookie;

/* renamed from: obx reason: default package */
public abstract class obx {

    /* renamed from: obx$a */
    public static final class a extends obx {
        public final AuthorizationRequest a;
        private final PartnerType b;
        private final HttpCookie c;

        a(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
            this.b = (PartnerType) gec.a(partnerType);
            this.a = (AuthorizationRequest) gec.a(authorizationRequest);
            this.c = (HttpCookie) gec.a(httpCookie);
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

    /* renamed from: obx$b */
    public static final class b extends obx {
        public final PartnerType a;

        b(PartnerType partnerType) {
            this.a = (PartnerType) gec.a(partnerType);
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

    /* renamed from: obx$c */
    public static final class c extends obx {
        public final PartnerType a;

        c(PartnerType partnerType) {
            this.a = (PartnerType) gec.a(partnerType);
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

    /* renamed from: obx$d */
    public static final class d extends obx {
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

    /* renamed from: obx$e */
    public static final class e extends obx {
        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StopPartnerService{}";
        }
    }

    obx() {
    }
}
