package defpackage;

import com.google.common.base.Optional;

/* renamed from: mvn reason: default package */
final class mvn extends mvm {
    private final String a;
    private final String b;
    private final Optional<String> c;

    /* renamed from: mvn$a */
    public static final class a extends defpackage.mvm.a {
        private String a;
        private String b;
        private Optional<String> c = Optional.e();

        public final defpackage.mvm.a a(Optional<String> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null image");
        }

        public final defpackage.mvm.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final mvm a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" displayName");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new mvn(this.a, this.b, this.c, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.mvm.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }
    }

    private mvn(String str, String str2, Optional<String> optional) {
        this.a = str;
        this.b = str2;
        this.c = optional;
    }

    /* synthetic */ mvn(String str, String str2, Optional optional, byte b2) {
        this(str, str2, optional);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Optional<String> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvm) {
            mvm mvm = (mvm) obj;
            return this.a.equals(mvm.a()) && this.b.equals(mvm.b()) && this.c.equals(mvm.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Artist{uri=");
        sb.append(this.a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
