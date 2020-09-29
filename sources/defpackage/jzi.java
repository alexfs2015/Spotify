package defpackage;

import com.google.common.base.Optional;

/* renamed from: jzi reason: default package */
final class jzi extends jzx {
    private final Optional<Long> a;
    private final boolean b;

    /* renamed from: jzi$a */
    static final class a extends defpackage.jzx.a {
        private Optional<Long> a = Optional.e();
        private Boolean b;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public final Optional<Long> a() {
            return this.a;
        }

        public final defpackage.jzx.a a(Long l) {
            this.a = Optional.b(l);
            return this;
        }

        public final defpackage.jzx.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final jzx b() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playWhenReady");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new jzi(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private jzi(Optional<Long> optional, boolean z) {
        this.a = optional;
        this.b = z;
    }

    /* synthetic */ jzi(Optional optional, boolean z, byte b2) {
        this(optional, z);
    }

    public final Optional<Long> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jzx) {
            jzx jzx = (jzx) obj;
            return this.a.equals(jzx.a()) && this.b == jzx.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayOptions{initialPosition=");
        sb.append(this.a);
        sb.append(", playWhenReady=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
