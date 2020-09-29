package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;
import java.util.Locale;

/* renamed from: tpy reason: default package */
abstract class tpy extends defpackage.rev.a<a> {
    private final Picasso a;
    private final tpr b;

    /* renamed from: tpy$a */
    static class a extends defpackage.gui.c.a<View> {
        private final trb b;
        private final Picasso c;
        private final tpr d;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(trb trb, Picasso picasso, tpr tpr) {
            super(trb.getView());
            this.b = trb;
            this.c = picasso;
            this.d = tpr;
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            int i;
            gzv text = gzt.text();
            gzw main = gzt.images().main();
            gzw background = gzt.images().background();
            String str = null;
            String uri = main != null ? main.uri() : null;
            if (background != null) {
                str = background.uri();
            }
            String string = gzt.custom().string("releaseDate");
            int intValue = gzt.custom().intValue("episodeDuration", 0);
            int intValue2 = gzt.custom().intValue("listenedDuration", 0);
            String b2 = jsd.b(this.d.a(string, intValue).toLowerCase(Locale.getDefault()), Locale.getDefault());
            if (intValue <= 0 || intValue2 <= 0) {
                i = -1;
            } else {
                i = (intValue2 * 100) / intValue;
            }
            boolean boolValue = gzt.custom().boolValue("downloadedBadge", false);
            trb trb = this.b;
            String str2 = "";
            String str3 = (String) fav.a(text.title(), str2);
            String str4 = (String) fav.a(text.description(), str2);
            trb.a.b();
            trb.c = new trp(new defpackage.trs.a(), trb.a);
            trp trp = trb.c;
            String trim = str3.trim();
            String trim2 = str4.trim();
            String trim3 = b2.trim();
            trr trr = trp.a;
            trt trt = trp.c;
            defpackage.tro.a aVar = new defpackage.tro.a(trim, trim2, trim3, boolValue, i);
            trp.c = trr.a(trt, aVar);
            trp.b.a(trp.c);
            if (!TextUtils.isEmpty(uri)) {
                this.c.a(uri).a(this.b.b.a());
            }
            if (!TextUtils.isEmpty(str) && !str.equals(uri)) {
                this.c.a(str).a(this.b.d);
            }
            this.b.a.a().setOnClickListener(new $$Lambda$tpy$a$ttpqL9hUp2Aja0kpMyTMvSQGwrU(gum, gzt));
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract tqz a(Resources resources);

    tpy(Picasso picasso, tpr tpr) {
        this.a = picasso;
        this.b = tpr;
    }

    public EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(trb.a(a(viewGroup.getResources()), viewGroup.getContext(), viewGroup), this.a, this.b);
    }
}
