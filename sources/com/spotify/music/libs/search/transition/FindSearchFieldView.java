package com.spotify.music.libs.search.transition;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class FindSearchFieldView extends FrameLayout {
    public static final Property<FindSearchFieldView, Float> e = new Property<FindSearchFieldView, Float>(Float.class, "fraction") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(((FindSearchFieldView) obj).a);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            FindSearchFieldView findSearchFieldView = (FindSearchFieldView) obj;
            float floatValue = ((Float) obj2).floatValue();
            findSearchFieldView.a = uun.a(0.0f, 1.0f, floatValue);
            findSearchFieldView.c.setLevel((int) (findSearchFieldView.a * 255.0f));
            findSearchFieldView.b.setAlpha(1.0f - floatValue);
            shq shq = findSearchFieldView.c;
            shq.b.setColor(findSearchFieldView.d.interpolate(floatValue));
            ip.d(findSearchFieldView);
        }
    };
    /* access modifiers changed from: 0000 */
    public float a;
    final TextView b;
    final shq c;
    final uux d;

    public FindSearchFieldView(Context context) {
        this(context, null);
    }

    public FindSearchFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        int c2 = fr.c(context, R.color.white);
        this.d = uuy.a(c2, gd.a(fr.c(context, R.color.cat_grayscale_55_40), fr.c(context, R.color.cat_grayscale_15)));
        setLayoutParams(new LayoutParams(-1, uts.b(56.0f, resources), 1.0f));
        int a2 = uts.a(4.0f, resources);
        this.c = new shq(a2, a2, c2);
        ip.a((View) this, (Drawable) this.c);
        this.b = fzz.a(context);
        uuu.b(context, this.b, R.attr.pasteTextAppearanceArticleLead);
        this.b.setTextColor(fr.c(context, R.color.gray_25));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int i = a2 << 1;
        layoutParams.setMargins(i, 0, i, 0);
        this.b.setLayoutParams(layoutParams);
        this.b.setGravity(17);
        this.b.setEllipsize(TruncateAt.END);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SEARCH, resources.getDimension(R.dimen.actionbar_search_drawables_size));
        spotifyIconDrawable.a(fr.c(context, R.color.black_90));
        this.b.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, null, null, null);
        this.b.setCompoundDrawablePadding(resources.getDimensionPixelSize(R.dimen.actionbar_search_drawables_padding));
        this.b.setMaxLines(1);
        addView(this.b);
        setId(R.id.find_search_field);
    }

    public final String a() {
        return this.b.getText().toString();
    }

    public final void a(String str) {
        this.b.setText(str);
    }

    public final String b() {
        if (this.b.getContentDescription() != null) {
            return this.b.getContentDescription().toString();
        }
        return a();
    }

    public final void b(String str) {
        this.b.setContentDescription(str);
    }
}
