package defpackage;

import java.util.Set;

/* renamed from: vbd reason: default package */
public abstract class vbd {

    /* renamed from: vbd$a */
    public static final class a extends vbd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchTopics{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: vbd$b */
    public static final class b extends vbd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHome{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: vbd$c */
    public static final class c extends vbd {
        public final Set<vbt> a;

        c(Set<vbt> set) {
            this.a = (Set) gcr.a(set);
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
            sb.append("NavigateToSendTopics{selectedTopics=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vbd$d */
    public static final class d extends vbd {
        private final Set<vbt> a;

        d(Set<vbt> set) {
            this.a = (Set) gcr.a(set);
        }

        public final Set<vbt> a() {
            return this.a;
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
            sb.append("SendSelectedTopicsSilently{selectedTopics=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vbd$e */
    public static final class e extends vbd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowRetryDialog{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    /* renamed from: vbd$f */
    public static final class f extends vbd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowSkipDialog{}";
        }

        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }
    }

    vbd() {
    }
}
