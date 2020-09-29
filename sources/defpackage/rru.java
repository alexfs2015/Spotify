package defpackage;

import java.util.List;

/* renamed from: rru reason: default package */
final class rru extends rrz {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final rrw g;
    private final List<rrv> h;
    private final List<Object> i;

    rru(String str, String str2, String str3, String str4, String str5, String str6, rrw rrw, List<rrv> list, List<Object> list2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                this.d = str4;
                if (str5 != null) {
                    this.e = str5;
                    this.f = str6;
                    if (rrw != null) {
                        this.g = rrw;
                        if (list != null) {
                            this.h = list;
                            this.i = list2;
                            return;
                        }
                        throw new NullPointerException("Null creators");
                    }
                    throw new NullPointerException("Null entity");
                }
                throw new NullPointerException("Null timestamp");
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null id");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final rrw g() {
        return this.g;
    }

    public final List<rrv> h() {
        return this.h;
    }

    public final List<Object> i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Story{id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", recReason=");
        sb.append(this.d);
        sb.append(", timestamp=");
        sb.append(this.e);
        sb.append(", color=");
        sb.append(this.f);
        sb.append(", entity=");
        sb.append(this.g);
        sb.append(", creators=");
        sb.append(this.h);
        sb.append(", tracks=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rrz) {
            rrz rrz = (rrz) obj;
            if (this.a.equals(rrz.a()) && this.b.equals(rrz.b())) {
                String str = this.c;
                if (str != null ? str.equals(rrz.c()) : rrz.c() == null) {
                    String str2 = this.d;
                    if (str2 != null ? str2.equals(rrz.d()) : rrz.d() == null) {
                        if (this.e.equals(rrz.e())) {
                            String str3 = this.f;
                            if (str3 != null ? str3.equals(rrz.f()) : rrz.f() == null) {
                                if (this.g.equals(rrz.g()) && this.h.equals(rrz.h())) {
                                    List<Object> list = this.i;
                                    return list != null ? list.equals(rrz.i()) : rrz.i() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str3 = this.f;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        List<Object> list = this.i;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode4 ^ i2;
    }
}
