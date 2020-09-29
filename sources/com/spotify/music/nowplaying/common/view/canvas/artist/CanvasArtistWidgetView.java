package com.spotify.music.nowplaying.common.view.canvas.artist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.Locale;

public class CanvasArtistWidgetView extends FrameLayout implements sxv {
    public Picasso a;
    private final Runnable b;
    private final Runnable c;
    private View d;
    private View e;
    private TextView f;
    private ImageView g;
    private a h;

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        setVisibility(0);
    }

    public CanvasArtistWidgetView(Context context) {
        this(context, null);
    }

    public CanvasArtistWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CanvasArtistWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Runnable() {
            public final void run() {
                CanvasArtistWidgetView.this.d();
            }
        };
        this.c = new Runnable() {
            public final void run() {
                CanvasArtistWidgetView.this.c();
            }
        };
        inflate(getContext(), R.layout.canvas_artist_widget, this);
        this.d = ip.c((View) this, (int) R.id.gradient_background);
        this.e = ip.c((View) this, (int) R.id.artist_attribution);
        this.f = (TextView) ip.c((View) this, (int) R.id.canvas_uploaded_by_artist_text);
        this.g = (ImageView) ip.c((View) this, (int) R.id.canvas_artist_avatar);
        this.e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CanvasArtistWidgetView.this.a(view);
            }
        });
        ip.a(this.d, (il) $$Lambda$CanvasArtistWidgetView$3Fop9Jz5Nvyq1MGgbac9tbmHbA.INSTANCE);
    }

    public final void a() {
        animate().cancel();
        ip.n(this).a(200).a(ftn.b).a(1.0f).b(this.c).c();
    }

    public final void b() {
        animate().cancel();
        ip.n(this).a(200).a(ftn.a).a(0.0f).a(this.b).c();
    }

    public final void a(a aVar) {
        this.h = aVar;
    }

    public final void a(int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.e.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
        this.e.setLayoutParams(marginLayoutParams);
    }

    public final void a(String str) {
        this.a.a(str).a(fzg.g(getContext())).b(fzg.g(getContext())).a(uvt.a(this.g));
    }

    public final void b(String str) {
        this.f.setText(String.format(Locale.US, getContext().getString(R.string.canvas_uploaded_by_text), new Object[]{str}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.c();
        }
    }
}
