package defpackage;

import java.util.Map;

/* renamed from: jzk reason: default package */
final class jzk extends kab {
    private final boolean a;
    private final boolean b;
    private final String c;
    private final Map<String, String> d;

    /* renamed from: jzk$a */
    static final class a extends defpackage.kab.a {
        private Boolean a;
        private Boolean b;
        private String c;
        private Map<String, String> d;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public final Map<String, String> a() {
            Map<String, String> map = this.d;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"metadata\" has not been set");
        }

        public final defpackage.kab.a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null mediaUrl");
        }

        public final defpackage.kab.a a(Map<String, String> map) {
            if (map != null) {
                this.d = map;
                return this;
            }
            throw new NullPointerException("Null metadata");
        }

        public final defpackage.kab.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.kab.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final kab b() {
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
                jzk jzk = new jzk(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d, 0);
                return jzk;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private jzk(boolean z, boolean z2, String str, Map<String, String> map) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = map;
    }

    /* synthetic */ jzk(boolean z, boolean z2, String str, Map map, byte b2) {
        this(z, z2, str, map);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kab) {
            kab kab = (kab) obj;
            return this.a == kab.a() && this.b == kab.b() && this.c.equals(kab.c()) && this.d.equals(kab.d());
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
}
