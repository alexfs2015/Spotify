package defpackage;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;

/* renamed from: obs reason: default package */
public final class obs implements vua<Observable<SignupConfigurationResponse>> {
    private final wlc<vju> a;

    private obs(wlc<vju> wlc) {
        this.a = wlc;
    }

    public static obs a(wlc<vju> wlc) {
        return new obs(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(obr.a((vju) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
