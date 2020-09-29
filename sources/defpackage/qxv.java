package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qxv reason: default package */
final class qxv extends qyc {
    private final ImmutableList<LinkType> a;
    private final Optional<sih> b;
    private final Optional<b> c;
    private final gjf d;
    private final udr e;

    /* renamed from: qxv$a */
    static final class a extends defpackage.qyc.a {
        private ImmutableList<LinkType> a;
        private Optional<sih> b = Optional.e();
        private Optional<b> c = Optional.e();
        private gjf d;
        private udr e;

        a() {
        }

        public final defpackage.qyc.a a(ImmutableList<LinkType> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null acceptLinkTypes");
        }

        public final defpackage.qyc.a a(Optional<sih> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }

        public final defpackage.qyc.a b(Optional<b> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null viewUriVerifier");
        }

        public final defpackage.qyc.a a(gjf gjf) {
            if (gjf != null) {
                this.d = gjf;
                return this;
            }
            throw new NullPointerException("Null pageIdentifier");
        }

        public final defpackage.qyc.a a(udr udr) {
            if (udr != null) {
                this.e = udr;
                return this;
            }
            throw new NullPointerException("Null featureIdentifier");
        }

        public final qyc a() {
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
                qxv qxv = new qxv(this.a, this.b, this.c, this.d, this.e, 0);
                return qxv;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ qxv(ImmutableList immutableList, Optional optional, Optional optional2, gjf gjf, udr udr, byte b2) {
        this(immutableList, optional, optional2, gjf, udr);
    }

    private qxv(ImmutableList<LinkType> immutableList, Optional<sih> optional, Optional<b> optional2, gjf gjf, udr udr) {
        this.a = immutableList;
        this.b = optional;
        this.c = optional2;
        this.d = gjf;
        this.e = udr;
    }

    public final ImmutableList<LinkType> a() {
        return this.a;
    }

    public final Optional<sih> b() {
        return this.b;
    }

    public final Optional<b> c() {
        return this.c;
    }

    public final gjf d() {
        return this.d;
    }

    public final udr e() {
        return this.e;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qyc) {
            qyc qyc = (qyc) obj;
            return this.a.equals(qyc.a()) && this.b.equals(qyc.b()) && this.c.equals(qyc.c()) && this.d.equals(qyc.d()) && this.e.equals(qyc.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
