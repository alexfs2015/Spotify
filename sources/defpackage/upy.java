package defpackage;

import com.spotify.music.sociallistening.model.Participant;

/* renamed from: upy reason: default package */
public abstract class upy {

    /* renamed from: upy$a */
    public static final class a extends upy {
        public final <R_> R_ a(gee<e, R_> gee, gee<f, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DialogConfirmEndButtonClicked{}";
        }
    }

    /* renamed from: upy$b */
    public static final class b extends upy {
        final Participant a;
        private final int b;

        public b(Participant participant, int i) {
            this.a = (Participant) gec.a(participant);
            this.b = i;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<f, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.b == this.b && bVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ParticipantClicked{participant=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upy$c */
    public static final class c extends upy {
        private final int a;

        public c(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<f, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ParticipantEndButtonClicked{position=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upy$d */
    public static final class d extends upy {
        private final int a;

        public d(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<f, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof d) && ((d) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ParticipantLeaveButtonClicked{position=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upy$e */
    public static final class e extends upy {
        final uns a;

        e(uns uns) {
            this.a = (uns) gec.a(uns);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<f, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6) {
            return gee.apply(this);
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
            sb.append("SocialListeningStateReceived{socialListeningState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upy$f */
    public static final class f extends upy {
        final String a;

        f(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<f, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6) {
            return gee2.apply(this);
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
            sb.append("UsernameReceived{username=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    upy() {
    }

    public static upy a(String str) {
        return new f(str);
    }

    public static upy a(uns uns) {
        return new e(uns);
    }

    public abstract <R_> R_ a(gee<e, R_> gee, gee<f, R_> gee2, gee<b, R_> gee3, gee<d, R_> gee4, gee<c, R_> gee5, gee<a, R_> gee6);
}
