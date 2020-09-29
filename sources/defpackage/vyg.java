package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;

/* renamed from: vyg reason: default package */
public abstract class vyg implements Parcelable {
    public static final vyg g = b(SignupConfigurationResponse.DEFAULT).a();

    /* renamed from: vyg$a */
    public interface a {
        vyg a();

        a b(boolean z);

        a c(boolean z);

        a d(boolean z);

        a e(boolean z);

        a f(boolean z);
    }

    public static vyg a(SignupConfigurationResponse signupConfigurationResponse) {
        return b(signupConfigurationResponse).a();
    }

    private static a b(SignupConfigurationResponse signupConfigurationResponse) {
        return new a().a(signupConfigurationResponse.canAcceptLicensesInOneStep).b(signupConfigurationResponse.canSignupWithAllGenders).c(signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition).d(signupConfigurationResponse.requiresMarketingOptIn).e(signupConfigurationResponse.requiresMarketingOptInText).f(signupConfigurationResponse.requiresSpecificLicenses);
    }

    public static Creator<vyg> g() {
        return new Creator<vyg>() {
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                return (vyg) vye.CREATOR.createFromParcel(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new vye[i];
            }
        };
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();
}
