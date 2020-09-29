package defpackage;

import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import java.util.Map;

/* renamed from: pwv reason: default package */
public abstract class pwv {

    /* renamed from: pwv$a */
    public static final class a extends pwv {
        public final String a;

        a(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogBannerExpanded{uuid=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pwv$b */
    public static final class b extends pwv {
        public final String a;
        public final String b;

        b(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b);
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

    /* renamed from: pwv$c */
    public static final class c extends pwv {
        public final qag a;
        public final BannerMessage b;
        public final String c;

        c(qag qag, BannerMessage bannerMessage, String str) {
            this.a = (qag) gec.a(qag);
            this.b = (BannerMessage) gec.a(bannerMessage);
            this.c = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c);
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

    /* renamed from: pwv$d */
    public static final class d extends pwv {
        public final String a;
        public final qag b;
        public final long c;

        d(String str, qag qag, long j) {
            this.a = (String) gec.a(str);
            this.b = (qag) gec.a(qag);
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.c == this.c && dVar.a.equals(this.a) && dVar.b.equals(this.b);
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

    /* renamed from: pwv$e */
    public static final class e extends pwv {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Map<String, String> e;

        e(String str, String str2, String str3, String str4, Map<String, String> map) {
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return gec.a(eVar.a, this.a) && gec.a(eVar.b, this.b) && gec.a(eVar.c, this.c) && gec.a(eVar.d, this.d) && gec.a(eVar.e, this.e);
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

    /* renamed from: pwv$f */
    public static final class f extends pwv {
        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotifyDismissal{}";
        }
    }

    /* renamed from: pwv$g */
    public static final class g extends pwv {
        public final QuicksilverClickAction a;
        public final String b;

        g(QuicksilverClickAction quicksilverClickAction, String str) {
            this.a = (QuicksilverClickAction) gec.a(quicksilverClickAction);
            this.b = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return gVar.a.equals(this.a) && gVar.b.equals(this.b);
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

    pwv() {
    }

    public static pwv a(QuicksilverClickAction quicksilverClickAction, String str) {
        return new g(quicksilverClickAction, str);
    }

    public static pwv a(qag qag, BannerMessage bannerMessage, String str) {
        return new c(qag, bannerMessage, str);
    }
}
