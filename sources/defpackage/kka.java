package defpackage;

import java.util.List;

/* renamed from: kka reason: default package */
abstract class kka extends kke {
    final String a;
    final List<kkd> b;

    /* renamed from: kka$a */
    static final class a extends defpackage.kke.a {
        private String a;
        private List<kkd> b;

        a() {
        }

        public final defpackage.kke.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null otherTopArtistsTitle");
        }

        public final defpackage.kke.a a(List<kkd> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null otherTopArtistList");
        }

        public final kke a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" otherTopArtistsTitle");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" otherTopArtistList");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new kkc(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    kka(String str, List<kkd> list) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null otherTopArtistList");
        }
        throw new NullPointerException("Null otherTopArtistsTitle");
    }

    public final String a() {
        return this.a;
    }

    public final List<kkd> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kke) {
            kke kke = (kke) obj;
            return this.a.equals(kke.a()) && this.b.equals(kke.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OtherTopArtists{otherTopArtistsTitle=");
        sb.append(this.a);
        sb.append(", otherTopArtistList=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
