package defpackage;

import com.spotify.music.sociallistening.model.HostSession;
import com.spotify.music.sociallistening.model.Notification;
import com.spotify.music.sociallistening.model.Session;

/* renamed from: ucb reason: default package */
public abstract class ucb {

    /* renamed from: ucb$a */
    public static final class a extends ucb {
        final String a;

        a(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("CurrentUsername{username=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct6.apply(this);
        }
    }

    /* renamed from: ucb$b */
    public static final class b extends ucb {
        final Session a;

        b(Session session) {
            this.a = (Session) gcr.a(session);
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
            sb.append("GetOrCreateSessionResult{session=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct7.apply(this);
        }
    }

    /* renamed from: ucb$c */
    public static final class c extends ucb {
        final Session a;

        c(Session session) {
            this.a = (Session) gcr.a(session);
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
            sb.append("GetSessionResult{session=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct8.apply(this);
        }
    }

    /* renamed from: ucb$d */
    public static final class d extends ucb {
        final HostSession a;

        d(HostSession hostSession) {
            this.a = (HostSession) gcr.a(hostSession);
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
            sb.append("HostNewSessionResult{hostSession=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct10.apply(this);
        }
    }

    /* renamed from: ucb$e */
    public static final class e extends ucb {
        final String a;

        public e(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("JoinSession{joinSessionUri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct2.apply(this);
        }
    }

    /* renamed from: ucb$f */
    public static final class f extends ucb {
        final Session a;

        f(Session session) {
            this.a = (Session) gcr.a(session);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("JoinSessionResult{session=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct9.apply(this);
        }
    }

    /* renamed from: ucb$g */
    public static final class g extends ucb {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LeaveSession{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct3.apply(this);
        }
    }

    /* renamed from: ucb$h */
    public static final class h extends ucb {
        final boolean a;

        public h(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof h) && ((h) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ObtainSession{createSession=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct.apply(this);
        }
    }

    /* renamed from: ucb$i */
    public static final class i extends ucb {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SessionTerminated{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct11.apply(this);
        }
    }

    /* renamed from: ucb$j */
    public static final class j extends ucb {
        final Notification a;

        j(Notification notification) {
            this.a = (Notification) gcr.a(notification);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return ((j) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SocialConnectNotification{notification=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct5.apply(this);
        }
    }

    /* renamed from: ucb$k */
    public static final class k extends ucb {
        final int a;

        public k(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof k) && ((k) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateEventRevision{eventRevision=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<h, R_> gct, gct<e, R_> gct2, gct<g, R_> gct3, gct<k, R_> gct4, gct<j, R_> gct5, gct<a, R_> gct6, gct<b, R_> gct7, gct<c, R_> gct8, gct<f, R_> gct9, gct<d, R_> gct10, gct<i, R_> gct11);

    ucb() {
    }

    public static ucb a(Notification notification) {
        return new j(notification);
    }

    public static ucb a(String str) {
        return new a(str);
    }

    public static ucb a(Session session) {
        return new b(session);
    }

    public static ucb b(Session session) {
        return new c(session);
    }

    public static ucb c(Session session) {
        return new f(session);
    }

    public static ucb a(HostSession hostSession) {
        return new d(hostSession);
    }
}
