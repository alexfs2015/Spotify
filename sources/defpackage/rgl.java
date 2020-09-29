package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.base.Suppliers;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.freetiercommon.uicomponents.Rows.c;
import java.util.EnumSet;

/* renamed from: rgl reason: default package */
public final class rgl extends defpackage.rev.a<a> {
    private final uvf a;

    /* renamed from: rgl$a */
    static class a extends defpackage.gui.c.a<View> {
        private Context b;
        private c c;
        private uvf d;

        public a(ViewGroup viewGroup, c cVar, uvf uvf) {
            super(cVar.getView());
            this.b = viewGroup.getContext();
            this.d = uvf;
            this.c = cVar;
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.a, gzt, aVar, iArr);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            gzw main = gzt.images().main();
            String str = null;
            String uri = main != null ? main.uri() : null;
            if (main != null) {
                str = main.placeholder();
            }
            Drawable a = fzg.a(this.b, (SpotifyIconV2) defpackage.gxx.a.a.a(str).a(SpotifyIconV2.PLAYLIST), (float) uts.b(64.0f, this.b.getResources()));
            this.d.a(!TextUtils.isEmpty(uri) ? Uri.parse(uri) : Uri.EMPTY).a(a).b(a).a(this.c.c());
            String str2 = "";
            String title = gzt.text().title() != null ? gzt.text().title() : str2;
            if (gzt.text().subtitle() != null) {
                str2 = gzt.text().subtitle();
            }
            this.c.b().setText(title);
            this.c.d().setText(str2);
            TextView d2 = this.c.d();
            if (gzt.custom().boolValue("shuffle_badge", false)) {
                jwu.a(d2.getContext(), d2, 0, R.id.drawable_group_on_demand, Suppliers.a(fqx.a(this.b)));
                d2.setCompoundDrawablePadding(uts.b(5.0f, d2.getResources()));
            } else {
                jwu.a(d2, 0, (int) R.id.drawable_group_on_demand);
            }
            guj.a(gum, this.c.getView(), gzt);
        }
    }

    public final int b() {
        return R.id.free_tier_larger_row;
    }

    public rgl(uvf uvf) {
        this.a = uvf;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(viewGroup, Rows.b(viewGroup.getContext(), viewGroup, 80, 8), this.a);
    }
}
