package com.spotify.mobile.android.wrapped2019.stories.templates.decadetopsongtopartist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

public class YearView extends ConstraintLayout {
    private StackImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;

    public YearView(Context context) {
        super(context);
        b();
    }

    public YearView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public YearView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.decade_top_year_view, this);
        this.b = (StackImageView) ip.c((View) this, (int) R.id.decade_top_image_stack);
        this.c = (TextView) ip.c((View) this, (int) R.id.decade_top_year);
        this.d = (TextView) ip.c((View) this, (int) R.id.decade_top_song_label);
        this.e = (TextView) ip.c((View) this, (int) R.id.decade_top_song);
        this.f = (TextView) ip.c((View) this, (int) R.id.decade_top_artist_label);
        this.g = (TextView) ip.c((View) this, (int) R.id.decade_top_artist);
    }

    public final void a(Picasso picasso, kgl kgl) {
        this.c.setText(kgl.a());
        this.d.setText(kgl.b());
        this.e.setText(kgl.c());
        this.f.setText(kgl.e());
        this.g.setText(kgl.f());
        picasso.a(kgl.g()).a(this.b.c(0));
        picasso.a(kgl.d()).a(this.b.c(1));
    }
}
