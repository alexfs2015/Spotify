package com.spotify.music.newplaying.scroll.widgets.pivots.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;

public class PivotsWidgetContentView extends LinearLayout {
    a a;
    public Picasso b;
    private PivotView[] c;
    private final Drawable d;

    public PivotsWidgetContentView(Context context) {
        this(context, null);
    }

    public PivotsWidgetContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PivotsWidgetContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        inflate(getContext(), R.layout.content_view, this);
        this.d = new uvd(new SpotifyIconDrawable(getContext(), SpotifyIconV2.PLAYLIST, (float) getResources().getDimensionPixelSize(R.dimen.pivot_icon_size)), 0.33f, fr.c(getContext(), R.color.white_20));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = new PivotView[]{(PivotView) findViewById(R.id.pivot_1), (PivotView) findViewById(R.id.pivot_2), (PivotView) findViewById(R.id.pivot_3)};
    }

    public final void a(ImmutableList<suu> immutableList) {
        for (int i = 0; i < this.c.length; i++) {
            int i2 = 8;
            if (i < immutableList.size()) {
                this.c[i].setVisibility(0);
                PivotView pivotView = this.c[i];
                suu suu = (suu) immutableList.get(i);
                fay.a(this.b);
                String a2 = suu.a();
                String b2 = suu.b();
                pivotView.a.setMaxLines(2);
                pivotView.a.setText(a2);
                pivotView.b.setMaxLines(1);
                pivotView.b.setText(b2);
                TextView textView = pivotView.b;
                if (b2 != null) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                pivotView.a.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        PivotView.this.a.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (PivotView.this.a.getLineCount() >= 2) {
                            return true;
                        }
                        PivotView.this.b.setMaxLines(2);
                        return false;
                    }
                });
                if (suu.c() != null) {
                    this.b.a(suu.c()).a((int) R.color.white_20).b(this.d).a(pivotView.c);
                } else {
                    pivotView.c.setImageDrawable(this.d);
                }
                pivotView.d.setOnClickListener(new OnClickListener(suu, i) {
                    private final /* synthetic */ suu f$1;
                    private final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void onClick(View view) {
                        PivotsWidgetContentView.this.d(this.f$1, this.f$2, view);
                    }
                });
                pivotView.c.setOnClickListener(new OnClickListener(suu, i) {
                    private final /* synthetic */ suu f$1;
                    private final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void onClick(View view) {
                        PivotsWidgetContentView.this.c(this.f$1, this.f$2, view);
                    }
                });
                pivotView.b.setOnClickListener(new OnClickListener(suu, i) {
                    private final /* synthetic */ suu f$1;
                    private final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void onClick(View view) {
                        PivotsWidgetContentView.this.b(this.f$1, this.f$2, view);
                    }
                });
                pivotView.a.setOnClickListener(new OnClickListener(suu, i) {
                    private final /* synthetic */ suu f$1;
                    private final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void onClick(View view) {
                        PivotsWidgetContentView.this.a(this.f$1, this.f$2, view);
                    }
                });
            } else {
                this.c[i].setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(suu suu, int i, View view) {
        this.a.a(suu, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(suu suu, int i, View view) {
        this.a.a(suu);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(suu suu, int i, View view) {
        this.a.b(suu);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(suu suu, int i, View view) {
        this.a.b(suu);
    }
}
