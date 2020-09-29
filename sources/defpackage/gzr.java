package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.glue.components.card.Card;
import com.spotify.android.glue.components.card.Card.TextLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable.Size;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: gzr reason: default package */
public abstract class gzr<C extends Card> extends gzu<C> {
    private final HubsGlueImageDelegate a;

    /* renamed from: gzr$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Style.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings$Style[] r0 = com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings$Style r1 = com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style.CIRCULAR_WITH_RIPPLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings$Style r1 = com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style.SQUARE_WITH_RIPPLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gzr.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: gzr$a */
    static final class a {
        /* access modifiers changed from: private */
        public static final gce<Size> a = gce.a(Size.class);
    }

    /* renamed from: gzr$b */
    public static final class b extends gzr<Card> {
        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, Card.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            Card d = fqv.a().a.d(context);
            fqz.a(d);
            fqw.a(d.getView());
            return d.a(TextLayout.DOUBLE_LINE_TITLE);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzr.super.a((Card) fqy, hcm, gwm, bVar);
        }
    }

    /* renamed from: gzr$c */
    public static final class c extends gzr<Card> {
        public c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(EnumSet.of(Trait.BIG_CARD), hubsGlueImageDelegate, Card.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            Card e = fqv.a().a.e(context);
            fqz.a(e);
            fqw.a(e.getView());
            return e.a(TextLayout.DOUBLE_LINE_TITLE);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzr.super.a((Card) fqy, hcm, gwm, bVar);
        }
    }

    /* renamed from: gzr$d */
    public static final class d extends gzr<Card> {
        public d(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(EnumSet.of(Trait.BIG_CARD), hubsGlueImageDelegate, Card.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            Card f = fqv.a().a.f(context);
            fqz.a(f);
            fqw.a(f.getView());
            return f.a(TextLayout.DOUBLE_LINE_TITLE);
        }

        /* access modifiers changed from: protected */
        public final void a(Card card, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            hcp main = hcm.images().main();
            Assertion.a(main != null, "main image missing");
            gzr.super.a(card.a(), main);
            hdl.a(card.getView());
            card.a(gzr.a(card.getView().getContext(), hcm.custom()));
            gwj.a(gwm, card.getView(), hcm);
            String str = "longClick";
            if (hcm.events().containsKey(str)) {
                hdl.a(gwm.c).a(str).a(hcm).a(card.getView()).b();
            }
        }
    }

    /* renamed from: gzr$e */
    public static final class e extends gzr<frg> {
        public e(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, frg.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return (frg) fqv.a().a(context, viewGroup).a(TextLayout.DOUBLE_LINE_TITLE);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzr.super.a((frg) fqy, hcm, gwm, bVar);
        }
    }

    /* renamed from: gzr$f */
    public static final class f extends h {
        public f(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return (frh) fqv.a().c(context, viewGroup).a(TextLayout.DOUBLE_LINE_TITLE);
        }
    }

    /* renamed from: gzr$g */
    public static final class g extends h {
        public g(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return (frh) fqv.a().b(context, viewGroup).a(TextLayout.DOUBLE_LINE_TITLE);
        }
    }

    /* renamed from: gzr$h */
    static abstract class h extends gzr<frh> {
        h(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, frh.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(frh frh, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzr.super.a(frh, hcm, gwm, bVar);
            frh.b(hcm.text().subtitle());
        }
    }

    private gzr(HubsGlueImageDelegate hubsGlueImageDelegate, Class<C> cls) {
        super(EnumSet.of(Trait.CARD, Trait.ONE_COLUMN), cls);
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    /* synthetic */ gzr(HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, byte b2) {
        this(hubsGlueImageDelegate, cls);
    }

    private gzr(EnumSet<Trait> enumSet, HubsGlueImageDelegate hubsGlueImageDelegate, Class<C> cls) {
        super(enumSet, cls);
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    /* synthetic */ gzr(EnumSet enumSet, HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, byte b2) {
        this(enumSet, hubsGlueImageDelegate, cls);
    }

    private static int a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("Failed to parse color: ");
            sb.append(str);
            Assertion.b(sb.toString());
            return -65536;
        }
    }

    private static Style a(hcp hcp) {
        String str = "style";
        Object obj = hcp.custom().get(str);
        return obj instanceof Style ? (Style) obj : gzn.a(hcp.custom().string(str));
    }

    static CardAccessoryDrawable a(Context context, hcj hcj) {
        String str = "";
        SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) defpackage.haq.a.a.a(hcj.string("accessoryIcon", str)).d();
        if (spotifyIconV2 == null) {
            return null;
        }
        return CardAccessoryDrawable.a(context, a(hcj.string("accessoryColor", str)), b(hcj.string("accessorySize")), spotifyIconV2);
    }

    private wgz a(Style style) {
        int i = AnonymousClass1.a[style.ordinal()];
        return i != 1 ? i != 2 ? vhc.b() : this.a.a().d : this.a.a().c;
    }

    private static Size b(String str) {
        try {
            gce a2 = a.a;
            Enum c2 = a2.c(str);
            if (c2 != null) {
                return (Size) c2;
            }
            throw new EnumConstantNotPresentException(a2.a, str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("Failed to parse size: ");
            sb.append(str);
            Assertion.b(sb.toString());
            return Size.SMALL;
        }
    }

    private static vfk b(Style style) {
        if (style == Style.CIRCULAR) {
            return vgq.a();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a(ImageView imageView, hcp hcp) {
        Picasso b2 = this.a.b();
        if (hcp == null || b2 == null) {
            if (b2 != null) {
                b2.d(imageView);
            }
            imageView.setImageDrawable(null);
        } else {
            Drawable a2 = this.a.a(hcp.placeholder(), (ImageConfig) HubsGlueImageConfig.CARD);
            Style a3 = a(hcp);
            vfk b3 = b(a3);
            wgr a4 = new wgj(new wgu(b2), imageView.getContext()).a(this.a.a(hcp.uri())).a(a2).b(a2).a(a(a3));
            if (b3 == null) {
                a4.a(imageView);
            } else {
                a4.a(vhj.a(imageView, b3));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(C c2, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        String title = hcm.text().title();
        boolean z = true;
        Assertion.a(!fbo.a(title), "title is missing");
        hcp main = hcm.images().main();
        if (main == null) {
            z = false;
        }
        Assertion.a(z, "main image missing");
        a(c2.a(), main);
        Context context = c2.getView().getContext();
        Drawable drawable = hcm.custom().boolValue("isFresh", false) ? fr.a(context, (int) R.drawable.freshness_badge) : fbo.b(hcm.custom().string("titleBadge")).equals("shuffle") ? frr.a(context) : null;
        c2.a(title, drawable);
        hdl.a(c2.getView());
        c2.a(a(c2.getView().getContext(), hcm.custom()));
        gwj.a(gwm, c2.getView(), hcm);
        String str = "longClick";
        if (hcm.events().containsKey(str)) {
            hdl.a(gwm.c).a(str).a(hcm).a(c2.getView()).b();
        }
    }
}
