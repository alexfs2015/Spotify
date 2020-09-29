package defpackage;

import com.google.common.base.Optional;
import java.util.List;

/* renamed from: prf reason: default package */
public abstract class prf {

    /* renamed from: prf$a */
    public static final class a extends prf {
        final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AdsModeEnabled{enabled=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct9.apply(this);
        }
    }

    /* renamed from: prf$b */
    public static final class b extends prf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AppBackgrounded{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct11.apply(this);
        }
    }

    /* renamed from: prf$c */
    public static final class c extends prf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AppForegrounded{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct10.apply(this);
        }
    }

    /* renamed from: prf$d */
    public static final class d extends prf {
        final boolean a;

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
            sb.append("CarModeEnabled{enabled=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct8.apply(this);
        }
    }

    /* renamed from: prf$e */
    public static final class e extends prf {
        public final String a;
        public final String b;

        e(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.a.equals(this.a) && eVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EventAborted{pattern=");
            sb.append(this.a);
            sb.append(", triggerType=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct4.apply(this);
        }
    }

    /* renamed from: prf$f */
    public static final class f extends prf {
        public final String a;
        public final String b;

        f(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a.equals(this.a) && fVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EventReceived{pattern=");
            sb.append(this.a);
            sb.append(", triggerType=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct3.apply(this);
        }
    }

    /* renamed from: prf$g */
    public static final class g extends prf {
        final String a;
        final String b;
        final String c;

        public g(String str, String str2, String str3) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return gVar.a.equals(this.a) && gVar.b.equals(this.b) && gVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageLoadingFailed{format=");
            sb.append(this.a);
            sb.append(", pattern=");
            sb.append(this.b);
            sb.append(", triggerType=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct6.apply(this);
        }
    }

    /* renamed from: prf$h */
    public static final class h extends prf {
        final String a;
        final String b;
        final String c;
        final Optional<ho<prk, ppb>> d;

        public h(String str, String str2, String str3, Optional<ho<prk, ppb>> optional) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
            this.d = (Optional) gcr.a(optional);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a.equals(this.a) && hVar.b.equals(this.b) && hVar.c.equals(this.c) && hVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageReceived{format=");
            sb.append(this.a);
            sb.append(", pattern=");
            sb.append(this.b);
            sb.append(", triggerType=");
            sb.append(this.c);
            sb.append(", messageOptional=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct5.apply(this);
        }
    }

    /* renamed from: prf$i */
    public static final class i extends prf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TriggerListLoadingFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct7.apply(this);
        }
    }

    /* renamed from: prf$j */
    public static final class j extends prf {
        final List<prk> a;

        j(List<prk> list) {
            this.a = (List) gcr.a(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return ((j) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TriggerListReceived{triggers=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct.apply(this);
        }
    }

    /* renamed from: prf$k */
    public static final class k extends prf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TriggerListRefreshTimerExpired{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<j, R_> gct, gct<k, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<h, R_> gct5, gct<g, R_> gct6, gct<i, R_> gct7, gct<d, R_> gct8, gct<a, R_> gct9, gct<c, R_> gct10, gct<b, R_> gct11);

    prf() {
    }

    public static prf a(List<prk> list) {
        return new j(list);
    }

    public static prf a(String str, String str2) {
        return new f(str, str2);
    }

    public static prf b(String str, String str2) {
        return new e(str, str2);
    }

    public static prf a(boolean z) {
        return new d(z);
    }
}
