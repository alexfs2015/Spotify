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

/* renamed from: vxc reason: default package */
public interface vxc {
    @xhs(a = {"No-Webgate-Authentication: true"})
    @xhm
    @xhw(a = "signup/public/v1/account/")
    Single<EmailSignupResponse> a(@xhl EmailSignupRequestBody emailSignupRequestBody);

    @xhs(a = {"No-Webgate-Authentication: true"})
    @xhm
    @xhw(a = "signup/public/v1/account/")
    Single<FacebookSignupResponse> a(@xhl FacebookSignupRequest facebookSignupRequest);

    @xhs(a = {"No-Webgate-Authentication: true"})
    @xhm
    @xhw(a = "signup/public/v1/account/")
    Single<IdentifierTokenSignupResponse> a(@xhl IdentifierTokenSignupRequestBody identifierTokenSignupRequestBody);

    @xhs(a = {"No-Webgate-Authentication: true"})
    @xhn(a = "signup/public/v1/account/?validate=1")
    Single<SignupConfigurationResponse> a(@xib(a = "key") String str);

    @xhs(a = {"No-Webgate-Authentication: true"})
    @xhn(a = "signup/public/v1/account/?validate=1&suggest=1&anonymize=1")
    Single<EmailValidationAndDisplayNameSuggestionResponse> a(@xib(a = "key") String str, @xib(a = "email") String str2);

    @xhs(a = {"No-Webgate-Authentication: true"})
    @xhn(a = "/signup/public/v1/account/?validate=1&suggest=1&anonymize=1")
    Single<PasswordValidationResponse> b(@xib(a = "key") String str, @xib(a = "password") String str2);
}
