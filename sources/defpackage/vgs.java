package defpackage;

/* renamed from: vgs reason: default package */
final class vgs extends vgy {
    private final int a;

    /* renamed from: vgs$a */
    static final class a extends defpackage.vgy.a {
        private Integer a;

        a() {
        }

        public final defpackage.vgy.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final vgy a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" abbaMaxFetchWait");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgs(this.a.intValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgs(int i, byte b) {
        this(i);
    }

    private vgs(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureServiceProperties{abbaMaxFetchWait=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vgy) {
            if (this.a == ((vgy) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }
}
