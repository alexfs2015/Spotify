package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: rsc reason: default package */
public abstract class rsc {

    /* renamed from: rsc$a */
    public static final class a extends rsc {
        private final String a;

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
            sb.append("MoreStoriesRequested{moreStoriesUrl=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3, gct<c, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct2.apply(this);
        }
    }

    /* renamed from: rsc$b */
    public static final class b extends rsc {
        final ImmutableList<rrx> a;

        b(ImmutableList<rrx> immutableList) {
            this.a = (ImmutableList) gcr.a(immutableList);
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
            sb.append("RecommendedArtistsLoaded{recommendedArtists=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3, gct<c, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct3.apply(this);
        }
    }

    /* renamed from: rsc$c */
    public static final class c extends rsc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "RecommendedArtistsLoadingFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3, gct<c, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct4.apply(this);
        }
    }

    /* renamed from: rsc$d */
    public static final class d extends rsc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "RefreshRequested{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3, gct<c, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct.apply(this);
        }
    }

    /* renamed from: rsc$e */
    public static final class e extends rsc {
        /* access modifiers changed from: 0000 */
        public final rry a;

        e(rry rry) {
            this.a = (rry) gcr.a(rry);
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
            sb.append("StoriesLoaded{storiesResponse=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3, gct<c, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct5.apply(this);
        }
    }

    /* renamed from: rsc$f */
    public static final class f extends rsc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StoriesLoadingFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3, gct<c, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct6.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3, gct<c, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6);

    rsc() {
    }

    public static rsc a(ImmutableList<rrx> immutableList) {
        return new b(immutableList);
    }

    public static rsc a(rry rry) {
        return new e(rry);
    }
}
