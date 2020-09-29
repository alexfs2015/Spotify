package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.signup.validators.LocalEmailValidator;
import com.spotify.libs.signup.validators.LocalEmailValidator.EmailValidation;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: gnq reason: default package */
public class gnq extends jor implements a {
    public gog T;
    private String U;
    private String V;
    private Button W;
    private ViewAnimator X;
    private TextView Y;
    private TextView Z;
    public gns a;
    private TextView aa;
    private EditText ab;
    private ProgressBar ac;
    /* access modifiers changed from: private */
    public boolean ad;
    /* access modifiers changed from: private */
    public boolean ae;
    public LocalEmailValidator b;

    public static gnq a(String str, boolean z, String str2) {
        gnq gnq = new gnq();
        Bundle bundle = new Bundle();
        bundle.putString("magiclink_email_or_username", str);
        bundle.putBoolean("magiclink_show_done_screen", z);
        bundle.putString("magiclink_initial_error_msg", str2);
        gnq.g(bundle);
        return gnq;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            this.U = bundle2.getString("magiclink_email_or_username", null);
            this.V = bundle2.getString("magiclink_initial_error_msg");
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.magiclink_request_fragment_sthlm_black, viewGroup, false);
        this.a.a = this;
        this.X = (ViewAnimator) inflate.findViewById(R.id.view_animator);
        this.X.setAnimateFirstView(true);
        this.ac = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        ((SpotifyIconView) inflate.findViewById(R.id.back_button)).setOnClickListener(new $$Lambda$gnq$qKaJinXacS8hli8oP9iTg9NT7fU(this));
        this.Y = (TextView) inflate.findViewById(R.id.request_magiclink_heading);
        this.ab = (EditText) inflate.findViewById(R.id.login_password_reset_email_input);
        this.ab.addTextChangedListener(new jxg() {
            public final void afterTextChanged(Editable editable) {
                if (!gnq.this.ad && !gnq.this.ae) {
                    gnq.this.T.a(goa.a((goh) new b(), (gof) new a()));
                    gnq.this.ad = true;
                }
                gnq.this.ae = false;
                gnq.this.a.a.i(!editable.toString().isEmpty());
            }
        });
        this.ab.setOnEditorActionListener(new $$Lambda$gnq$DbAvtWRpX5ErQyG8Lt9aSdLN8XI(this));
        this.W = (Button) inflate.findViewById(R.id.login_password_reset_button);
        this.W.setOnClickListener(new $$Lambda$gnq$XlaBxyyPS46rQiqJxvz3ibmEk(this));
        ((Button) inflate.findViewById(R.id.open_email_app_button)).setOnClickListener(new $$Lambda$gnq$xpVFBEPoBtE58OywQ1DINdOGptw(this));
        this.Z = (TextView) inflate.findViewById(R.id.login_email_info_message);
        if (!TextUtils.isEmpty(this.V)) {
            this.Z.setText(this.V);
            this.V = null;
        }
        this.aa = (TextView) inflate.findViewById(R.id.request_sent_message);
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        goh goh;
        gog gog = this.T;
        if (this.X.getDisplayedChild() == 0) {
            goh = new b();
        } else {
            goh = new a();
        }
        gog.a(goa.a(goh, new a(), new c()));
        this.t.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 && !TextUtils.isEmpty(textView.getText())) {
            this.T.a(goa.a(new b(), new h(), new c()));
            this.a.a(this.ab.getText().toString());
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.T.a(goa.a(new b(), new h(), new c()));
        this.a.a(this.ab.getText().toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a.af();
        this.T.a(goa.a(new a(), new g(), new c()));
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        gba.a(this.ab);
        boolean z = false;
        if (!TextUtils.isEmpty(this.U)) {
            this.ae = true;
            this.ab.setText(this.U);
            Bundle bundle2 = this.i;
            if (bundle2 != null && bundle2.getBoolean("magiclink_show_done_screen", false)) {
                a(true);
                z = true;
            }
        }
        if (bundle == null && !z) {
            this.T.a(goa.a(new b()));
        }
    }

    public final void h() {
        super.h();
        gns gns = this.a;
        gns.c.bf_();
        gns.b.a.c();
    }

    public final void c() {
        this.Z.setText(R.string.magiclink_error_request_network);
    }

    public final void e() {
        this.Z.setText(R.string.magiclink_error_request_generic);
    }

    public final void a(boolean z) {
        Logger.e("request email was sent", new Object[0]);
        if (z) {
            this.T.a(goa.a((goh) new b(), (goe) new g()));
        } else {
            this.T.a(goa.a((goh) new b(), (goe) new f()));
        }
        gba.b(this.ab);
        boolean z2 = ip.f(this.H) == 1;
        ViewAnimator viewAnimator = this.X;
        viewAnimator.setInAnimation(viewAnimator.getContext(), z2 ? R.anim.slide_in_left : R.anim.slide_in_right);
        ViewAnimator viewAnimator2 = this.X;
        viewAnimator2.setOutAnimation(viewAnimator2.getContext(), z2 ? R.anim.slide_out_right : R.anim.slide_out_left);
        this.X.showNext();
        this.T.a(goa.a(new a()));
        this.Y.setText(R.string.magiclink_request_sent_heading);
        if (LocalEmailValidator.a(this.ab.getText().toString()) == EmailValidation.VALID) {
            this.aa.setText(a((int) R.string.magiclink_request_sent_message, this.ab.getText()));
        } else {
            this.aa.setText(a((int) R.string.magiclink_request_sent_message_no_email));
        }
    }

    public final void ae() {
        this.Z.setText(R.string.magiclink_error_request_user_not_found);
    }

    public final void i(boolean z) {
        this.W.setEnabled(z);
    }

    public final void j(boolean z) {
        int i = 0;
        this.W.setVisibility(z ? 4 : 0);
        ProgressBar progressBar = this.ac;
        if (!z) {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    public final void af() {
        Intent a2 = gnp.a(o());
        if (a2 != null) {
            a(a2);
        }
    }
}
