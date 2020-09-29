package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.spotify.android.glue.components.card.Card;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard.Settings.TextLayout;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import java.util.EnumSet;

/* renamed from: gym reason: default package */
public abstract class gym<C extends Card> extends gyo<C> {
    private final HubsGlueImageDelegate a;

    /* renamed from: gym$a */
    public static final class a extends gym<Card> {
        public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, Card.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            Card a = fqv.a().a.a(context, viewGroup);
            fqz.a(a);
            fqw.a(a.getView());
            return a;
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gym.super.a((Card) fqy, hcm, gwm, bVar);
        }
    }

    /* renamed from: gym$b */
    public static final class b extends gym<frg> {
        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, frg.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(frg frg, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gym.super.a(frg, hcm, gwm, bVar);
            frg.a(gzk.a(hcm));
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return fqv.a().a(context, viewGroup);
        }
    }

    /* renamed from: gym$c */
    public static final class c extends gym<frh> {
        public c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, frh.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(frh frh, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gym.super.a(frh, hcm, gwm, bVar);
            frh.a(gzk.a(hcm));
            frh.b(gzk.b(hcm));
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return fqv.a().c(context, viewGroup);
        }
    }

    /* renamed from: gym$d */
    public static final class d extends gym<frh> {
        public d(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, frh.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(frh frh, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gym.super.a(frh, hcm, gwm, bVar);
            frh.a(gzk.a(hcm));
            CharSequence b = gzk.b(hcm);
            if (TextUtils.isEmpty(b)) {
                b = gzk.c(hcm);
            }
            frh.b(b);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return fqv.a().b(context, viewGroup);
        }
    }

    private gym(HubsGlueImageDelegate hubsGlueImageDelegate, Class<C> cls) {
        super(EnumSet.of(Trait.CARD, Trait.ONE_COLUMN), cls);
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    /* synthetic */ gym(HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, byte b2) {
        this(hubsGlueImageDelegate, cls);
    }

    /* access modifiers changed from: protected */
    public void a(C c2, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        gzd.a(this.a, c2.a(), hcm.images().main(), null, HubsGlueImageConfig.CARD);
        Object obj = hcm.custom().get("textLayout");
        TextLayout textLayout = obj instanceof TextLayout ? (TextLayout) obj : obj instanceof String ? (TextLayout) com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard.Settings.TextLayout.a.a.b(obj.toString()).a(TextLayout.a) : TextLayout.a;
        c2.a(textLayout.mImplementation);
        hdl.a(c2.getView());
        gwj.a(gwm, c2.getView(), hcm);
        String str = "longClick";
        if (hcm.events().containsKey(str)) {
            hdl.a(gwm.c).a(str).a(hcm).a(c2.getView()).b();
        }
    }
}
