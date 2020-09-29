package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.net.HttpCookie;

/* renamed from: nvl reason: default package */
public abstract class nvl {

    /* renamed from: nvl$a */
    public static final class a extends nvl {
        final PartnerType a;
        final boolean b;

        a(PartnerType partnerType, boolean z) {
            this.a = (PartnerType) gcr.a(partnerType);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a == this.a && aVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccountConnectedResult{partner=");
            sb.append(this.a);
            sb.append(", didConnect=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8) {
            return gct8.apply(this);
        }
    }

    /* renamed from: nvl$b */
    public static final class b extends nvl {
        final ImmutableMap<PartnerType, rvn> a;

        b(ImmutableMap<PartnerType, rvn> immutableMap) {
            this.a = (ImmutableMap) gcr.a(immutableMap);
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
            sb.append("AccountLinkingDataReceived{integrationEntries=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8) {
            return gct6.apply(this);
        }
    }

    /* renamed from: nvl$c */
    public static final class c extends nvl {
        final PartnerType a;

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
            sb.append("AppInstalled{partner=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8) {
            return gct5.apply(this);
        }
    }

    /* renamed from: nvl$d */
    public static final class d extends nvl {
        final PartnerType a;
        final AuthorizationRequest b;
        final HttpCookie c;

        d(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
            this.a = (PartnerType) gcr.a(partnerType);
            this.b = (AuthorizationRequest) gcr.a(authorizationRequest);
            this.c = (HttpCookie) gcr.a(httpCookie);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a == this.a && dVar.b.equals(this.b) && dVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AuthorizationRequired{partner=");
            sb.append(this.a);
            sb.append(", authorizationRequest=");
            sb.append(this.b);
            sb.append(", cookie=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8) {
            return gct7.apply(this);
        }
    }

    /* renamed from: nvl$e */
    public static final class e extends nvl {
        final boolean a;

        public e(boolean z) {
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
            sb.append("MasterToggleChanged{enabled=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8) {
            return gct2.apply(this);
        }
    }

    /* renamed from: nvl$f */
    public static final class f extends nvl {
        final boolean a;

        f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof f) && ((f) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MasterTogglePropertyRead{enabled=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8) {
            return gct.apply(this);
        }
    }

    /* renamed from: nvl$g */
    public static final class g extends nvl {
        final PartnerType a;

        g(PartnerType partnerType) {
            this.a = (PartnerType) gcr.a(partnerType);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof g) && ((g) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PartnerConnectRequested{partner=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8) {
            return gct3.apply(this);
        }
    }

    /* renamed from: nvl$h */
    public static final class h extends nvl {
        final PartnerType a;

        h(PartnerType partnerType) {
            this.a = (PartnerType) gcr.a(partnerType);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof h) && ((h) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PartnerInstallRequested{partner=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8);

    nvl() {
    }

    public static nvl a(boolean z) {
        return new f(z);
    }

    public static nvl a(PartnerType partnerType) {
        return new g(partnerType);
    }

    public static nvl b(PartnerType partnerType) {
        return new h(partnerType);
    }

    public static nvl a(ImmutableMap<PartnerType, rvn> immutableMap) {
        return new b(immutableMap);
    }

    public static nvl a(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return new d(partnerType, authorizationRequest, httpCookie);
    }

    public static nvl a(PartnerType partnerType, boolean z) {
        return new a(partnerType, z);
    }
}
