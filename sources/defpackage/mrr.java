package defpackage;

/* renamed from: mrr reason: default package */
abstract class mrr extends msh {
    final String a;
    final String b;

    /* renamed from: mrr$a */
    static final class a implements defpackage.msh.a {
        private String a;
        private String b;

        a() {
        }

        public final defpackage.msh.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public final msh a() {
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
                sb2.append(" playlistName");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new mrx(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.msh.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null playlistName");
        }
    }

    mrr(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null playlistName");
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
        if (obj instanceof msh) {
            msh msh = (msh) obj;
            return this.a.equals(msh.a()) && this.b.equals(msh.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RenameOperation{playlistUri=");
        sb.append(this.a);
        sb.append(", playlistName=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
