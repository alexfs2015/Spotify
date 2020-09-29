package defpackage;

import com.spotify.playlist.models.Show.MediaType;
import java.util.Map;

/* renamed from: okp reason: default package */
final class okp extends okq {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final String f;
    private final MediaType g;
    private final Map<String, String> h;

    /* renamed from: okp$a */
    static final class a implements defpackage.okq.a {
        private String a;
        private String b;
        private Boolean c;
        private Boolean d;
        private Integer e;
        private String f;
        private MediaType g;
        private Map<String, String> h;

        a() {
        }

        public final defpackage.okq.a a(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public final defpackage.okq.a a(MediaType mediaType) {
            this.g = mediaType;
            return this;
        }

        public final defpackage.okq.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.okq.a a(Map<String, String> map) {
            if (map != null) {
                this.h = map;
                return this;
            }
            throw new NullPointerException("Null additionalMetadata");
        }

        public final defpackage.okq.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final okq a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" name");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" canRemoveFromPlaylist");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" canBanFromPlaylist");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" index");
                str = sb5.toString();
            }
            if (this.h == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" additionalMetadata");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                okp okp = new okp(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.intValue(), this.f, this.g, this.h, 0);
                return okp;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.okq.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final defpackage.okq.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.okq.a c(String str) {
            this.f = str;
            return this;
        }
    }

    private okp(String str, String str2, boolean z, boolean z2, int i, String str3, MediaType mediaType, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = str3;
        this.g = mediaType;
        this.h = map;
    }

    /* synthetic */ okp(String str, String str2, boolean z, boolean z2, int i, String str3, MediaType mediaType, Map map, byte b2) {
        this(str, str2, z, z2, i, str3, mediaType, map);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof okq) {
            okq okq = (okq) obj;
            if (this.a.equals(okq.a()) && this.b.equals(okq.b()) && this.c == okq.c() && this.d == okq.d() && this.e == okq.e()) {
                String str = this.f;
                if (str != null ? str.equals(okq.f()) : okq.f() == null) {
                    MediaType mediaType = this.g;
                    if (mediaType != null ? mediaType.equals(okq.g()) : okq.g() == null) {
                        if (this.h.equals(okq.h())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f;
    }

    public final MediaType g() {
        return this.g;
    }

    public final Map<String, String> h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        int i2 = (((hashCode ^ i) * 1000003) ^ this.e) * 1000003;
        String str = this.f;
        int i3 = 0;
        int hashCode2 = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        MediaType mediaType = this.g;
        if (mediaType != null) {
            i3 = mediaType.hashCode();
        }
        return ((hashCode2 ^ i3) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuItem{uri=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", canRemoveFromPlaylist=");
        sb.append(this.c);
        sb.append(", canBanFromPlaylist=");
        sb.append(this.d);
        sb.append(", index=");
        sb.append(this.e);
        sb.append(", rowId=");
        sb.append(this.f);
        sb.append(", mediaType=");
        sb.append(this.g);
        sb.append(", additionalMetadata=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
