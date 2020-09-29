package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;

/* renamed from: jhk reason: default package */
public abstract class jhk {
    public static final jhk a = new a().a((AuthorizationRequest) null).a(ProtocolVersion.UNRESOLVED).a(Optional.e()).a(false).b(false).b(Optional.e()).a();

    /* renamed from: jhk$a */
    public static abstract class a {
        public abstract a a(Optional<jhb> optional);

        public abstract a a(AuthorizationRequest authorizationRequest);

        public abstract a a(ProtocolVersion protocolVersion);

        public abstract a a(boolean z);

        public abstract jhk a();

        public abstract a b(Optional<Boolean> optional);

        public abstract a b(boolean z);
    }

    public abstract AuthorizationRequest a();

    public abstract ProtocolVersion b();

    public abstract Optional<jhb> c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract Optional<Boolean> f();

    public abstract a g();
}
