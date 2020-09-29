package com.spotify.mobile.android.wrapped2019.stories.templates.topgenres;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.SuperscriptSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import java.text.NumberFormat;

public class GenreBarView extends ConstraintLayout {
    private TextView b;
    private TextView c;

    public GenreBarView(Context context) {
        super(context);
        d();
    }

    public GenreBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public GenreBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }

    private static int a(int i, Resources resources) {
        return (int) TypedValue.applyDimension(2, 13.0f, resources.getDisplayMetrics());
    }

    private static String a(float f) {
        return NumberFormat.getPercentInstance().format((double) (f / 100.0f));
    }

    private void a(String str) {
        this.b.setText(str);
    }

    private Spannable b(String str) {
        int indexOf = str.indexOf(37);
        int a = a(13, getResources());
        SpannableString spannableString = new SpannableString(str);
        int i = indexOf + 1;
        spannableString.setSpan(new SuperscriptSpan(), indexOf, i, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(a, false), indexOf, i, 33);
        return spannableString;
    }

    private void b(int i) {
        this.c.setText(b(a((float) i)));
    }

    private void d() {
        inflate(getContext(), R.layout.top_genres_genre_bar, this);
        this.b = (TextView) ip.d((View) this, (int) R.id.top_genre_bar_title);
        this.c = (TextView) ip.d((View) this, (int) R.id.top_genre_bar_percent_value);
        if (isInEditMode()) {
            a(klq.c().a("Metal").a(100).a());
        }
    }

    public final void a(klq klq) {
        a(klq.a());
        b(klq.b());
    }

    public final View b() {
        return (View) fbp.a(this.c);
    }

    public final TextView c() {
        return (TextView) fbp.a(this.b);
    }
}
