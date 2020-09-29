package defpackage;

/* renamed from: mrq reason: default package */
abstract class mrq extends msc {
    final String a;
    final String b;
    final String c;

    /* renamed from: mrq$a */
    static final class a implements defpackage.msc.a {
        private String a;
        private String b;
        private String c;

        a() {
        }

        public final defpackage.msc.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public final msc a() {
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
                return new mrw(this.a, this.b, this.c);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.msc.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null rowId");
        }

        public final defpackage.msc.a c(String str) {
            this.c = str;
            return this;
        }
    }

    mrq(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
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

    /* access modifiers changed from: protected */
    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof msc) {
            msc msc = (msc) obj;
            if (this.a.equals(msc.a()) && this.b.equals(msc.b())) {
                String str = this.c;
                return str != null ? str.equals(msc.c()) : msc.c() == null;
            }
        }
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MoveOperation{playlistUri=");
        sb.append(this.a);
        sb.append(", rowId=");
        sb.append(this.b);
        sb.append(", moveBeforeRowId=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
