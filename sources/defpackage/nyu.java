package defpackage;

import android.content.Context;
import com.spotify.mobile.android.connect.model.Tech;

/* renamed from: nyu reason: default package */
public abstract class nyu {

    /* renamed from: nyu$a */
    public static final class a extends nyu {
        public final Tech a;

        public a(Tech tech) {
            this.a = (Tech) gcr.a(tech);
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
            sb.append("Connecting{tech=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<d> gcs4) {
            gcs2.accept(this);
        }
    }

    /* renamed from: nyu$b */
    public static final class b extends nyu {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DevicesAvailable{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<c> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<d> gcs4) {
            gcs3.accept(this);
        }
    }

    /* renamed from: nyu$c */
    public static final class c extends nyu {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoDevices{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<c> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<d> gcs4) {
            gcs.accept(this);
        }
    }

    /* renamed from: nyu$d */
    public static final class d extends nyu {
        public final Tech a;
        public final kko<Context, String> b;

        d(Tech tech, kko<Context, String> kko) {
            this.a = (Tech) gcr.a(tech);
            this.b = (kko) gcr.a(kko);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a == this.a && dVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayingFrom{tech=");
            sb.append(this.a);
            sb.append(", deviceName=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<d> gcs4) {
            gcs4.accept(this);
        }
    }

    public abstract void a(gcs<c> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<d> gcs4);

    nyu() {
    }

    public static nyu a(Tech tech, kko<Context, String> kko) {
        return new d(tech, kko);
    }
}
