package defpackage;

import com.spotify.music.connection.OfflineReason;

/* renamed from: kxx reason: default package */
public abstract class kxx {

    /* renamed from: kxx$a */
    public static final class a extends kxx {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Connecting{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: kxx$b */
    public static final class b extends kxx {
        public final OfflineReason a;

        b(OfflineReason offlineReason) {
            this.a = (OfflineReason) gcr.a(offlineReason);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Offline{reason=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: kxx$c */
    public static final class c extends kxx {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Online{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3);

    public abstract void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3);

    kxx() {
    }

    public static kxx a(OfflineReason offlineReason) {
        return new b(offlineReason);
    }

    public final boolean a() {
        return this instanceof c;
    }
}
