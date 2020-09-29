package com.spotify.music.newplaying.scroll.widgets.pivots.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.spotify.music.R;

public class PivotsWidgetView extends RelativeLayout implements tfo, vdc {
    public PivotsWidgetContentView a;
    private PivotsWidgetLoadingView b;

    public PivotsWidgetView(Context context) {
        super(context, null);
    }

    public PivotsWidgetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public PivotsWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void a() {
        this.b.setVisibility(0);
        this.a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a();
    }

    /* access modifiers changed from: private */
    public void a(c cVar) {
        this.a.a(cVar.a);
        this.a.setAlpha(0.0f);
        this.a.setVisibility(0);
        this.a.animate().alpha(1.0f);
        this.b.animate().alpha(0.0f).withEndAction(new Runnable() {
            public final void run() {
                PivotsWidgetView.this.b();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.b.setAlpha(1.0f);
        this.b.setVisibility(8);
    }

    public final void a(int i) {
        ((GradientDrawable) getBackground()).setColor(gd.b(i, fr.c(getContext(), R.color.pivots_background_overlay), 0.5f));
    }

    public final void a(tfj tfj) {
        tfj.a(new ged() {
            public final void accept(Object obj) {
                PivotsWidgetView.this.a((b) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                PivotsWidgetView.this.a((c) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                PivotsWidgetView.this.a((a) obj);
            }
        });
    }

    public final void a(a aVar) {
        this.a.a = aVar;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (PivotsWidgetLoadingView) findViewById(R.id.loading_view);
        this.a = (PivotsWidgetContentView) findViewById(R.id.pivots_view);
    }
}
