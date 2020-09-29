package defpackage;

import java.util.List;

/* renamed from: sbb reason: default package */
final class sbb extends sbg {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final sbd g;
    private final List<sbc> h;
    private final List<Object> i;

    sbb(String str, String str2, String str3, String str4, String str5, String str6, sbd sbd, List<sbc> list, List<Object> list2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                this.d = str4;
                if (str5 != null) {
                    this.e = str5;
                    this.f = str6;
                    if (sbd != null) {
                        this.g = sbd;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbg) {
            sbg sbg = (sbg) obj;
            if (this.a.equals(sbg.a()) && this.b.equals(sbg.b())) {
                String str = this.c;
                if (str != null ? str.equals(sbg.c()) : sbg.c() == null) {
                    String str2 = this.d;
                    if (str2 != null ? str2.equals(sbg.d()) : sbg.d() == null) {
                        if (this.e.equals(sbg.e())) {
                            String str3 = this.f;
                            if (str3 != null ? str3.equals(sbg.f()) : sbg.f() == null) {
                                if (this.g.equals(sbg.g()) && this.h.equals(sbg.h())) {
                                    List<Object> list = this.i;
                                    return list != null ? list.equals(sbg.i()) : sbg.i() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final String f() {
        return this.f;
    }

    public final sbd g() {
        return this.g;
    }

    public final List<sbc> h() {
        return this.h;
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
}
