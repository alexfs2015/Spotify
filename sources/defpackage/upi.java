package defpackage;

/* renamed from: upi reason: default package */
public abstract class upi {

    /* renamed from: upi$a */
    public static final class a extends upi {
        public final String a;

        a(String str) {
            this.a = (String) gec.a(str);
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
            sb.append("NotifyFirstParticipantJoinedYou{participantName=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upi$b */
    public static final class b extends upi {
        public final String a;

        b(String str) {
            this.a = (String) gec.a(str);
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
            sb.append("NotifyHostEnded{hostName=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upi$c */
    public static final class c extends upi {
        public final String a;

        c(String str) {
            this.a = (String) gec.a(str);
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
            sb.append("NotifyParticipantJoined{participantName=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upi$d */
    public static final class d extends upi {
        public final String a;

        d(String str) {
            this.a = (String) gec.a(str);
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
            sb.append("NotifyParticipantLeft{participantName=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upi$e */
    public static final class e extends upi {
        public final boolean a;

        e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof e) && ((e) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotifyYouEnded{shortDelay=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upi$f */
    public static final class f extends upi {
        public final String a;
        public final int b;

        f(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.b == this.b && fVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotifyYouJoined{hostName=");
            sb.append(this.a);
            sb.append(", participantCount=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upi$g */
    public static final class g extends upi {
        public final String a;

        g(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotifyYouJoinedAsTheFirstParticipant{hostName=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upi$h */
    public static final class h extends upi {
        public final boolean a;

        h(boolean z) {
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
            sb.append("NotifyYouLeft{shortDelay=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upi$i */
    public static final class i extends upi {
        i() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PersistHostEducationShown{}";
        }
    }

    /* renamed from: upi$j */
    public static final class j extends upi {
        j() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof j;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PersistParticipantEducationShown{}";
        }
    }

    /* renamed from: upi$k */
    public static final class k extends upi {
        public final String a;

        k(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            return ((k) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowHostEducation{participantName=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: upi$l */
    public static final class l extends upi {
        public final String a;

        l(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            return ((l) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowParticipantEducation{hostName=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    upi() {
    }
}
