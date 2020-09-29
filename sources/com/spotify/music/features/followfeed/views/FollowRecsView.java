package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.music.R;

public class FollowRecsView extends LinearLayout {
    public TextView a;
    public RecyclerView b;
    public msh c;
    private View d;

    public interface a {
        void a(String str);

        void b(String str);
    }

    public FollowRecsView(Context context) {
        super(context);
        a();
    }

    public FollowRecsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public FollowRecsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.d = inflate(getContext(), R.layout.follow_recs_feed_item, this);
        this.d.setLayoutParams(new LayoutParams(-1, -2));
        this.a = (TextView) ip.c(this.d, (int) R.id.section_title);
        this.b = (RecyclerView) ip.c(this.d, (int) R.id.recycler_view);
        RecyclerView recyclerView = this.b;
        getContext();
        recyclerView.a((i) new LinearLayoutManager(0, false));
        this.b.q = true;
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.follow_recs_space_start_and_end);
        final int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.follow_recs_margin_middle);
        this.b.a((h) new h() {
            public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
                int e = RecyclerView.e(view);
                if (e != -1) {
                    i d = recyclerView.d();
                    if (d != null) {
                        rect.set(e == 0 ? dimensionPixelSize : dimensionPixelSize2, 0, e == d.t() + -1 ? dimensionPixelSize : dimensionPixelSize2, 0);
                    }
                }
            }
        });
    }
}
