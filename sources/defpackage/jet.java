package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* renamed from: jet reason: default package */
final class jet extends jex {
    private final String a;
    private final String b;
    private final String c;
    private final Bitmap d;
    private final Bitmap e;
    private final List<String> f;
    private final Map<String, String> g;

    /* renamed from: jet$a */
    static final class a implements defpackage.jex.a {
        private String a;
        private String b;
        private Bitmap c;
        private Map<String, String> d;

        a() {
        }

        public final defpackage.jex.a a(Bitmap bitmap) {
            this.c = bitmap;
            return this;
        }

        public final defpackage.jex.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }

        public final defpackage.jex.a a(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public final jex a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" entityUri");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                jet jet = new jet(this.a, this.b, null, null, this.c, null, this.d, 0);
                return jet;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final defpackage.jex.a b(String str) {
            this.b = str;
            return this;
        }
    }

    private jet(String str, String str2, String str3, Bitmap bitmap, Bitmap bitmap2, List<String> list, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bitmap;
        this.e = bitmap2;
        this.f = list;
        this.g = map;
    }

    /* synthetic */ jet(String str, String str2, String str3, Bitmap bitmap, Bitmap bitmap2, List list, Map map, byte b2) {
        this(str, str2, str3, bitmap, bitmap2, list, map);
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

    public final Map<String, String> d() {
        return this.g;
    }

    public final Bitmap e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jex) {
            jex jex = (jex) obj;
            if (this.a.equals(jex.a())) {
                String str = this.b;
                if (str != null ? str.equals(jex.b()) : jex.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(jex.c()) : jex.c() == null) {
                        Bitmap bitmap = this.d;
                        if (bitmap != null ? bitmap.equals(jex.e()) : jex.e() == null) {
                            Bitmap bitmap2 = this.e;
                            if (bitmap2 != null ? bitmap2.equals(jex.f()) : jex.f() == null) {
                                List<String> list = this.f;
                                if (list != null ? list.equals(jex.g()) : jex.g() == null) {
                                    Map<String, String> map = this.g;
                                    return map != null ? map.equals(jex.d()) : jex.d() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Bitmap f() {
        return this.e;
    }

    public final List<String> g() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Bitmap bitmap = this.d;
        int hashCode4 = (hashCode3 ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        Bitmap bitmap2 = this.e;
        int hashCode5 = (hashCode4 ^ (bitmap2 == null ? 0 : bitmap2.hashCode())) * 1000003;
        List<String> list = this.f;
        int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        Map<String, String> map = this.g;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode6 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryShareEntityData{entityUri=");
        sb.append(this.a);
        sb.append(", contextUri=");
        sb.append(this.b);
        sb.append(", logContext=");
        sb.append(this.c);
        sb.append(", stickerBitmap=");
        sb.append(this.d);
        sb.append(", backgroundBitmap=");
        sb.append(this.e);
        sb.append(", backgroundColorList=");
        sb.append(this.f);
        sb.append(", queryParameters=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
