package defpackage;

import com.google.common.base.Optional;

/* renamed from: gdd reason: default package */
abstract class gdd extends defpackage.gdf.a {
    final Optional<Boolean> a;
    final int b;

    /* renamed from: gdd$a */
    static final class a implements C0033a {
        private Optional<Boolean> a = Optional.e();
        private Integer b;

        a() {
        }

        public final C0033a a(int i) {
            this.b = Integer.valueOf(500);
            return this;
        }

        public final C0033a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null isPlayableOnly");
        }

        public final defpackage.gdf.a a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" updateThrottling");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new gde(this.a, this.b.intValue());
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    gdd(Optional<Boolean> optional, int i) {
        if (optional != null) {
            this.a = optional;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null isPlayableOnly");
    }

    public final Optional<Boolean> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.gdf.a) {
            defpackage.gdf.a aVar = (defpackage.gdf.a) obj;
            return this.a.equals(aVar.a()) && this.b == aVar.b();
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration{isPlayableOnly=");
        sb.append(this.a);
        sb.append(", updateThrottling=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
