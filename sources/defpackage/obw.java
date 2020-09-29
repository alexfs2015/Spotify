package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: obw reason: default package */
final class obw extends oca {
    private final Optional<Boolean> b;
    private final ImmutableMap<PartnerType, sex> c;

    /* renamed from: obw$a */
    static final class a extends defpackage.oca.a {
        private Optional<Boolean> a;
        private ImmutableMap<PartnerType, sex> b;

        a() {
            this.a = Optional.e();
        }

        private a(oca oca) {
            this.a = Optional.e();
            this.a = oca.a();
            this.b = oca.b();
        }

        /* synthetic */ a(oca oca, byte b2) {
            this(oca);
        }

        public final defpackage.oca.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null masterToggle");
        }

        public final defpackage.oca.a a(ImmutableMap<PartnerType, sex> immutableMap) {
            if (immutableMap != null) {
                this.b = immutableMap;
                return this;
            }
            throw new NullPointerException("Null integrationList");
        }

        public final oca a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" integrationList");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new obw(this.a, this.b, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private obw(Optional<Boolean> optional, ImmutableMap<PartnerType, sex> immutableMap) {
        this.b = optional;
        this.c = immutableMap;
    }

    /* synthetic */ obw(Optional optional, ImmutableMap immutableMap, byte b2) {
        this(optional, immutableMap);
    }

    public final Optional<Boolean> a() {
        return this.b;
    }

    public final ImmutableMap<PartnerType, sex> b() {
        return this.c;
    }

    public final defpackage.oca.a c() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oca) {
            oca oca = (oca) obj;
            return this.b.equals(oca.a()) && this.c.equals(oca.b());
        }
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsModel{masterToggle=");
        sb.append(this.b);
        sb.append(", integrationList=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
