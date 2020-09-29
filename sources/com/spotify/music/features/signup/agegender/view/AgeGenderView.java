package com.spotify.music.features.signup.agegender.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;
import com.spotify.termsandconditions.TermsAndConditionsView;
import io.reactivex.subjects.BehaviorSubject;

public class AgeGenderView extends LinearLayout implements b, a {
    public TextView a;
    public Position b;
    public Button c;
    public View d;
    public TextView e;
    public Drawable f;
    private final BehaviorSubject<Gender> g = BehaviorSubject.a();
    private TextView h;
    private a i;
    private Gender j;
    private TextView k;
    private Drawable l;
    private TermsAndConditionsView m;

    public enum Position {
        LEFT,
        CENTER,
        RIGHT
    }

    public AgeGenderView(Context context) {
        super(context);
        n();
    }

    public AgeGenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n();
    }

    private void n() {
        inflate(getContext(), R.layout.create_account_age_gender_input_fields, this);
        this.d = (View) fay.a(findViewById(R.id.sign_up_age_gender_inputs_container));
        this.a = (TextView) fay.a(findViewById(R.id.sign_up_age_text));
        this.e = (TextView) fay.a(findViewById(R.id.sign_up_age_error_message));
        this.h = (TextView) fay.a(findViewById(R.id.sign_up_gender_text));
        this.k = (TextView) fay.a(findViewById(R.id.sign_up_gender_error_message));
        this.c = (Button) fay.a(findViewById(R.id.sign_up_create_button));
        this.c.setEnabled(false);
        this.b = Position.RIGHT;
        this.l = fr.a(getContext(), (int) R.drawable.bg_login_text_field_white);
        this.f = fr.a(getContext(), (int) R.drawable.bg_login_text_field_error);
        this.m = (TermsAndConditionsView) fay.a(findViewById(R.id.sign_up_terms));
    }

    public final void a(a aVar) {
        this.i = aVar;
        this.i.a(this, this.g);
        this.a.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                AgeGenderView.this.b(view, z);
            }
        });
        this.a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AgeGenderView.this.c(view);
            }
        });
        this.h.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                AgeGenderView.this.a(view, z);
            }
        });
        this.h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AgeGenderView.this.b(view);
            }
        });
        this.c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AgeGenderView.this.a(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view, boolean z) {
        if (z) {
            this.i.a(qfn.ae());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.i.a(qfn.ae());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, boolean z) {
        if (z) {
            this.i.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.i.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.i.a();
    }

    public final void a(boolean z, kf kfVar) {
        gac.b(this.h);
        qfo i2 = qfo.i(z);
        i2.U = this.j;
        i2.T = this;
        i2.a(kfVar, "genderpicker");
    }

    public final void l() {
        gac.b(this.a);
    }

    public final void m() {
        this.m.d();
    }

    public final void a(String str) {
        this.a.setText(str);
    }

    public final void a(Gender gender) {
        this.j = gender;
        this.h.setText(qfp.a(gender));
        this.g.onNext(this.j);
    }

    public final void a() {
        qgb.a(this.a);
    }

    public final void b() {
        qgb.a(this.h);
    }

    public final void c() {
        qgb.b(this.a);
    }

    public final void d() {
        qgb.b(this.h);
    }

    public final void e() {
        ip.a((View) this.a, this.l);
        this.e.setText("");
    }

    public final void j() {
        this.c.setEnabled(true);
    }

    public final void k() {
        this.c.setEnabled(false);
    }

    public final void i() {
        this.a.setEnabled(false);
        this.h.setEnabled(false);
    }

    public final void h() {
        this.a.setEnabled(true);
        this.h.setEnabled(true);
    }

    public final void f() {
        this.m.a((View) this.c);
    }

    public final void g() {
        TermsAndConditionsView termsAndConditionsView = this.m;
        termsAndConditionsView.a.a(termsAndConditionsView, termsAndConditionsView.getResources().getString(vof.terms_and_conditions_text_privacy_policy));
    }
}
