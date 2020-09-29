package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: pov reason: default package */
public final class pov extends defpackage.rnw.a<a> {
    private final HubsGlueImageDelegate a;
    private final pob b;

    /* renamed from: pov$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final ImageView b;
        private final ViewGroup c;
        private final pob d;
        private final HubsGlueImageDelegate e;

        /* renamed from: pov$a$a reason: collision with other inner class name */
        static class C0076a implements OnLayoutChangeListener {
            private final ImageView a;
            private final hcm b;
            private final Handler c = new Handler(Looper.getMainLooper());
            private final HubsGlueImageDelegate d;

            public C0076a(hcm hcm, ImageView imageView, HubsGlueImageDelegate hubsGlueImageDelegate) {
                this.b = hcm;
                this.a = imageView;
                this.d = hubsGlueImageDelegate;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(int i, int i2) {
                LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i2;
                this.a.setLayoutParams(layoutParams);
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = i4 - i2;
                int i10 = i3 - i;
                hcp main = this.b.images().main();
                Assertion.a(main != null, "main image missing");
                hcj bundle = this.b.custom().bundle("imageSize");
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
                    this.c.post(new $$Lambda$pov$a$a$BssN6pyYEUmjhM_KeSrWtoD1E0(this, i10, max));
                    ImageView imageView = this.a;
                    Picasso b2 = this.d.b();
                    if (main != null) {
                        vgy vgy = new vgy(i10, max);
                        wgr a2 = b2.a(this.d.a(main.uri()));
                        a2.a((wgz) vgy);
                        a2.a(imageView);
                    } else {
                        b2.d(imageView);
                        imageView.setImageDrawable(null);
                    }
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                throw new IllegalArgumentException("Missing required fields from Hubs JSON: 'imageSize'");
            }
        }

        protected a(ViewGroup viewGroup, HubsGlueImageDelegate hubsGlueImageDelegate, pob pob) {
            super(viewGroup);
            this.b = (ImageView) viewGroup.findViewById(R.id.image);
            this.c = (ViewGroup) viewGroup.findViewById(R.id.content);
            this.e = hubsGlueImageDelegate;
            this.d = pob;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            ((ViewGroup) this.a).addOnLayoutChangeListener(new C0076a(hcm, this.b, this.e));
            this.c.removeAllViews();
            pob.a(hcm, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            for (hcm hcm2 : hcm.children()) {
                gwi binder = gwm.d.getBinder(gwm.h.resolve(hcm2));
                ViewGroup viewGroup = this.c;
                if (binder != null) {
                    View a = binder.a(viewGroup, gwm);
                    binder.a(a, hcm2, gwm, bVar);
                    viewGroup.addView(a);
                }
            }
        }
    }

    public pov(HubsGlueImageDelegate hubsGlueImageDelegate, pob pob) {
        this.a = hubsGlueImageDelegate;
        this.b = pob;
    }

    public final int b() {
        return R.id.hubs_premium_page_image;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_container, viewGroup, false), this.a, this.b);
    }
}
