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

/* renamed from: gwk reason: default package */
public abstract class gwk<C extends Card> extends gwm<C> {
    private final HubsGlueImageDelegate a;

    /* renamed from: gwk$a */
    public static final class a extends gwk<Card> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwk.super.a((Card) fqe, gzt, gum, bVar);
        }

        public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, Card.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            Card a = fqb.a().a.a(context, viewGroup);
            fqf.a(a);
            fqc.a(a.getView());
            return a;
        }
    }

    /* renamed from: gwk$b */
    public static final class b extends gwk<fqm> {
        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, fqm.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(fqm fqm, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwk.super.a(fqm, gzt, gum, bVar);
            fqm.a(gwz.a(gzt));
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return fqb.a().a(context, viewGroup);
        }
    }

    /* renamed from: gwk$c */
    public static final class c extends gwk<fqn> {
        public c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, fqn.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(fqn fqn, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwk.super.a(fqn, gzt, gum, bVar);
            fqn.a(gwz.a(gzt));
            fqn.b(gwz.b(gzt));
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return fqb.a().c(context, viewGroup);
        }
    }

    /* renamed from: gwk$d */
    public static final class d extends gwk<fqn> {
        public d(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, fqn.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(fqn fqn, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwk.super.a(fqn, gzt, gum, bVar);
            fqn.a(gwz.a(gzt));
            CharSequence b = gwz.b(gzt);
            if (TextUtils.isEmpty(b)) {
                b = gwz.c(gzt);
            }
            fqn.b(b);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return fqb.a().b(context, viewGroup);
        }
    }

    /* synthetic */ gwk(HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, byte b2) {
        this(hubsGlueImageDelegate, cls);
    }

    private gwk(HubsGlueImageDelegate hubsGlueImageDelegate, Class<C> cls) {
        super(EnumSet.of(Trait.CARD, Trait.ONE_COLUMN), cls);
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    /* access modifiers changed from: protected */
    public void a(C c2, gzt gzt, gum gum, defpackage.gui.b bVar) {
        TextLayout textLayout;
        gwt.a(this.a, c2.a(), gzt.images().main(), null, HubsGlueImageConfig.CARD);
        Object obj = gzt.custom().get("textLayout");
        if (obj instanceof TextLayout) {
            textLayout = (TextLayout) obj;
        } else if (obj instanceof String) {
            textLayout = (TextLayout) com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard.Settings.TextLayout.a.a.b(obj.toString()).a(TextLayout.a);
        } else {
            textLayout = TextLayout.a;
        }
        c2.a(textLayout.mImplementation);
        has.a(c2.getView());
        guj.a(gum, c2.getView(), gzt);
        String str = "longClick";
        if (gzt.events().containsKey(str)) {
            has.a(gum.c).a(str).a(gzt).a(c2.getView()).b();
        }
    }
}
