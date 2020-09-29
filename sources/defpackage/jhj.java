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

/* renamed from: jhj reason: default package */
public final class jhj {
    private static Set<jhh> a(ErrorMessage errorMessage, String str) {
        return ImmutableSet.d(jhh.a(errorMessage, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jhh a(a aVar) {
        return new a(aVar.a, aVar.b, (String) jvi.a(aVar.d, ""));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jhh a(b bVar) {
        return new b(bVar.a, bVar.b, (String) jvi.a(bVar.c, ""));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jhh a(d dVar) {
        String str = "";
        return jhh.a(dVar.a, (String) jvi.a(dVar.b, str), (String) jvi.a(dVar.c, str));
    }

    public static kmw<jhk, jhh> a(jhk jhk) {
        return kmw.a(jhk, ImmutableSet.d(new j()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(jhk jhk, a aVar) {
        if (jhk.e()) {
            return kng.e();
        }
        AuthorizationRequest a = jhk.a();
        String g = a != null ? a.g() : null;
        ErrorMessage errorMessage = ErrorMessage.e;
        if (g == null) {
            g = "";
        }
        return kng.a(a(errorMessage, g));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(jhk jhk, b bVar) {
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) fbp.a(jhk.a());
        a g = jhk.g();
        g.b(true);
        return kng.a(g.a(), ImmutableSet.d((jhh) bVar.a.a((gee<a, R_>) $$Lambda$jhj$rOKmG4mDZcUYH2Ql21ZyLls2Fg0.INSTANCE, (gee<b, R_>) $$Lambda$jhj$ChOF4uDkpj0HLx0xXelC62gVLac.INSTANCE, (gee<d, R_>) $$Lambda$jhj$V81kYhdS2olu8G2_Rzy_4baJo.INSTANCE, (gee<e, R_>) new $$Lambda$jhj$B3viwfaeDdBRhrMszEkvB_BJE5k<e,R_>(authorizationRequest, jhk), (gee<c, R_>) new $$Lambda$jhj$UgeaTx5zYagvah67FHsWMuq1sMs<c,R_>(authorizationRequest, jhk))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(jhk jhk, c cVar) {
        String str = cVar.a;
        String g = ((AuthorizationRequest) fbp.a(jhk.a())).g();
        ErrorMessage errorMessage = ErrorMessage.BAKERY_REQUEST_ERROR;
        if (g == null) {
            g = "";
        }
        return kng.a((Set<? extends F>) ImmutableSet.d(jhh.a(errorMessage, str, g)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(jhk jhk, d dVar) {
        jhb jhb = dVar.a;
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) fbp.a(jhk.a());
        a g = jhk.g();
        g.a(Optional.b(jhb));
        return kng.a(g.a(), ImmutableSet.d(new e(authorizationRequest, jhb)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(jhk jhk, e eVar) {
        Assertion.a("Received unexpected Mobius event: GotGoogleAppFlipFlag", jhk.b() == ProtocolVersion.GOOGLE_V1);
        String g = ((AuthorizationRequest) fbp.a(jhk.a())).g();
        jhk.g().b(Optional.b(Boolean.valueOf(eVar.a)));
        if (eVar.a) {
            return kng.a((Set<? extends F>) ImmutableSet.d(new f()));
        }
        ErrorMessage errorMessage = ErrorMessage.INVALID_PARAMETERS_ERROR;
        if (g == null) {
            g = "";
        }
        return kng.a((Set<? extends F>) ImmutableSet.d(jhh.a(errorMessage, (int) R.string.applink_flag_error_description, g)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(jhk jhk, f fVar) {
        a g = jhk.g();
        ProtocolVersion protocolVersion = fVar.b;
        AuthorizationRequest authorizationRequest = fVar.a;
        boolean z = fVar.c;
        boolean z2 = fVar.d;
        String str = (String) jvi.a(authorizationRequest.g(), "");
        if (protocolVersion == ProtocolVersion.UNRESOLVED) {
            return kng.a(a(ErrorMessage.INVALID_VERSION_ERROR, str));
        }
        g.a(protocolVersion);
        if (!z) {
            return kng.a(a(ErrorMessage.c, str));
        }
        if (authorizationRequest.f() == null && (authorizationRequest.e() == ResponseType.TOKEN || protocolVersion != ProtocolVersion.URI_V1) && !z2) {
            return kng.a(a(ErrorMessage.CLIENT_VERIFICATION_ERROR, str));
        }
        return (fbo.a(authorizationRequest.c()) || fbo.a(authorizationRequest.b())) ? kng.a(a(ErrorMessage.INVALID_PARAMETERS_ERROR, str)) : kng.a(g.a(authorizationRequest).a(), ImmutableSet.d(new l()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(jhk jhk, g gVar) {
        SessionState sessionState = gVar.a;
        if (sessionState.loggingIn() || sessionState.loggingOut()) {
            return kng.e();
        }
        if (sessionState.loggedIn()) {
            String g = ((AuthorizationRequest) fbp.a(jhk.a())).g();
            if (!sessionState.canConnect()) {
                ErrorMessage errorMessage = ErrorMessage.d;
                if (g == null) {
                    g = "";
                }
                return kng.a((Set<? extends F>) ImmutableSet.d(jhh.a(errorMessage, (int) R.string.applink_offline_error_description, g)));
            }
            if (sessionState.connected()) {
                if (jhk.b() == ProtocolVersion.GOOGLE_V1) {
                    if (!jhk.f().b()) {
                        return kng.a((Set<? extends F>) ImmutableSet.d(new c()));
                    }
                } else if (!jhk.c().b()) {
                    return kng.a((Set<? extends F>) ImmutableSet.d(new f()));
                }
            }
            return kng.e();
        } else if (jhk.d()) {
            return kng.e();
        } else {
            a g2 = jhk.g();
            g2.a(true);
            return kng.a(g2.a(), ImmutableSet.d(new k()));
        }
    }

    public static kng<jhk, jhh> a(jhk jhk, jhi jhi) {
        return (kng) jhi.a(new $$Lambda$jhj$5Z6XhJWx2n9E9S7OcHwJO0MxgdE(jhk), new $$Lambda$jhj$YoW8OB1UWb4IhczAIxvlYwJJzNM(jhk), new $$Lambda$jhj$Lx7Ad4dvpCLyZ_XMMTjzrl9U91U(jhk), new $$Lambda$jhj$Hbxtk8aD9tYiEHUpiDr13VMkpKY(jhk), new $$Lambda$jhj$KP64Ue_JYIUCJRpaygNcLkSrw(jhk), new $$Lambda$jhj$HIsrgQuxV_LJX01adtRUbXEIDUE(jhk), new $$Lambda$jhj$ziSBavn774oJQyqBgWZ2dPikmd4(jhk));
    }
}
