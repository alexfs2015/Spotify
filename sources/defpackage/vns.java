package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: vns reason: default package */
public abstract class vns {

    /* renamed from: vns$a */
    public static final class a extends vns {
        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BackButtonTapped{}";
        }
    }

    /* renamed from: vns$b */
    public static final class b extends vns {
        final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee9.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectivityStateChanged{hasConnection=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vns$c */
    public static final class c extends vns {
        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DoneButtonTapped{}";
        }
    }

    /* renamed from: vns$d */
    public static final class d extends vns {
        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee10.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "RetryConfirmed{}";
        }
    }

    /* renamed from: vns$e */
    public static final class e extends vns {
        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipButtonTapped{}";
        }
    }

    /* renamed from: vns$f */
    public static final class f extends vns {
        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee8.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipConfirmed{}";
        }
    }

    /* renamed from: vns$g */
    public static final class g extends vns {
        final int a;

        public g(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof g) && ((g) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TopicDeselected{position=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vns$h */
    public static final class h extends vns {
        final int a;

        public h(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof h) && ((h) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TopicSelected{position=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vns$i */
    public static final class i extends vns {
        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TopicsFetchFailed{}";
        }
    }

    /* renamed from: vns$j */
    public static final class j extends vns {
        final ImmutableList<voe> a;

        j(ImmutableList<voe> immutableList) {
            this.a = (ImmutableList) gec.a(immutableList);
        }

        public final <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return ((j) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TopicsFetched{pickerItems=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vns() {
    }

    public static vns a(ImmutableList<voe> immutableList) {
        return new j(immutableList);
    }

    public abstract <R_> R_ a(gee<j, R_> gee, gee<i, R_> gee2, gee<h, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6, gee<e, R_> gee7, gee<f, R_> gee8, gee<b, R_> gee9, gee<d, R_> gee10);
}
