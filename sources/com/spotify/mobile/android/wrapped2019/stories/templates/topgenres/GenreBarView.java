package com.spotify.mobile.android.wrapped2019.stories.templates.topgenres;

import android.content.Context;
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
        b();
    }

    public GenreBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public GenreBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        if (isInEditMode()) {
            inflate(getContext(), R.layout.top_genres_genre_bar_view, this);
            this.b = (TextView) ip.c((View) this, (int) R.id.title);
            this.c = (TextView) ip.c((View) this, (int) R.id.percent_value);
        }
    }

    private void b(int i) {
        inflate(getContext(), i, this);
        this.b = (TextView) ip.c((View) this, (int) R.id.title);
        this.c = (TextView) ip.c((View) this, (int) R.id.percent_value);
    }

    public final void a(kih kih) {
        b((int) R.layout.top_genres_favorite_genre_bar);
        a(kih.a());
        String format = NumberFormat.getPercentInstance().format((double) (((float) kih.b()) / 100.0f));
        int indexOf = format.indexOf(37);
        int applyDimension = (int) TypedValue.applyDimension(2, 13.0f, getResources().getDisplayMetrics());
        SpannableString spannableString = new SpannableString(format);
        int i = indexOf + 1;
        spannableString.setSpan(new SuperscriptSpan(), indexOf, i, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(applyDimension, false), indexOf, i, 33);
        this.c.setText(spannableString);
    }

    public final void b(kih kih) {
        b((int) R.layout.top_genres_genre_bar_view);
        a(kih.a());
    }

    private void a(String str) {
        this.b.setText(str);
    }
}
