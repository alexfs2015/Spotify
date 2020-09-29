package defpackage;

/* renamed from: uco reason: default package */
public abstract class uco {

    /* renamed from: uco$a */
    public static final class a extends uco {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "HostEducationShown{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: uco$b */
    public static final class b extends uco {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ParticipantEducationShown{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: uco$c */
    public static final class c extends uco {
        final uax a;

        c(uax uax) {
            this.a = (uax) gcr.a(uax);
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

        public final <R_> R_ a(gct<c, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3);

    uco() {
    }

    public static uco a(uax uax) {
        return new c(uax);
    }
}
