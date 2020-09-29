package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: smm reason: default package */
public abstract class smm {

    /* renamed from: smm$a */
    public static final class a extends smm {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ActivityStopped{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: smm$b */
    public static final class b extends smm {
        final fpt a;

        b(fpt fpt) {
            this.a = (fpt) gcr.a(fpt);
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
            sb.append("FlagsChanged{flags=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: smm$c */
    public static final class c extends smm {
        final SessionState a;

        c(SessionState sessionState) {
            this.a = (SessionState) gcr.a(sessionState);
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
            sb.append("SessionStateChanged{sessionState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3);

    smm() {
    }

    public static smm a(fpt fpt) {
        return new b(fpt);
    }

    public static smm a(SessionState sessionState) {
        return new c(sessionState);
    }
}
