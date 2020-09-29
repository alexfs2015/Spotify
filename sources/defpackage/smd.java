package defpackage;

import com.spotify.music.libs.search.history.SearchHistory;
import com.spotify.music.libs.search.offline.model.OfflineResults;
import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;

/* renamed from: smd reason: default package */
public abstract class smd {

    /* renamed from: smd$a */
    public static final class a extends smd {
        public final QueryAutocompleteResult a;

        public a(QueryAutocompleteResult queryAutocompleteResult) {
            this.a = (QueryAutocompleteResult) gec.a(queryAutocompleteResult);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<e, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<a, R_> gee5) {
            return gee5.apply(this);
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
            sb.append("Autocomplete{model=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: smd$b */
    public static final class b extends smd {
        public final SearchHistory a;

        public b(SearchHistory searchHistory) {
            this.a = (SearchHistory) gec.a(searchHistory);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<e, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<a, R_> gee5) {
            return gee3.apply(this);
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
            sb.append("History{model=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: smd$c */
    public static final class c extends smd {
        c() {
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<e, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<a, R_> gee5) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "None{}";
        }
    }

    /* renamed from: smd$d */
    public static final class d extends smd {
        public final OfflineResults a;

        public d(OfflineResults offlineResults) {
            this.a = (OfflineResults) gec.a(offlineResults);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<e, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<a, R_> gee5) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Offline{model=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: smd$e */
    public static final class e extends smd {
        public final smc a;

        public e(smc smc) {
            this.a = (smc) gec.a(smc);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<e, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<a, R_> gee5) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Online{model=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    smd() {
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<e, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<a, R_> gee5);
}
