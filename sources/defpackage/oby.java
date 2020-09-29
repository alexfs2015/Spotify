package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.net.HttpCookie;

/* renamed from: oby reason: default package */
public abstract class oby {

    /* renamed from: oby$a */
    public static final class a extends oby {
        final PartnerType a;
        final boolean b;

        a(PartnerType partnerType, boolean z) {
            this.a = (PartnerType) gec.a(partnerType);
            this.b = z;
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<a, R_> gee8) {
            return gee8.apply(this);
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
    }

    /* renamed from: oby$b */
    public static final class b extends oby {
        final ImmutableMap<PartnerType, sex> a;

        b(ImmutableMap<PartnerType, sex> immutableMap) {
            this.a = (ImmutableMap) gec.a(immutableMap);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<a, R_> gee8) {
            return gee6.apply(this);
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
    }

    /* renamed from: oby$c */
    public static final class c extends oby {
        final PartnerType a;

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<a, R_> gee8) {
            return gee5.apply(this);
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
            sb.append("AppInstalled{partner=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: oby$d */
    public static final class d extends oby {
        final PartnerType a;
        final AuthorizationRequest b;
        final HttpCookie c;

        d(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
            this.a = (PartnerType) gec.a(partnerType);
            this.b = (AuthorizationRequest) gec.a(authorizationRequest);
            this.c = (HttpCookie) gec.a(httpCookie);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<a, R_> gee8) {
            return gee7.apply(this);
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
    }

    /* renamed from: oby$e */
    public static final class e extends oby {
        final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<a, R_> gee8) {
            return gee2.apply(this);
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
    }

    /* renamed from: oby$f */
    public static final class f extends oby {
        final boolean a;

        f(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<a, R_> gee8) {
            return gee.apply(this);
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
    }

    /* renamed from: oby$g */
    public static final class g extends oby {
        final PartnerType a;

        g(PartnerType partnerType) {
            this.a = (PartnerType) gec.a(partnerType);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<a, R_> gee8) {
            return gee3.apply(this);
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
    }

    /* renamed from: oby$h */
    public static final class h extends oby {
        final PartnerType a;

        h(PartnerType partnerType) {
            this.a = (PartnerType) gec.a(partnerType);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<a, R_> gee8) {
            return gee4.apply(this);
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
    }

    oby() {
    }

    public static oby a(ImmutableMap<PartnerType, sex> immutableMap) {
        return new b(immutableMap);
    }

    public static oby a(PartnerType partnerType) {
        return new g(partnerType);
    }

    public static oby a(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return new d(partnerType, authorizationRequest, httpCookie);
    }

    public static oby a(PartnerType partnerType, boolean z) {
        return new a(partnerType, z);
    }

    public static oby a(boolean z) {
        return new f(z);
    }

    public static oby b(PartnerType partnerType) {
        return new h(partnerType);
    }

    public abstract <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<a, R_> gee8);
}
