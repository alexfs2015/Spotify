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

/* renamed from: haj reason: default package */
public final class haj extends gzu<fsf> {
    private final HubsGlueImageDelegate a;

    public haj(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.of(Trait.STACKABLE), fsf.class);
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
        fqv.b();
        return fsk.e(context, viewGroup);
    }

    public final /* bridge */ /* synthetic */ EnumSet a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
        super.a(view, hcm, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, b bVar) {
        fsf fsf = (fsf) fqy;
        String title = hcm.text().title();
        String subtitle = hcm.text().subtitle();
        String accessory = hcm.text().accessory();
        hcp main = hcm.images().main();
        boolean z = true;
        Assertion.a(!fbo.a(title), "title not set");
        Assertion.a(!fbo.a(subtitle), "subtitle not set");
        Assertion.a(!fbo.a(accessory), "accesory not set");
        if (main == null) {
            z = false;
        }
        Assertion.a(z, "main image not set");
        fsf.a(title);
        String subtitle2 = hcm.text().subtitle();
        if (fbo.a(subtitle2)) {
            fsf.b(null);
        } else if (fbn.a(hcm.custom().string("subtitleStyle", ""), "metadata")) {
            fsf.c(subtitle2);
        } else {
            fsf.b(subtitle2);
        }
        fsf.d(accessory);
        ImageView c = fsf.c();
        Picasso b = this.a.b();
        if (main != null) {
            Drawable a2 = this.a.a(main.placeholder(), (ImageConfig) HubsGlueImageConfig.THUMBNAIL);
            b.a(this.a.a(main.uri())).a(a2).b(a2).a(c);
        } else {
            b.d(c);
            c.setImageDrawable(null);
        }
        fsf.a(hcm.custom().boolValue("active", false));
        hdl.a(fsf.getView());
        gwj.a(gwm, fsf.getView(), hcm);
        String str = "longClick";
        if (hcm.events().containsKey(str)) {
            hdl.a(gwm.c).a(str).a(hcm).a(fsf.getView()).b();
        }
        had.a(fsf, hcm, gwm);
    }
}
