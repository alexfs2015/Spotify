package defpackage;

import com.spotify.playlist.models.Show.MediaType;
import java.util.Map;

/* renamed from: onz reason: default package */
final class onz extends ooa {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final MediaType e;
    private final Map<String, String> f;

    /* renamed from: onz$a */
    static final class a implements defpackage.ooa.a {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private MediaType e;
        private Map<String, String> f;

        a() {
        }

        public final defpackage.ooa.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.ooa.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final defpackage.ooa.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.ooa.a c(String str) {
            this.d = str;
            return this;
        }

        public final defpackage.ooa.a a(MediaType mediaType) {
            this.e = mediaType;
            return this;
        }

        public final defpackage.ooa.a a(Map<String, String> map) {
            if (map != null) {
                this.f = map;
                return this;
            }
            throw new NullPointerException("Null additionalMetadata");
        }

        public final ooa a() {
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
                sb3.append(" index");
                str = sb3.toString();
            }
            if (this.f == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" additionalMetadata");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                onz onz = new onz(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, 0);
                return onz;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ onz(String str, String str2, int i, String str3, MediaType mediaType, Map map, byte b2) {
        this(str, str2, i, str3, mediaType, map);
    }

    private onz(String str, String str2, int i, String str3, MediaType mediaType, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = mediaType;
        this.f = map;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final MediaType e() {
        return this.e;
    }

    public final Map<String, String> f() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuItem{uri=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", index=");
        sb.append(this.c);
        sb.append(", rowId=");
        sb.append(this.d);
        sb.append(", mediaType=");
        sb.append(this.e);
        sb.append(", additionalMetadata=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ooa) {
            ooa ooa = (ooa) obj;
            if (this.a.equals(ooa.a()) && this.b.equals(ooa.b()) && this.c == ooa.c()) {
                String str = this.d;
                if (str != null ? str.equals(ooa.d()) : ooa.d() == null) {
                    MediaType mediaType = this.e;
                    if (mediaType != null ? mediaType.equals(ooa.e()) : ooa.e() == null) {
                        if (this.f.equals(ooa.f())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        String str = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        MediaType mediaType = this.e;
        if (mediaType != null) {
            i = mediaType.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f.hashCode();
    }
}
