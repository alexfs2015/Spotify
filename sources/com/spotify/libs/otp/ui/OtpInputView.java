package com.spotify.libs.otp.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.spotify.music.R;

public class OtpInputView extends FrameLayout {
    public a a;
    public fot<CharSequence> b;
    public int c;
    private final TextWatcher d = new b(this, 0);
    private final HiddenOtpEditText e;
    private final HorizontalScrollView f;
    private final ViewGroup g;
    private final Rect h = new Rect();
    private TextView[] i;
    private int j = -1;

    public interface a {
        void a();

        void a(boolean z);

        boolean b();
    }

    class b implements TextWatcher {
        private b() {
        }

        /* synthetic */ b(OtpInputView otpInputView, byte b) {
            this();
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 > i2) {
                OtpInputView.a(OtpInputView.this, charSequence.toString().substring(i2 + i, i + i3));
            }
        }
    }

    public OtpInputView(Context context) {
        super(context);
        LayoutInflater from = LayoutInflater.from(getContext());
        this.e = (HiddenOtpEditText) from.inflate(R.layout.otp_input_hidden, this, false);
        this.e.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                OtpInputView.this.a(view, z);
            }
        });
        this.e.addTextChangedListener(this.d);
        HiddenOtpEditText hiddenOtpEditText = this.e;
        hiddenOtpEditText.a = new com.spotify.libs.otp.ui.HiddenOtpEditText.a() {
            public final boolean onDelete(HiddenOtpEditText hiddenOtpEditText) {
                return OtpInputView.this.a(hiddenOtpEditText);
            }
        };
        gnp.a((TextView) hiddenOtpEditText, (defpackage.gnp.a) new defpackage.gnp.a() {
            public final boolean onDone() {
                return OtpInputView.this.h();
            }
        });
        this.f = (HorizontalScrollView) from.inflate(R.layout.otp_input_container, this, false);
        this.g = (ViewGroup) this.f.findViewById(R.id.input_container);
        addView(this.e);
        addView(this.f);
    }

    public OtpInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater from = LayoutInflater.from(getContext());
        this.e = (HiddenOtpEditText) from.inflate(R.layout.otp_input_hidden, this, false);
        this.e.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                OtpInputView.this.a(view, z);
            }
        });
        this.e.addTextChangedListener(this.d);
        HiddenOtpEditText hiddenOtpEditText = this.e;
        hiddenOtpEditText.a = new com.spotify.libs.otp.ui.HiddenOtpEditText.a() {
            public final boolean onDelete(HiddenOtpEditText hiddenOtpEditText) {
                return OtpInputView.this.a(hiddenOtpEditText);
            }
        };
        gnp.a((TextView) hiddenOtpEditText, (defpackage.gnp.a) new defpackage.gnp.a() {
            public final boolean onDone() {
                return OtpInputView.this.h();
            }
        });
        this.f = (HorizontalScrollView) from.inflate(R.layout.otp_input_container, this, false);
        this.g = (ViewGroup) this.f.findViewById(R.id.input_container);
        addView(this.e);
        addView(this.f);
    }

    public OtpInputView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater from = LayoutInflater.from(getContext());
        this.e = (HiddenOtpEditText) from.inflate(R.layout.otp_input_hidden, this, false);
        this.e.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                OtpInputView.this.a(view, z);
            }
        });
        this.e.addTextChangedListener(this.d);
        HiddenOtpEditText hiddenOtpEditText = this.e;
        hiddenOtpEditText.a = new com.spotify.libs.otp.ui.HiddenOtpEditText.a() {
            public final boolean onDelete(HiddenOtpEditText hiddenOtpEditText) {
                return OtpInputView.this.a(hiddenOtpEditText);
            }
        };
        gnp.a((TextView) hiddenOtpEditText, (defpackage.gnp.a) new defpackage.gnp.a() {
            public final boolean onDone() {
                return OtpInputView.this.h();
            }
        });
        this.f = (HorizontalScrollView) from.inflate(R.layout.otp_input_container, this, false);
        this.g = (ViewGroup) this.f.findViewById(R.id.input_container);
        addView(this.e);
        addView(this.f);
    }

    private Rect a(View view) {
        this.h.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        return this.h;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, View view) {
        d(i2);
    }

    private void a(int i2, String str) {
        boolean a2 = a();
        fbp.b(i2 >= 0 && i2 < this.c);
        fbp.a(this.i);
        this.i[i2].setText(str);
        if (a2 != a()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(!a2);
            }
            if (!a2 && g()) {
                a aVar2 = this.a;
                if (aVar2 != null) {
                    aVar2.b();
                }
                d(-1);
            }
        }
        fot<CharSequence> fot = this.b;
        if (fot != null) {
            fot.accept(d());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, boolean z) {
        if (!z) {
            d(-1);
        }
    }

    static /* synthetic */ void a(OtpInputView otpInputView, String str) {
        if (otpInputView.j >= 0 && str.matches("\\d")) {
            otpInputView.a(otpInputView.j, str);
            if (otpInputView.f() && !otpInputView.g()) {
                otpInputView.d(otpInputView.j + 1);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(HiddenOtpEditText hiddenOtpEditText) {
        int i2 = this.j;
        boolean z = false;
        if (i2 < 0) {
            return false;
        }
        if (i2 >= 0 && i2 < this.c) {
            z = true;
        }
        fbp.b(z);
        String str = " ";
        if (b(i2).equals(str)) {
            int i3 = this.j;
            if (i3 > 0) {
                d(i3 - 1);
            }
        } else {
            a(this.j, str);
        }
        return true;
    }

    private boolean c(int i2) {
        fbp.b(i2 >= 0 && i2 < this.c);
        fbp.a(this.i);
        return this.i[i2].getText().toString().matches("\\d");
    }

    private void d(int i2) {
        if (i2 >= 0) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a();
            }
        }
        fbp.b(i2 < this.c);
        if (i2 == this.j) {
            if (i2 >= 0 && isEnabled()) {
                gbx.a(this.e);
            }
            return;
        }
        fbp.a(this.i);
        if (f()) {
            this.i[this.j].setActivated(false);
        }
        if (i2 >= 0) {
            this.i[i2].setActivated(true);
        }
        this.j = i2;
        if (i2 >= 0) {
            gbx.a(this.e);
            this.f.requestChildRectangleOnScreen(this.g, a((View) this.i[i2]), false);
            return;
        }
        gbx.b(this.e);
    }

    private int e() {
        for (int i2 = 0; i2 < this.c; i2++) {
            if (!c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private boolean f() {
        return this.j >= 0;
    }

    private boolean g() {
        return f() && this.j == this.c - 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean h() {
        if (this.a == null || !a()) {
            return true;
        }
        ((a) fbp.a(this.a)).b();
        d(-1);
        return false;
    }

    public final void a(int i2) {
        fbp.b(i2 >= 0);
        if (this.c != i2) {
            LayoutInflater from = LayoutInflater.from(getContext());
            b();
            this.g.removeAllViews();
            this.i = new TextView[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                TextView textView = (TextView) from.inflate(R.layout.otp_input_field, this.g, false);
                textView.setActivated(false);
                textView.setText(" ");
                textView.setOnClickListener(new OnClickListener(i3) {
                    private final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        OtpInputView.this.a(this.f$1, view);
                    }
                });
                this.g.addView(textView);
                ((TextView[]) fbp.a(this.i))[i3] = textView;
            }
            this.c = i2;
        }
    }

    public final void a(Bundle bundle) {
        String str = "key-otp";
        if (bundle.containsKey(str)) {
            int i2 = bundle.getInt("num-digits");
            String[] stringArray = bundle.getStringArray(str);
            a(i2);
            fbp.b(stringArray.length == i2);
            for (int i3 = 0; i3 < i2; i3++) {
                a(i3, stringArray[i3]);
            }
        }
    }

    public final void a(boolean z) {
        int i2;
        int i3;
        TextView[] textViewArr;
        if (z) {
            i2 = R.drawable.bg_otp_input_field_mismatch;
            i3 = R.color.red;
        } else {
            i2 = R.drawable.bg_otp_input_field;
            i3 = R.color.white;
        }
        for (TextView textView : (TextView[]) fbp.a(this.i)) {
            textView.setTextColor(fr.c(getContext(), i3));
            textView.setBackgroundResource(i2);
        }
    }

    public final boolean a() {
        return this.c > 0 && e() < 0;
    }

    public String b(int i2) {
        fbp.b(i2 >= 0 && i2 < this.c);
        fbp.a(this.i);
        return this.i[i2].getText().toString();
    }

    public final void b() {
        for (int i2 = 0; i2 < this.c; i2++) {
            a(i2, " ");
        }
        d(-1);
    }

    public final void c() {
        if (isEnabled()) {
            int e2 = e();
            if (e2 >= 0) {
                d(e2);
            }
        }
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.c; i2++) {
            sb.append(b(i2));
        }
        return sb.toString();
    }

    public void setEnabled(boolean z) {
        fbp.b(this.c > 0);
        super.setEnabled(z);
        this.e.setEnabled(z);
        for (TextView enabled : (TextView[]) fbp.a(this.i)) {
            enabled.setEnabled(z);
        }
        if (z) {
            c();
        } else {
            d(-1);
        }
    }
}
