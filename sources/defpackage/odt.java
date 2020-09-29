package defpackage;

/* renamed from: odt reason: default package */
abstract class odt extends oed {
    final boolean a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final boolean f;
    final boolean g;

    /* renamed from: odt$a */
    static final class a extends defpackage.oed.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;

        a() {
        }

        public final defpackage.oed.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final oed a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" resumeDisabled");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" pauseDisabled");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" skipNextDisabled");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" skipPrevDisabled");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" peekNextDisabled");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" peekPrevDisabled");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" transferPlaybackDisabled");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                odx odx = new odx(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue());
                return odx;
            }
            StringBuilder sb8 = new StringBuilder("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }

        public final defpackage.oed.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.oed.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.oed.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.oed.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.oed.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.oed.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }
    }

    odt(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oed) {
            oed oed = (oed) obj;
            return this.a == oed.a() && this.b == oed.b() && this.c == oed.c() && this.d == oed.d() && this.e == oed.e() && this.f == oed.f() && this.g == oed.g();
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Restrictions{resumeDisabled=");
        sb.append(this.a);
        sb.append(", pauseDisabled=");
        sb.append(this.b);
        sb.append(", skipNextDisabled=");
        sb.append(this.c);
        sb.append(", skipPrevDisabled=");
        sb.append(this.d);
        sb.append(", peekNextDisabled=");
        sb.append(this.e);
        sb.append(", peekPrevDisabled=");
        sb.append(this.f);
        sb.append(", transferPlaybackDisabled=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
