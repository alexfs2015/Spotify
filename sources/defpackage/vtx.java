package defpackage;

/* renamed from: vtx reason: default package */
final class vtx extends vud {
    private final int a;

    /* renamed from: vtx$a */
    static final class a extends defpackage.vud.a {
        private Integer a;

        a() {
        }

        public final defpackage.vud.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final vud a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" abbaMaxFetchWait");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vtx(this.a.intValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vtx(int i) {
        this.a = i;
    }

    /* synthetic */ vtx(int i, byte b) {
        this(i);
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vud) {
            if (this.a == ((vud) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureServiceProperties{abbaMaxFetchWait=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
