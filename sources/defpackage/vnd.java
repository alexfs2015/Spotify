package defpackage;

import java.util.Set;

/* renamed from: vnd reason: default package */
public abstract class vnd {

    /* renamed from: vnd$a */
    public static final class a extends vnd {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHome{}";
        }
    }

    /* renamed from: vnd$b */
    public static final class b extends vnd {
        private final Set<voh> a;

        b(Set<voh> set) {
            this.a = (Set) gec.a(set);
        }

        public final Set<voh> a() {
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
            sb.append("SendSelectedTopics{topics=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vnd() {
    }
}
