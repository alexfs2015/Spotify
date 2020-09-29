package defpackage;

/* renamed from: lri reason: default package */
final class lri extends defpackage.lrf.a {
    private final b a;
    private final int b;

    /* renamed from: lri$a */
    static final class a implements C0051a {
        private b a;
        private Integer b;

        a() {
        }

        public final C0051a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final C0051a a(b bVar) {
            this.a = bVar;
            return this;
        }

        public final defpackage.lrf.a a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" noOfItemsAdded");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new lri(this.a, this.b.intValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private lri(b bVar, int i) {
        this.a = bVar;
        this.b = i;
    }

    /* synthetic */ lri(b bVar, int i, byte b2) {
        this(bVar, i);
    }

    public final b a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lrf.a) {
            defpackage.lrf.a aVar = (defpackage.lrf.a) obj;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{duplicateResult=");
        sb.append(this.a);
        sb.append(", noOfItemsAdded=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
