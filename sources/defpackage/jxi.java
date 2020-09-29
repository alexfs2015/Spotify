package defpackage;

import com.google.common.base.Optional;

/* renamed from: jxi reason: default package */
final class jxi extends jxx {
    private final Optional<Long> a;
    private final boolean b;

    /* renamed from: jxi$a */
    static final class a extends defpackage.jxx.a {
        private Optional<Long> a = Optional.e();
        private Boolean b;

        a() {
        }

        public final defpackage.jxx.a a(Long l) {
            this.a = Optional.b(l);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final Optional<Long> a() {
            return this.a;
        }

        public final defpackage.jxx.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final jxx b() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playWhenReady");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new jxi(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ jxi(Optional optional, boolean z, byte b2) {
        this(optional, z);
    }

    private jxi(Optional<Long> optional, boolean z) {
        this.a = optional;
        this.b = z;
    }

    public final Optional<Long> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayOptions{initialPosition=");
        sb.append(this.a);
        sb.append(", playWhenReady=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jxx) {
            jxx jxx = (jxx) obj;
            return this.a.equals(jxx.a()) && this.b == jxx.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }
}
