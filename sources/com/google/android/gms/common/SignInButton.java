package com.google.android.gms.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.spotify.music.R;

public final class SignInButton extends FrameLayout implements OnClickListener {
    private int a;
    private int b;
    private View c;
    private OnClickListener d;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.a, 0, 0);
        try {
            this.a = obtainStyledAttributes.getInt(a.b, 0);
            this.b = obtainStyledAttributes.getInt(a.c, 2);
            obtainStyledAttributes.recycle();
            int i2 = this.a;
            int i3 = this.b;
            this.a = i2;
            this.b = i3;
            Context context2 = getContext();
            View view = this.c;
            if (view != null) {
                removeView(view);
            }
            try {
                this.c = bxb.a(context2, this.a, this.b);
            } catch (RemoteCreatorException unused) {
                int i4 = this.a;
                int i5 = this.b;
                SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context2);
                Resources resources = context2.getResources();
                signInButtonImpl.setTypeface(Typeface.DEFAULT_BOLD);
                signInButtonImpl.setTextSize(14.0f);
                int i6 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
                signInButtonImpl.setMinHeight(i6);
                signInButtonImpl.setMinWidth(i6);
                int a2 = SignInButtonImpl.a(i5, R.drawable.common_google_signin_btn_icon_dark, R.drawable.common_google_signin_btn_icon_light, R.drawable.common_google_signin_btn_icon_light);
                int a3 = SignInButtonImpl.a(i5, R.drawable.common_google_signin_btn_text_dark, R.drawable.common_google_signin_btn_text_light, R.drawable.common_google_signin_btn_text_light);
                String str = "Unknown button size: ";
                if (i4 == 0 || i4 == 1) {
                    a2 = a3;
                } else if (i4 != 2) {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append(str);
                    sb.append(i4);
                    throw new IllegalStateException(sb.toString());
                }
                Drawable f = gm.f(resources.getDrawable(a2));
                gm.a(f, resources.getColorStateList(R.color.common_google_signin_btn_tint));
                gm.a(f, Mode.SRC_ATOP);
                signInButtonImpl.setBackgroundDrawable(f);
                signInButtonImpl.setTextColor((ColorStateList) bwx.a(resources.getColorStateList(SignInButtonImpl.a(i5, R.color.common_google_signin_btn_text_dark, R.color.common_google_signin_btn_text_light, R.color.common_google_signin_btn_text_light))));
                if (i4 == 0) {
                    signInButtonImpl.setText(resources.getString(R.string.common_signin_button_text));
                } else if (i4 == 1) {
                    signInButtonImpl.setText(resources.getString(R.string.common_signin_button_text_long));
                } else if (i4 == 2) {
                    signInButtonImpl.setText(null);
                } else {
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append(str);
                    sb2.append(i4);
                    throw new IllegalStateException(sb2.toString());
                }
                signInButtonImpl.setTransformationMethod(null);
                if (bzk.a(signInButtonImpl.getContext())) {
                    signInButtonImpl.setGravity(19);
                }
                this.c = signInButtonImpl;
            }
            addView(this.c);
            this.c.setEnabled(isEnabled());
            this.c.setOnClickListener(this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.d = onClickListener;
        View view = this.c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
    }

    public final void onClick(View view) {
        OnClickListener onClickListener = this.d;
        if (onClickListener != null && view == this.c) {
            onClickListener.onClick(this);
        }
    }
}
