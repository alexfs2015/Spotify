package defpackage;

import java.util.List;

/* renamed from: okz reason: default package */
final class okz extends ole {
    private final vlc a;
    private final List<vle> b;
    private final List<vle> c;

    /* renamed from: okz$a */
    static final class a implements defpackage.ole.a {
        private vlc a;
        private List<vle> b;
        private List<vle> c;

        a() {
        }

        public final defpackage.ole.a a(List<vle> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.ole.a a(vlc vlc) {
            if (vlc != null) {
                this.a = vlc;
                return this;
            }
            throw new NullPointerException("Null playlist");
        }

        public final ole a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playlist");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" items");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" recommendations");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new okz(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.ole.a b(List<vle> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null recommendations");
        }
    }

    private okz(vlc vlc, List<vle> list, List<vle> list2) {
        this.a = vlc;
        this.b = list;
        this.c = list2;
    }

    /* synthetic */ okz(vlc vlc, List list, List list2, byte b2) {
        this(vlc, list, list2);
    }

    public final vlc a() {
        return this.a;
    }

    public final List<vle> b() {
        return this.b;
    }

    public final List<vle> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ole) {
            ole ole = (ole) obj;
            return this.a.equals(ole.a()) && this.b.equals(ole.b()) && this.c.equals(ole.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{playlist=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", recommendations=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}