package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: svc reason: default package */
public abstract class svc {

    /* renamed from: svc$a */
    public static final class a extends svc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: svc$b */
    public static final class b extends svc {
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

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }
    }

    /* renamed from: svc$c */
    public static final class c extends svc {
        public final ImmutableList<suu> a;

        c(ImmutableList<suu> immutableList) {
            this.a = (ImmutableList) gcr.a(immutableList);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PivotsLoaded{pivots=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3);

    svc() {
    }

    public static svc a(ImmutableList<suu> immutableList) {
        return new c(immutableList);
    }
}
