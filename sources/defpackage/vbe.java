package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: vbe reason: default package */
public abstract class vbe {

    /* renamed from: vbe$a */
    public static final class a extends vbe {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BackButtonTapped{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct6.apply(this);
        }
    }

    /* renamed from: vbe$b */
    public static final class b extends vbe {
        final boolean a;

        public b(boolean z) {
            this.a = z;
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

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct9.apply(this);
        }
    }

    /* renamed from: vbe$c */
    public static final class c extends vbe {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DoneButtonTapped{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct5.apply(this);
        }
    }

    /* renamed from: vbe$d */
    public static final class d extends vbe {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "RetryConfirmed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct10.apply(this);
        }
    }

    /* renamed from: vbe$e */
    public static final class e extends vbe {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipButtonTapped{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct7.apply(this);
        }
    }

    /* renamed from: vbe$f */
    public static final class f extends vbe {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipConfirmed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct8.apply(this);
        }
    }

    /* renamed from: vbe$g */
    public static final class g extends vbe {
        final int a;

        public g(int i) {
            this.a = i;
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

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct4.apply(this);
        }
    }

    /* renamed from: vbe$h */
    public static final class h extends vbe {
        final int a;

        public h(int i) {
            this.a = i;
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

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct3.apply(this);
        }
    }

    /* renamed from: vbe$i */
    public static final class i extends vbe {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TopicsFetchFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct2.apply(this);
        }
    }

    /* renamed from: vbe$j */
    public static final class j extends vbe {
        final ImmutableList<vbq> a;

        j(ImmutableList<vbq> immutableList) {
            this.a = (ImmutableList) gcr.a(immutableList);
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

        public final <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<j, R_> gct, gct<i, R_> gct2, gct<h, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6, gct<e, R_> gct7, gct<f, R_> gct8, gct<b, R_> gct9, gct<d, R_> gct10);

    vbe() {
    }

    public static vbe a(ImmutableList<vbq> immutableList) {
        return new j(immutableList);
    }
}
