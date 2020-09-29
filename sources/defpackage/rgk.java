package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: rgk reason: default package */
final class rgk extends rgr {
    private final ImmutableList<LinkType> a;
    private final Optional<sso> b;
    private final Optional<b> c;
    private final gkq d;
    private final uqm e;

    /* renamed from: rgk$a */
    static final class a extends defpackage.rgr.a {
        private ImmutableList<LinkType> a;
        private Optional<sso> b = Optional.e();
        private Optional<b> c = Optional.e();
        private gkq d;
        private uqm e;

        a() {
        }

        public final defpackage.rgr.a a(Optional<sso> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }

        public final defpackage.rgr.a a(ImmutableList<LinkType> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null acceptLinkTypes");
        }

        public final defpackage.rgr.a a(gkq gkq) {
            if (gkq != null) {
                this.d = gkq;
                return this;
            }
            throw new NullPointerException("Null pageIdentifier");
        }

        public final defpackage.rgr.a a(uqm uqm) {
            if (uqm != null) {
                this.e = uqm;
                return this;
            }
            throw new NullPointerException("Null featureIdentifier");
        }

        public final rgr a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" acceptLinkTypes");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" pageIdentifier");
                str = sb2.toString();
            }
            if (this.e == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" featureIdentifier");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                rgk rgk = new rgk(this.a, this.b, this.c, this.d, this.e, 0);
                return rgk;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.rgr.a b(Optional<b> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null viewUriVerifier");
        }
    }

    private rgk(ImmutableList<LinkType> immutableList, Optional<sso> optional, Optional<b> optional2, gkq gkq, uqm uqm) {
        this.a = immutableList;
        this.b = optional;
        this.c = optional2;
        this.d = gkq;
        this.e = uqm;
    }

    /* synthetic */ rgk(ImmutableList immutableList, Optional optional, Optional optional2, gkq gkq, uqm uqm, byte b2) {
        this(immutableList, optional, optional2, gkq, uqm);
    }

    public final ImmutableList<LinkType> a() {
        return this.a;
    }

    public final Optional<sso> b() {
        return this.b;
    }

    public final Optional<b> c() {
        return this.c;
    }

    public final gkq d() {
        return this.d;
    }

    public final uqm e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgr) {
            rgr rgr = (rgr) obj;
            return this.a.equals(rgr.a()) && this.b.equals(rgr.b()) && this.c.equals(rgr.c()) && this.d.equals(rgr.d()) && this.e.equals(rgr.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPageIdentifiers{acceptLinkTypes=");
        sb.append(this.a);
        sb.append(", viewUri=");
        sb.append(this.b);
        sb.append(", viewUriVerifier=");
        sb.append(this.c);
        sb.append(", pageIdentifier=");
        sb.append(this.d);
        sb.append(", featureIdentifier=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
