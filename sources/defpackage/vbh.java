package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: vbh reason: default package */
public abstract class vbh {

    /* renamed from: vbh$a */
    public static final class a extends vbh {
        final vbc a;

        a(vbc vbc) {
            this.a = (vbc) gcr.a(vbc);
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
            sb.append("Error{errorState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vbh$b */
    public static final class b extends vbh {
        public final ImmutableList<vbq> a;

        b(ImmutableList<vbq> immutableList) {
            this.a = (ImmutableList) gcr.a(immutableList);
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
            sb.append("Loaded{pickerItems=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vbh$c */
    public static final class c extends vbh {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    vbh() {
    }

    public static vbh a(ImmutableList<vbq> immutableList) {
        return new b(immutableList);
    }

    public static vbh a(vbc vbc) {
        return new a(vbc);
    }
}
