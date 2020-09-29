package defpackage;

import com.spotify.mobile.android.storylines.model.StorylinesCardContent;

/* renamed from: tfw reason: default package */
public abstract class tfw {

    /* renamed from: tfw$a */
    public static final class a extends tfw {
        public final Throwable a;

        a(Throwable th) {
            this.a = (Throwable) gec.a(th);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee3.apply(this);
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

    /* renamed from: tfw$b */
    public static final class b extends tfw {
        public final StorylinesCardContent a;

        b(StorylinesCardContent storylinesCardContent) {
            this.a = (StorylinesCardContent) gec.a(storylinesCardContent);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Loaded{storylinesContent=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: tfw$c */
    public static final class c extends tfw {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    tfw() {
    }

    public static tfw a(StorylinesCardContent storylinesCardContent) {
        return new b(storylinesCardContent);
    }

    public static tfw a(Throwable th) {
        return new a(th);
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3);
}
