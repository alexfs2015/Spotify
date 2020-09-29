package defpackage;

import com.spotify.music.sociallistening.model.Participant;

/* renamed from: udd reason: default package */
public abstract class udd {

    /* renamed from: udd$a */
    public static final class a extends udd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DialogConfirmEndButtonClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<e, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6) {
            return gct6.apply(this);
        }
    }

    /* renamed from: udd$b */
    public static final class b extends udd {
        final Participant a;
        private final int b;

        public b(Participant participant, int i) {
            this.a = (Participant) gcr.a(participant);
            this.b = i;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6) {
            return gct3.apply(this);
        }
    }

    /* renamed from: udd$c */
    public static final class c extends udd {
        private final int a;

        public c(int i) {
            this.a = i;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6) {
            return gct5.apply(this);
        }
    }

    /* renamed from: udd$d */
    public static final class d extends udd {
        private final int a;

        public d(int i) {
            this.a = i;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6) {
            return gct4.apply(this);
        }
    }

    /* renamed from: udd$e */
    public static final class e extends udd {
        final uax a;

        e(uax uax) {
            this.a = (uax) gcr.a(uax);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6) {
            return gct.apply(this);
        }
    }

    /* renamed from: udd$f */
    public static final class f extends udd {
        final String a;

        f(String str) {
            this.a = (String) gcr.a(str);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<e, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<d, R_> gct4, gct<c, R_> gct5, gct<a, R_> gct6);

    udd() {
    }

    public static udd a(uax uax) {
        return new e(uax);
    }

    public static udd a(String str) {
        return new f(str);
    }
}
