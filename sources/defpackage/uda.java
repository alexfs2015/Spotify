package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: uda reason: default package */
public final class uda implements fqy {
    public final TextView a;
    public final TextView b;
    public final wgx c = new wgx() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fbp.a(!bitmap.isRecycled());
            uda.this.e.setImageDrawable(new vgt(bitmap, uda.this.g));
            uda.this.e.setScaleType(ScaleType.CENTER_CROP);
            if (loadedFrom != LoadedFrom.MEMORY) {
                uda.c(uda.this);
            }
            fbp.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            uda.this.e.setImageDrawable(uda.this.f);
        }

        public final void b(Drawable drawable) {
            uda.this.e.setImageDrawable(uda.this.f);
        }
    };
    private final View d;
    /* access modifiers changed from: private */
    public final ImageView e;
    /* access modifiers changed from: private */
    public final udh f;
    /* access modifiers changed from: private */
    public final float g;
    private final ValueAnimator h;

    private uda(ViewGroup viewGroup, ucz ucz) {
        this.d = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.episode_discovery_card, viewGroup, false);
        Resources resources = this.d.getResources();
        this.d.getLayoutParams().width = ucz.a();
        this.a = (TextView) this.d.findViewById(R.id.discovery_card_title);
        this.b = (TextView) this.d.findViewById(R.id.discovery_card_subtitle);
        this.g = (float) resources.getDimensionPixelSize(R.dimen.discovery_card_corner_radius);
        this.f = new udh(resources, R.dimen.discovery_card_corner_radius);
        this.f.a(fr.c(this.d.getContext(), R.color.discovery_card_background_placeholder));
        this.e = (ImageView) this.d.findViewById(R.id.discovery_card_bg_image);
        this.e.setBackground(this.f);
        this.h = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.h.setDuration(400);
        this.h.addUpdateListener(new $$Lambda$uda$gEYFnM5ck1jpwKOMWFEUDFw6k7o(this));
        vfz.a(this.d).b(this.e).a(this.a, this.b).a();
    }

    public static uda a(ViewGroup viewGroup, ucz ucz) {
        return new uda(viewGroup, ucz);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.e.setImageAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
    }

    static /* synthetic */ void c(uda uda) {
        if (uda.h.isRunning()) {
            uda.h.cancel();
        }
        uda.e.setImageAlpha(0);
        uda.h.start();
    }

    public final View getView() {
        return this.d;
    }
}
