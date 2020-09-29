package defpackage;

import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import java.util.Map;

/* renamed from: ppl reason: default package */
public abstract class ppl {

    /* renamed from: ppl$a */
    public static final class a extends ppl {
        public final String a;
        public final String b;

        a(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogImpression{impressionUrl=");
            sb.append(this.a);
            sb.append(", uuid=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ppl$b */
    public static final class b extends ppl {
        public final prk a;
        public final NoteMessage b;
        public final String c;

        b(prk prk, NoteMessage noteMessage, String str) {
            this.a = (prk) gcr.a(prk);
            this.b = (NoteMessage) gcr.a(noteMessage);
            this.c = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b) && bVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogMessageDiscarded{trigger=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append(", reason=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ppl$c */
    public static final class c extends ppl {
        public final String a;
        public final prk b;
        public final long c;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.c == this.c && cVar.a.equals(this.a) && cVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Long.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogPerformance{messageId=");
            sb.append(this.a);
            sb.append(", trigger=");
            sb.append(this.b);
            sb.append(", timeMessageReceived=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ppl$d */
    public static final class d extends ppl {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Map<String, String> e;

        d(String str, String str2, String str3, String str4, Map<String, String> map) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = map;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return gcr.a(dVar.a, this.a) && gcr.a(dVar.b, this.b) && gcr.a(dVar.c, this.c) && gcr.a(dVar.d, this.d) && gcr.a(dVar.e, this.e);
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Map<String, String> map = this.e;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogWebviewEvent{messageId=");
            sb.append(this.a);
            sb.append(", uuid=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", target=");
            sb.append(this.d);
            sb.append(", metadata=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ppl$e */
    public static final class e extends ppl {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotifyDismissal{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    /* renamed from: ppl$f */
    public static final class f extends ppl {
        public final QuicksilverClickAction a;
        public final String b;

        f(QuicksilverClickAction quicksilverClickAction, String str) {
            this.a = (QuicksilverClickAction) gcr.a(quicksilverClickAction);
            this.b = (String) gcr.a(str);
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
            sb.append("PerformAction{action=");
            sb.append(this.a);
            sb.append(", uuid=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    ppl() {
    }
}
