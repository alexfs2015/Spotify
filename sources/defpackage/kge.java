package defpackage;

import java.util.List;

/* renamed from: kge reason: default package */
public abstract class kge {

    /* renamed from: kge$a */
    public static final class a extends kge {
        public final List<kfp> a;

        a(List<kfp> list) {
            this.a = (List) gec.a(list);
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
            sb.append("FetchAllStories{stories=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kge$b */
    public static final class b extends kge {
        private final kfp a;

        public final kfp a() {
            return this.a;
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
            sb.append("FetchStory{story=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kge$c */
    public static final class c extends kge {
        public final boolean a;

        c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FinishExperience{muted=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kge$d */
    public static final class d extends kge {
        public final kgk a;

        d(kgk kgk) {
            this.a = (kgk) gec.a(kgk);
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
            sb.append("LogInteraction{logMessage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kge$e */
    public static final class e extends kge {
        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenShareMenu{}";
        }
    }

    /* renamed from: kge$f */
    public static final class f extends kge {
        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PauseMainPlayback{}";
        }
    }

    /* renamed from: kge$g */
    public static final class g extends kge {
        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PauseStory{}";
        }
    }

    /* renamed from: kge$h */
    public static final class h extends kge {
        h() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ResumeStory{}";
        }
    }

    /* renamed from: kge$i */
    public static final class i extends kge {
        public final boolean a;

        i(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof i) && ((i) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetMuted{muted=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    kge() {
    }

    public static kge a(List<kfp> list) {
        return new a(list);
    }

    public static kge a(kgk kgk) {
        return new d(kgk);
    }

    public static kge a(boolean z) {
        return new c(z);
    }

    public static kge b(boolean z) {
        return new i(z);
    }
}
