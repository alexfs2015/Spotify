package defpackage;

import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestion.Error;
import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestion.Ok;
import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import io.reactivex.functions.Function;

/* renamed from: vlq reason: default package */
public final class vlq {
    public final vju a;

    public vlq(vju vju) {
        this.a = vju;
    }

    public static Function<EmailValidationAndDisplayNameSuggestionResponse, vlr> a(String str) {
        return new $$Lambda$vlq$kYG50cRH7Mu5jM3o2eQbfwUJ0p0(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vlr a(String str, EmailValidationAndDisplayNameSuggestionResponse emailValidationAndDisplayNameSuggestionResponse) {
        return (vlr) emailValidationAndDisplayNameSuggestionResponse.status().map(new $$Lambda$vlq$eIaw9gQwik8cVXdQnN4gw5egkrk(str, emailValidationAndDisplayNameSuggestionResponse), new $$Lambda$vlq$wckHGYXm1vKh7LCpWb8cKzmrKbM(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vlr a(String str, EmailValidationAndDisplayNameSuggestionResponse emailValidationAndDisplayNameSuggestionResponse, Ok ok) {
        return new c(str, emailValidationAndDisplayNameSuggestionResponse.status().asOk().displayNameSuggestion());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vlr a(String str, Error error) {
        int status = error.status();
        if (status == 20) {
            return vlr.a(str, 20);
        }
        if (status != 130) {
            return vlr.a(str, -1);
        }
        return vlr.a(str, 130);
    }
}
