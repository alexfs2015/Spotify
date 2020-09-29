package defpackage;

import com.spotify.music.connection.OfflineReason;

/* renamed from: nnj reason: default package */
public abstract class nnj<T> {

    /* renamed from: nnj$a */
    public static final class a extends nnj<Object> {
        final Throwable a;

        a(Throwable th) {
            this.a = (Throwable) gcr.a(th);
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
            sb.append("Error{throwable=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nnj$b */
    public static final class b extends nnj<Object> {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: nnj$c */
    public static final class c extends nnj<Object> {
        final OfflineReason a;

        c(OfflineReason offlineReason) {
            this.a = (OfflineReason) gcr.a(offlineReason);
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
            sb.append("OfflineError{offlineReason=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nnj$d */
    public static final class d<T> extends nnj<T> {
        public final T a;

        d(T t) {
            this.a = gcr.a(t);
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
            sb.append("Success{payload=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    nnj() {
    }

    public static <T> nnj<T> a() {
        return new b();
    }

    public static <T> nnj<T> a(OfflineReason offlineReason) {
        return new c(offlineReason);
    }

    public static <T> nnj<T> a(T t) {
        return new d(t);
    }
}
