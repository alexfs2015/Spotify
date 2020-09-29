package defpackage;

/* renamed from: knr reason: default package */
final class knr extends knw {
    private final knx a;
    private final knv b;
    private final int c;
    private final String d;
    private final boolean e;
    private final boolean f;

    /* renamed from: knr$a */
    static final class a extends defpackage.knw.a {
        private knx a;
        private knv b;
        private Integer c;
        private String d;
        private Boolean e;
        private Boolean f;

        /* synthetic */ a(knw knw, byte b2) {
            this(knw);
        }

        a() {
        }

        private a(knw knw) {
            this.a = knw.a();
            this.b = knw.b();
            this.c = Integer.valueOf(knw.c());
            this.d = knw.d();
            this.e = Boolean.valueOf(knw.e());
            this.f = Boolean.valueOf(knw.f());
        }

        public final defpackage.knw.a a(knx knx) {
            if (knx != null) {
                this.a = knx;
                return this;
            }
            throw new NullPointerException("Null voiceState");
        }

        public final defpackage.knw.a a(knv knv) {
            if (knv != null) {
                this.b = knv;
                return this;
            }
            throw new NullPointerException("Null voiceAdMetadata");
        }

        public final defpackage.knw.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.knw.a a(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final defpackage.knw.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.knw.a b(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final knw a() {
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
                knr knr = new knr(this.a, this.b, this.c.intValue(), this.d, this.e.booleanValue(), this.f.booleanValue(), 0);
                return knr;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    /* synthetic */ knr(knx knx, knv knv, int i, String str, boolean z, boolean z2, byte b2) {
        this(knx, knv, i, str, z, z2);
    }

    private knr(knx knx, knv knv, int i, String str, boolean z, boolean z2) {
        this.a = knx;
        this.b = knv;
        this.c = i;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public final knx a() {
        return this.a;
    }

    public final knv b() {
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

    public final boolean f() {
        return this.f;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof knw) {
            knw knw = (knw) obj;
            return this.a.equals(knw.a()) && this.b.equals(knw.b()) && this.c == knw.c() && this.d.equals(knw.d()) && this.e == knw.e() && this.f == knw.f();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.knw.a g() {
        return new a(this, 0);
    }
}
