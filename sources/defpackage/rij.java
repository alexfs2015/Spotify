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

/* renamed from: rij reason: default package */
public final class rij implements rev<View> {
    private final Context a;
    private final Picasso b;
    private final gxw c;

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
    }

    public final int b() {
        return R.id.home_tappable_section_header;
    }

    public rij(Context context, Picasso picasso, gxw gxw) {
        this.a = context;
        this.b = picasso;
        this.c = gxw;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.SPACED_VERTICALLY);
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        ril ril = new ril(viewGroup.getContext(), viewGroup, this.b);
        fqf.a(ril);
        return ril.getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        Drawable drawable;
        rim rim = (rim) fqf.a(view, rim.class);
        if (fax.a(gzt.text().title()) || fax.a(gzt.text().subtitle())) {
            rim.a();
            return;
        }
        rim.a(gzt.text().title());
        rim.b(gzt.text().subtitle());
        gzw main = gzt.images().main();
        Uri parse = main != null ? Uri.parse(main.uri()) : Uri.EMPTY;
        if (main == null || TextUtils.isEmpty(main.placeholder())) {
            drawable = fr.a(this.a, (int) R.color.image_placeholder_color);
        } else {
            drawable = this.c.a(main.placeholder(), HubsGlueImageConfig.THUMBNAIL);
        }
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        rim.a(parse, drawable, str);
        has.a(gum.c).a("click").a(gzt).a(rim.getView()).a();
    }
}
