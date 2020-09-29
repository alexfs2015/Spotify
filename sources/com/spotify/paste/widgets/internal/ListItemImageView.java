package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.appcompat.widget.AppCompatImageView;

public final class ListItemImageView extends AppCompatImageView {
    public ListItemImageView(Context context) {
        super(context);
        a(getDrawable() != null);
    }

    public ListItemImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(getDrawable() != null);
    }

    public ListItemImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(getDrawable() != null);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), MeasureSpec.makeMeasureSpec(min, 1073741824));
    }

    private void a(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public final void setImageDrawable(Drawable drawable) {
        a(drawable != null);
        super.setImageDrawable(drawable);
    }

    public final void setImageResource(int i) {
        a(i != 0);
        super.setImageResource(i);
    }

    public final void setImageURI(Uri uri) {
        a(uri != null && !uri.equals(Uri.EMPTY));
        super.setImageURI(uri);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        a(bitmap != null);
        super.setImageBitmap(bitmap);
    }
}
