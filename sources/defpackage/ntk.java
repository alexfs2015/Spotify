package defpackage;

import com.spotify.music.connection.OfflineReason;

/* renamed from: ntk reason: default package */
public abstract class ntk<T> {

    /* renamed from: ntk$a */
    public static final class a extends ntk<Object> {
        final Throwable a;

        a(Throwable th) {
            this.a = (Throwable) gec.a(th);
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

    /* renamed from: ntk$b */
    public static final class b extends ntk<Object> {
        b() {
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

    /* renamed from: ntk$c */
    public static final class c extends ntk<Object> {
        final OfflineReason a;

        c(OfflineReason offlineReason) {
            this.a = (OfflineReason) gec.a(offlineReason);
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

    /* renamed from: ntk$d */
    public static final class d<T> extends ntk<T> {
        public final T a;

        d(T t) {
            this.a = gec.a(t);
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

    ntk() {
    }

    public static <T> ntk<T> a() {
        return new b();
    }

    public static <T> ntk<T> a(OfflineReason offlineReason) {
        return new c(offlineReason);
    }

    public static <T> ntk<T> a(T t) {
        return new d(t);
    }
}
