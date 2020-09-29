package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.Set;

/* renamed from: jeu reason: default package */
public final class jeu {
    public static kjx<jev, jes> a(jev jev, jet jet) {
        return (kjx) jet.a(new $$Lambda$jeu$Y1oYwTGpVbNJtMaTo9Iz7lA8ik(jev), new $$Lambda$jeu$5unZrRYYRDe62GISSpi1ZZzeCW8(jev), new $$Lambda$jeu$zNRpI0MokVrGA9JzGHukBeOeuQ4(jev), new $$Lambda$jeu$g8psQABjnhPp_5BhQz9VdaEV8c(jev), new $$Lambda$jeu$2u3wtIh5JZ6eU7OMa8hPqEWS7g(jev), new $$Lambda$jeu$HBngM0NL7Bwy6TVVB6oCBHrsClY(jev), new $$Lambda$jeu$q8KUAFAD7BRkpz8fHx0hywvlWE(jev));
    }

    private static Set<jes> a(ErrorMessage errorMessage, String str) {
        return ImmutableSet.d(jes.a(errorMessage, str));
    }

    public static kjn<jev, jes> a(jev jev) {
        return kjn.a(jev, ImmutableSet.d(new j()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jes a(d dVar) {
        String str = "";
        return jes.a(dVar.a, (String) jtc.a(dVar.b, str), (String) jtc.a(dVar.c, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jes a(b bVar) {
        return new b(bVar.a, bVar.b, (String) jtc.a(bVar.c, ""));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jes a(a aVar) {
        return new a(aVar.a, aVar.b, (String) jtc.a(aVar.d, ""));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(jev jev, b bVar) {
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) fay.a(jev.a());
        a g = jev.g();
        g.b(true);
        return kjx.a(g.a(), ImmutableSet.d((jes) bVar.a.a((gct<a, R_>) $$Lambda$jeu$Vs02AX_kA43Bjmp6MBLPc8gydLs.INSTANCE, (gct<b, R_>) $$Lambda$jeu$A_TkiD5xJwPnxa2H_8otftgLu7U.INSTANCE, (gct<d, R_>) $$Lambda$jeu$qPKMo3g31OlXYRnpLo5Ms28Y.INSTANCE, (gct<e, R_>) new $$Lambda$jeu$kA_APKualWLFE7WVJBfzKdsyv6M<e,R_>(authorizationRequest, jev), (gct<c, R_>) new $$Lambda$jeu$MuFiGTXXKjfggeHfEnhuMXwPYsM<c,R_>(authorizationRequest, jev))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(jev jev, c cVar) {
        String str = cVar.a;
        String g = ((AuthorizationRequest) fay.a(jev.a())).g();
        ErrorMessage errorMessage = ErrorMessage.BAKERY_REQUEST_ERROR;
        if (g == null) {
            g = "";
        }
        return kjx.a((Set<? extends F>) ImmutableSet.d(jes.a(errorMessage, str, g)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(jev jev, d dVar) {
        jem jem = dVar.a;
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) fay.a(jev.a());
        a g = jev.g();
        g.a(Optional.b(jem));
        return kjx.a(g.a(), ImmutableSet.d(new e(authorizationRequest, jem)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(jev jev, a aVar) {
        if (jev.e()) {
            return kjx.e();
        }
        AuthorizationRequest a = jev.a();
        String g = a != null ? a.g() : null;
        ErrorMessage errorMessage = ErrorMessage.e;
        if (g == null) {
            g = "";
        }
        return kjx.a(a(errorMessage, g));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(jev jev, e eVar) {
        Assertion.a("Received unexpected Mobius event: GotGoogleAppFlipFlag", jev.b() == ProtocolVersion.GOOGLE_V1);
        String g = ((AuthorizationRequest) fay.a(jev.a())).g();
        jev.g().b(Optional.b(Boolean.valueOf(eVar.a)));
        if (eVar.a) {
            return kjx.a((Set<? extends F>) ImmutableSet.d(new f()));
        }
        ErrorMessage errorMessage = ErrorMessage.INVALID_PARAMETERS_ERROR;
        if (g == null) {
            g = "";
        }
        return kjx.a((Set<? extends F>) ImmutableSet.d(jes.a(errorMessage, (int) R.string.applink_flag_error_description, g)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(jev jev, g gVar) {
        SessionState sessionState = gVar.a;
        if (sessionState.loggingIn() || sessionState.loggingOut()) {
            return kjx.e();
        }
        if (sessionState.loggedIn()) {
            String g = ((AuthorizationRequest) fay.a(jev.a())).g();
            if (!sessionState.canConnect()) {
                ErrorMessage errorMessage = ErrorMessage.d;
                if (g == null) {
                    g = "";
                }
                return kjx.a((Set<? extends F>) ImmutableSet.d(jes.a(errorMessage, (int) R.string.applink_offline_error_description, g)));
            }
            if (sessionState.connected()) {
                if (jev.b() == ProtocolVersion.GOOGLE_V1) {
                    if (!jev.f().b()) {
                        return kjx.a((Set<? extends F>) ImmutableSet.d(new c()));
                    }
                } else if (!jev.c().b()) {
                    return kjx.a((Set<? extends F>) ImmutableSet.d(new f()));
                }
            }
            return kjx.e();
        } else if (jev.d()) {
            return kjx.e();
        } else {
            a g2 = jev.g();
            g2.a(true);
            return kjx.a(g2.a(), ImmutableSet.d(new k()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(jev jev, f fVar) {
        a g = jev.g();
        ProtocolVersion protocolVersion = fVar.b;
        AuthorizationRequest authorizationRequest = fVar.a;
        boolean z = fVar.c;
        boolean z2 = fVar.d;
        String str = (String) jtc.a(authorizationRequest.g(), "");
        if (protocolVersion == ProtocolVersion.UNRESOLVED) {
            return kjx.a(a(ErrorMessage.INVALID_VERSION_ERROR, str));
        }
        g.a(protocolVersion);
        if (!z) {
            return kjx.a(a(ErrorMessage.c, str));
        }
        if (authorizationRequest.f() == null && (authorizationRequest.e() == ResponseType.TOKEN || protocolVersion != ProtocolVersion.URI_V1) && !z2) {
            return kjx.a(a(ErrorMessage.CLIENT_VERIFICATION_ERROR, str));
        }
        String b = authorizationRequest.b();
        if (fax.a(authorizationRequest.c()) || fax.a(b)) {
            return kjx.a(a(ErrorMessage.INVALID_PARAMETERS_ERROR, str));
        }
        return kjx.a(g.a(authorizationRequest).a(), ImmutableSet.d(new l()));
    }
}
