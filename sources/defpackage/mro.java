package defpackage;

/* renamed from: mro reason: default package */
abstract class mro extends msa {
    final String a;
    final String b;

    /* renamed from: mro$a */
    static final class a implements defpackage.msa.a {
        private String a;
        private String b;

        a() {
        }

        public final defpackage.msa.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public final msa a() {
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
                return new mru(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.msa.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null rowId");
        }
    }

    mro(String str, String str2) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof msa) {
            msa msa = (msa) obj;
            return this.a.equals(msa.a()) && this.b.equals(msa.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteOperation{playlistUri=");
        sb.append(this.a);
        sb.append(", rowId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
