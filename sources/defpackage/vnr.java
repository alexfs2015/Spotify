package defpackage;

import java.util.Set;

/* renamed from: vnr reason: default package */
public abstract class vnr {

    /* renamed from: vnr$a */
    public static final class a extends vnr {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchTopics{}";
        }
    }

    /* renamed from: vnr$b */
    public static final class b extends vnr {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHome{}";
        }
    }

    /* renamed from: vnr$c */
    public static final class c extends vnr {
        public final Set<voh> a;

        c(Set<voh> set) {
            this.a = (Set) gec.a(set);
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

    /* renamed from: vnr$d */
    public static final class d extends vnr {
        private final Set<voh> a;

        d(Set<voh> set) {
            this.a = (Set) gec.a(set);
        }

        public final Set<voh> a() {
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

    /* renamed from: vnr$e */
    public static final class e extends vnr {
        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowRetryDialog{}";
        }
    }

    /* renamed from: vnr$f */
    public static final class f extends vnr {
        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowSkipDialog{}";
        }
    }

    vnr() {
    }
}
