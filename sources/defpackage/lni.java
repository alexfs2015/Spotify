package defpackage;

/* renamed from: lni reason: default package */
final class lni extends defpackage.lnf.a {
    private final b a;
    private final int b;

    /* renamed from: lni$a */
    static final class a implements C0050a {
        private b a;
        private Integer b;

        a() {
        }

        public final C0050a a(b bVar) {
            this.a = bVar;
            return this;
        }

        public final C0050a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.lnf.a a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" noOfItemsAdded");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new lni(this.a, this.b.intValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ lni(b bVar, int i, byte b2) {
        this(bVar, i);
    }

    private lni(b bVar, int i) {
        this.a = bVar;
        this.b = i;
    }

    public final b a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{duplicateResult=");
        sb.append(this.a);
        sb.append(", noOfItemsAdded=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lnf.a) {
            defpackage.lnf.a aVar = (defpackage.lnf.a) obj;
            b bVar = this.a;
            if (bVar != null ? bVar.equals(aVar.a()) : aVar.a() == null) {
                if (this.b == aVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        b bVar = this.a;
        return (((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003) ^ this.b;
    }
}
