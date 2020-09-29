package defpackage;

import com.google.common.base.Optional;

/* renamed from: opr reason: default package */
abstract class opr extends opy {
    final Optional<String> a;
    final Optional<way> b;

    /* renamed from: opr$a */
    static final class a implements defpackage.opy.a {
        private Optional<String> a;
        private Optional<way> b;

        a() {
            this.a = Optional.e();
            this.b = Optional.e();
        }

        private a(opy opy) {
            this.a = Optional.e();
            this.b = Optional.e();
            this.a = opy.a();
            this.b = opy.b();
        }

        /* synthetic */ a(opy opy, byte b2) {
            this(opy);
        }

        public final defpackage.opy.a a(Optional<String> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null textFilter");
        }

        public final opy a() {
            return new ops(this.a, this.b);
        }

        public final defpackage.opy.a b(Optional<way> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null sortOrder");
        }
    }

    opr(Optional<String> optional, Optional<way> optional2) {
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

    public final Optional<way> b() {
        return this.b;
    }

    public final defpackage.opy.a c() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof opy) {
            opy opy = (opy) obj;
            return this.a.equals(opy.a()) && this.b.equals(opy.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterAndSort{textFilter=");
        sb.append(this.a);
        sb.append(", sortOrder=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
