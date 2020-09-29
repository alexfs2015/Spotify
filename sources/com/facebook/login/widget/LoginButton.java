package com.facebook.login.widget;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.ToolTipPopup.Style;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;

public class LoginButton extends ajz {
    /* access modifiers changed from: 0000 */
    public a b = new a();
    /* access modifiers changed from: private */
    public boolean c;
    private String d;
    private String e;
    /* access modifiers changed from: private */
    public String f = "fb_login_view_usage";
    private boolean g;
    private Style h = Style.BLUE;
    private ToolTipMode i;
    private long j = 6000;
    private ToolTipPopup k;
    private ajx l;

    /* renamed from: com.facebook.login.widget.LoginButton$3 reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[ToolTipMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.facebook.login.widget.LoginButton$ToolTipMode[] r0 = com.facebook.login.widget.LoginButton.ToolTipMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.login.widget.LoginButton$ToolTipMode r1 = com.facebook.login.widget.LoginButton.ToolTipMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.login.widget.LoginButton$ToolTipMode r1 = com.facebook.login.widget.LoginButton.ToolTipMode.DISPLAY_ALWAYS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.login.widget.LoginButton$ToolTipMode r1 = com.facebook.login.widget.LoginButton.ToolTipMode.NEVER_DISPLAY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.LoginButton.AnonymousClass3.<clinit>():void");
        }
    }

    public enum ToolTipMode {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static ToolTipMode d;
        int intValue;
        private String stringValue;

        static {
            ToolTipMode toolTipMode;
            d = toolTipMode;
        }

        public static ToolTipMode a(int i) {
            ToolTipMode[] values;
            for (ToolTipMode toolTipMode : values()) {
                if (toolTipMode.intValue == i) {
                    return toolTipMode;
                }
            }
            return null;
        }

        private ToolTipMode(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public final String toString() {
            return this.stringValue;
        }
    }

    static class a {
        DefaultAudience a = DefaultAudience.FRIENDS;
        List<String> b = Collections.emptyList();
        LoginBehavior c = LoginBehavior.NATIVE_WITH_FALLBACK;
        String d = "rerequest";

        a() {
        }
    }

    public class b implements OnClickListener {
        protected b() {
        }

        public void onClick(View view) {
            String str;
            LoginButton.this.a(view);
            aju a2 = aju.a();
            int i = 0;
            if (aju.b()) {
                Context context = LoginButton.this.getContext();
                final ank a3 = a();
                if (LoginButton.this.c) {
                    String string = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_log_out_action);
                    String string2 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_cancel_action);
                    aki a4 = aki.a();
                    if (a4 == null || a4.a == null) {
                        str = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                    } else {
                        str = String.format(LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_as), new Object[]{a4.a});
                    }
                    Builder builder = new Builder(context);
                    builder.setMessage(str).setCancelable(true).setPositiveButton(string, new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            a3.c();
                        }
                    }).setNegativeButton(string2, null);
                    builder.create().show();
                } else {
                    a3.c();
                }
            } else {
                a().c(LoginButton.this.c(), LoginButton.this.b.b);
            }
            akw akw = new akw(LoginButton.this.getContext());
            Bundle bundle = new Bundle();
            if (a2 == null) {
                i = 1;
            }
            bundle.putInt("logging_in", i);
            bundle.putInt("access_token_expired", aju.b() ? 1 : 0);
            akw.b(LoginButton.this.f, bundle);
        }

        /* access modifiers changed from: protected */
        public ank a() {
            ank b = ank.b();
            b.c = LoginButton.this.f();
            b.b = LoginButton.this.b.c;
            b.d = LoginButton.this.b.d;
            return b;
        }
    }

    public final int d() {
        return R.style.com_facebook_loginview_default_style;
    }

    static {
        LoginButton.class.getName();
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public final DefaultAudience f() {
        return this.b.a;
    }

    private void g() {
        ToolTipPopup toolTipPopup = this.k;
        if (toolTipPopup != null) {
            toolTipPopup.b();
            this.k = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajx ajx = this.l;
        if (ajx != null && !ajx.c) {
            this.l.a();
            h();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.g && !isInEditMode()) {
            this.g = true;
            int i2 = AnonymousClass3.a[this.i.ordinal()];
            if (i2 == 1) {
                final String a2 = amw.a(getContext());
                akc.e().execute(new Runnable() {
                    public final void run() {
                        final amg a2 = FetchedAppSettingsManager.a(a2, false);
                        LoginButton.this.c().runOnUiThread(new Runnable() {
                            public final void run() {
                                LoginButton.a(LoginButton.this, a2);
                            }
                        });
                    }
                });
            } else if (i2 == 2) {
                b(getResources().getString(R.string.com_facebook_tooltip_default));
            }
        }
    }

    private void b(String str) {
        this.k = new ToolTipPopup(str, this);
        ToolTipPopup toolTipPopup = this.k;
        toolTipPopup.d = this.h;
        toolTipPopup.e = this.j;
        toolTipPopup.a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        h();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ajx ajx = this.l;
        if (ajx != null && ajx.c) {
            ajx.b.a(ajx.a);
            ajx.c = false;
        }
        g();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 != 0) {
            g();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        super.a(context, attributeSet, i2, i3);
        this.a = e();
        this.i = ToolTipMode.d;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.ano.a.a, i2, i3);
        try {
            this.c = obtainStyledAttributes.getBoolean(defpackage.ano.a.b, true);
            this.d = obtainStyledAttributes.getString(defpackage.ano.a.c);
            this.e = obtainStyledAttributes.getString(defpackage.ano.a.d);
            this.i = ToolTipMode.a(obtainStyledAttributes.getInt(defpackage.ano.a.e, ToolTipMode.d.intValue));
            obtainStyledAttributes.recycle();
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(R.color.com_facebook_blue));
                this.d = "Continue with Facebook";
            } else {
                this.l = new ajx() {
                    public final void a(aju aju) {
                        LoginButton.this.h();
                    }
                };
            }
            h();
            setCompoundDrawablesWithIntrinsicBounds(ab.b(getContext(), R.drawable.com_facebook_button_login_logo), null, null, null);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public b e() {
        return new b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
        Resources resources = getResources();
        String str = this.d;
        if (str == null) {
            str = resources.getString(R.string.com_facebook_loginview_log_in_button_continue);
            int c2 = c(str);
            if (resolveSize(c2, i2) < c2) {
                str = resources.getString(R.string.com_facebook_loginview_log_in_button);
            }
        }
        int c3 = c(str);
        String str2 = this.e;
        if (str2 == null) {
            str2 = resources.getString(R.string.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(resolveSize(Math.max(c3, c(str2)), i2), compoundPaddingTop);
    }

    private int c(String str) {
        return getCompoundPaddingLeft() + getCompoundDrawablePadding() + a(str) + getCompoundPaddingRight();
    }

    /* access modifiers changed from: private */
    public void h() {
        Resources resources = getResources();
        if (isInEditMode() || !aju.b()) {
            String str = this.d;
            if (str != null) {
                setText(str);
                return;
            }
            String string = resources.getString(R.string.com_facebook_loginview_log_in_button_continue);
            int width = getWidth();
            if (width != 0 && c(string) > width) {
                string = resources.getString(R.string.com_facebook_loginview_log_in_button);
            }
            setText(string);
            return;
        }
        String str2 = this.e;
        if (str2 == null) {
            str2 = resources.getString(R.string.com_facebook_loginview_log_out_button);
        }
        setText(str2);
    }

    public final int a() {
        return RequestCodeOffset.Login.a();
    }

    static /* synthetic */ void a(LoginButton loginButton, amg amg) {
        if (amg != null && amg.c && loginButton.getVisibility() == 0) {
            loginButton.b(amg.b);
        }
    }
}
