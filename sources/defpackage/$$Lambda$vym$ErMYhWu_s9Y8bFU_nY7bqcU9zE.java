package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$vym$ErMYhWu_s9Y8bFU_nY7bq-cU9zE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vym$ErMYhWu_s9Y8bFU_nY7bqcU9zE implements Consumer {
    private final /* synthetic */ AgeValidator f$0;
    private final /* synthetic */ gqm f$1;

    public /* synthetic */ $$Lambda$vym$ErMYhWu_s9Y8bFU_nY7bqcU9zE(AgeValidator ageValidator, gqm gqm) {
        this.f$0 = ageValidator;
        this.f$1 = gqm;
    }

    public final void accept(Object obj) {
        vym.a(this.f$0, this.f$1, (SignupConfigurationResponse) obj);
    }
}
