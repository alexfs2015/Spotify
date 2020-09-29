package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;

/* renamed from: jew reason: default package */
final class jew extends jev {
    private final AuthorizationRequest b;
    private final ProtocolVersion c;
    private final Optional<jem> d;
    private final boolean e;
    private final boolean f;
    private final Optional<Boolean> g;

    /* renamed from: jew$a */
    static final class a extends defpackage.jev.a {
        private AuthorizationRequest a;
        private ProtocolVersion b;
        private Optional<jem> c;
        private Boolean d;
        private Boolean e;
        private Optional<Boolean> f;

        /* synthetic */ a(jev jev, byte b2) {
            this(jev);
        }

        a() {
            this.c = Optional.e();
            this.f = Optional.e();
        }

        private a(jev jev) {
            this.c = Optional.e();
            this.f = Optional.e();
            this.a = jev.a();
            this.b = jev.b();
            this.c = jev.c();
            this.d = Boolean.valueOf(jev.d());
            this.e = Boolean.valueOf(jev.e());
            this.f = jev.f();
        }

        public final defpackage.jev.a a(AuthorizationRequest authorizationRequest) {
            this.a = authorizationRequest;
            return this;
        }

        public final defpackage.jev.a a(ProtocolVersion protocolVersion) {
            if (protocolVersion != null) {
                this.b = protocolVersion;
                return this;
            }
            throw new NullPointerException("Null protocolVersion");
        }

        public final defpackage.jev.a a(Optional<jem> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null gotBakeryResponse");
        }

        public final defpackage.jev.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.jev.a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.jev.a b(Optional<Boolean> optional) {
            if (optional != null) {
                this.f = optional;
                return this;
            }
            throw new NullPointerException("Null googleAppFlipEnabled");
        }

        public final jev a() {
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
                jew jew = new jew(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), this.f, 0);
                return jew;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ jew(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, Optional optional, boolean z, boolean z2, Optional optional2, byte b2) {
        this(authorizationRequest, protocolVersion, optional, z, z2, optional2);
    }

    private jew(AuthorizationRequest authorizationRequest, ProtocolVersion protocolVersion, Optional<jem> optional, boolean z, boolean z2, Optional<Boolean> optional2) {
        this.b = authorizationRequest;
        this.c = protocolVersion;
        this.d = optional;
        this.e = z;
        this.f = z2;
        this.g = optional2;
    }

    public final AuthorizationRequest a() {
        return this.b;
    }

    public final ProtocolVersion b() {
        return this.c;
    }

    public final Optional<jem> c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final Optional<Boolean> f() {
        return this.g;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jev) {
            jev jev = (jev) obj;
            AuthorizationRequest authorizationRequest = this.b;
            if (authorizationRequest != null ? authorizationRequest.equals(jev.a()) : jev.a() == null) {
                return this.c.equals(jev.b()) && this.d.equals(jev.c()) && this.e == jev.d() && this.f == jev.e() && this.g.equals(jev.f());
            }
        }
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

    public final defpackage.jev.a g() {
        return new a(this, 0);
    }
}
