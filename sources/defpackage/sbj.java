package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: sbj reason: default package */
public abstract class sbj {

    /* renamed from: sbj$a */
    public static final class a extends sbj {
        private final String a;

        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
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
            sb.append("MoreStoriesRequested{moreStoriesUrl=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: sbj$b */
    public static final class b extends sbj {
        final ImmutableList<sbe> a;

        b(ImmutableList<sbe> immutableList) {
            this.a = (ImmutableList) gec.a(immutableList);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
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
            sb.append("RecommendedArtistsLoaded{recommendedArtists=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: sbj$c */
    public static final class c extends sbj {
        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "RecommendedArtistsLoadingFailed{}";
        }
    }

    /* renamed from: sbj$d */
    public static final class d extends sbj {
        d() {
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "RefreshRequested{}";
        }
    }

    /* renamed from: sbj$e */
    public static final class e extends sbj {
        /* access modifiers changed from: 0000 */
        public final sbf a;

        e(sbf sbf) {
            this.a = (sbf) gec.a(sbf);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee5.apply(this);
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
    }

    /* renamed from: sbj$f */
    public static final class f extends sbj {
        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StoriesLoadingFailed{}";
        }
    }

    sbj() {
    }

    public static sbj a(ImmutableList<sbe> immutableList) {
        return new b(immutableList);
    }

    public static sbj a(sbf sbf) {
        return new e(sbf);
    }

    public abstract <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6);
}
