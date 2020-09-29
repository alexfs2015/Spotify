package defpackage;

import com.spotify.music.libs.search.history.SearchHistory;
import com.spotify.music.libs.search.offline.model.OfflineResults;
import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;

/* renamed from: sbw reason: default package */
public abstract class sbw {

    /* renamed from: sbw$a */
    public static final class a extends sbw {
        public final QueryAutocompleteResult a;

        public a(QueryAutocompleteResult queryAutocompleteResult) {
            this.a = (QueryAutocompleteResult) gcr.a(queryAutocompleteResult);
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

        public final <R_> R_ a(gct<c, R_> gct, gct<e, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<a, R_> gct5) {
            return gct5.apply(this);
        }
    }

    /* renamed from: sbw$b */
    public static final class b extends sbw {
        public final SearchHistory a;

        public b(SearchHistory searchHistory) {
            this.a = (SearchHistory) gcr.a(searchHistory);
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

        public final <R_> R_ a(gct<c, R_> gct, gct<e, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<a, R_> gct5) {
            return gct3.apply(this);
        }
    }

    /* renamed from: sbw$c */
    public static final class c extends sbw {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "None{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<e, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<a, R_> gct5) {
            return gct.apply(this);
        }
    }

    /* renamed from: sbw$d */
    public static final class d extends sbw {
        public final OfflineResults a;

        public d(OfflineResults offlineResults) {
            this.a = (OfflineResults) gcr.a(offlineResults);
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

        public final <R_> R_ a(gct<c, R_> gct, gct<e, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<a, R_> gct5) {
            return gct4.apply(this);
        }
    }

    /* renamed from: sbw$e */
    public static final class e extends sbw {
        public final sbv a;

        public e(sbv sbv) {
            this.a = (sbv) gcr.a(sbv);
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

        public final <R_> R_ a(gct<c, R_> gct, gct<e, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<a, R_> gct5) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<e, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<a, R_> gct5);

    sbw() {
    }
}
