package defpackage;

/* renamed from: upj reason: default package */
public abstract class upj {

    /* renamed from: upj$a */
    public static final class a extends upj {
        public final <R_> R_ a(gee<c, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "HostEducationShown{}";
        }
    }

    /* renamed from: upj$b */
    public static final class b extends upj {
        public final <R_> R_ a(gee<c, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ParticipantEducationShown{}";
        }
    }

    /* renamed from: upj$c */
    public static final class c extends upj {
        final uns a;

        c(uns uns) {
            this.a = (uns) gec.a(uns);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3) {
            return gee.apply(this);
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
            sb.append("SocialListeningStateReceived{socialListeningState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    upj() {
    }

    public static upj a(uns uns) {
        return new c(uns);
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3);
}
