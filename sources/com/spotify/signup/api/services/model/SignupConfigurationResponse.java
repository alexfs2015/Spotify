package com.spotify.signup.api.services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SignupConfigurationResponse {
    public static final SignupConfigurationResponse DEFAULT = createDefaultConfiguration();
    @JsonProperty("allowed_calling_codes")
    @fiq(a = "allowed_calling_codes")
    public CallingCode[] allowedCallingCodes;
    @JsonProperty("can_accept_licenses_in_one_step")
    @fiq(a = "can_accept_licenses_in_one_step")
    public boolean canAcceptLicensesInOneStep;
    @JsonProperty("pretick_eula")
    @fiq(a = "pretick_eula")
    public boolean canImplicitlyAcceptTermsAndCondition;
    @JsonProperty("use_all_genders")
    @fiq(a = "use_all_genders")
    public boolean canSignupWithAllGenders;
    @JsonProperty("marketing_opt_in_contact_us_url")
    @fiq(a = "marketing_opt_in_contact_us_url")
    public String contactUrl;
    @JsonProperty("country")
    @fiq(a = "country")
    public String country;
    @JsonProperty("minimum_age")
    @fiq(a = "minimum_age")
    public int minimumAge;
    @JsonProperty("requires_marketing_opt_in")
    @fiq(a = "requires_marketing_opt_in")
    public boolean requiresMarketingOptIn;
    @JsonProperty("requires_marketing_opt_in_text")
    @fiq(a = "requires_marketing_opt_in_text")
    public boolean requiresMarketingOptInText;
    @JsonProperty("specific_licenses")
    @fiq(a = "specific_licenses")
    public boolean requiresSpecificLicenses;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CallingCode {
        @JsonProperty("calling_code")
        @fiq(a = "calling_code")
        public String callingCode;
        @JsonProperty("country_code")
        @fiq(a = "country_code")
        public String countryCode;

        public static CallingCode create(String str, String str2) {
            CallingCode callingCode2 = new CallingCode();
            callingCode2.countryCode = str;
            callingCode2.callingCode = str2;
            return callingCode2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CallingCode{countryCode=");
            sb.append(this.countryCode);
            sb.append(", callingCode=");
            sb.append(this.callingCode);
            sb.append("}");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CallingCode)) {
                return false;
            }
            CallingCode callingCode2 = (CallingCode) obj;
            return this.countryCode.equals(callingCode2.countryCode) && this.callingCode.equals(callingCode2.callingCode);
        }

        public int hashCode() {
            return ((this.countryCode.hashCode() ^ 1000003) * 1000003) ^ this.callingCode.hashCode();
        }
    }

    private static SignupConfigurationResponse createDefaultConfiguration() {
        SignupConfigurationResponse signupConfigurationResponse = new SignupConfigurationResponse();
        signupConfigurationResponse.canAcceptLicensesInOneStep = false;
        signupConfigurationResponse.canSignupWithAllGenders = false;
        signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition = false;
        signupConfigurationResponse.requiresMarketingOptIn = false;
        signupConfigurationResponse.requiresMarketingOptInText = false;
        signupConfigurationResponse.minimumAge = 13;
        String str = "";
        signupConfigurationResponse.country = str;
        signupConfigurationResponse.contactUrl = str;
        signupConfigurationResponse.requiresSpecificLicenses = false;
        signupConfigurationResponse.allowedCallingCodes = null;
        return signupConfigurationResponse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignupConfigurationResponse{canAcceptLicensesInOneStep=");
        sb.append(this.canAcceptLicensesInOneStep);
        sb.append(", canSignupWithAllGenders=");
        sb.append(this.canSignupWithAllGenders);
        sb.append(", canImplicitlyAcceptTermsAndCondition=");
        sb.append(this.canImplicitlyAcceptTermsAndCondition);
        sb.append(", requiresMarketingOptIn=");
        sb.append(this.requiresMarketingOptIn);
        sb.append(", requiresMarketingOptInText=");
        sb.append(this.requiresMarketingOptInText);
        sb.append(", minimumAge=");
        sb.append(this.minimumAge);
        sb.append(", country='");
        sb.append(this.country);
        sb.append('\'');
        sb.append(", contactUrl='");
        sb.append(this.contactUrl);
        sb.append('\'');
        sb.append(", requiresSpecificLicenses=");
        sb.append(this.requiresSpecificLicenses);
        sb.append(", allowedCallingCodes=");
        sb.append(Arrays.toString(this.allowedCallingCodes));
        sb.append('}');
        return sb.toString();
    }
}
