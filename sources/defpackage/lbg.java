package defpackage;

import com.spotify.music.connection.OfflineReason;

/* renamed from: lbg reason: default package */
public abstract class lbg {

    /* renamed from: lbg$a */
    public static final class a extends lbg {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee3.apply(this);
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Connecting{}";
        }
    }

    /* renamed from: lbg$b */
    public static final class b extends lbg {
        public final OfflineReason a;

        b(OfflineReason offlineReason) {
            this.a = (OfflineReason) gec.a(offlineReason);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee2.apply(this);
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged2.accept(this);
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
    }

    /* renamed from: lbg$c */
    public static final class c extends lbg {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee.apply(this);
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Online{}";
        }
    }

    lbg() {
    }

    public static lbg a(OfflineReason offlineReason) {
        return new b(offlineReason);
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3);

    public abstract void a(ged<c> ged, ged<b> ged2, ged<a> ged3);

    public final boolean a() {
        return this instanceof c;
    }
}
