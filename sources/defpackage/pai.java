package defpackage;

/* renamed from: pai reason: default package */
public final class pai extends paj {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final uzf g;
    private final String h;
    private final String i;
    private final String j;
    private final boolean k;
    private final long l;
    private final gzz m;

    public pai(String str, String str2, String str3, String str4, String str5, int i2, uzf uzf, String str6, String str7, String str8, boolean z, long j2, gzz gzz) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = str5;
                        this.f = i2;
                        if (uzf != null) {
                            this.g = uzf;
                            if (str6 != null) {
                                this.h = str6;
                                if (str7 != null) {
                                    this.i = str7;
                                    if (str8 != null) {
                                        this.j = str8;
                                        this.k = z;
                                        this.l = j2;
                                        this.m = gzz;
                                        return;
                                    }
                                    throw new NullPointerException("Null shareCoverArtUri");
                                }
                                throw new NullPointerException("Null podcastName");
                            }
                            throw new NullPointerException("Null podcastUri");
                        }
                        throw new NullPointerException("Null offlineState");
                    }
                    throw new NullPointerException("Null metadata");
                }
                throw new NullPointerException("Null episodeName");
            }
            throw new NullPointerException("Null episodeUri");
        }
        throw new NullPointerException("Null description");
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

    public final int f() {
        return this.f;
    }

    public final uzf g() {
        return this.g;
    }

    public final String h() {
        return this.h;
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

    public final long l() {
        return this.l;
    }

    public final gzz m() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BodyViewModel{description=");
        sb.append(this.a);
        sb.append(", episodeUri=");
        sb.append(this.b);
        sb.append(", episodeName=");
        sb.append(this.c);
        sb.append(", metadata=");
        sb.append(this.d);
        sb.append(", coverArtUri=");
        sb.append(this.e);
        sb.append(", downloadState=");
        sb.append(this.f);
        sb.append(", offlineState=");
        sb.append(this.g);
        sb.append(", podcastUri=");
        sb.append(this.h);
        sb.append(", podcastName=");
        sb.append(this.i);
        sb.append(", shareCoverArtUri=");
        sb.append(this.j);
        sb.append(", isExplicit=");
        sb.append(this.k);
        sb.append(", podcastLengthInMillis=");
        sb.append(this.l);
        sb.append(", featuredContent=");
        sb.append(this.m);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof paj) {
            paj paj = (paj) obj;
            if (this.a.equals(paj.a()) && this.b.equals(paj.b()) && this.c.equals(paj.c()) && this.d.equals(paj.d())) {
                String str = this.e;
                if (str != null ? str.equals(paj.e()) : paj.e() == null) {
                    if (this.f == paj.f() && this.g.equals(paj.g()) && this.h.equals(paj.h()) && this.i.equals(paj.i()) && this.j.equals(paj.j()) && this.k == paj.k() && this.l == paj.l()) {
                        gzz gzz = this.m;
                        return gzz != null ? gzz.equals(paj.m()) : paj.m() == null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        int i2 = 0;
        int hashCode2 = (((((((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        long j2 = this.l;
        int i3 = (hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        gzz gzz = this.m;
        if (gzz != null) {
            i2 = gzz.hashCode();
        }
        return i3 ^ i2;
    }
}
