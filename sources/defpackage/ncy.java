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

/* renamed from: ncy reason: default package */
public final class ncy implements rnx<GlueHeaderViewV2> {
    final ndo a;
    private final vgw b;
    private final wzi<fyh> c;
    private final ndr d;

    public ncy(vgw vgw, ndo ndo, wzi<fyh> wzi, ndr ndr) {
        this.b = vgw;
        this.a = ndo;
        this.c = wzi;
        this.d = ndr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Interpolator interpolator, float f) {
        ((fyh) this.c.get()).a(interpolator.getInterpolation(f));
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context);
        ((fyh) this.c.get()).a(0.0f);
        glueHeaderViewV2.a = gau.a(context.getResources()) + vgl.c(context, R.attr.actionBarSize) + (context.getResources().getDimensionPixelSize(R.dimen.solar_button_height) / 2);
        glueHeaderViewV2.a((fvu) new $$Lambda$ncy$RBB7pjZbxVeJoEwIzyodMHsvz8(this, new AccelerateInterpolator(2.0f)));
        return glueHeaderViewV2;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.HEADER);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, hcm hcm, gwm gwm, b bVar) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
        View inflate = LayoutInflater.from(glueHeaderViewV2.getContext()).inflate(R.layout.full_bleed_header, glueHeaderViewV2, false);
        final ImageView imageView = (ImageView) inflate.findViewById(R.id.img_picture);
        View findViewById = inflate.findViewById(R.id.image_overlay);
        View findViewById2 = inflate.findViewById(R.id.title_subtitle_container);
        hcp main = hcm.images().main();
        String uri = main != null ? main.uri() : null;
        this.a.a(imageView);
        this.b.a(uri).a((int) R.drawable.placeholder_background).a(imageView, (wfz) new wfz() {
            public final void a() {
                ncy.this.a.b(imageView);
            }

            public final void b() {
            }
        });
        this.a.b(imageView);
        ndr ndr = this.d;
        String a2 = ndr.a(hcm.text().title());
        String subtitle = hcm.text().subtitle() != null ? hcm.text().subtitle() : "";
        TextView textView = (TextView) findViewById2.findViewById(R.id.txt_title);
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_subtitle);
        textView.setText(a2);
        if (VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(1);
        } else if (textView instanceof jg) {
            ((jg) textView).setAutoSizeTextTypeWithDefaults(1);
        }
        textView2.setText(subtitle);
        glueHeaderViewV2.a((fxe) new nea(inflate, imageView, findViewById, findViewById2));
    }

    public final int b() {
        return R.id.header_full_bleed;
    }
}
