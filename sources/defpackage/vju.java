package defpackage;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Single;

/* renamed from: vju reason: default package */
public final class vju {
    public final vjw a;
    public final String b;

    private vju(vjw vjw, String str) {
        this.a = vjw;
        this.b = str;
    }

    public final Single<SignupConfigurationResponse> a() {
        return this.a.a(vjv.a);
    }

    public static vju a(vjw vjw, String str) {
        return new vju(vjw, str);
    }
}
