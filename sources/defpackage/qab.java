package defpackage;

import com.google.common.base.Optional;
import java.util.List;

/* renamed from: qab reason: default package */
public abstract class qab {

    /* renamed from: qab$a */
    public static final class a extends qab {
        final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee9.apply(this);
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
    }

    /* renamed from: qab$b */
    public static final class b extends qab {
        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee11.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AppBackgrounded{}";
        }
    }

    /* renamed from: qab$c */
    public static final class c extends qab {
        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee10.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AppForegrounded{}";
        }
    }

    /* renamed from: qab$d */
    public static final class d extends qab {
        final boolean a;

        d(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee8.apply(this);
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
    }

    /* renamed from: qab$e */
    public static final class e extends qab {
        public final String a;
        public final String b;

        e(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee4.apply(this);
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
    }

    /* renamed from: qab$f */
    public static final class f extends qab {
        public final String a;
        public final String b;

        f(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee3.apply(this);
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
    }

    /* renamed from: qab$g */
    public static final class g extends qab {
        final String a;
        final String b;
        final String c;

        public g(String str, String str2, String str3) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee6.apply(this);
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
    }

    /* renamed from: qab$h */
    public static final class h extends qab {
        final String a;
        final String b;
        final String c;
        final Optional<ho<qag, pxx>> d;

        public h(String str, String str2, String str3, Optional<ho<qag, pxx>> optional) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
            this.d = (Optional) gec.a(optional);
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee5.apply(this);
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
    }

    /* renamed from: qab$i */
    public static final class i extends qab {
        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TriggerListLoadingFailed{}";
        }
    }

    /* renamed from: qab$j */
    public static final class j extends qab {
        final List<qag> a;

        j(List<qag> list) {
            this.a = (List) gec.a(list);
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee.apply(this);
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
    }

    /* renamed from: qab$k */
    public static final class k extends qab {
        public final <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TriggerListRefreshTimerExpired{}";
        }
    }

    qab() {
    }

    public static qab a(String str, String str2) {
        return new f(str, str2);
    }

    public static qab a(List<qag> list) {
        return new j(list);
    }

    public static qab a(boolean z) {
        return new d(z);
    }

    public static qab b(String str, String str2) {
        return new e(str, str2);
    }

    public abstract <R_> R_ a(gee<j, R_> gee, gee<k, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<h, R_> gee5, gee<g, R_> gee6, gee<i, R_> gee7, gee<d, R_> gee8, gee<a, R_> gee9, gee<c, R_> gee10, gee<b, R_> gee11);
}
