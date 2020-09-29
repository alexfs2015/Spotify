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

/* renamed from: gnz reason: default package */
public final class gnz<H extends Parcelable, V> implements b {
    gnx<H, V> a;
    OtpInputView b;
    TextView c;
    TextView d;
    View e;
    private ViewGroup f;
    private TextView g;
    private TextView h;

    /* renamed from: gnz$a */
    class a extends c {
        private a() {
        }

        /* synthetic */ a(gnz gnz, byte b) {
            this();
        }

        public final void a(Bundle bundle) {
            OtpInputView otpInputView = (OtpInputView) fbp.a(gnz.this.b);
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
                ((OtpInputView) fbp.a(gnz.this.b)).a(bundle);
            }
        }
    }

    public gnz(com.spotify.mobile.android.util.ui.Lifecycle.a aVar) {
        aVar.a(new a(this, 0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        gnx gnx = (gnx) fbp.a(this.a);
        gnx.b.o();
        ((c) fbp.a(gnx.c)).b();
    }

    private void b() {
        ((View) fbp.a(this.e)).setEnabled(c() && ((OtpInputView) fbp.a(this.b)).a() && !d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        ((gnx) fbp.a(this.a)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        OtpInputView otpInputView = (OtpInputView) fbp.a(this.b);
        this.a.a((String) fbp.a(!otpInputView.a() ? null : otpInputView.d()));
    }

    private boolean c() {
        return ((OtpInputView) fbp.a(this.b)).isEnabled();
    }

    private boolean d() {
        return ((TextView) fbp.a(this.d)).getVisibility() == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((OtpInputView) fbp.a(this.b)).c();
    }

    public final int a() {
        return R.id.validate_otp;
    }

    public final void a(ViewGroup viewGroup) {
        fbp.a(this.a);
        fbp.b(this.f == null);
        this.f = (ViewGroup) fbp.a(viewGroup);
        this.b = (OtpInputView) fbp.a(viewGroup.findViewById(R.id.otp_input));
        this.c = (TextView) fbp.a(viewGroup.findViewById(R.id.otp_description));
        this.d = (TextView) fbp.a(viewGroup.findViewById(R.id.otp_mismatch));
        this.e = (View) fbp.a(viewGroup.findViewById(R.id.validate_otp_button));
        this.g = (TextView) fbp.a(viewGroup.findViewById(R.id.resend_sms));
        this.h = (TextView) fbp.a(viewGroup.findViewById(R.id.edit_phone_number));
        gno.a((TextView) fbp.a(this.g), SpotifyIconV2.MESSAGES);
        gno.a((TextView) fbp.a(this.h), SpotifyIconV2.EDIT);
        ((View) fbp.a(this.e)).setEnabled(false);
        this.e.setOnClickListener(new $$Lambda$gnz$L5wqCaCYdQyEuemjtr_2QsyOtE(this));
        ((TextView) fbp.a(this.g)).setOnClickListener(new $$Lambda$gnz$n14Xt9RIENTaTmYlpmAtWV9lJ8(this));
        ((TextView) fbp.a(this.h)).setOnClickListener(new $$Lambda$gnz$orsojkSwpsS2aUu39ANJa4TlJk(this));
        ((OtpInputView) fbp.a(this.b)).a = new com.spotify.libs.otp.ui.OtpInputView.a() {
            public final void a() {
                gnz.this.d(false);
            }

            public final void a(boolean z) {
                ((View) fbp.a(gnz.this.e)).setEnabled(z);
            }

            public final boolean b() {
                return gaw.a((View) fbp.a(gnz.this.e));
            }
        };
    }

    public final void a(boolean z) {
        ((OtpInputView) fbp.a(this.b)).b();
        AnimatorHelper.a((View) fbp.a(this.f), z, new $$Lambda$gnz$dUlW8rSyMsbZquA07nUBcYB7pc(this));
        gnx gnx = (gnx) fbp.a(this.a);
        OtpInputView otpInputView = (OtpInputView) fbp.a(this.b);
        if (otpInputView.b == null) {
            otpInputView.b = fot.a();
        }
        gnx.a(otpInputView.b.f());
    }

    public final void b(boolean z) {
        ((gnx) fbp.a(this.a)).a.bd_();
        AnimatorHelper.a((View) fbp.a(this.f), z);
    }

    public final void c(boolean z) {
        ((OtpInputView) fbp.a(this.b)).setEnabled(z);
        ((TextView) fbp.a(this.g)).setEnabled(z);
        ((TextView) fbp.a(this.h)).setEnabled(z);
        b();
    }

    public final void d(boolean z) {
        ((OtpInputView) fbp.a(this.b)).a(z);
        int i = 0;
        ((TextView) fbp.a(this.d)).setVisibility(z ? 0 : 8);
        TextView textView = (TextView) fbp.a(this.c);
        if (z) {
            i = 8;
        }
        textView.setVisibility(i);
        b();
    }
}
