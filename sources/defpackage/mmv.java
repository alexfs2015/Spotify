package defpackage;

/* renamed from: mmv reason: default package */
abstract class mmv extends mnh {
    final String a;
    final String b;

    /* renamed from: mmv$a */
    static final class a implements defpackage.mnh.a {
        private String a;
        private String b;

        a() {
        }

        public final defpackage.mnh.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public final defpackage.mnh.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null rowId");
        }

        public final mnh a() {
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
                sb2.append(" rowId");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new mnb(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    mmv(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null rowId");
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
        StringBuilder sb = new StringBuilder("DeleteOperation{playlistUri=");
        sb.append(this.a);
        sb.append(", rowId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mnh) {
            mnh mnh = (mnh) obj;
            return this.a.equals(mnh.a()) && this.b.equals(mnh.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
