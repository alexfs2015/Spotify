package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.LoggingBehavior;
import com.spotify.music.R;

public class ProfilePictureView extends FrameLayout {
    private static String a = ProfilePictureView.class.getSimpleName();
    private String b;
    private int c = 0;
    private int d = 0;
    private boolean e = true;
    private Bitmap f;
    private ImageView g;
    private int h = -1;
    private amy i;
    private Bitmap j = null;

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
        a(attributeSet);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
        a(attributeSet);
    }

    private void a() {
        amy amy = this.i;
        if (amy != null) {
            amx.b(amy);
        }
        a(BitmapFactory.decodeResource(getResources(), this.e ? R.drawable.com_facebook_profile_picture_blank_square : R.drawable.com_facebook_profile_picture_blank_portrait));
    }

    private void a(int i2) {
        if (i2 == -4 || i2 == -3 || i2 == -2 || i2 == -1) {
            this.h = i2;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Must use a predefined preset size");
    }

    private void a(Context context) {
        removeAllViews();
        this.g = new ImageView(context);
        this.g.setLayoutParams(new LayoutParams(-1, -1));
        this.g.setScaleType(ScaleType.CENTER_INSIDE);
        addView(this.g);
    }

    private void a(Bitmap bitmap) {
        ImageView imageView = this.g;
        if (imageView != null && bitmap != null) {
            this.f = bitmap;
            imageView.setImageBitmap(bitmap);
        }
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f);
        a(obtainStyledAttributes.getInt(a.h, -1));
        this.e = obtainStyledAttributes.getBoolean(a.g, true);
        obtainStyledAttributes.recycle();
    }

    static /* synthetic */ void a(ProfilePictureView profilePictureView, amz amz) {
        if (amz.a == profilePictureView.i) {
            profilePictureView.i = null;
            Bitmap bitmap = amz.d;
            Exception exc = amz.b;
            if (exc != null) {
                and.a(LoggingBehavior.REQUESTS, 6, a, exc.toString());
            } else if (bitmap != null) {
                profilePictureView.a(bitmap);
                if (amz.c) {
                    profilePictureView.b(false);
                }
            }
        }
    }

    private void a(boolean z) {
        boolean b2 = b();
        String str = this.b;
        if (str == null || str.length() == 0 || (this.d == 0 && this.c == 0)) {
            a();
            return;
        }
        if (b2 || z) {
            b(true);
        }
    }

    private void b(boolean z) {
        a aVar = new a(getContext(), amy.a(this.b, this.d, this.c));
        aVar.d = z;
        aVar.e = this;
        aVar.c = new b() {
            public final void a(amz amz) {
                ProfilePictureView.a(ProfilePictureView.this, amz);
            }
        };
        amy a2 = aVar.a();
        amy amy = this.i;
        if (amy != null) {
            amx.b(amy);
        }
        this.i = a2;
        amx.a(a2);
    }

    private boolean b() {
        int height = getHeight();
        int width = getWidth();
        boolean z = false;
        if (width > 0 && height > 0) {
            int c2 = c(false);
            if (c2 != 0) {
                height = c2;
                width = height;
            }
            if (width <= height) {
                height = this.e ? width : 0;
            } else {
                width = this.e ? height : 0;
            }
            if (!(width == this.d && height == this.c)) {
                z = true;
            }
            this.d = width;
            this.c = height;
        }
        return z;
    }

    private int c(boolean z) {
        int i2 = this.h;
        int i3 = R.dimen.com_facebook_profilepictureview_preset_size_normal;
        if (i2 == -4) {
            i3 = R.dimen.com_facebook_profilepictureview_preset_size_large;
        } else if (i2 != -3) {
            if (i2 == -2) {
                i3 = R.dimen.com_facebook_profilepictureview_preset_size_small;
            } else if (i2 != -1 || !z) {
                return 0;
            }
        }
        return getResources().getDimensionPixelSize(i3);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        a(false);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = MeasureSpec.getSize(i3);
        int size2 = MeasureSpec.getSize(i2);
        if (MeasureSpec.getMode(i3) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = c(true);
            i3 = MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (MeasureSpec.getMode(i2) != 1073741824 && layoutParams.width == -2) {
            size2 = c(true);
            i2 = MeasureSpec.makeMeasureSpec(size2, 1073741824);
            z = true;
        }
        if (z) {
            setMeasuredDimension(size2, size);
            measureChildren(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.b = bundle.getString("ProfilePictureView_profileId");
        this.h = bundle.getInt("ProfilePictureView_presetSize");
        this.e = bundle.getBoolean("ProfilePictureView_isCropped");
        this.d = bundle.getInt("ProfilePictureView_width");
        this.c = bundle.getInt("ProfilePictureView_height");
        a(true);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.b);
        bundle.putInt("ProfilePictureView_presetSize", this.h);
        bundle.putBoolean("ProfilePictureView_isCropped", this.e);
        bundle.putInt("ProfilePictureView_width", this.d);
        bundle.putInt("ProfilePictureView_height", this.c);
        bundle.putBoolean("ProfilePictureView_refresh", this.i != null);
        return bundle;
    }
}
