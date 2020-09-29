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

/* renamed from: tqx reason: default package */
public final class tqx implements fqe {
    public final TextView a;
    public final TextView b;
    public final vsr c = new vsr() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fay.a(!bitmap.isRecycled());
            tqx.this.e.setImageDrawable(new uvc(bitmap, tqx.this.g));
            tqx.this.e.setScaleType(ScaleType.CENTER_CROP);
            if (loadedFrom != LoadedFrom.MEMORY) {
                tqx.c(tqx.this);
            }
            fay.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            tqx.this.e.setImageDrawable(tqx.this.f);
        }

        public final void b(Drawable drawable) {
            tqx.this.e.setImageDrawable(tqx.this.f);
        }
    };
    private final View d;
    /* access modifiers changed from: private */
    public final ImageView e;
    /* access modifiers changed from: private */
    public final tre f;
    /* access modifiers changed from: private */
    public final float g;
    private final ValueAnimator h;

    public static tqx a(ViewGroup viewGroup, tqw tqw) {
        return new tqx(viewGroup, tqw);
    }

    private tqx(ViewGroup viewGroup, tqw tqw) {
        this.d = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.episode_discovery_card, viewGroup, false);
        Resources resources = this.d.getResources();
        this.d.getLayoutParams().width = tqw.a();
        this.a = (TextView) this.d.findViewById(R.id.discovery_card_title);
        this.b = (TextView) this.d.findViewById(R.id.discovery_card_subtitle);
        this.g = (float) resources.getDimensionPixelSize(R.dimen.discovery_card_corner_radius);
        this.f = new tre(resources, R.dimen.discovery_card_corner_radius);
        this.f.a(fr.c(this.d.getContext(), R.color.discovery_card_background_placeholder));
        this.e = (ImageView) this.d.findViewById(R.id.discovery_card_bg_image);
        this.e.setBackground(this.f);
        this.h = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.h.setDuration(400);
        this.h.addUpdateListener(new $$Lambda$tqx$lT4YNzOsKCHBBEmbt0sTBYfEMJg(this));
        uui.a(this.d).b(this.e).a(this.a, this.b).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.e.setImageAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
    }

    public final View getView() {
        return this.d;
    }

    static /* synthetic */ void c(tqx tqx) {
        if (tqx.h.isRunning()) {
            tqx.h.cancel();
        }
        tqx.e.setImageAlpha(0);
        tqx.h.start();
    }
}
