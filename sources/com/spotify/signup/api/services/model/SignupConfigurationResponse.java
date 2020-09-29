package com.spotify.signup.api.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SignupConfigurationResponse implements Parcelable {
    public static final Creator<SignupConfigurationResponse> CREATOR = new Creator<SignupConfigurationResponse>() {
        public final SignupConfigurationResponse createFromParcel(Parcel parcel) {
            return new SignupConfigurationResponse(parcel);
        }

        public final SignupConfigurationResponse[] newArray(int i) {
            return new SignupConfigurationResponse[i];
        }
    };
    public static final SignupConfigurationResponse DEFAULT = createDefaultConfiguration();
    @JsonProperty("allowed_calling_codes")
    @fjk(a = "allowed_calling_codes")
    public CallingCode[] allowedCallingCodes;
    @JsonProperty("can_accept_licenses_in_one_step")
    @fjk(a = "can_accept_licenses_in_one_step")
    public boolean canAcceptLicensesInOneStep;
    @JsonProperty("pretick_eula")
    @fjk(a = "pretick_eula")
    public boolean canImplicitlyAcceptTermsAndCondition;
    @JsonProperty("use_all_genders")
    @fjk(a = "use_all_genders")
    public boolean canSignupWithAllGenders;
    @JsonProperty("marketing_opt_in_contact_us_url")
    @fjk(a = "marketing_opt_in_contact_us_url")
    public String contactUrl;
    @JsonProperty("country")
    @fjk(a = "country")
    public String country;
    @JsonProperty("minimum_age")
    @fjk(a = "minimum_age")
    public int minimumAge;
    @JsonProperty("requires_marketing_opt_in")
    @fjk(a = "requires_marketing_opt_in")
    public boolean requiresMarketingOptIn;
    @JsonProperty("requires_marketing_opt_in_text")
    @fjk(a = "requires_marketing_opt_in_text")
    public boolean requiresMarketingOptInText;
    @JsonProperty("specific_licenses")
    @fjk(a = "specific_licenses")
    public boolean requiresSpecificLicenses;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CallingCode implements Parcelable {
        public static final Creator<CallingCode> CREATOR = new Creator<CallingCode>() {
            public final CallingCode createFromParcel(Parcel parcel) {
                return new CallingCode(parcel);
            }

            public final CallingCode[] newArray(int i) {
                return new CallingCode[i];
            }
        };
        @JsonProperty("calling_code")
        @fjk(a = "calling_code")
        public String callingCode;
        @JsonProperty("country_code")
        @fjk(a = "country_code")
        public String countryCode;

        public CallingCode() {
        }

        private CallingCode(Parcel parcel) {
            this.countryCode = parcel.readString();
            this.callingCode = parcel.readString();
        }

        public static CallingCode create(String str, String str2) {
            CallingCode callingCode2 = new CallingCode();
            callingCode2.countryCode = str;
            callingCode2.callingCode = str2;
            return callingCode2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CallingCode)) {
                return false;
            }
            CallingCode callingCode2 = (CallingCode) obj;
            return fbn.a(callingCode2.countryCode, this.countryCode) && fbn.a(callingCode2.callingCode, this.callingCode);
        }

        public int hashCode() {
            return ((this.countryCode.hashCode() ^ 1000003) * 1000003) ^ this.callingCode.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CallingCode{countryCode=");
            sb.append(this.countryCode);
            sb.append(", callingCode=");
            sb.append(this.callingCode);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.countryCode);
            parcel.writeString(this.callingCode);
        }
    }

    public SignupConfigurationResponse() {
    }

    private SignupConfigurationResponse(Parcel parcel) {
        this.canAcceptLicensesInOneStep = juo.a(parcel);
        this.canSignupWithAllGenders = juo.a(parcel);
        this.canImplicitlyAcceptTermsAndCondition = juo.a(parcel);
        this.requiresMarketingOptIn = juo.a(parcel);
        this.requiresMarketingOptInText = juo.a(parcel);
        this.minimumAge = parcel.readInt();
        this.country = parcel.readString();
        this.contactUrl = parcel.readString();
        this.requiresSpecificLicenses = juo.a(parcel);
        this.allowedCallingCodes = (CallingCode[]) parcel.createTypedArray(CallingCode.CREATOR);
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

    public int describeContents() {
        return 0;
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

    public void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, this.canAcceptLicensesInOneStep);
        juo.a(parcel, this.canSignupWithAllGenders);
        juo.a(parcel, this.canImplicitlyAcceptTermsAndCondition);
        juo.a(parcel, this.requiresMarketingOptIn);
        juo.a(parcel, this.requiresMarketingOptInText);
        parcel.writeInt(this.minimumAge);
        parcel.writeString(this.country);
        parcel.writeString(this.contactUrl);
        juo.a(parcel, this.requiresSpecificLicenses);
        parcel.writeTypedArray(this.allowedCallingCodes, i);
    }
}
