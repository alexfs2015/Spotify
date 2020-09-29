package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.squareup.picasso.Picasso;
import defpackage.fsj;
import java.util.EnumSet;

/* renamed from: gzy reason: default package */
public abstract class gzy<T extends fsj> extends gzu<T> {
    private final HubsGlueImageDelegate a;
    private final BadgesFactory b;

    /* renamed from: gzy$a */
    public static class a extends gzy<fry> {
        public a(HubsGlueImageDelegate hubsGlueImageDelegate, BadgesFactory badgesFactory) {
            super(hubsGlueImageDelegate, badgesFactory, fry.class);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return gzy.super.a(context, viewGroup);
        }

        public final /* bridge */ /* synthetic */ EnumSet a() {
            return gzy.super.a();
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            gzy.super.a(view, hcm, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzy.super.a((fry) fqy, hcm, gwm);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fsj fsj, hcm hcm) {
            had.a((frx) (fry) fsj, hcm);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fsj b(Context context, ViewGroup viewGroup) {
            fqv.b();
            return fsk.b(context, viewGroup);
        }
    }

    /* renamed from: gzy$b */
    public static class b extends gzy<fsc> {
        public b(HubsGlueImageDelegate hubsGlueImageDelegate, BadgesFactory badgesFactory) {
            super(hubsGlueImageDelegate, badgesFactory, fsc.class);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return gzy.super.a(context, viewGroup);
        }

        public final /* bridge */ /* synthetic */ EnumSet a() {
            return gzy.super.a();
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            gzy.super.a(view, hcm, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzy.super.a((fsc) fqy, hcm, gwm);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fsj fsj, hcm hcm) {
            had.a((fsb) (fsc) fsj, hcm);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fsj b(Context context, ViewGroup viewGroup) {
            fqv.b();
            return fsk.b(context, viewGroup, false);
        }
    }

    protected gzy(HubsGlueImageDelegate hubsGlueImageDelegate, BadgesFactory badgesFactory, Class<T> cls) {
        super(EnumSet.of(Trait.STACKABLE), cls);
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
        this.b = badgesFactory;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
        return b(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public final T a(Context context, ViewGroup viewGroup) {
        return b(context, viewGroup);
    }

    public /* bridge */ /* synthetic */ EnumSet a() {
        return super.a();
    }

    public /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
        super.a(view, hcm, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        a((T) (fsj) fqy, hcm, gwm);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, hcm hcm);

    /* access modifiers changed from: protected */
    public final void a(T t, hcm hcm, gwm gwm) {
        hdl.a(t.getView());
        a(t, hcm);
        gwj.a(gwm, t.getView(), hcm);
        String str = "longClick";
        if (hcm.events().containsKey(str)) {
            hdl.a(gwm.c).a(str).a(hcm).a(t.getView()).b();
        }
        Assertion.a(hcm.images().main() != null, "main image is missing");
        ImageView c = t.c();
        hcp main = hcm.images().main();
        Picasso b2 = this.a.b();
        if (main != null) {
            Drawable a2 = this.a.a(main.placeholder(), (ImageConfig) HubsGlueImageConfig.THUMBNAIL);
            wgr b3 = b2.a(this.a.a(main.uri())).a(a2).b(a2);
            Context context = c.getContext();
            BadgesFactory badgesFactory = this.b;
            vfk a3 = Style.CIRCULAR == gzn.a(main.custom().string("style")) ? vgq.a() : null;
            if ("verified".equals(main.custom().get("badge"))) {
                a3 = badgesFactory.a(context, gye.a(ImageSize.SMALL), a3);
            }
            if (a3 == null) {
                b3.a(c);
            } else {
                b3.a(vhj.a(c, a3));
            }
        } else {
            b2.d(c);
            c.setImageDrawable(null);
        }
        Optional a4 = defpackage.haq.a.a.a((String) hcm.custom().get("accessoryRightIcon"));
        if (a4.b()) {
            View a5 = jyz.a(t.getView().getContext(), (SpotifyIconV2) a4.c());
            String str2 = "rightAccessoryClick";
            if (hcm.events().containsKey(str2)) {
                hdl.a(gwm.c).a(str2).a(hcm).a(a5).a();
            }
            t.a(a5);
        } else {
            t.a(null);
        }
        t.a(hcm.custom().boolValue("active", false));
    }

    /* access modifiers changed from: protected */
    public abstract T b(Context context, ViewGroup viewGroup);
}
