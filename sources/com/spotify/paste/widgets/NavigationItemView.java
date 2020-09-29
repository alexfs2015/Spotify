package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class NavigationItemView extends FrameLayout {
    private static final int[] a = {16842914};
    private final SpotifyIconDrawable b;
    private final TextView c;

    public NavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (int) R.attr.pasteDefaultsNavigationItemStyle);
    }

    public NavigationItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, context.obtainStyledAttributes(attributeSet, a.F, i, 0));
    }

    private NavigationItemView(Context context, AttributeSet attributeSet, TypedArray typedArray) {
        super(context, attributeSet);
        uut.a(NavigationItemView.class, this);
        Drawable drawable = typedArray.getDrawable(a.G);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(a.H, 0);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(a.L, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(a.J, 0);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(a.K, -1);
        ColorStateList colorStateList = typedArray.getColorStateList(a.I);
        int resourceId = typedArray.getResourceId(a.M, 0);
        typedArray.recycle();
        ip.a((View) this, drawable);
        setMinimumHeight(dimensionPixelSize);
        setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        inflate(context, R.layout.paste_navigationitem, this);
        this.c = (TextView) findViewById(R.id.title);
        uuu.a(context, this.c, resourceId);
        this.c.setCompoundDrawablePadding(dimensionPixelSize2);
        this.c.setDuplicateParentStateEnabled(true);
        if (dimensionPixelSize3 < 0) {
            this.b = new SpotifyIconDrawable(context, SpotifyIcon.ALBUM_32);
        } else {
            this.b = new SpotifyIconDrawable(context, SpotifyIcon.ALBUM_32, (float) dimensionPixelSize3);
        }
        this.b.a(colorStateList);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        return super.onCreateDrawableState(i + 1);
    }
}
