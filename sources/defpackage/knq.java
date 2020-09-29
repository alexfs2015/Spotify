package defpackage;

/* renamed from: knq reason: default package */
final class knq extends knv {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;
    private final String g;
    private final long h;

    knq(String str, String str2, String str3, String str4, long j, String str5, String str6, long j2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = j;
                        if (str5 != null) {
                            this.f = str5;
                            if (str6 != null) {
                                this.g = str6;
                                this.h = j2;
                                return;
                            }
                            throw new NullPointerException("Null actionUri");
                        }
                        throw new NullPointerException("Null intent");
                    }
                    throw new NullPointerException("Null adPlaybackId");
                }
                throw new NullPointerException("Null creativeId");
            }
            throw new NullPointerException("Null lineItemId");
        }
        throw new NullPointerException("Null adId");
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

    public final long e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final long h() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceAdMetadata{adId=");
        sb.append(this.a);
        sb.append(", lineItemId=");
        sb.append(this.b);
        sb.append(", creativeId=");
        sb.append(this.c);
        sb.append(", adPlaybackId=");
        sb.append(this.d);
        sb.append(", microphoneDelay=");
        sb.append(this.e);
        sb.append(", intent=");
        sb.append(this.f);
        sb.append(", actionUri=");
        sb.append(this.g);
        sb.append(", microphoneListeningPeriod=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof knv) {
            knv knv = (knv) obj;
            return this.a.equals(knv.a()) && this.b.equals(knv.b()) && this.c.equals(knv.c()) && this.d.equals(knv.d()) && this.e == knv.e() && this.f.equals(knv.f()) && this.g.equals(knv.g()) && this.h == knv.h();
        }
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j = this.e;
        int hashCode2 = (((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        long j2 = this.h;
        return hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)));
    }
}
