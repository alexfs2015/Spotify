package com.spotify.mobile.android.wrapped2019.stories.templates.stack;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.util.List;

public class StackImageView extends ConstraintLayout implements wgx {
    private List<ImageView> b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public StackImageView(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public StackImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public StackImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        setClipChildren(false);
        setClipToPadding(false);
        inflate(getContext(), R.layout.stacked_image_view, this);
        this.b = ImmutableList.a((ImageView) ip.d((View) this, (int) R.id.view_front), (ImageView) ip.d((View) this, (int) R.id.view_mid_front), (ImageView) ip.d((View) this, (int) R.id.mid_view), (ImageView) ip.d((View) this, (int) R.id.view_mid_back), (ImageView) ip.d((View) this, (int) R.id.view_back));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.k, 0, 0);
        if (!obtainStyledAttributes.hasValue(a.o) || !obtainStyledAttributes.hasValue(a.n) || !obtainStyledAttributes.hasValue(a.m) || !obtainStyledAttributes.hasValue(a.l)) {
            throw new IllegalStateException("front/back imageWidth and front/back imageHeight need to be defined");
        }
        this.d = obtainStyledAttributes.getDimensionPixelSize(a.o, -1);
        this.c = obtainStyledAttributes.getDimensionPixelSize(a.n, -1);
        this.f = obtainStyledAttributes.getDimensionPixelSize(a.m, -1);
        this.e = obtainStyledAttributes.getDimensionPixelSize(a.l, -1);
        c(obtainStyledAttributes.getInt(a.q, 3));
        this.h = obtainStyledAttributes.getInt(a.p, 0);
        this.i = obtainStyledAttributes.getInt(a.r, 0);
        obtainStyledAttributes.recycle();
    }

    private void c(int i2) {
        if (i2 <= this.b.size()) {
            this.g = i2;
            int i3 = this.c - this.e;
            int i4 = this.d - this.f;
            for (int i5 = 0; i5 < this.b.size(); i5++) {
                View view = (View) this.b.get(i5);
                if (i5 < this.g) {
                    view.setVisibility(0);
                    LayoutParams layoutParams = view.getLayoutParams();
                    int i6 = this.c;
                    int i7 = this.g;
                    layoutParams.height = i6 - (i7 == 1 ? 0 : (i3 * i5) / (i7 - 1));
                    int i8 = this.d;
                    int i9 = this.g;
                    layoutParams.width = i8 - (i9 == 1 ? 0 : (i4 * i5) / (i9 - 1));
                    view.setLayoutParams(layoutParams);
                } else {
                    view.setVisibility(8);
                }
            }
            postInvalidate();
            return;
        }
        String str = "arstecn tfksiurheeae ine covemntrs osnta    wabgb";
        throw new IllegalArgumentException("stack size cannot be greater than number of views");
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fbp.a(!bitmap.isRecycled());
        for (ImageView imageBitmap : this.b) {
            imageBitmap.setImageBitmap(bitmap);
        }
        fbp.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
    }

    public final ImageView b(int i2) {
        return (ImageView) this.b.get(i2);
    }

    public final void b(Drawable drawable) {
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = (i4 - i2) - this.d;
        int i7 = (i5 - i3) - this.c;
        for (int i8 = 0; i8 < this.g; i8++) {
            View view = (View) this.b.get(i8);
            LayoutParams layoutParams = view.getLayoutParams();
            int i9 = (this.c - layoutParams.height) / 2;
            int i10 = (this.d - layoutParams.width) / 2;
            int i11 = this.g;
            if (i11 == 1) {
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
            } else {
                int i12 = this.h;
                if (i12 == 0) {
                    view.setTranslationX(0.0f);
                } else {
                    view.setTranslationX((float) ((((-i6) / 2) + i10 + ((i6 * i8) / (i11 - 1))) * i12));
                }
                int i13 = this.i;
                if (i13 == 0) {
                    view.setTranslationY(0.0f);
                } else {
                    view.setTranslationY((float) ((((-i7) / 2) + i9 + ((i7 * i8) / (this.g - 1))) * i13));
                }
            }
        }
        super.onLayout(z, i2, i3, i4, i5);
    }
}
