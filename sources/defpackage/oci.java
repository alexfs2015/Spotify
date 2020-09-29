package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.features.signup.agegender.view.AgeGenderView;
import com.spotify.music.features.signup.displayname.DisplayNameView;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;

/* renamed from: oci reason: default package */
public class oci extends jor implements gnh, gnl, b, qfs {
    public oap T;
    public ToastieManager U;
    public a V;
    public oav W;
    public a X;
    public obx Y;
    public jvy Z;
    public a a;
    private View aa;
    private TextView ab;
    /* access modifiers changed from: private */
    public AgeGenderView ac;
    private DisplayNameView ad;
    public vof b;

    public static oci c() {
        return new oci();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_phone_number_signup, viewGroup, false);
        this.aa = (View) fay.a(inflate.findViewById(R.id.spinner));
        this.ab = (TextView) fay.a(inflate.findViewById(R.id.header));
        this.ac = (AgeGenderView) fay.a(inflate.findViewById(R.id.age_gender));
        this.ad = (DisplayNameView) fay.a(inflate.findViewById(R.id.display_name));
        this.T.a = new a() {
            public final void a() {
                AgeGenderView a2 = oci.this.ac;
                ip.a((View) a2.a, a2.f);
                a2.e.setText(R.string.choose_username_too_young);
            }

            public final void a(String str) {
                AgeGenderView a2 = oci.this.ac;
                ip.a((View) a2.a, a2.f);
                a2.e.setText(str);
            }
        };
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        fay.a(this.ac);
        fay.a(this.ad);
        this.W.a = (b) fay.a(new oax(this.ac));
        this.ac.a((a) fay.a(this.V));
        this.Y.a = (b) fay.a(new obz(this.ad));
        DisplayNameView displayNameView = this.ad;
        a aVar = (a) fay.a(this.X);
        displayNameView.a = aVar;
        fnp a2 = fnv.a(displayNameView.b);
        Observable a3 = fns.a(displayNameView.c);
        EditText editText = displayNameView.b;
        String str = "view == null";
        fnr.a(editText, str);
        Predicate<Object> predicate = fnq.a;
        fnr.a(editText, str);
        fnr.a(predicate, "handled == null");
        aVar.a(displayNameView, a2, a3, new fnw(editText, predicate));
        this.a.c();
    }

    public final void a(uos uos) {
        fay.a(this.U);
        this.U.a(uos);
    }

    public final void h() {
        this.U.a();
        super.h();
    }

    public final boolean a() {
        return this.a.e();
    }

    public final void a(b bVar, boolean z) {
        bVar.a(z);
    }

    public final void b(b bVar, boolean z) {
        bVar.b(z);
    }

    public final void a(SignupConfigurationResponse signupConfigurationResponse) {
        if (signupConfigurationResponse.requiresMarketingOptIn) {
            this.Z.b(o()).a().a(qfl.a, true).a(qfl.b, signupConfigurationResponse.contactUrl).b();
        }
        ((vof) fay.a(this.b)).a(voi.a(signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition, signupConfigurationResponse.canAcceptLicensesInOneStep, signupConfigurationResponse.requiresSpecificLicenses), (a) new a() {
            public final void c() {
            }

            public final void a() {
                oci.this.a.f();
            }

            public final void b() {
                ka p = oci.this.p();
                if (p != null) {
                    p.i().c();
                } else {
                    Assertion.b("Attempted to pop back stack while detached");
                }
            }
        });
    }

    public final void a(boolean z) {
        ((View) fay.a(this.aa)).setVisibility(z ? 0 : 8);
    }

    public final void a(String str) {
        ((TextView) fay.a(this.ab)).setText(str);
    }

    public final void e() {
        this.a.d();
    }

    public final void ae() {
        this.a.g();
    }

    public final void a(b bVar) {
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(bVar.a());
        fay.a(viewGroup);
        bVar.a(viewGroup);
    }
}
