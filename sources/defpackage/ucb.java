package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;
import java.util.Locale;

/* renamed from: ucb reason: default package */
abstract class ucb extends defpackage.rnx.a<a> {
    private final Picasso a;
    private final ubu b;

    /* renamed from: ucb$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final ude b;
        private final Picasso c;
        private final ubu d;

        protected a(ude ude, Picasso picasso, ubu ubu) {
            super(ude.getView());
            this.b = ude;
            this.c = picasso;
            this.d = ubu;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            hco text = hcm.text();
            hcp main = hcm.images().main();
            hcp background = hcm.images().background();
            String str = null;
            String uri = main != null ? main.uri() : null;
            if (background != null) {
                str = background.uri();
            }
            String string = hcm.custom().string("releaseDate");
            int intValue = hcm.custom().intValue("episodeDuration", 0);
            int intValue2 = hcm.custom().intValue("listenedDuration", 0);
            String b2 = jun.b(this.d.a(string, intValue).toLowerCase(Locale.getDefault()), Locale.getDefault());
            int i = (intValue <= 0 || intValue2 <= 0) ? -1 : (intValue2 * 100) / intValue;
            boolean boolValue = hcm.custom().boolValue("downloadedBadge", false);
            ude ude = this.b;
            String str2 = "";
            String str3 = (String) fbm.a(text.title(), str2);
            String str4 = (String) fbm.a(text.description(), str2);
            ude.a.b();
            ude.c = new uds(new defpackage.udv.a(), ude.a);
            uds uds = ude.c;
            String trim = str3.trim();
            String trim2 = str4.trim();
            String trim3 = b2.trim();
            udu udu = uds.a;
            udw udw = uds.c;
            defpackage.udr.a aVar = new defpackage.udr.a(trim, trim2, trim3, boolValue, i);
            uds.c = udu.a(udw, aVar);
            uds.b.a(uds.c);
            if (!TextUtils.isEmpty(uri)) {
                this.c.a(uri).a(this.b.b.a());
            }
            if (!TextUtils.isEmpty(str) && !str.equals(uri)) {
                this.c.a(str).a(this.b.d);
            }
            this.b.a.a().setOnClickListener(new $$Lambda$ucb$a$QgPuTPtQniSYHMAEBOH7tc79WBU(gwm, hcm));
        }
    }

    ucb(Picasso picasso, ubu ubu) {
        this.a = picasso;
        this.b = ubu;
    }

    public EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD);
    }

    /* access modifiers changed from: 0000 */
    public abstract udc a(Resources resources);

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(ude.a(a(viewGroup.getResources()), viewGroup.getContext(), viewGroup), this.a, this.b);
    }
}
