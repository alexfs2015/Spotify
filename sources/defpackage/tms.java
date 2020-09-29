package defpackage;

/* renamed from: tms reason: default package */
public abstract class tms {

    /* renamed from: tms$a */
    public static final class a extends tms {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Clear{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: tms$b */
    public static final class b extends tms {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Empty{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }
    }

    /* renamed from: tms$c */
    public static final class c extends tms {
        public final String a;
        public final boolean b;
        public final long c;
        public final long d;

        c(String str, boolean z, long j, long j2) {
            this.a = (String) gcr.a(str);
            this.b = z;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.b == this.b && cVar.c == this.c && cVar.d == this.d && cVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode()) * 31) + Long.valueOf(this.c).hashCode()) * 31) + Long.valueOf(this.d).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Update{episodeUri=");
            sb.append(this.a);
            sb.append(", isPlaying=");
            sb.append(this.b);
            sb.append(", progress=");
            sb.append(this.c);
            sb.append(", length=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3);

    tms() {
    }

    public static tms a(String str, boolean z, long j, long j2) {
        c cVar = new c(str, z, j, j2);
        return cVar;
    }
}
