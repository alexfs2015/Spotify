package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: gxr reason: default package */
public final class gxr extends gxg<frl> {
    private final HubsGlueImageDelegate a;

    public final /* bridge */ /* synthetic */ EnumSet a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
        super.a(view, gzt, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, b bVar) {
        frl frl = (frl) fqe;
        String title = gzt.text().title();
        String subtitle = gzt.text().subtitle();
        String accessory = gzt.text().accessory();
        gzw main = gzt.images().main();
        boolean z = true;
        Assertion.a(!fax.a(title), "title not set");
        Assertion.a(!fax.a(subtitle), "subtitle not set");
        Assertion.a(!fax.a(accessory), "accesory not set");
        if (main == null) {
            z = false;
        }
        Assertion.a(z, "main image not set");
        frl.a(title);
        String subtitle2 = gzt.text().subtitle();
        if (fax.a(subtitle2)) {
            frl.b(null);
        } else if (faw.a(gzt.custom().string("subtitleStyle", ""), "metadata")) {
            frl.c(subtitle2);
        } else {
            frl.b(subtitle2);
        }
        frl.d(accessory);
        ImageView c = frl.c();
        Picasso b = this.a.b();
        if (main != null) {
            Drawable a2 = this.a.a(main.placeholder(), (ImageConfig) HubsGlueImageConfig.THUMBNAIL);
            b.a(this.a.a(main.uri())).a(a2).b(a2).a(c);
        } else {
            b.d(c);
            c.setImageDrawable(null);
        }
        frl.a(gzt.custom().boolValue("active", false));
        has.a(frl.getView());
        guj.a(gum, frl.getView(), gzt);
        String str = "longClick";
        if (gzt.events().containsKey(str)) {
            has.a(gum.c).a(str).a(gzt).a(frl.getView()).b();
        }
        gxm.a(frl, gzt, gum);
    }

    public gxr(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.of(Trait.STACKABLE), frl.class);
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
        fqb.b();
        return frq.e(context, viewGroup);
    }
}
