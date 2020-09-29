package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.R;
import java.util.List;

public class PivotContainerView extends FrameLayout implements tff, tfj {
    public PivotListView a;
    private View b;
    private View c;

    public PivotContainerView(Context context) {
        this(context, null);
    }

    public PivotContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PivotContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.driving_pivot_container_view, this);
        this.b = findViewById(R.id.pivot_offline_view);
        this.c = findViewById(R.id.pivot_loading_view);
        this.a = (PivotListView) findViewById(R.id.pivot_list_view);
    }

    public final void a(List<tfg> list, int i) {
        this.a.a(list, i);
    }

    public final void a(a aVar) {
        this.a.P = aVar;
    }

    public final void f_(boolean z) {
        this.a.c(z);
    }

    public final void a() {
        this.b.setVisibility(0);
        this.c.setVisibility(4);
        this.a.setVisibility(4);
    }

    public final void b() {
        this.b.setVisibility(4);
        this.c.setVisibility(0);
        this.a.setVisibility(4);
    }

    public final void c() {
        this.b.setVisibility(4);
        this.c.setVisibility(4);
        this.a.setVisibility(0);
    }
}
