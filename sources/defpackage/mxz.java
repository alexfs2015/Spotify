package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: mxz reason: default package */
public final class mxz implements rev<GlueHeaderViewV2> {
    final myn a;
    private final uvf b;
    private final wlc<fxn> c;
    private final myo d;

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
    }

    public final int b() {
        return R.id.header_full_bleed;
    }

    public final /* synthetic */ void a(View view, gzt gzt, gum gum, b bVar) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
        View inflate = LayoutInflater.from(glueHeaderViewV2.getContext()).inflate(R.layout.full_bleed_header, glueHeaderViewV2, false);
        final ImageView imageView = (ImageView) inflate.findViewById(R.id.img_picture);
        View findViewById = inflate.findViewById(R.id.image_overlay);
        View findViewById2 = inflate.findViewById(R.id.title_subtitle_container);
        gzw main = gzt.images().main();
        String uri = main != null ? main.uri() : null;
        this.a.a(imageView);
        this.b.a(uri).a((int) R.drawable.placeholder_background).a(imageView, (vrt) new vrt() {
            public final void b() {
            }

            public final void a() {
                mxz.this.a.b(imageView);
            }
        });
        this.a.b(imageView);
        myo myo = this.d;
        String a2 = myo.a(gzt.text().title());
        String subtitle = gzt.text().subtitle() != null ? gzt.text().subtitle() : "";
        TextView textView = (TextView) findViewById2.findViewById(R.id.txt_title);
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_subtitle);
        textView.setText(a2);
        if (VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(1);
        } else if (textView instanceof jg) {
            ((jg) textView).setAutoSizeTextTypeWithDefaults(1);
        }
        textView2.setText(subtitle);
        glueHeaderViewV2.a((fwk) new myz(inflate, imageView, findViewById, findViewById2));
    }

    public mxz(uvf uvf, myn myn, wlc<fxn> wlc, myo myo) {
        this.b = uvf;
        this.a = myn;
        this.c = wlc;
        this.d = myo;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.HEADER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Interpolator interpolator, float f) {
        ((fxn) this.c.get()).a(interpolator.getInterpolation(f));
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
        Context context = viewGroup.getContext();
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context);
        ((fxn) this.c.get()).a(0.0f);
        glueHeaderViewV2.a = gaa.a(context.getResources()) + uuu.c(context, R.attr.actionBarSize) + (context.getResources().getDimensionPixelSize(R.dimen.solar_button_height) / 2);
        glueHeaderViewV2.a((fva) new $$Lambda$mxz$ul2ppcEFJ5ZoV8adRyTNgBaXJw(this, new AccelerateInterpolator(2.0f)));
        return glueHeaderViewV2;
    }
}
