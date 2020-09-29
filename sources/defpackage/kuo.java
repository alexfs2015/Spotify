package defpackage;

import com.spotify.music.canvas.model.CanvasContentType;

/* renamed from: kuo reason: default package */
public final class kuo extends kup {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final CanvasContentType e;
    private final String f;
    private final String g;
    private final String h;

    public kuo(String str, String str2, String str3, String str4, CanvasContentType canvasContentType, String str5, String str6, String str7) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            if (str4 != null) {
                this.d = str4;
                if (canvasContentType != null) {
                    this.e = canvasContentType;
                    this.f = str5;
                    this.g = str6;
                    this.h = str7;
                    return;
                }
                throw new NullPointerException("Null type");
            }
            throw new NullPointerException("Null canvasId");
        }
        throw new NullPointerException("Null trackUri");
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

    public final CanvasContentType e() {
        return this.e;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("CanvasTrack{trackUri=");
        sb.append(this.a);
        sb.append(", canvasUri=");
        sb.append(this.b);
        sb.append(", canvasFileId=");
        sb.append(this.c);
        sb.append(", canvasId=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", artistName=");
        sb.append(this.f);
        sb.append(", artistUri=");
        sb.append(this.g);
        sb.append(", artistAvatarUrl=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kup) {
            kup kup = (kup) obj;
            if (this.a.equals(kup.a())) {
                String str = this.b;
                if (str != null ? str.equals(kup.b()) : kup.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(kup.c()) : kup.c() == null) {
                        if (this.d.equals(kup.d()) && this.e.equals(kup.e())) {
                            String str3 = this.f;
                            if (str3 != null ? str3.equals(kup.f()) : kup.f() == null) {
                                String str4 = this.g;
                                if (str4 != null ? str4.equals(kup.g()) : kup.g() == null) {
                                    String str5 = this.h;
                                    return str5 != null ? str5.equals(kup.h()) : kup.h() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str3 = this.f;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.g;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.h;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 ^ i;
    }
}
