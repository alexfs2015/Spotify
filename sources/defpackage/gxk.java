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
import defpackage.frp;
import java.util.EnumSet;

/* renamed from: gxk reason: default package */
public abstract class gxk<T extends frp> extends gxg<T> {
    private final HubsGlueImageDelegate a;

    /* renamed from: gxk$a */
    public static class a extends gxk<fre> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return gxk.super.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxk.super.a((fre) fqe, gzt, gum);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(frp frp, gzt gzt) {
            gxm.a((frd) (fre) frp, gzt);
        }

        public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, fre.class);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ frp b(Context context, ViewGroup viewGroup) {
            fqb.b();
            return frq.b(context, viewGroup);
        }
    }

    /* renamed from: gxk$b */
    public static class b extends gxk<fri> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return gxk.super.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxk.super.a((fri) fqe, gzt, gum);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(frp frp, gzt gzt) {
            gxm.a((frh) (fri) frp, gzt);
        }

        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, fri.class);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ frp b(Context context, ViewGroup viewGroup) {
            fqb.b();
            return frq.b(context, viewGroup, false);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, gzt gzt);

    /* access modifiers changed from: protected */
    public abstract T b(Context context, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
        a((T) (frp) fqe, gzt, gum);
    }

    protected gxk(HubsGlueImageDelegate hubsGlueImageDelegate, Class<T> cls) {
        super(EnumSet.of(Trait.STACKABLE), cls);
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    /* access modifiers changed from: protected */
    public final void a(T t, gzt gzt, gum gum) {
        has.a(t.getView());
        a(t, gzt);
        guj.a(gum, t.getView(), gzt);
        String str = "longClick";
        if (gzt.events().containsKey(str)) {
            has.a(gum.c).a(str).a(gzt).a(t.getView()).b();
        }
        Assertion.a(gzt.images().main() != null, "main image is missing");
        ImageView c = t.c();
        gzw main = gzt.images().main();
        Picasso b2 = this.a.b();
        if (main != null) {
            Drawable a2 = this.a.a(main.placeholder(), (ImageConfig) HubsGlueImageConfig.THUMBNAIL);
            vsl b3 = b2.a(this.a.a(main.uri())).a(a2).b(a2);
            Context context = c.getContext();
            utt a3 = Style.CIRCULAR == gxb.a(main.custom().string("style")) ? uuz.a() : null;
            if ("verified".equals(main.custom().get("badge"))) {
                a3 = ((BadgesFactory) ggw.a(BadgesFactory.class)).a(context, gwd.a(ImageSize.SMALL), a3);
            }
            if (a3 == null) {
                b3.a(c);
            } else {
                b3.a(uvt.a(c, a3));
            }
        } else {
            b2.d(c);
            c.setImageDrawable(null);
        }
        Optional a4 = defpackage.gxx.a.a.a((String) gzt.custom().get("accessoryRightIcon"));
        if (a4.b()) {
            View a5 = jwz.a(t.getView().getContext(), (SpotifyIconV2) a4.c());
            String str2 = "rightAccessoryClick";
            if (gzt.events().containsKey(str2)) {
                has.a(gum.c).a(str2).a(gzt).a(a5).a();
            }
            t.a(a5);
        } else {
            t.a(null);
        }
        t.a(gzt.custom().boolValue("active", false));
    }

    /* access modifiers changed from: protected */
    public final T a(Context context, ViewGroup viewGroup) {
        return b(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
        return b(context, viewGroup);
    }
}
