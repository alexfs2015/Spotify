package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;

@Deprecated
public class EmptyView extends LinearLayout {
    private static final int[] e = {16843161, 16843233, 16843087};
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final vhu d;
    private int f;

    public EmptyView(Context context) {
        this(context, null);
    }

    public EmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteDefaultsEmptyViewStyle);
    }

    /* JADX INFO: finally extract failed */
    public EmptyView(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        int i2;
        int i3;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i4 = i;
        super(context, attributeSet);
        vgk.a(EmptyView.class, this);
        setOrientation(1);
        setGravity(17);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, e, i4, 0);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        String string = obtainStyledAttributes.getString(1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, a.q, i4, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(a.x, 0);
        ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(a.y);
        int resourceId2 = obtainStyledAttributes2.getResourceId(a.u, 0);
        ColorStateList colorStateList2 = obtainStyledAttributes2.getColorStateList(a.v);
        int dimensionPixelOffset = obtainStyledAttributes2.getDimensionPixelOffset(a.s, 0);
        int dimensionPixelOffset2 = obtainStyledAttributes2.getDimensionPixelOffset(a.w, 0);
        int dimensionPixelOffset3 = obtainStyledAttributes2.getDimensionPixelOffset(a.r, 0);
        int i5 = dimensionPixelOffset2;
        this.f = obtainStyledAttributes2.getDimensionPixelSize(a.t, vfj.b(96.0f, getResources()));
        obtainStyledAttributes2.recycle();
        try {
            TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, new int[]{16842836}, i4, 0);
            drawable = obtainStyledAttributes3.getDrawable(0);
            obtainStyledAttributes3.recycle();
        } catch (NotFoundException unused) {
            obtainStyledAttributes2.recycle();
            drawable = null;
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
        inflate(context2, R.layout.paste_empty, this);
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.text);
        this.c = (ImageView) findViewById(R.id.image);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.accessory);
        this.d = new vhu(viewGroup);
        a((CharSequence) string);
        b(string2);
        a(drawable2);
        ip.a((View) this, drawable);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (((float) displayMetrics.widthPixels) / displayMetrics.density < 321.0f) {
            i3 = vfj.a(32.0f, getResources());
            i2 = vfj.a(16.0f, getResources());
        } else {
            i3 = vfj.a(48.0f, getResources());
            i2 = vfj.a(32.0f, getResources());
        }
        setPadding(i3, i2, i3, i2);
        if (resourceId != 0) {
            vgl.a(context2, this.a, resourceId);
        }
        if (resourceId2 != 0) {
            vgl.a(context2, this.b, resourceId2);
        }
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.b.setTextColor(colorStateList2);
        }
        if (dimensionPixelOffset > 0) {
            ((LayoutParams) this.c.getLayoutParams()).bottomMargin = dimensionPixelOffset;
        }
        if (i5 > 0) {
            ((LayoutParams) this.b.getLayoutParams()).topMargin = i5;
        }
        if (dimensionPixelOffset3 > 0) {
            ((LayoutParams) viewGroup.getLayoutParams()).topMargin = dimensionPixelOffset3;
        }
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            this.c.setVisibility(0);
            this.c.setImageDrawable(drawable);
            return;
        }
        this.c.setVisibility(8);
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.b.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.b.setText(charSequence);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.d.a();
        Drawable drawable = this.c.getDrawable();
        if (drawable != null) {
            int i3 = this.f;
            int round = Math.round(((float) i3) / (((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight())));
            this.c.getLayoutParams().width = i3;
            this.c.getLayoutParams().height = round;
        }
        super.onMeasure(i, i2);
    }
}
