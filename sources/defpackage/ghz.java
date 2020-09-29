package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: ghz reason: default package */
public abstract class ghz {

    /* renamed from: ghz$a */
    public static final class a extends ghz {
        final String a;
        final String b;

        public a(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee3.apply(this);
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
    }

    /* renamed from: ghz$b */
    public static final class b extends ghz {
        final String a;

        public b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee2.apply(this);
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
    }

    /* renamed from: ghz$c */
    public static final class c extends ghz {
        final boolean a;
        final boolean b;
        final RolloutFlag c;

        public c(boolean z, boolean z2, RolloutFlag rolloutFlag) {
            this.a = z;
            this.b = z2;
            this.c = (RolloutFlag) gec.a(rolloutFlag);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee.apply(this);
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
    }

    /* renamed from: ghz$d */
    public static final class d extends ghz {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SwitchFailed{}";
        }
    }

    /* renamed from: ghz$e */
    public static final class e extends ghz {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SwitchSuccessful{}";
        }
    }

    ghz() {
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5);
}
