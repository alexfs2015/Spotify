package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$vlg$MhF55Bgll3K9GDx64k3I0kOL5A0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vlg$MhF55Bgll3K9GDx64k3I0kOL5A0 implements Consumer {
    private final /* synthetic */ AgeValidator f$0;

    public /* synthetic */ $$Lambda$vlg$MhF55Bgll3K9GDx64k3I0kOL5A0(AgeValidator ageValidator) {
        this.f$0 = ageValidator;
    }

    public final void accept(Object obj) {
        vlg.a(this.f$0, (SignupConfigurationResponse) obj);
    }
}
