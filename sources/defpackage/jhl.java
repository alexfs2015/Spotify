package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;

/* renamed from: jhl reason: default package */
final class jhl extends jhk {
    private final AuthorizationRequest b;
    private final ProtocolVersion c;
    private final Optional<jhb> d;
    private final boolean e;
    private final boolean f;
    private final Optional<Boolean> g;

    /* renamed from: jhl$a */
    static final class a extends defpackage.jhk.a {
        private AuthorizationRequest a;
        private ProtocolVersion b;
        private Optional<jhb> c;
        private Boolean d;
        private Boolean e;
        private Optional<Boolean> f;

        a() {
            this.c = Optional.e();
            this.f = Optional.e();
        }

        private a(jhk jhk) {
            this.c = Optional.e();
            this.f = Optional.e();
            this.a = jhk.a();
            this.b = jhk.b();
            this.c = jhk.c();
            this.d = Boolean.valueOf(jhk.d());
            this.e = Boolean.valueOf(jhk.e());
            this.f = jhk.f();
        }

        /* synthetic */ a(jhk jhk, byte b2) {
            this(jhk);
        }

        public final defpackage.jhk.a a(Optional<jhb> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null gotBakeryResponse");
        }

        public final defpackage.jhk.a a(AuthorizationRequest authorizationRequest) {
            this.a = authorizationRequest;
            return this;
        }

        public final defpackage.jhk.a a(ProtocolVersion protocolVersion) {
            if (protocolVersion != null) {
                this.b = protocolVersion;
                return this;
            }
            throw new NullPointerException("Null protocolVersion");
        }

        public final defpackage.jhk.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final jhk a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" protocolVersion");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" loginAlreadyAttempted");
                str = sb2.toString();
            }
            if (this.e == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" gotPreflightAccountsResponse");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                jhl jhl = new jhl(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), this.f, 0);
                return jhl;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.jhk.a b(Optional<Boolean> optional) {
            if (optional != null) {
                this.f = optional;
                return this;
            }
            throw new NullPointerException("Null googleAppFlipEnabled");
        }

        public final defpackage.jhk.a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    private jhl(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, Optional<jhb> optional, boolean z, boolean z2, Optional<Boolean> optional2) {
        this.b = authorizationRequest;
        this.c = protocolVersion;
        this.d = optional;
        this.e = z;
        this.f = z2;
        this.g = optional2;
    }

    /* synthetic */ jhl(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, Optional optional, boolean z, boolean z2, Optional optional2, byte b2) {
        this(authorizationRequest, protocolVersion, optional, z, z2, optional2);
    }

    public final AuthorizationRequest a() {
        return this.b;
    }

    public final ProtocolVersion b() {
        return this.c;
    }

    public final Optional<jhb> c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jhk) {
            jhk jhk = (jhk) obj;
            AuthorizationRequest authorizationRequest = this.b;
            if (authorizationRequest != null ? authorizationRequest.equals(jhk.a()) : jhk.a() == null) {
                return this.c.equals(jhk.b()) && this.d.equals(jhk.c()) && this.e == jhk.d() && this.f == jhk.e() && this.g.equals(jhk.f());
            }
        }
    }

    public final Optional<Boolean> f() {
        return this.g;
    }

    public final defpackage.jhk.a g() {
        return new a(this, 0);
    }

    public final int hashCode() {
        AuthorizationRequest authorizationRequest = this.b;
        int i = 1231;
        int hashCode = ((((((((authorizationRequest == null ? 0 : authorizationRequest.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationModel{authorizationRequest=");
        sb.append(this.b);
        sb.append(", protocolVersion=");
        sb.append(this.c);
        sb.append(", gotBakeryResponse=");
        sb.append(this.d);
        sb.append(", loginAlreadyAttempted=");
        sb.append(this.e);
        sb.append(", gotPreflightAccountsResponse=");
        sb.append(this.f);
        sb.append(", googleAppFlipEnabled=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
