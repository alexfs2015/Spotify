package defpackage;

import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.EmailSignupResponse;
import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import com.spotify.signup.api.services.model.FacebookSignupRequest;
import com.spotify.signup.api.services.model.FacebookSignupResponse;
import com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody;
import com.spotify.signup.api.services.model.IdentifierTokenSignupResponse;
import com.spotify.signup.api.services.model.PasswordValidationResponse;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Single;

/* renamed from: vjw reason: default package */
public interface vjw {
    @wtn(a = {"No-Webgate-Authentication: true"})
    @wth
    @wtr(a = "signup/public/v1/account/")
    Single<EmailSignupResponse> a(@wtg EmailSignupRequestBody emailSignupRequestBody);

    @wtn(a = {"No-Webgate-Authentication: true"})
    @wth
    @wtr(a = "signup/public/v1/account/")
    Single<FacebookSignupResponse> a(@wtg FacebookSignupRequest facebookSignupRequest);

    @wtn(a = {"No-Webgate-Authentication: true"})
    @wth
    @wtr(a = "signup/public/v1/account/")
    Single<IdentifierTokenSignupResponse> a(@wtg IdentifierTokenSignupRequestBody identifierTokenSignupRequestBody);

    @wtn(a = {"No-Webgate-Authentication: true"})
    @wti(a = "signup/public/v1/account/?validate=1")
    Single<SignupConfigurationResponse> a(@wtw(a = "key") String str);

    @wtn(a = {"No-Webgate-Authentication: true"})
    @wti(a = "signup/public/v1/account/?validate=1&suggest=1&anonymize=1")
    Single<EmailValidationAndDisplayNameSuggestionResponse> a(@wtw(a = "key") String str, @wtw(a = "email") String str2);

    @wtn(a = {"No-Webgate-Authentication: true"})
    @wti(a = "/signup/public/v1/account/?validate=1&suggest=1&anonymize=1")
    Single<PasswordValidationResponse> b(@wtw(a = "key") String str, @wtw(a = "password") String str2);
}
