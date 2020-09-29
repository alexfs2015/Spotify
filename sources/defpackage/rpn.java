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

/* renamed from: rpn reason: default package */
public final class rpn extends defpackage.rnx.a<a> {
    private final vgw a;

    /* renamed from: rpn$a */
    static class a extends defpackage.gwi.c.a<View> {
        private Context b;
        private c c;
        private vgw d;

        public a(ViewGroup viewGroup, c cVar, vgw vgw) {
            super(cVar.getView());
            this.b = viewGroup.getContext();
            this.d = vgw;
            this.c = cVar;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            hcp main = hcm.images().main();
            String str = null;
            String uri = main != null ? main.uri() : null;
            if (main != null) {
                str = main.placeholder();
            }
            Drawable a = gaa.a(this.b, (SpotifyIconV2) defpackage.haq.a.a.a(str).a(SpotifyIconV2.PLAYLIST), (float) vfj.b(64.0f, this.b.getResources()));
            this.d.a(!TextUtils.isEmpty(uri) ? Uri.parse(uri) : Uri.EMPTY).a(a).b(a).a(this.c.c());
            String str2 = "";
            String title = hcm.text().title() != null ? hcm.text().title() : str2;
            if (hcm.text().subtitle() != null) {
                str2 = hcm.text().subtitle();
            }
            this.c.b().setText(title);
            this.c.d().setText(str2);
            TextView d2 = this.c.d();
            if (hcm.custom().boolValue("shuffle_badge", false)) {
                jyw.a(d2.getContext(), d2, 0, R.id.drawable_group_on_demand, Suppliers.a(frr.a(this.b)));
                d2.setCompoundDrawablePadding(vfj.b(5.0f, d2.getResources()));
            } else {
                jyw.a(d2, 0, (int) R.id.drawable_group_on_demand);
            }
            gwj.a(gwm, this.c.getView(), hcm);
        }
    }

    public rpn(vgw vgw) {
        this.a = vgw;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final int b() {
        return R.id.free_tier_larger_row;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(viewGroup, Rows.b(viewGroup.getContext(), viewGroup, 80, 8), this.a);
    }
}
