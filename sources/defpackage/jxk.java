package defpackage;

import java.util.Map;

/* renamed from: jxk reason: default package */
final class jxk extends jyb {
    private final boolean a;
    private final boolean b;
    private final String c;
    private final Map<String, String> d;

    /* renamed from: jxk$a */
    static final class a extends defpackage.jyb.a {
        private Boolean a;
        private Boolean b;
        private String c;
        private Map<String, String> d;

        a() {
        }

        public final defpackage.jyb.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.jyb.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.jyb.a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null mediaUrl");
        }

        public final defpackage.jyb.a a(Map<String, String> map) {
            if (map != null) {
                this.d = map;
                return this;
            }
            throw new NullPointerException("Null metadata");
        }

        /* access modifiers changed from: 0000 */
        public final Map<String, String> a() {
            Map<String, String> map = this.d;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"metadata\" has not been set");
        }

        /* access modifiers changed from: 0000 */
        public final jyb b() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isAudioOnlyAllowed");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" isRoyaltyMedia");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" mediaUrl");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" metadata");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                jxk jxk = new jxk(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d, 0);
                return jxk;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ jxk(boolean z, boolean z2, String str, Map map, byte b2) {
        this(z, z2, str, map);
    }

    private jxk(boolean z, boolean z2, String str, Map<String, String> map) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = map;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Map<String, String> d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackRequest{isAudioOnlyAllowed=");
        sb.append(this.a);
        sb.append(", isRoyaltyMedia=");
        sb.append(this.b);
        sb.append(", mediaUrl=");
        sb.append(this.c);
        sb.append(", metadata=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jyb) {
            jyb jyb = (jyb) obj;
            return this.a == jyb.a() && this.b == jyb.b() && this.c.equals(jyb.c()) && this.d.equals(jyb.d());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return ((((i2 ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
