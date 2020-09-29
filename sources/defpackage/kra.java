package defpackage;

/* renamed from: kra reason: default package */
final class kra extends krf {
    private final krg a;
    private final kre b;
    private final int c;
    private final String d;
    private final boolean e;
    private final boolean f;

    /* renamed from: kra$a */
    static final class a extends defpackage.krf.a {
        private krg a;
        private kre b;
        private Integer c;
        private String d;
        private Boolean e;
        private Boolean f;

        a() {
        }

        private a(krf krf) {
            this.a = krf.a();
            this.b = krf.b();
            this.c = Integer.valueOf(krf.c());
            this.d = krf.d();
            this.e = Boolean.valueOf(krf.e());
            this.f = Boolean.valueOf(krf.f());
        }

        /* synthetic */ a(krf krf, byte b2) {
            this(krf);
        }

        public final defpackage.krf.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.krf.a a(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final defpackage.krf.a a(kre kre) {
            if (kre != null) {
                this.b = kre;
                return this;
            }
            throw new NullPointerException("Null voiceAdMetadata");
        }

        public final defpackage.krf.a a(krg krg) {
            if (krg != null) {
                this.a = krg;
                return this;
            }
            throw new NullPointerException("Null voiceState");
        }

        public final defpackage.krf.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final krf a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" voiceState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" voiceAdMetadata");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" timerId");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" sessionId");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" isSpeechReceived");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" isContextChanged");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                kra kra = new kra(this.a, this.b, this.c.intValue(), this.d, this.e.booleanValue(), this.f.booleanValue(), 0);
                return kra;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.krf.a b(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }
    }

    private kra(krg krg, kre kre, int i, String str, boolean z, boolean z2) {
        this.a = krg;
        this.b = kre;
        this.c = i;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    /* synthetic */ kra(krg krg, kre kre, int i, String str, boolean z, boolean z2, byte b2) {
        this(krg, kre, i, str, z, z2);
    }

    public final krg a() {
        return this.a;
    }

    public final kre b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krf) {
            krf krf = (krf) obj;
            return this.a.equals(krf.a()) && this.b.equals(krf.b()) && this.c == krf.c() && this.d.equals(krf.d()) && this.e == krf.e() && this.f == krf.f();
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final defpackage.krf.a g() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceAdModel{voiceState=");
        sb.append(this.a);
        sb.append(", voiceAdMetadata=");
        sb.append(this.b);
        sb.append(", timerId=");
        sb.append(this.c);
        sb.append(", sessionId=");
        sb.append(this.d);
        sb.append(", isSpeechReceived=");
        sb.append(this.e);
        sb.append(", isContextChanged=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
