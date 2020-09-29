package defpackage;

/* renamed from: mmz reason: default package */
abstract class mmz extends mnp {
    final String a;
    final String b;

    /* renamed from: mmz$a */
    static final class a implements defpackage.mnp.a {
        private String a;
        private String b;

        a() {
        }

        public final defpackage.mnp.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public final defpackage.mnp.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        public final mnp a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playlistUri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" imageUri");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new mnf(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    mmz(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null playlistUri");
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SetPictureOperation{playlistUri=");
        sb.append(this.a);
        sb.append(", imageUri=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mnp) {
            mnp mnp = (mnp) obj;
            return this.a.equals(mnp.a()) && this.b.equals(mnp.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
