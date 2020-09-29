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

/* renamed from: gxd reason: default package */
public abstract class gxd<C extends Card> extends gxg<C> {
    private final HubsGlueImageDelegate a;

    /* renamed from: gxd$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gxd.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: gxd$a */
    static final class a {
        /* access modifiers changed from: private */
        public static final gbg<Size> a = gbg.a(Size.class);
    }

    /* renamed from: gxd$b */
    public static final class b extends gxd<Card> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxd.super.a((Card) fqe, gzt, gum, bVar);
        }

        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, Card.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            Card d = fqb.a().a.d(context);
            fqf.a(d);
            fqc.a(d.getView());
            return d.a(TextLayout.DOUBLE_LINE_TITLE);
        }
    }

    /* renamed from: gxd$c */
    public static final class c extends gxd<Card> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxd.super.a((Card) fqe, gzt, gum, bVar);
        }

        public c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(EnumSet.of(Trait.BIG_CARD), hubsGlueImageDelegate, Card.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            Card e = fqb.a().a.e(context);
            fqf.a(e);
            fqc.a(e.getView());
            return e.a(TextLayout.DOUBLE_LINE_TITLE);
        }
    }

    /* renamed from: gxd$d */
    public static final class d extends gxd<Card> {
        public d(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(EnumSet.of(Trait.BIG_CARD), hubsGlueImageDelegate, Card.class, 0);
        }

        /* access modifiers changed from: protected */
        public final void a(Card card, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gzw main = gzt.images().main();
            Assertion.a(main != null, "main image missing");
            gxd.super.a(card.a(), main);
            has.a(card.getView());
            card.a(gxd.a(card.getView().getContext(), gzt.custom()));
            guj.a(gum, card.getView(), gzt);
            String str = "longClick";
            if (gzt.events().containsKey(str)) {
                has.a(gum.c).a(str).a(gzt).a(card.getView()).b();
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            Card f = fqb.a().a.f(context);
            fqf.a(f);
            fqc.a(f.getView());
            return f.a(TextLayout.DOUBLE_LINE_TITLE);
        }
    }

    /* renamed from: gxd$e */
    public static final class e extends gxd<fqm> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxd.super.a((fqm) fqe, gzt, gum, bVar);
        }

        public e(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, fqm.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return (fqm) fqb.a().a(context, viewGroup).a(TextLayout.DOUBLE_LINE_TITLE);
        }
    }

    /* renamed from: gxd$f */
    public static final class f extends h {
        public f(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return (fqn) fqb.a().c(context, viewGroup).a(TextLayout.DOUBLE_LINE_TITLE);
        }
    }

    /* renamed from: gxd$g */
    public static final class g extends h {
        public g(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return (fqn) fqb.a().b(context, viewGroup).a(TextLayout.DOUBLE_LINE_TITLE);
        }
    }

    /* renamed from: gxd$h */
    static abstract class h extends gxd<fqn> {
        h(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, fqn.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(fqn fqn, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxd.super.a(fqn, gzt, gum, bVar);
            fqn.b(gzt.text().subtitle());
        }
    }

    /* synthetic */ gxd(HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, byte b2) {
        this(hubsGlueImageDelegate, cls);
    }

    /* synthetic */ gxd(EnumSet enumSet, HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, byte b2) {
        this(enumSet, hubsGlueImageDelegate, cls);
    }

    private gxd(HubsGlueImageDelegate hubsGlueImageDelegate, Class<C> cls) {
        super(EnumSet.of(Trait.CARD, Trait.ONE_COLUMN), cls);
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    private gxd(EnumSet<Trait> enumSet, HubsGlueImageDelegate hubsGlueImageDelegate, Class<C> cls) {
        super(enumSet, cls);
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    /* access modifiers changed from: protected */
    public void a(C c2, gzt gzt, gum gum, defpackage.gui.b bVar) {
        Drawable drawable;
        String title = gzt.text().title();
        boolean z = true;
        Assertion.a(!fax.a(title), "title is missing");
        gzw main = gzt.images().main();
        if (main == null) {
            z = false;
        }
        Assertion.a(z, "main image missing");
        a(c2.a(), main);
        Context context = c2.getView().getContext();
        String b2 = fax.b(gzt.custom().string("titleBadge"));
        if (gzt.custom().boolValue("isFresh", false)) {
            drawable = fr.a(context, (int) R.drawable.freshness_badge);
        } else if (b2.equals("shuffle")) {
            drawable = fqx.a(context);
        } else {
            drawable = null;
        }
        c2.a(title, drawable);
        has.a(c2.getView());
        c2.a(a(c2.getView().getContext(), gzt.custom()));
        guj.a(gum, c2.getView(), gzt);
        String str = "longClick";
        if (gzt.events().containsKey(str)) {
            has.a(gum.c).a(str).a(gzt).a(c2.getView()).b();
        }
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

    private static Size b(String str) {
        try {
            gbg a2 = a.a;
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

    static CardAccessoryDrawable a(Context context, gzq gzq) {
        String str = "";
        SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) defpackage.gxx.a.a.a(gzq.string("accessoryIcon", str)).d();
        if (spotifyIconV2 == null) {
            return null;
        }
        return CardAccessoryDrawable.a(context, a(gzq.string("accessoryColor", str)), b(gzq.string("accessorySize")), spotifyIconV2);
    }

    /* access modifiers changed from: 0000 */
    public void a(ImageView imageView, gzw gzw) {
        Picasso b2 = this.a.b();
        if (gzw == null || b2 == null) {
            if (b2 != null) {
                b2.d(imageView);
            }
            imageView.setImageDrawable(null);
        } else {
            Drawable a2 = this.a.a(gzw.placeholder(), (ImageConfig) HubsGlueImageConfig.CARD);
            Style a3 = a(gzw);
            utt b3 = b(a3);
            vsl a4 = new vsd(new vso(b2), imageView.getContext()).a(this.a.a(gzw.uri())).a(a2).b(a2).a(a(a3));
            if (b3 == null) {
                a4.a(imageView);
            } else {
                a4.a(uvt.a(imageView, b3));
            }
        }
    }

    private static Style a(gzw gzw) {
        String str = "style";
        Object obj = gzw.custom().get(str);
        if (obj instanceof Style) {
            return (Style) obj;
        }
        return gxb.a(gzw.custom().string(str));
    }

    private vst a(Style style) {
        int i = AnonymousClass1.a[style.ordinal()];
        if (i == 1) {
            return this.a.a().c;
        }
        if (i != 2) {
            return uvl.b();
        }
        return this.a.a().d;
    }

    private static utt b(Style style) {
        if (style == Style.CIRCULAR) {
            return uuz.a();
        }
        return null;
    }
}
