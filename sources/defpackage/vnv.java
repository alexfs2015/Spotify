package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: vnv reason: default package */
public abstract class vnv {

    /* renamed from: vnv$a */
    public static final class a extends vnv {
        final vnq a;

        a(vnq vnq) {
            this.a = (vnq) gec.a(vnq);
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

    /* renamed from: vnv$b */
    public static final class b extends vnv {
        public final ImmutableList<voe> a;

        b(ImmutableList<voe> immutableList) {
            this.a = (ImmutableList) gec.a(immutableList);
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

    /* renamed from: vnv$c */
    public static final class c extends vnv {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    vnv() {
    }

    public static vnv a(ImmutableList<voe> immutableList) {
        return new b(immutableList);
    }

    public static vnv a(vnq vnq) {
        return new a(vnq);
    }
}
