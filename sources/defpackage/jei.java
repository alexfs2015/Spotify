package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.Locale;

/* renamed from: jei reason: default package */
public final class jei {
    public final AuthorizationRequest a;

    /* renamed from: jei$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ResponseType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.sso.AuthorizationRequest$ResponseType[] r0 = com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.sso.AuthorizationRequest$ResponseType r1 = com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType.TOKEN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.sso.AuthorizationRequest$ResponseType r1 = com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType.CODE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jei.AnonymousClass1.<clinit>():void");
        }
    }

    private jei(AuthorizationRequest authorizationRequest) {
        this.a = authorizationRequest;
    }

    public static jei a(AuthorizationRequest authorizationRequest) {
        return new jei(authorizationRequest);
    }

    public jei(String str, ResponseType responseType, String str2, ClientIdentity clientIdentity, String str3, String[] strArr, boolean z) {
        this.a = AuthorizationRequest.a(str, responseType, str2, clientIdentity, null, strArr, false);
    }

    public final Uri a() {
        Builder builder = new Builder();
        Builder appendQueryParameter = builder.scheme("https").authority(jef.a()).appendPath(gnc.a(Locale.getDefault())).appendPath("authorize").appendQueryParameter("client_id", this.a.c());
        int i = AnonymousClass1.a[this.a.e().ordinal()];
        String str = i != 1 ? i != 2 ? "unknown" : "code" : "token";
        appendQueryParameter.appendQueryParameter("response_type", str).appendQueryParameter("redirect_uri", this.a.b()).appendQueryParameter("nosignout", Boolean.TRUE.toString());
        if (this.a.h()) {
            builder.appendQueryParameter("show_dialog", "true");
        }
        if (this.a.g() != null) {
            builder.appendQueryParameter("state", this.a.g());
        }
        if (this.a.f() != null) {
            ClientIdentity clientIdentity = (ClientIdentity) fay.a(this.a.f());
            builder.appendQueryParameter("client_app_id", String.format("%s:%s", new Object[]{clientIdentity.a, clientIdentity.b}));
        }
        String[] a2 = this.a.a();
        if (a2.length > 0) {
            builder.appendQueryParameter("scope", fau.a(" ").a((Object[]) a2));
        }
        return builder.build();
    }
}
