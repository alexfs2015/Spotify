package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: ubw reason: default package */
public abstract class ubw extends defpackage.rnx.a<a> {
    private final Picasso a;

    /* renamed from: ubw$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final uda b;
        private final Picasso c;

        protected a(uda uda, Picasso picasso) {
            super(uda.getView());
            this.b = uda;
            this.c = picasso;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            hco text = hcm.text();
            hcp main = hcm.images().main();
            String str = null;
            if (main != null && !TextUtils.isEmpty(main.uri())) {
                str = main.uri();
            }
            uda uda = this.b;
            String str2 = "";
            String str3 = (String) fbm.a(text.title(), str2);
            String str4 = (String) fbm.a(text.subtitle(), str2);
            if (!TextUtils.isEmpty(str3)) {
                uda.a.setText(str3.trim());
                uda.a.setVisibility(0);
            } else {
                uda.a.setVisibility(8);
            }
            if (!TextUtils.isEmpty(str4)) {
                uda.b.setText(str4.trim());
                uda.b.setVisibility(0);
            } else {
                uda.b.setVisibility(8);
            }
            uda uda2 = this.b;
            uda2.getView().setOnClickListener(new $$Lambda$ubw$a$6gXKLEVlmUYJFbDxkXprctNyfo(gwm, hcm));
            this.c.a(str).a(this.b.c);
        }
    }

    public ubw(Picasso picasso) {
        this.a = picasso;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD);
    }

    /* access modifiers changed from: 0000 */
    public abstract ucz a(Resources resources);

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(uda.a(viewGroup, a(viewGroup.getResources())), this.a);
    }
}
