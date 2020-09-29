package defpackage;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Single;

/* renamed from: vxa reason: default package */
public final class vxa {
    public final vxc a;
    public final String b;

    private vxa(vxc vxc, String str) {
        this.a = vxc;
        this.b = str;
    }

    public static vxa a(vxc vxc, String str) {
        return new vxa(vxc, str);
    }

    public final Single<SignupConfigurationResponse> a() {
        return this.a.a(vxb.a);
    }
}
