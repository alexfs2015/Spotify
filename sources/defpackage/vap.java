package defpackage;

import java.util.Set;

/* renamed from: vap reason: default package */
public abstract class vap {

    /* renamed from: vap$a */
    public static final class a extends vap {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHome{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: vap$b */
    public static final class b extends vap {
        private final Set<vbt> a;

        b(Set<vbt> set) {
            this.a = (Set) gcr.a(set);
        }

        public final Set<vbt> a() {
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

    vap() {
    }
}
