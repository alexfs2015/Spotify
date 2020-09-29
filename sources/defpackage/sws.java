package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: sws reason: default package */
public abstract class sws {

    /* renamed from: sws$a */
    public static final class a extends sws {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EndLoggedInSession{}";
        }
    }

    /* renamed from: sws$b */
    public static final class b extends sws {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "GoToLogin{}";
        }
    }

    /* renamed from: sws$c */
    public static final class c extends sws {
        public final fqn a;

        c(fqn fqn) {
            this.a = (fqn) gec.a(fqn);
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
            sb.append("HandleFlagsChanged{flags=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: sws$d */
    public static final class d extends sws {
        public final SessionState a;

        d(SessionState sessionState) {
            this.a = (SessionState) gec.a(sessionState);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HandleSessionStateChanged{sessionState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: sws$e */
    public static final class e extends sws {
        public final fqn a;
        public final SessionState b;

        e(fqn fqn, SessionState sessionState) {
            this.a = (fqn) gec.a(fqn);
            this.b = (SessionState) gec.a(sessionState);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.a.equals(this.a) && eVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StartLoggedInSession{flags=");
            sb.append(this.a);
            sb.append(", sessionState=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: sws$f */
    public static final class f extends sws {
        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "UiHidden{}";
        }
    }

    /* renamed from: sws$g */
    public static final class g extends sws {
        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "UiVisible{}";
        }
    }

    sws() {
    }

    public static sws a(fqn fqn, SessionState sessionState) {
        return new e(fqn, sessionState);
    }
}
