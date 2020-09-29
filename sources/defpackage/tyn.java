package defpackage;

/* renamed from: tyn reason: default package */
public abstract class tyn {

    /* renamed from: tyn$a */
    public static final class a extends tyn {
        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Clear{}";
        }
    }

    /* renamed from: tyn$b */
    public static final class b extends tyn {
        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Empty{}";
        }
    }

    /* renamed from: tyn$c */
    public static final class c extends tyn {
        public final String a;
        public final boolean b;
        public final long c;
        public final long d;

        c(String str, boolean z, long j, long j2) {
            this.a = (String) gec.a(str);
            this.b = z;
            this.c = j;
            this.d = j2;
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged2.accept(this);
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
    }

    tyn() {
    }

    public static tyn a(String str, boolean z, long j, long j2) {
        c cVar = new c(str, z, j, j2);
        return cVar;
    }

    public abstract void a(ged<b> ged, ged<c> ged2, ged<a> ged3);
}
