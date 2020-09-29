package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: ggo reason: default package */
public abstract class ggo {

    /* renamed from: ggo$a */
    public static final class a extends ggo {
        final String a;
        final String b;

        public a(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FoundDevice{deviceId=");
            sb.append(this.a);
            sb.append(", gaiaDeviceJson=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct3.apply(this);
        }
    }

    /* renamed from: ggo$b */
    public static final class b extends ggo {
        final String a;

        public b(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("GotNewIntentWithPhysicalDeviceId{physicalDeviceId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct2.apply(this);
        }
    }

    /* renamed from: ggo$c */
    public static final class c extends ggo {
        final boolean a;
        final boolean b;
        final RolloutFlag c;

        public c(boolean z, boolean z2, RolloutFlag rolloutFlag) {
            this.a = z;
            this.b = z2;
            this.c = (RolloutFlag) gcr.a(rolloutFlag);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a == this.a && cVar.b == this.b && cVar.c == this.c;
        }

        public final int hashCode() {
            return ((((Boolean.valueOf(this.a).hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GotPrerequisites{isPlaying=");
            sb.append(this.a);
            sb.append(", isPaused=");
            sb.append(this.b);
            sb.append(", flag=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct.apply(this);
        }
    }

    /* renamed from: ggo$d */
    public static final class d extends ggo {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SwitchFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct5.apply(this);
        }
    }

    /* renamed from: ggo$e */
    public static final class e extends ggo {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SwitchSuccessful{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5);

    ggo() {
    }
}
