package defpackage;

import java.util.List;

/* renamed from: qaa reason: default package */
public abstract class qaa {

    /* renamed from: qaa$a */
    public static final class a extends qaa {
        public final String a;
        public final String b;
        public final String c;
        public final List<qag> d;

        a(String str, String str2, String str3, List<qag> list) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
            this.d = (List) gec.a(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b) && aVar.c.equals(this.c) && aVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FetchMessage{format=");
            sb.append(this.a);
            sb.append(", pattern=");
            sb.append(this.b);
            sb.append(", triggerType=");
            sb.append(this.c);
            sb.append(", matchingTriggers=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: qaa$b */
    public static final class b extends qaa {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchTriggerList{}";
        }
    }

    /* renamed from: qaa$c */
    public static final class c extends qaa {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        c(String str, String str2, String str3, String str4, String str5) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
            this.d = (String) gec.a(str4);
            this.e = (String) gec.a(str5);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c) && cVar.d.equals(this.d) && cVar.e.equals(this.e);
        }

        public final int hashCode() {
            return ((((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogMessageDiscarded{reason=");
            sb.append(this.a);
            sb.append(", triggerPattern=");
            sb.append(this.b);
            sb.append(", triggerType=");
            sb.append(this.c);
            sb.append(", messageFormat=");
            sb.append(this.d);
            sb.append(", messageId=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: qaa$d */
    public static final class d extends qaa {
        public final qag a;
        public final pxx b;

        d(qag qag, pxx pxx) {
            this.a = (qag) gec.a(qag);
            this.b = (pxx) gec.a(pxx);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PublishMessage{trigger=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: qaa$e */
    public static final class e extends qaa {
        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StartTriggerListRefreshTimer{}";
        }
    }

    qaa() {
    }

    public static qaa a(String str, String str2, String str3, String str4, String str5) {
        c cVar = new c(str, str2, str3, str4, str5);
        return cVar;
    }

    public static qaa a(String str, String str2, String str3, List<qag> list) {
        return new a(str, str2, str3, list);
    }
}
