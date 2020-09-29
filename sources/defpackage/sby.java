package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: sby reason: default package */
public abstract class sby {

    /* renamed from: sby$a */
    public static final class a extends sby {
        final String a;

        public a(String str) {
            this.a = (String) gcr.a(str);
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

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2) {
            return gct2.apply(this);
        }
    }

    /* renamed from: sby$b */
    public static final class b extends sby {
        public final String a;
        public final int b;
        public final String c;
        final SearchHistoryItem d;

        public b(String str, int i, String str2, SearchHistoryItem searchHistoryItem) {
            this.a = (String) gcr.a(str);
            this.b = i;
            this.c = str2;
            this.d = (SearchHistoryItem) gcr.a(searchHistoryItem);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.b == this.b && bVar.a.equals(this.a) && gcr.a(bVar.c, this.c) && bVar.d.equals(this.d);
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

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2);

    sby() {
    }
}
