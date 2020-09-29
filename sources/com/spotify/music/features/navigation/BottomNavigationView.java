package com.spotify.music.features.navigation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.LinearLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import java.util.ArrayList;
import java.util.List;

public class BottomNavigationView extends LinearLayout {
    public final List<BottomNavigationItemView> a = new ArrayList(5);
    public boolean b;
    private final float c = TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
    private BottomNavigationItemView d;
    private Paint e;

    public BottomNavigationView(Context context) {
        super(context);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private boolean a() {
        return this.b || getResources().getBoolean(R.bool.show_bottom_navigation_items_text);
    }

    public final BottomNavigationItemView a(NavigationGroup navigationGroup, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, BottomTab bottomTab, int i, int i2, int i3) {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) LayoutInflater.from(getContext()).inflate(i3, this, false);
        bottomNavigationItemView.a = navigationGroup;
        bottomNavigationItemView.a(bottomTab.mViewUri.toString());
        bottomNavigationItemView.a(bottomTab);
        bottomNavigationItemView.c = this.b;
        String string = getResources().getString(i);
        if (a()) {
            bottomNavigationItemView.a(spotifyIconV2, spotifyIconV22, 24.0f);
            bottomNavigationItemView.a((CharSequence) string);
        } else {
            bottomNavigationItemView.a(spotifyIconV2, spotifyIconV22, 26.0f);
            bottomNavigationItemView.a();
            bottomNavigationItemView.setOnLongClickListener(new gac());
        }
        bottomNavigationItemView.setId(i2);
        bottomNavigationItemView.setContentDescription(string);
        this.a.add(bottomNavigationItemView);
        addView(bottomNavigationItemView);
        int dimension = getChildCount() == 3 ? (int) getResources().getDimension(R.dimen.bottom_navigation_padding) : 0;
        setPadding(dimension, 0, dimension, 0);
        return bottomNavigationItemView;
    }

    public final BottomTab a(BottomTab bottomTab) {
        fbp.a(bottomTab);
        BottomNavigationItemView b2 = b(bottomTab);
        if (b2 == null) {
            Logger.d("Tab %s is not present in navigation bar. Can't be set to active", bottomTab);
            BottomNavigationItemView bottomNavigationItemView = this.d;
            return bottomNavigationItemView != null ? bottomNavigationItemView.b : BottomTab.UNKNOWN;
        }
        BottomNavigationItemView bottomNavigationItemView2 = this.d;
        if (bottomNavigationItemView2 != null) {
            bottomNavigationItemView2.setActivated(false);
        }
        b2.setActivated(true);
        this.d = b2;
        return bottomTab;
    }

    public final boolean a(BottomTab bottomTab, OnLongClickListener onLongClickListener) {
        BottomNavigationItemView b2 = b(bottomTab);
        if (b2 == null) {
            return false;
        }
        b2.setOnLongClickListener(onLongClickListener);
        return true;
    }

    public BottomNavigationItemView b(BottomTab bottomTab) {
        for (BottomNavigationItemView bottomNavigationItemView : this.a) {
            if (bottomTab == bottomNavigationItemView.b) {
                return bottomNavigationItemView;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect((float) getLeft(), (float) getTop(), (float) getRight(), ((float) getTop()) + this.c, this.e);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.e = new Paint();
        this.e.setColor(fr.c(getContext(), R.color.cat_grayscale_8));
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }
}
