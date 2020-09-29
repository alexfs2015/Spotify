package defpackage;

import com.spotify.pageloader.NetworkErrorReason;

/* renamed from: vez reason: default package */
public abstract class vez<T> {

    /* renamed from: vez$a */
    public static final class a<T> extends vez<T> {
        public final T a;

        a(T t) {
            this.a = gec.a(t);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a<T>, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5) {
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
            sb.append("Loaded{data=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vez$b */
    public static final class b extends vez<Object> {
        b() {
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a<Object>, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    /* renamed from: vez$c */
    public static final class c extends vez<Object> {
        public final NetworkErrorReason a;

        c(NetworkErrorReason networkErrorReason) {
            this.a = (NetworkErrorReason) gec.a(networkErrorReason);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a<Object>, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NetworkError{reason=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vez$d */
    public static final class d extends vez<Object> {
        d() {
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a<Object>, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotFound{}";
        }
    }

    /* renamed from: vez$e */
    public static final class e extends vez<Object> {
        public final Throwable a;

        e(Throwable th) {
            this.a = (Throwable) gec.a(th);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a<Object>, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5) {
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
            sb.append("SomethingWentWrong{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vez() {
    }

    public static <T> vez<T> a() {
        return new b();
    }

    public static <T> vez<T> a(NetworkErrorReason networkErrorReason) {
        return new c(networkErrorReason);
    }

    public static <T> vez<T> a(T t) {
        return new a(t);
    }

    public static <T> vez<T> a(Throwable th) {
        return new e(th);
    }

    public static <T> vez<T> b() {
        return new d();
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a<T>, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4, gee<e, R_> gee5);

    public final boolean c() {
        return this instanceof c;
    }
}
