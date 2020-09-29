package defpackage;

import com.google.common.base.Optional;

/* renamed from: red reason: default package */
final class red extends reh {
    private final boolean b;
    private final Optional<rdv> c;

    /* renamed from: red$a */
    static final class a extends defpackage.reh.a {
        private Boolean a;
        private Optional<rdv> b;

        /* synthetic */ a(reh reh, byte b2) {
            this(reh);
        }

        a() {
            this.b = Optional.e();
        }

        private a(reh reh) {
            this.b = Optional.e();
            this.a = Boolean.valueOf(reh.a());
            this.b = reh.b();
        }

        public final defpackage.reh.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.reh.a a(Optional<rdv> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null profilePage");
        }

        public final reh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" connected");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new red(this.a.booleanValue(), this.b, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ red(boolean z, Optional optional, byte b2) {
        this(z, optional);
    }

    private red(boolean z, Optional<rdv> optional) {
        this.b = z;
        this.c = optional;
    }

    public final boolean a() {
        return this.b;
    }

    public final Optional<rdv> b() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreeTierUserProfileModel{connected=");
        sb.append(this.b);
        sb.append(", profilePage=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof reh) {
            reh reh = (reh) obj;
            return this.b == reh.a() && this.c.equals(reh.b());
        }
    }

    public final int hashCode() {
        return (((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final defpackage.reh.a c() {
        return new a(this, 0);
    }
}
