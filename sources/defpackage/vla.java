package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;

/* renamed from: vla reason: default package */
public abstract class vla implements Parcelable {
    public static final vla g = b(SignupConfigurationResponse.DEFAULT).a();

    /* renamed from: vla$a */
    public interface a {
        vla a();

        a b(boolean z);

        a c(boolean z);

        a d(boolean z);

        a e(boolean z);

        a f(boolean z);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public static vla a(SignupConfigurationResponse signupConfigurationResponse) {
        return b(signupConfigurationResponse).a();
    }

    private static a b(SignupConfigurationResponse signupConfigurationResponse) {
        return new a().a(signupConfigurationResponse.canAcceptLicensesInOneStep).b(signupConfigurationResponse.canSignupWithAllGenders).c(signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition).d(signupConfigurationResponse.requiresMarketingOptIn).e(signupConfigurationResponse.requiresMarketingOptInText).f(signupConfigurationResponse.requiresSpecificLicenses);
    }

    public static Creator<vla> g() {
        return new Creator<vla>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new vky[i];
            }

            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                return (vla) vky.CREATOR.createFromParcel(parcel);
            }
        };
    }
}
