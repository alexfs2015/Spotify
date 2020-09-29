package defpackage;

import com.google.common.base.Optional;

/* renamed from: oin reason: default package */
abstract class oin extends oiu {
    final Optional<String> a;
    final Optional<vns> b;

    /* renamed from: oin$a */
    static final class a implements defpackage.oiu.a {
        private Optional<String> a;
        private Optional<vns> b;

        /* synthetic */ a(oiu oiu, byte b2) {
            this(oiu);
        }

        a() {
            this.a = Optional.e();
            this.b = Optional.e();
        }

        private a(oiu oiu) {
            this.a = Optional.e();
            this.b = Optional.e();
            this.a = oiu.a();
            this.b = oiu.b();
        }

        public final defpackage.oiu.a a(Optional<String> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null textFilter");
        }

        public final defpackage.oiu.a b(Optional<vns> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null sortOrder");
        }

        public final oiu a() {
            return new oio(this.a, this.b);
        }
    }

    oin(Optional<String> optional, Optional<vns> optional2) {
        if (optional != null) {
            this.a = optional;
            if (optional2 != null) {
                this.b = optional2;
                return;
            }
            throw new NullPointerException("Null sortOrder");
        }
        throw new NullPointerException("Null textFilter");
    }

    public final Optional<String> a() {
        return this.a;
    }

    public final Optional<vns> b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterAndSort{textFilter=");
        sb.append(this.a);
        sb.append(", sortOrder=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oiu) {
            oiu oiu = (oiu) obj;
            return this.a.equals(oiu.a()) && this.b.equals(oiu.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final defpackage.oiu.a c() {
        return new a(this, 0);
    }
}
