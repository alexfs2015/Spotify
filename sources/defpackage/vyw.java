package defpackage;

import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestion.Error;
import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestion.Ok;
import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import io.reactivex.functions.Function;

/* renamed from: vyw reason: default package */
public final class vyw {
    public final vxa a;

    public vyw(vxa vxa) {
        this.a = vxa;
    }

    public static Function<EmailValidationAndDisplayNameSuggestionResponse, vyx> a(String str) {
        return new $$Lambda$vyw$7xpMXQ8YMBwdi5ZtgxLYAkj6q2I(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vyx a(String str, Error error) {
        int status = error.status();
        return status != 20 ? status != 130 ? vyx.a(str, -1) : vyx.a(str, 130) : vyx.a(str, 20);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vyx a(String str, EmailValidationAndDisplayNameSuggestionResponse emailValidationAndDisplayNameSuggestionResponse) {
        return (vyx) emailValidationAndDisplayNameSuggestionResponse.status().map(new $$Lambda$vyw$u8cKGnKRK_7aXADUFSaGkbZuI(str, emailValidationAndDisplayNameSuggestionResponse), new $$Lambda$vyw$37sPdGGp6ux07YYUd929EHB5PqM(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vyx a(String str, EmailValidationAndDisplayNameSuggestionResponse emailValidationAndDisplayNameSuggestionResponse, Ok ok) {
        return new c(str, emailValidationAndDisplayNameSuggestionResponse.status().asOk().displayNameSuggestion());
    }
}
