package defpackage;

import java.util.Map;

/* renamed from: pjl reason: default package */
public final class pjl extends pjr {
    private final int a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final boolean k;
    private final String l;
    private final Map<String, String> m;
    private final int n;
    private final boolean o;

    public pjl(int i2, String str, String str2, int i3, int i4, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Map<String, String> map, int i5, boolean z2) {
        this.a = i2;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.d = i3;
                this.e = i4;
                if (str3 != null) {
                    this.f = str3;
                    if (str4 != null) {
                        this.g = str4;
                        this.h = str5;
                        if (str6 != null) {
                            this.i = str6;
                            if (str7 != null) {
                                this.j = str7;
                                this.k = z;
                                if (str8 != null) {
                                    this.l = str8;
                                    if (map != null) {
                                        this.m = map;
                                        this.n = i5;
                                        this.o = z2;
                                        return;
                                    }
                                    throw new NullPointerException("Null episodeMetadata");
                                }
                                throw new NullPointerException("Null shareCoverArtUri");
                            }
                            throw new NullPointerException("Null episodeUri");
                        }
                        throw new NullPointerException("Null podcastUri");
                    }
                    throw new NullPointerException("Null episodeName");
                }
                throw new NullPointerException("Null podcastName");
            }
            throw new NullPointerException("Null subtitle");
        }
        throw new NullPointerException("Null title");
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pjr) {
            pjr pjr = (pjr) obj;
            if (this.a == pjr.a() && this.b.equals(pjr.b()) && this.c.equals(pjr.c()) && this.d == pjr.d() && this.e == pjr.e() && this.f.equals(pjr.f()) && this.g.equals(pjr.g())) {
                String str = this.h;
                if (str != null ? str.equals(pjr.h()) : pjr.h() == null) {
                    return this.i.equals(pjr.i()) && this.j.equals(pjr.j()) && this.k == pjr.k() && this.l.equals(pjr.l()) && this.m.equals(pjr.m()) && this.n == pjr.n() && this.o == pjr.o();
                }
            }
        }
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        String str = this.h;
        int i2 = 1231;
        int hashCode2 = (((((((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n) * 1000003;
        if (!this.o) {
            i2 = 1237;
        }
        return hashCode2 ^ i2;
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public final String l() {
        return this.l;
    }

    public final Map<String, String> m() {
        return this.m;
    }

    public final int n() {
        return this.n;
    }

    public final boolean o() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderViewModel{status=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", progress=");
        sb.append(this.d);
        sb.append(", length=");
        sb.append(this.e);
        sb.append(", podcastName=");
        sb.append(this.f);
        sb.append(", episodeName=");
        sb.append(this.g);
        sb.append(", podcastCoverArtUri=");
        sb.append(this.h);
        sb.append(", podcastUri=");
        sb.append(this.i);
        sb.append(", episodeUri=");
        sb.append(this.j);
        sb.append(", canAddToQueue=");
        sb.append(this.k);
        sb.append(", shareCoverArtUri=");
        sb.append(this.l);
        sb.append(", episodeMetadata=");
        sb.append(this.m);
        sb.append(", downloadState=");
        sb.append(this.n);
        sb.append(", isExplicit=");
        sb.append(this.o);
        sb.append("}");
        return sb.toString();
    }
}
