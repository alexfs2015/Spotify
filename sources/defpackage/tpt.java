package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: tpt reason: default package */
public abstract class tpt extends defpackage.rev.a<a> {
    private final Picasso a;

    /* renamed from: tpt$a */
    static class a extends defpackage.gui.c.a<View> {
        private final tqx b;
        private final Picasso c;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(tqx tqx, Picasso picasso) {
            super(tqx.getView());
            this.b = tqx;
            this.c = picasso;
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            gzv text = gzt.text();
            gzw main = gzt.images().main();
            String str = null;
            if (main != null && !TextUtils.isEmpty(main.uri())) {
                str = main.uri();
            }
            tqx tqx = this.b;
            String str2 = "";
            String str3 = (String) fav.a(text.title(), str2);
            String str4 = (String) fav.a(text.subtitle(), str2);
            if (!TextUtils.isEmpty(str3)) {
                tqx.a.setText(str3.trim());
                tqx.a.setVisibility(0);
            } else {
                tqx.a.setVisibility(8);
            }
            if (!TextUtils.isEmpty(str4)) {
                tqx.b.setText(str4.trim());
                tqx.b.setVisibility(0);
            } else {
                tqx.b.setVisibility(8);
            }
            tqx tqx2 = this.b;
            tqx2.getView().setOnClickListener(new $$Lambda$tpt$a$kDIjY1SktQLAA9HcJPdXs4xs7MM(gum, gzt));
            this.c.a(str).a(this.b.c);
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract tqw a(Resources resources);

    public tpt(Picasso picasso) {
        this.a = picasso;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(tqx.a(viewGroup, a(viewGroup.getResources())), this.a);
    }
}
