package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.features.phonenumbersignup.agegender.view.AgeGenderView;
import com.spotify.music.features.phonenumbersignup.displayname.DisplayNameView;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;

/* renamed from: ojo reason: default package */
public class ojo extends jrd implements gow, gpa, ohk, b {
    public ohh T;
    public ToastieManager U;
    public a V;
    public oho W;
    public a X;
    public oiz Y;
    public jyg Z;
    public a a;
    private View aa;
    private TextView ab;
    /* access modifiers changed from: private */
    public AgeGenderView ac;
    private DisplayNameView ad;
    public wbn b;

    public static ojo e() {
        return new ojo();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_phone_number_signup, viewGroup, false);
        this.aa = (View) fbp.a(inflate.findViewById(R.id.spinner));
        this.ab = (TextView) fbp.a(inflate.findViewById(R.id.header));
        this.ac = (AgeGenderView) fbp.a(inflate.findViewById(R.id.age_gender));
        this.ad = (DisplayNameView) fbp.a(inflate.findViewById(R.id.display_name));
        this.T.a = new a() {
            public final void a() {
                AgeGenderView a2 = ojo.this.ac;
                ip.a((View) a2.a, a2.f);
                a2.e.setText(R.string.choose_username_too_young);
            }

            public final void a(String str) {
                AgeGenderView a2 = ojo.this.ac;
                ip.a((View) a2.a, a2.f);
                a2.e.setText(str);
            }
        };
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        fbp.a(this.ac);
        fbp.a(this.ad);
        this.W.a = (b) fbp.a(new ohq(this.ac));
        this.ac.a((a) fbp.a(this.V));
        this.Y.a = (b) fbp.a(new ojb(this.ad));
        DisplayNameView displayNameView = this.ad;
        a aVar = (a) fbp.a(this.X);
        displayNameView.a = aVar;
        foj a2 = fop.a(displayNameView.b);
        Observable a3 = fom.a(displayNameView.c);
        EditText editText = displayNameView.b;
        String str = "view == null";
        fol.a(editText, str);
        Predicate<Object> predicate = fok.a;
        fol.a(editText, str);
        fol.a(predicate, "handled == null");
        aVar.a(displayNameView, a2, a3, new foq(editText, predicate));
        this.a.c();
    }

    public final void a(SignupConfigurationResponse signupConfigurationResponse) {
        if (signupConfigurationResponse.requiresMarketingOptIn) {
            this.Z.b(o()).a().a(gqm.a, true).a(gqm.b, signupConfigurationResponse.contactUrl).b();
        }
        ((wbn) fbp.a(this.b)).a(wbq.a(signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition, signupConfigurationResponse.canAcceptLicensesInOneStep, signupConfigurationResponse.requiresSpecificLicenses), (a) new a() {
            public final void a() {
                ojo.this.a.f();
            }

            public final void b() {
                kf p = ojo.this.p();
                if (p != null) {
                    p.i().c();
                } else {
                    Assertion.b("Attempted to pop back stack while detached");
                }
            }

            public final void c() {
            }
        });
    }

    public final void a(b bVar) {
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(bVar.a());
        fbp.a(viewGroup);
        bVar.a(viewGroup);
    }

    public final void a(b bVar, boolean z) {
        bVar.a(z);
    }

    public final void a(String str) {
        ((TextView) fbp.a(this.ab)).setText(str);
    }

    public final void a(uzy uzy) {
        fbp.a(this.U);
        this.U.a(uzy);
    }

    public final void a(boolean z) {
        ((View) fbp.a(this.aa)).setVisibility(z ? 0 : 8);
    }

    public final boolean a() {
        return this.a.e();
    }

    public final void b() {
        this.a.d();
    }

    public final void b(b bVar, boolean z) {
        bVar.b(z);
    }

    public final void c() {
        this.a.g();
    }

    public final void h() {
        this.U.a();
        super.h();
    }
}
