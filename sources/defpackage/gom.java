package defpackage;

import com.spotify.signup.api.services.model.PasswordValidation;
import com.spotify.signup.api.services.model.PasswordValidationResponse;
import io.reactivex.Single;

/* renamed from: gom reason: default package */
public final class gom {
    private final vxa a;

    /* renamed from: gom$a */
    public static class a {
        public final boolean a;
        public final boolean b;
        public final String c;

        public a(boolean z, boolean z2, String str) {
            this.a = z;
            this.b = z2;
            this.c = str;
        }
    }

    public gom(vxa vxa) {
        this.a = vxa;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(PasswordValidationResponse passwordValidationResponse) {
        PasswordValidation status = passwordValidationResponse.status();
        return status.isOk() ? new a(true, false, null) : passwordValidationResponse.status().isError() ? new a(false, false, status.asError().message()) : new a(false, false, null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(Throwable th) {
        return new a(false, true, null);
    }

    public final Single<a> a(String str) {
        return this.a.a.b(vxb.a, str).f($$Lambda$gom$UkSIAHUiAXmegUQyxqzEU_AA_Pk.INSTANCE).g($$Lambda$gom$POgwWJQptiLAkdtNX21hWg_aU8.INSTANCE);
    }
}
