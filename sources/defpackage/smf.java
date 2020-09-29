package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: smf reason: default package */
public abstract class smf {

    /* renamed from: smf$a */
    public static final class a extends smf {
        final String a;

        public a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee2.apply(this);
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
            sb.append("Autocomplete{suggestion=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: smf$b */
    public static final class b extends smf {
        public final String a;
        public final int b;
        public final String c;
        final SearchHistoryItem d;

        public b(String str, int i, String str2, SearchHistoryItem searchHistoryItem) {
            this.a = (String) gec.a(str);
            this.b = i;
            this.c = str2;
            this.d = (SearchHistoryItem) gec.a(searchHistoryItem);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.b == this.b && bVar.a.equals(this.a) && gec.a(bVar.c, this.c) && bVar.d.equals(this.d);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode()) * 31;
            String str = this.c;
            if (str != null) {
                i = str.hashCode();
            }
            return ((hashCode + i) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Main{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append(", sectionId=");
            sb.append(this.c);
            sb.append(", historyItem=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    smf() {
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2);
}
