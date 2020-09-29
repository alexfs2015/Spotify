package defpackage;

import com.spotify.music.sociallistening.model.HostSession;
import com.spotify.music.sociallistening.model.Notification;
import com.spotify.music.sociallistening.model.Session;

/* renamed from: uow reason: default package */
public abstract class uow {

    /* renamed from: uow$a */
    public static final class a extends uow {
        final String a;

        a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee6.apply(this);
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
    }

    /* renamed from: uow$b */
    public static final class b extends uow {
        final Session a;

        b(Session session) {
            this.a = (Session) gec.a(session);
        }

        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee7.apply(this);
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
    }

    /* renamed from: uow$c */
    public static final class c extends uow {
        final Session a;

        c(Session session) {
            this.a = (Session) gec.a(session);
        }

        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee8.apply(this);
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
    }

    /* renamed from: uow$d */
    public static final class d extends uow {
        final HostSession a;

        d(HostSession hostSession) {
            this.a = (HostSession) gec.a(hostSession);
        }

        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee10.apply(this);
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
    }

    /* renamed from: uow$e */
    public static final class e extends uow {
        final String a;

        public e(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee2.apply(this);
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
    }

    /* renamed from: uow$f */
    public static final class f extends uow {
        final Session a;

        f(Session session) {
            this.a = (Session) gec.a(session);
        }

        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee9.apply(this);
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
    }

    /* renamed from: uow$g */
    public static final class g extends uow {
        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LeaveSession{}";
        }
    }

    /* renamed from: uow$h */
    public static final class h extends uow {
        final boolean a;

        public h(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee.apply(this);
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
    }

    /* renamed from: uow$i */
    public static final class i extends uow {
        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee11.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SessionTerminated{}";
        }
    }

    /* renamed from: uow$j */
    public static final class j extends uow {
        final Notification a;

        j(Notification notification) {
            this.a = (Notification) gec.a(notification);
        }

        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee5.apply(this);
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
    }

    /* renamed from: uow$k */
    public static final class k extends uow {
        final int a;

        public k(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11) {
            return gee4.apply(this);
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
    }

    uow() {
    }

    public static uow a(HostSession hostSession) {
        return new d(hostSession);
    }

    public static uow a(Notification notification) {
        return new j(notification);
    }

    public static uow a(Session session) {
        return new b(session);
    }

    public static uow a(String str) {
        return new a(str);
    }

    public static uow b(Session session) {
        return new c(session);
    }

    public static uow c(Session session) {
        return new f(session);
    }

    public abstract <R_> R_ a(gee<h, R_> gee, gee<e, R_> gee2, gee<g, R_> gee3, gee<k, R_> gee4, gee<j, R_> gee5, gee<a, R_> gee6, gee<b, R_> gee7, gee<c, R_> gee8, gee<f, R_> gee9, gee<d, R_> gee10, gee<i, R_> gee11);
}
