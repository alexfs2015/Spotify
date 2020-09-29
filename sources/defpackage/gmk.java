package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.otp.ui.AnimatorHelper;
import com.spotify.libs.otp.ui.OtpInputView;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;

/* renamed from: gmk reason: default package */
public final class gmk<H extends Parcelable, V> implements b {
    gmi<H, V> a;
    OtpInputView b;
    TextView c;
    TextView d;
    View e;
    private ViewGroup f;
    private TextView g;
    private TextView h;

    /* renamed from: gmk$a */
    class a extends c {
        private a() {
        }

        /* synthetic */ a(gmk gmk, byte b) {
            this();
        }

        public final void a(Bundle bundle) {
            OtpInputView otpInputView = (OtpInputView) fay.a(gmk.this.b);
            if (otpInputView.c > 0) {
                String[] strArr = new String[otpInputView.c];
                for (int i = 0; i < otpInputView.c; i++) {
                    strArr[i] = otpInputView.b(i);
                }
                bundle.putStringArray("key-otp", strArr);
                bundle.putInt("num-digits", otpInputView.c);
            }
        }

        public final void b(Bundle bundle) {
            if (bundle != null) {
                ((OtpInputView) fay.a(gmk.this.b)).a(bundle);
            }
        }
    }

    public final int a() {
        return R.id.validate_otp;
    }

    public gmk(com.spotify.mobile.android.util.ui.Lifecycle.a aVar) {
        aVar.a(new a(this, 0));
    }

    public final void a(ViewGroup viewGroup) {
        fay.a(this.a);
        fay.b(this.f == null);
        this.f = (ViewGroup) fay.a(viewGroup);
        this.b = (OtpInputView) fay.a(viewGroup.findViewById(R.id.otp_input));
        this.c = (TextView) fay.a(viewGroup.findViewById(R.id.otp_description));
        this.d = (TextView) fay.a(viewGroup.findViewById(R.id.otp_mismatch));
        this.e = (View) fay.a(viewGroup.findViewById(R.id.validate_otp_button));
        this.g = (TextView) fay.a(viewGroup.findViewById(R.id.resend_sms));
        this.h = (TextView) fay.a(viewGroup.findViewById(R.id.edit_phone_number));
        glz.a((TextView) fay.a(this.g), SpotifyIconV2.MESSAGES);
        glz.a((TextView) fay.a(this.h), SpotifyIconV2.EDIT);
        ((View) fay.a(this.e)).setEnabled(false);
        this.e.setOnClickListener(new $$Lambda$gmk$FPqMlptLGNj7OhC9VVrdprxXmF8(this));
        ((TextView) fay.a(this.g)).setOnClickListener(new $$Lambda$gmk$S3nn3Y0AkQZgiK2qq13qilM1xVc(this));
        ((TextView) fay.a(this.h)).setOnClickListener(new $$Lambda$gmk$WiBUK8dhQBys14XDzLfgbb1dJuY(this));
        ((OtpInputView) fay.a(this.b)).a = new com.spotify.libs.otp.ui.OtpInputView.a() {
            public final void a(boolean z) {
                ((View) fay.a(gmk.this.e)).setEnabled(z);
            }

            public final void a() {
                gmk.this.d(false);
            }

            public final boolean b() {
                return gac.a((View) fay.a(gmk.this.e));
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        String str;
        gmi<H, V> gmi = this.a;
        OtpInputView otpInputView = (OtpInputView) fay.a(this.b);
        if (!otpInputView.a()) {
            str = null;
        } else {
            str = otpInputView.d();
        }
        gmi.a((String) fay.a(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        ((gmi) fay.a(this.a)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        gmi gmi = (gmi) fay.a(this.a);
        gmi.b.o();
        ((c) fay.a(gmi.c)).b();
    }

    public final void a(boolean z) {
        ((OtpInputView) fay.a(this.b)).b();
        AnimatorHelper.a((View) fay.a(this.f), z, new $$Lambda$gmk$3InBp5VVnaqsy5R8Hd9C5xs2oIQ(this));
        gmi gmi = (gmi) fay.a(this.a);
        OtpInputView otpInputView = (OtpInputView) fay.a(this.b);
        if (otpInputView.b == null) {
            otpInputView.b = fnz.a();
        }
        gmi.a(otpInputView.b.f());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((OtpInputView) fay.a(this.b)).c();
    }

    public final void b(boolean z) {
        ((gmi) fay.a(this.a)).a.bf_();
        AnimatorHelper.a((View) fay.a(this.f), z);
    }

    public final void c(boolean z) {
        ((OtpInputView) fay.a(this.b)).setEnabled(z);
        ((TextView) fay.a(this.g)).setEnabled(z);
        ((TextView) fay.a(this.h)).setEnabled(z);
        b();
    }

    public final void d(boolean z) {
        ((OtpInputView) fay.a(this.b)).a(z);
        int i = 0;
        ((TextView) fay.a(this.d)).setVisibility(z ? 0 : 8);
        TextView textView = (TextView) fay.a(this.c);
        if (z) {
            i = 8;
        }
        textView.setVisibility(i);
        b();
    }

    private void b() {
        ((View) fay.a(this.e)).setEnabled(c() && ((OtpInputView) fay.a(this.b)).a() && !d());
    }

    private boolean c() {
        return ((OtpInputView) fay.a(this.b)).isEnabled();
    }

    private boolean d() {
        return ((TextView) fay.a(this.d)).getVisibility() == 0;
    }
}
