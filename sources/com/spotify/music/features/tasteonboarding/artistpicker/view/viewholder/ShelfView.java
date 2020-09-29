package com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.PageIndicator;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.ShelfGridRecyclerView;

public class ShelfView extends ConstraintLayout {
    public TextView b;
    public ShelfGridRecyclerView c;
    public PageIndicator d;
    public qth e;
    public a f;

    public interface a {
        void a();
    }

    public ShelfView(Context context) {
        this(context, null);
    }

    public ShelfView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.view_shelf, this);
        this.b = (TextView) findViewById(R.id.shelf_title);
        this.c = (ShelfGridRecyclerView) findViewById(R.id.shelf_recycler_view);
        this.d = (PageIndicator) findViewById(R.id.page_indicator);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i) {
        if (this.f != null && i > 0) {
            this.c.scrollBy(i, 0);
            this.f.a();
        }
    }

    public final void b(int i) {
        this.c.post(new Runnable(i) {
            private final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ShelfView.this.c(this.f$1);
            }
        });
    }
}
