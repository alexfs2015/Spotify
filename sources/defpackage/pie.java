package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: pie reason: default package */
public final class pie extends defpackage.reu.a<a> {
    private final HubsGlueImageDelegate a;
    private final phk b;

    /* renamed from: pie$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final ImageView b;
        private final ViewGroup c;
        private final phk d;
        private final HubsGlueImageDelegate e;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup, HubsGlueImageDelegate hubsGlueImageDelegate, phk phk) {
            super(viewGroup);
            this.b = (ImageView) viewGroup.findViewById(R.id.image);
            this.c = (ViewGroup) viewGroup.findViewById(R.id.content);
            this.e = hubsGlueImageDelegate;
            this.d = phk;
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            ((ViewGroup) this.a).addOnLayoutChangeListener(new $$Lambda$pie$a$aHMNalZlH13l7iKV73dd_SojERI(this, gzt));
            this.c.removeAllViews();
            phk.a(gzt, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            for (gzt gzt2 : gzt.children()) {
                gui binder = gum.d.getBinder(gum.h.resolve(gzt2));
                ViewGroup viewGroup = this.c;
                if (binder != null) {
                    View a = binder.a(viewGroup, gum);
                    binder.a(a, gzt2, gum, bVar);
                    viewGroup.addView(a);
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(gzt gzt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i4 - i2;
            int i10 = i3 - i;
            gzw main = gzt.images().main();
            Assertion.a(main != null, "main image missing");
            gzq bundle = gzt.custom().bundle("imageSize");
            if (bundle != null) {
                Integer intValue = bundle.intValue("width");
                Integer intValue2 = bundle.intValue("height");
                if (intValue == null || intValue2 == null) {
                    throw new IllegalArgumentException("Missing required fields from Hubs JSON: 'width' or 'height'");
                }
                double d2 = (double) i10;
                double intValue3 = (double) intValue.intValue();
                Double.isNaN(d2);
                Double.isNaN(intValue3);
                double d3 = d2 / intValue3;
                double intValue4 = (double) intValue2.intValue();
                Double.isNaN(intValue4);
                int max = Math.max((int) (d3 * intValue4), i9);
                LayoutParams layoutParams = this.b.getLayoutParams();
                layoutParams.width = i10;
                layoutParams.height = max;
                this.b.setLayoutParams(layoutParams);
                ImageView imageView = this.b;
                Picasso b2 = this.e.b();
                if (main != null) {
                    uvh uvh = new uvh(i10, max);
                    vsl a = b2.a(this.e.a(main.uri()));
                    a.a((vst) uvh);
                    a.a(imageView);
                    return;
                }
                b2.d(imageView);
                imageView.setImageDrawable(null);
                return;
            }
            throw new IllegalArgumentException("Missing required fields from Hubs JSON: 'imageSize'");
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_image;
    }

    public pie(HubsGlueImageDelegate hubsGlueImageDelegate, phk phk) {
        this.a = hubsGlueImageDelegate;
        this.b = phk;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_container, viewGroup, false), this.a, this.b);
    }
}
