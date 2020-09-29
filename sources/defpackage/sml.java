package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: sml reason: default package */
public abstract class sml {

    /* renamed from: sml$a */
    public static final class a extends sml {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EndLoggedInSession{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: sml$b */
    public static final class b extends sml {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "GoToLogin{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: sml$c */
    public static final class c extends sml {
        public final fpt a;

        c(fpt fpt) {
            this.a = (fpt) gcr.a(fpt);
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

    /* renamed from: sml$d */
    public static final class d extends sml {
        public final SessionState a;

        d(SessionState sessionState) {
            this.a = (SessionState) gcr.a(sessionState);
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

    /* renamed from: sml$e */
    public static final class e extends sml {
        public final fpt a;
        public final SessionState b;

        e(fpt fpt, SessionState sessionState) {
            this.a = (fpt) gcr.a(fpt);
            this.b = (SessionState) gcr.a(sessionState);
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

    /* renamed from: sml$f */
    public static final class f extends sml {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "UiHidden{}";
        }

        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }
    }

    /* renamed from: sml$g */
    public static final class g extends sml {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "UiVisible{}";
        }

        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }
    }

    sml() {
    }

    public static sml a(fpt fpt, SessionState sessionState) {
        return new e(fpt, sessionState);
    }
}
