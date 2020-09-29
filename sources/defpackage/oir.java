package defpackage;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;

/* renamed from: oir reason: default package */
public final class oir implements wig<Observable<SignupConfigurationResponse>> {
    private final wzi<vxa> a;

    private oir(wzi<vxa> wzi) {
        this.a = wzi;
    }

    public static oir a(wzi<vxa> wzi) {
        return new oir(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(oiq.a((vxa) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
