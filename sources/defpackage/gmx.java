package defpackage;

import com.spotify.signup.api.services.model.PasswordValidation;
import com.spotify.signup.api.services.model.PasswordValidationResponse;
import io.reactivex.Single;

/* renamed from: gmx reason: default package */
public final class gmx {
    private final vju a;

    /* renamed from: gmx$a */
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

    public gmx(vju vju) {
        this.a = vju;
    }

    public final Single<a> a(String str) {
        return this.a.a.b(vjv.a, str).f($$Lambda$gmx$zoBJlU0WBVRqiMFn8x3p4quisDM.INSTANCE).g($$Lambda$gmx$ckwIU9um9UPnq8r4D5sQnGHzQE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(PasswordValidationResponse passwordValidationResponse) {
        PasswordValidation status = passwordValidationResponse.status();
        if (status.isOk()) {
            return new a(true, false, null);
        }
        if (passwordValidationResponse.status().isError()) {
            return new a(false, false, status.asError().message());
        }
        return new a(false, false, null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(Throwable th) {
        return new a(false, true, null);
    }
}
