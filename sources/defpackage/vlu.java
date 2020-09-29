package defpackage;

/* renamed from: vlu reason: default package */
abstract class vlu extends vma {
    final vlw a;
    final boolean b;

    /* renamed from: vlu$a */
    static final class a implements defpackage.vma.a {
        private vlw a;
        private Boolean b;

        /* synthetic */ a(vma vma, byte b2) {
            this(vma);
        }

        a() {
        }

        private a(vma vma) {
            this.a = vma.a();
            this.b = Boolean.valueOf(vma.b());
        }

        public final defpackage.vma.a a(vlw vlw) {
            if (vlw != null) {
                this.a = vlw;
                return this;
            }
            throw new NullPointerException("Null gender");
        }

        public final defpackage.vma.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final vma a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" gender");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" noneBinaryGenderEnabled");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vlv(this.a, this.b.booleanValue());
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    vlu(vlw vlw, boolean z) {
        if (vlw != null) {
            this.a = vlw;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null gender");
    }

    public final vlw a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GenderModel{gender=");
        sb.append(this.a);
        sb.append(", noneBinaryGenderEnabled=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vma) {
            vma vma = (vma) obj;
            return this.a.equals(vma.a()) && this.b == vma.b();
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final defpackage.vma.a c() {
        return new a(this, 0);
    }
}
