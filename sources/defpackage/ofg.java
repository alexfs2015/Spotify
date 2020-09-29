package defpackage;

import android.content.Context;
import com.spotify.mobile.android.connect.model.Tech;

/* renamed from: ofg reason: default package */
public abstract class ofg {

    /* renamed from: ofg$a */
    public static final class a extends ofg {
        public final Tech a;

        public a(Tech tech) {
            this.a = (Tech) gec.a(tech);
        }

        public final void a(ged<c> ged, ged<a> ged2, ged<b> ged3, ged<d> ged4) {
            ged2.accept(this);
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
    }

    /* renamed from: ofg$b */
    public static final class b extends ofg {
        public final void a(ged<c> ged, ged<a> ged2, ged<b> ged3, ged<d> ged4) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DevicesAvailable{}";
        }
    }

    /* renamed from: ofg$c */
    public static final class c extends ofg {
        public final void a(ged<c> ged, ged<a> ged2, ged<b> ged3, ged<d> ged4) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoDevices{}";
        }
    }

    /* renamed from: ofg$d */
    public static final class d extends ofg {
        public final Tech a;
        public final knx<Context, String> b;

        d(Tech tech, knx<Context, String> knx) {
            this.a = (Tech) gec.a(tech);
            this.b = (knx) gec.a(knx);
        }

        public final void a(ged<c> ged, ged<a> ged2, ged<b> ged3, ged<d> ged4) {
            ged4.accept(this);
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
    }

    ofg() {
    }

    public static ofg a(Tech tech, knx<Context, String> knx) {
        return new d(tech, knx);
    }

    public abstract void a(ged<c> ged, ged<a> ged2, ged<b> ged3, ged<d> ged4);
}
