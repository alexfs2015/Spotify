package defpackage;

import java.util.List;

/* renamed from: pre reason: default package */
public abstract class pre {

    /* renamed from: pre$a */
    public static final class a extends pre {
        public final String a;
        public final String b;
        public final String c;
        public final List<prk> d;

        a(String str, String str2, String str3, List<prk> list) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
            this.d = (List) gcr.a(list);
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

    /* renamed from: pre$b */
    public static final class b extends pre {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchTriggerList{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: pre$c */
    public static final class c extends pre {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        c(String str, String str2, String str3, String str4, String str5) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
            this.d = (String) gcr.a(str4);
            this.e = (String) gcr.a(str5);
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

    /* renamed from: pre$d */
    public static final class d extends pre {
        public final prk a;
        public final ppb b;

        d(prk prk, ppb ppb) {
            this.a = (prk) gcr.a(prk);
            this.b = (ppb) gcr.a(ppb);
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

    /* renamed from: pre$e */
    public static final class e extends pre {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StartTriggerListRefreshTimer{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    pre() {
    }

    public static pre a(String str, String str2, String str3, List<prk> list) {
        return new a(str, str2, str3, list);
    }

    public static pre a(String str, String str2, String str3, String str4, String str5) {
        c cVar = new c(str, str2, str3, str4, str5);
        return cVar;
    }
}
