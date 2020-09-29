package defpackage;

import com.spotify.music.feature.facebooksso.createaccount.model.Failure;

/* renamed from: lll reason: default package */
public abstract class lll {

    /* renamed from: lll$a */
    public static final class a extends lll {
        public final Failure a;

        a(Failure failure) {
            this.a = (Failure) gcr.a(failure);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed{failure=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: lll$b */
    public static final class b extends lll {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InProgress{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }
    }

    /* renamed from: lll$c */
    public static final class c extends lll {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Successful{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3);

    lll() {
    }

    public static lll a(Failure failure) {
        return new a(failure);
    }
}
