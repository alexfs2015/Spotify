package com.spotify.mobile.android.wrapped2019.stories.templates.topgenres;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.R;
import java.util.List;

public class TopGenresView extends FrameLayout {
    public TopGenresView(Context context) {
        super(context);
    }

    public TopGenresView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopGenresView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(List<kih> list) {
        ((GenreBarView) ip.c((View) this, (int) R.id.genre_view_01)).a((kih) list.get(0));
    }

    public void b(List<kih> list) {
        a(list);
        ((GenreBarView) ip.c((View) this, (int) R.id.genre_view_02)).b((kih) list.get(1));
    }

    public void c(List<kih> list) {
        b(list);
        ((GenreBarView) ip.c((View) this, (int) R.id.genre_view_03)).b((kih) list.get(2));
    }

    public void d(List<kih> list) {
        c(list);
        ((GenreBarView) ip.c((View) this, (int) R.id.genre_view_04)).b((kih) list.get(3));
    }
}
