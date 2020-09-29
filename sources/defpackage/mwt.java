package defpackage;

import java.util.List;

/* renamed from: mwt reason: default package */
final class mwt extends mwz {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Long e;
    private final List<mwo> f;
    private final String g;
    private final boolean h;
    private final List<mxb> i;

    mwt(String str, String str2, String str3, String str4, Long l, List<mwo> list, String str5, boolean z, List<mxb> list2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = str4;
                    if (l != null) {
                        this.e = l;
                        if (list != null) {
                            this.f = list;
                            if (str5 != null) {
                                this.g = str5;
                                this.h = z;
                                this.i = list2;
                                return;
                            }
                            throw new NullPointerException("Null imageUrl");
                        }
                        throw new NullPointerException("Null artists");
                    }
                    throw new NullPointerException("Null timestamp");
                }
                throw new NullPointerException("Null albumType");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
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

    public final Long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwz) {
            mwz mwz = (mwz) obj;
            if (this.a.equals(mwz.a()) && this.b.equals(mwz.b()) && this.c.equals(mwz.c())) {
                String str = this.d;
                if (str != null ? str.equals(mwz.d()) : mwz.d() == null) {
                    if (this.e.equals(mwz.e()) && this.f.equals(mwz.f()) && this.g.equals(mwz.g()) && this.h == mwz.h()) {
                        List<mxb> list = this.i;
                        return list != null ? list.equals(mwz.i()) : mwz.i() == null;
                    }
                }
            }
        }
    }

    public final List<mwo> f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int i2 = 0;
        int hashCode2 = (((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003;
        List<mxb> list = this.i;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public final List<mxb> i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicReleaseData{uri=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", albumType=");
        sb.append(this.c);
        sb.append(", artistPickMessage=");
        sb.append(this.d);
        sb.append(", timestamp=");
        sb.append(this.e);
        sb.append(", artists=");
        sb.append(this.f);
        sb.append(", imageUrl=");
        sb.append(this.g);
        sb.append(", interacted=");
        sb.append(this.h);
        sb.append(", tracks=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
