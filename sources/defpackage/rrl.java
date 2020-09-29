package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: rrl reason: default package */
public final class rrl implements rnx<View> {
    private final Context a;
    private final Picasso b;
    private final hap c;

    public rrl(Context context, Picasso picasso, hap hap) {
        this.a = context;
        this.b = picasso;
        this.c = hap;
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        rrn rrn = new rrn(viewGroup.getContext(), viewGroup, this.b);
        fqz.a(rrn);
        return rrn.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.SPACED_VERTICALLY);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        rro rro = (rro) fqz.a(view, rro.class);
        if (fbo.a(hcm.text().title()) || fbo.a(hcm.text().subtitle())) {
            rro.a();
            return;
        }
        rro.a(hcm.text().title());
        rro.b(hcm.text().subtitle());
        hcp main = hcm.images().main();
        Uri parse = main != null ? Uri.parse(main.uri()) : Uri.EMPTY;
        Drawable a2 = (main == null || TextUtils.isEmpty(main.placeholder())) ? fr.a(this.a, (int) R.color.image_placeholder_color) : this.c.a(main.placeholder(), HubsGlueImageConfig.THUMBNAIL);
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        rro.a(parse, a2, str);
        hdl.a(gwm.c).a("click").a(hcm).a(rro.getView()).a();
    }

    public final int b() {
        return R.id.home_tappable_section_header;
    }
}
