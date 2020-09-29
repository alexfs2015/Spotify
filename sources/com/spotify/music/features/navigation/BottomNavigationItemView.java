package com.spotify.music.features.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.paste.graphics.drawable.BadgedDrawable;
import com.spotify.paste.graphics.drawable.BadgedDrawable.BadgePosition;
import com.spotify.paste.graphics.drawable.BadgedDrawable.a;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class BottomNavigationItemView extends LinearLayout implements uue {
    NavigationGroup a;
    public BottomTab b;
    boolean c;
    private TextView d;
    private ImageView e;
    private StateListDrawable f;
    private StateListDrawable g;
    private ColorStateList h;
    private String i;
    private boolean j;
    private final int k;
    private final uud l;

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i2) {
        super((Context) fay.a(context), attributeSet, i2);
        this.l = new uud(this);
        this.k = getResources().getDimensionPixelSize(R.dimen.bottom_navigation_item_max_width);
        uui.c(this).a();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (TextView) findViewById(R.id.bottom_navigation_item_title);
        this.e = (ImageView) findViewById(R.id.bottom_navigation_item_icon);
        this.h = fr.b(getContext(), (int) R.color.nav_tab_bar_items_color);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        if (this.c) {
            super.onMeasure(i2, i3);
        } else {
            super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i2), this.k), MeasureSpec.getMode(i2)), i3);
        }
    }

    public final void a(SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, float f2) {
        float b2 = (float) uts.b(f2, getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), (SpotifyIconV2) fay.a(spotifyIconV2), b2);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(getContext(), (SpotifyIconV2) fay.a(spotifyIconV22), b2);
        spotifyIconDrawable.a(this.h);
        spotifyIconDrawable2.a(this.h);
        this.f = new StateListDrawable();
        this.f.addState(new int[]{16843518}, spotifyIconDrawable2);
        this.f.addState(StateSet.WILD_CARD, spotifyIconDrawable);
        int i2 = ((int) b2) / 3;
        a aVar = new a();
        aVar.b = i2;
        aVar.c = i2;
        aVar.a = BadgePosition.TOP_RIGHT;
        aVar.e = uts.b(-1.0f, getResources());
        jqf jqf = new jqf(fr.c(getContext(), R.color.green), fr.c(getContext(), R.color.cat_grayscale_15), i2 / 4);
        BadgedDrawable badgedDrawable = new BadgedDrawable(spotifyIconDrawable, jqf, aVar);
        BadgedDrawable badgedDrawable2 = new BadgedDrawable(spotifyIconDrawable2, jqf, aVar);
        this.g = new StateListDrawable();
        this.g.addState(new int[]{16843518}, badgedDrawable2);
        this.g.addState(StateSet.WILD_CARD, badgedDrawable);
        a(this.j);
    }

    public final void a(boolean z) {
        this.j = z;
        this.e.setImageDrawable(z ? this.g : this.f);
    }

    public final void a(String str) {
        this.i = (String) fay.a(str);
    }

    public final void a(BottomTab bottomTab) {
        this.b = (BottomTab) fay.a(bottomTab);
    }

    public final void a(b bVar) {
        this.l.a(bVar);
    }

    public final b c() {
        return this.l.a;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.l.b();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.l.a();
        this.f.setState(getDrawableState());
        this.g.setState(getDrawableState());
    }

    public final void a(CharSequence charSequence) {
        this.d.setText(charSequence);
        this.e.setContentDescription(charSequence);
    }

    public final void a() {
        this.d.setVisibility(8);
    }
}
