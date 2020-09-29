package defpackage;

import com.google.common.base.Optional;

/* renamed from: paq reason: default package */
public abstract class paq {

    /* renamed from: paq$a */
    public static final class a extends paq {
        public final String a;

        a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return gcr.a(((a) obj).a, this.a);
        }

        public final int hashCode() {
            String str = this.a;
            return (str != null ? str.hashCode() : 0) + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure{message=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3) {
            gcs2.accept(this);
        }
    }

    /* renamed from: paq$b */
    public static final class b extends paq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3) {
            gcs.accept(this);
        }
    }

    /* renamed from: paq$c */
    public static final class c extends paq {
        public final uys a;
        public final Optional<gzz> b;
        public final Optional<gzz> c;

        c(uys uys, Optional<gzz> optional, Optional<gzz> optional2) {
            this.a = (uys) gcr.a(uys);
            this.b = (Optional) gcr.a(optional);
            this.c = (Optional) gcr.a(optional2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success{episode=");
            sb.append(this.a);
            sb.append(", episodeRecommendationsHubsViewModel=");
            sb.append(this.b);
            sb.append(", featuredContentHubsViewModel=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3) {
            gcs3.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3);

    paq() {
    }

    public static paq a(String str) {
        return new a(str);
    }

    public static paq a(uys uys, Optional<gzz> optional, Optional<gzz> optional2) {
        return new c(uys, optional, optional2);
    }
}
