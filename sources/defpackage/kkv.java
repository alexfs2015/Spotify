package defpackage;

/* renamed from: kkv reason: default package */
abstract class kkv extends kkz {
    final String a;
    private final String b;

    /* renamed from: kkv$a */
    static final class a implements defpackage.kkz.a {
        private String a;
        private String b;

        a() {
        }

        public final defpackage.kkz.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        public final kkz a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" imageUri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" sharedId");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new kkx(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.kkz.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null sharedId");
        }
    }

    kkv(String str, String str2) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.a = str2;
                return;
            }
            throw new NullPointerException("Null sharedId");
        }
        throw new NullPointerException("Null imageUri");
    }

    public String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kkz) {
            kkz kkz = (kkz) obj;
            return this.b.equals(kkz.a()) && this.a.equals(kkz.b());
        }
    }

    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SummaryCard{imageUri=");
        sb.append(this.b);
        sb.append(", sharedId=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
