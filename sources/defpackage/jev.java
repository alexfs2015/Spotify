package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;

/* renamed from: jev reason: default package */
public abstract class jev {
    public static final jev a = new a().a((AuthorizationRequest) null).a(ProtocolVersion.UNRESOLVED).a(Optional.e()).a(false).b(false).b(Optional.e()).a();

    /* renamed from: jev$a */
    public static abstract class a {
        public abstract a a(Optional<jem> optional);

        public abstract a a(AuthorizationRequest authorizationRequest);

        public abstract a a(ProtocolVersion protocolVersion);

        public abstract a a(boolean z);

        public abstract jev a();

        public abstract a b(Optional<Boolean> optional);

        public abstract a b(boolean z);
    }

    public abstract AuthorizationRequest a();

    public abstract ProtocolVersion b();

    public abstract Optional<jem> c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract Optional<Boolean> f();

    public abstract a g();
}
