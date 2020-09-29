package defpackage;

import java.util.List;

/* renamed from: lqx reason: default package */
final class lqx extends lqz {
    private final String a;
    private final int b;
    private final List<byte[]> c;

    /* renamed from: lqx$a */
    public static final class a implements defpackage.lqz.a {
        private String a;
        private Integer b;
        private List<byte[]> c;

        public final defpackage.lqz.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.lqz.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.lqz.a a(List<byte[]> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null cardsState");
        }

        public final lqz a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" cardsCount");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" cardsState");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new lqx(this.a, this.b.intValue(), this.c, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ lqx(String str, int i, List list, byte b2) {
        this(str, i, list);
    }

    private lqx(String str, int i, List<byte[]> list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final List<byte[]> c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{currentCardId=");
        sb.append(this.a);
        sb.append(", cardsCount=");
        sb.append(this.b);
        sb.append(", cardsState=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqz) {
            lqz lqz = (lqz) obj;
            String str = this.a;
            if (str != null ? str.equals(lqz.a()) : lqz.a() == null) {
                return this.b == lqz.b() && this.c.equals(lqz.c());
            }
        }
    }

    public final int hashCode() {
        String str = this.a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }
}
