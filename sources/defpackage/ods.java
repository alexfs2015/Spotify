package defpackage;

/* renamed from: ods reason: default package */
abstract class ods extends oeb {
    final boolean a;
    final long b;
    final long c;
    final float d;

    /* renamed from: ods$a */
    static final class a extends defpackage.oeb.a {
        private Boolean a;
        private Long b;
        private Long c;
        private Float d;

        a() {
        }

        public final defpackage.oeb.a a(float f) {
            this.d = Float.valueOf(f);
            return this;
        }

        public final defpackage.oeb.a a(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public final defpackage.oeb.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final oeb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isPlaying");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" duration");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" playbackPosition");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" playbackSpeed");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                odw odw = new odw(this.a.booleanValue(), this.b.longValue(), this.c.longValue(), this.d.floatValue());
                return odw;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.oeb.a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    ods(boolean z, long j, long j2, float f) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final boolean a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oeb) {
            oeb oeb = (oeb) obj;
            return this.a == oeb.a() && this.b == oeb.b() && this.c == oeb.c() && Float.floatToIntBits(this.d) == Float.floatToIntBits(oeb.d());
        }
    }

    public int hashCode() {
        int i = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        long j = this.b;
        int i2 = (i ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.c;
        return ((i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState{isPlaying=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", playbackPosition=");
        sb.append(this.c);
        sb.append(", playbackSpeed=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
