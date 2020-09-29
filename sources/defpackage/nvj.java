package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: nvj reason: default package */
final class nvj extends nvn {
    private final Optional<Boolean> b;
    private final ImmutableMap<PartnerType, rvn> c;

    /* renamed from: nvj$a */
    static final class a extends defpackage.nvn.a {
        private Optional<Boolean> a;
        private ImmutableMap<PartnerType, rvn> b;

        /* synthetic */ a(nvn nvn, byte b2) {
            this(nvn);
        }

        a() {
            this.a = Optional.e();
        }

        private a(nvn nvn) {
            this.a = Optional.e();
            this.a = nvn.a();
            this.b = nvn.b();
        }

        public final defpackage.nvn.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null masterToggle");
        }

        public final defpackage.nvn.a a(ImmutableMap<PartnerType, rvn> immutableMap) {
            if (immutableMap != null) {
                this.b = immutableMap;
                return this;
            }
            throw new NullPointerException("Null integrationList");
        }

        public final nvn a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" integrationList");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new nvj(this.a, this.b, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ nvj(Optional optional, ImmutableMap immutableMap, byte b2) {
        this(optional, immutableMap);
    }

    private nvj(Optional<Boolean> optional, ImmutableMap<PartnerType, rvn> immutableMap) {
        this.b = optional;
        this.c = immutableMap;
    }

    public final Optional<Boolean> a() {
        return this.b;
    }

    public final ImmutableMap<PartnerType, rvn> b() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsModel{masterToggle=");
        sb.append(this.b);
        sb.append(", integrationList=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nvn) {
            nvn nvn = (nvn) obj;
            return this.b.equals(nvn.a()) && this.c.equals(nvn.b());
        }
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final defpackage.nvn.a c() {
        return new a(this, 0);
    }
}
