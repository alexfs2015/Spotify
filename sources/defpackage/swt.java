package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: swt reason: default package */
public abstract class swt {

    /* renamed from: swt$a */
    public static final class a extends swt {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<a, R_> gee3) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ActivityStopped{}";
        }
    }

    /* renamed from: swt$b */
    public static final class b extends swt {
        final fqn a;

        b(fqn fqn) {
            this.a = (fqn) gec.a(fqn);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<a, R_> gee3) {
            return gee.apply(this);
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
    }

    /* renamed from: swt$c */
    public static final class c extends swt {
        final SessionState a;

        c(SessionState sessionState) {
            this.a = (SessionState) gec.a(sessionState);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<a, R_> gee3) {
            return gee2.apply(this);
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
    }

    swt() {
    }

    public static swt a(SessionState sessionState) {
        return new c(sessionState);
    }

    public static swt a(fqn fqn) {
        return new b(fqn);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<a, R_> gee3);
}
