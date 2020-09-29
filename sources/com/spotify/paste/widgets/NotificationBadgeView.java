package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.R;

public class NotificationBadgeView extends AppCompatTextView {
    private final int a;

    public NotificationBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteDefaultsNotificationBadgeStyle);
    }

    public NotificationBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        vgk.a(NotificationBadgeView.class, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.N, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(a.R, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(a.O);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.Q, 0);
        int integer = obtainStyledAttributes.getInteger(a.P, 99);
        obtainStyledAttributes.recycle();
        ip.a((View) this, drawable);
        vgl.a(context, this, resourceId);
        setMinWidth(dimensionPixelSize);
        setVisibility(8);
        this.a = integer;
    }
}
