package defpackage;

/* renamed from: mmw reason: default package */
abstract class mmw extends mni {
    final String a;
    final String b;

    /* renamed from: mmw$a */
    static final class a implements defpackage.mni.a {
        private String a;
        private String b;

        a() {
        }

        public final defpackage.mni.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public final defpackage.mni.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null playlistDescription");
        }

        public final mni a() {
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
                sb2.append(" playlistDescription");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new mnc(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    mmw(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null playlistDescription");
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
        StringBuilder sb = new StringBuilder("DescribeOperation{playlistUri=");
        sb.append(this.a);
        sb.append(", playlistDescription=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mni) {
            mni mni = (mni) obj;
            return this.a.equals(mni.a()) && this.b.equals(mni.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
