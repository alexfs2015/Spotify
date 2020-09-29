package defpackage;

import java.util.List;

/* renamed from: kec reason: default package */
public abstract class kec {

    /* renamed from: kec$a */
    public static final class a extends kec {
        public final List<kdo> a;

        a(List<kdo> list) {
            this.a = (List) gcr.a(list);
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

    /* renamed from: kec$b */
    public static final class b extends kec {
        private final kdo a;

        public final kdo a() {
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

    /* renamed from: kec$c */
    public static final class c extends kec {
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

    /* renamed from: kec$d */
    public static final class d extends kec {
        public final kei a;

        d(kei kei) {
            this.a = (kei) gcr.a(kei);
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

    /* renamed from: kec$e */
    public static final class e extends kec {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenShareMenu{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    /* renamed from: kec$f */
    public static final class f extends kec {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PauseMainPlayback{}";
        }

        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }
    }

    /* renamed from: kec$g */
    public static final class g extends kec {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PauseStory{}";
        }

        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }
    }

    /* renamed from: kec$h */
    public static final class h extends kec {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ResumeStory{}";
        }

        h() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }
    }

    /* renamed from: kec$i */
    public static final class i extends kec {
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

    kec() {
    }

    public static kec a(boolean z) {
        return new c(z);
    }

    public static kec b(boolean z) {
        return new i(z);
    }

    public static kec a(List<kdo> list) {
        return new a(list);
    }

    public static kec a(kei kei) {
        return new d(kei);
    }
}
