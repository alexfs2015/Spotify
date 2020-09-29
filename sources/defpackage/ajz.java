package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: ajz reason: default package */
public abstract class ajz extends Button {
    /* access modifiers changed from: protected */
    public OnClickListener a;
    private String b;
    private String c;
    /* access modifiers changed from: private */
    public OnClickListener d;
    private boolean e;
    private int f;
    private int g;

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public int d() {
        return 0;
    }

    protected ajz(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, 0);
        int d2 = d();
        if (d2 == 0) {
            d2 = R.style.com_facebook_button;
        }
        a(context, attributeSet, i, d2);
        this.b = str;
        this.c = str2;
        setClickable(true);
        setFocusable(true);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public int b() {
        return a();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            new akw(getContext()).a(this.b);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if ((getGravity() & 1) != 0) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int compoundPaddingRight = getCompoundPaddingRight();
            int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - a(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
            this.f = compoundPaddingLeft - min;
            this.g = compoundPaddingRight + min;
            this.e = true;
        }
        super.onDraw(canvas);
        this.e = false;
    }

    public int getCompoundPaddingLeft() {
        if (this.e) {
            return this.f;
        }
        return super.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (this.e) {
            return this.g;
        }
        return super.getCompoundPaddingRight();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Activity c() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L_0x0018:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "Unable to get Activity."
            r0.<init>(r1)
            goto L_0x0021
        L_0x0020:
            throw r0
        L_0x0021:
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajz.c():android.app.Activity");
    }

    /* access modifiers changed from: protected */
    public final int a(String str) {
        return (int) Math.ceil((double) getPaint().measureText(str));
    }

    public final void a(View view) {
        OnClickListener onClickListener = this.d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(fr.c(context, R.color.com_facebook_blue));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
        try {
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes2.getResourceId(0, 0), obtainStyledAttributes2.getResourceId(1, 0), obtainStyledAttributes2.getResourceId(2, 0), obtainStyledAttributes2.getResourceId(3, 0));
            setCompoundDrawablePadding(obtainStyledAttributes2.getDimensionPixelSize(4, 0));
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
            try {
                setPadding(obtainStyledAttributes3.getDimensionPixelSize(0, 0), obtainStyledAttributes3.getDimensionPixelSize(1, 0), obtainStyledAttributes3.getDimensionPixelSize(2, 0), obtainStyledAttributes3.getDimensionPixelSize(3, 0));
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
                try {
                    setTextColor(obtainStyledAttributes4.getColorStateList(0));
                    obtainStyledAttributes4.recycle();
                    TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
                    try {
                        setGravity(obtainStyledAttributes5.getInt(0, 17));
                        obtainStyledAttributes5.recycle();
                        TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                        try {
                            setTextSize(0, (float) obtainStyledAttributes6.getDimensionPixelSize(0, 0));
                            setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes6.getInt(1, 1)));
                            setText(obtainStyledAttributes6.getString(2));
                            obtainStyledAttributes6.recycle();
                            super.setOnClickListener(new OnClickListener() {
                                public final void onClick(View view) {
                                    ajz ajz = ajz.this;
                                    new akw(ajz.getContext()).a(ajz.c);
                                    if (ajz.this.a != null) {
                                        ajz.this.a.onClick(view);
                                        return;
                                    }
                                    if (ajz.this.d != null) {
                                        ajz.this.d.onClick(view);
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            obtainStyledAttributes6.recycle();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        obtainStyledAttributes5.recycle();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    obtainStyledAttributes4.recycle();
                    throw th3;
                }
            } catch (Throwable th4) {
                obtainStyledAttributes3.recycle();
                throw th4;
            }
        } catch (Throwable th5) {
            obtainStyledAttributes2.recycle();
            throw th5;
        }
    }
}
