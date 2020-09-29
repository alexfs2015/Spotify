package defpackage;

import com.spotify.music.canvas.model.CanvasContentType;

/* renamed from: kxx reason: default package */
public final class kxx extends kxy {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final CanvasContentType e;
    private final String f;
    private final String g;
    private final String h;

    public kxx(String str, String str2, String str3, String str4, CanvasContentType canvasContentType, String str5, String str6, String str7) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxy) {
            kxy kxy = (kxy) obj;
            if (this.a.equals(kxy.a())) {
                String str = this.b;
                if (str != null ? str.equals(kxy.b()) : kxy.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(kxy.c()) : kxy.c() == null) {
                        if (this.d.equals(kxy.d()) && this.e.equals(kxy.e())) {
                            String str3 = this.f;
                            if (str3 != null ? str3.equals(kxy.f()) : kxy.f() == null) {
                                String str4 = this.g;
                                if (str4 != null ? str4.equals(kxy.g()) : kxy.g() == null) {
                                    String str5 = this.h;
                                    return str5 != null ? str5.equals(kxy.h()) : kxy.h() == null;
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

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
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
}
