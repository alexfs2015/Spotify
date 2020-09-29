package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rir reason: default package */
public final class rir extends defpackage.rev.a<a> {
    private final rhu a;
    private final vsd b;

    /* renamed from: rir$a */
    static class a extends defpackage.gui.c.a<View> {
        private final rhu b;
        private final vsd c;
        private final ImageView d;
        private final ImageView e;
        private final TextView f;
        private final Button g;
        private final Button h;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(View view, vsd vsd, rhu rhu) {
            super(view);
            this.b = rhu;
            this.c = vsd;
            this.d = (ImageView) view.findViewById(R.id.placeholder_image);
            this.e = (ImageView) view.findViewById(R.id.home_banner_main_image);
            this.f = (TextView) view.findViewById(R.id.home_banner_title);
            this.g = (Button) view.findViewById(R.id.home_banner_cta);
            this.h = (Button) view.findViewById(R.id.home_banner_dismiss);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(defpackage.gzt r7, defpackage.gum r8, defpackage.gui.b r9) {
            /*
                r6 = this;
                com.spotify.music.homecomponents.card.HomeCardViewBinder$CardSize r9 = com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize.MEDIUM
                rhu r0 = r6.b
                android.widget.ImageView r1 = r6.d
                r0.a(r1, r9)
                gzs r9 = r7.images()
                gzw r9 = r9.background()
                if (r9 == 0) goto L_0x0022
                java.lang.String r0 = r9.uri()
                if (r0 == 0) goto L_0x0022
                java.lang.String r9 = r9.uri()
                android.net.Uri r9 = android.net.Uri.parse(r9)
                goto L_0x0024
            L_0x0022:
                android.net.Uri r9 = android.net.Uri.EMPTY
            L_0x0024:
                android.widget.ImageView r0 = r6.e
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131231251(0x7f080213, float:1.8078578E38)
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                vsd r1 = r6.c
                vsl r9 = r1.a(r9)
                r9.a(r0)
                r9.b(r0)
                android.view.View r0 = r6.a
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131165641(0x7f0701c9, float:1.7945505E38)
                int r0 = r0.getDimensionPixelSize(r1)
                float r0 = (float) r0
                android.widget.ImageView r1 = r6.e
                utt r0 = defpackage.uvc.a(r0)
                vsr r0 = defpackage.uvt.a(r1, r0)
                r9.a(r0)
                gzv r9 = r7.text()
                java.lang.String r0 = r9.title()
                boolean r0 = defpackage.fax.a(r0)
                r1 = 8
                r2 = 0
                if (r0 != 0) goto L_0x007c
                android.widget.TextView r0 = r6.f
                r0.setVisibility(r2)
                android.widget.TextView r0 = r6.f
                java.lang.String r9 = r9.title()
                r0.setText(r9)
                goto L_0x0081
            L_0x007c:
                android.widget.TextView r9 = r6.f
                r9.setVisibility(r1)
            L_0x0081:
                java.util.List r9 = r7.children()
                int r9 = r9.size()
                r0 = 1
                r3 = 2
                if (r9 >= r3) goto L_0x0093
                android.widget.Button r9 = r6.g
                r9.setVisibility(r1)
                goto L_0x00de
            L_0x0093:
                java.util.List r9 = r7.children()
                java.lang.Object r9 = r9.get(r2)
                gzt r9 = (defpackage.gzt) r9
                gzv r9 = r9.text()
                java.lang.String r9 = r9.title()
                java.util.List r4 = r7.children()
                java.lang.Object r4 = r4.get(r0)
                gzt r4 = (defpackage.gzt) r4
                gzv r4 = r4.text()
                java.lang.String r4 = r4.title()
                boolean r5 = defpackage.fax.a(r9)
                if (r5 != 0) goto L_0x00c8
                android.widget.Button r5 = r6.g
                r5.setVisibility(r2)
                android.widget.Button r5 = r6.g
                r5.setText(r9)
                goto L_0x00cd
            L_0x00c8:
                android.widget.Button r9 = r6.g
                r9.setVisibility(r1)
            L_0x00cd:
                boolean r9 = defpackage.fax.a(r4)
                if (r9 != 0) goto L_0x00de
                android.widget.Button r9 = r6.h
                r9.setVisibility(r2)
                android.widget.Button r9 = r6.h
                r9.setText(r4)
                goto L_0x00e3
            L_0x00de:
                android.widget.Button r9 = r6.h
                r9.setVisibility(r1)
            L_0x00e3:
                java.util.List r9 = r7.children()
                int r9 = r9.size()
                if (r9 < r3) goto L_0x0148
                java.util.List r9 = r7.children()
                java.lang.Object r9 = r9.get(r2)
                gzt r9 = (defpackage.gzt) r9
                java.util.List r7 = r7.children()
                java.lang.Object r7 = r7.get(r0)
                gzt r7 = (defpackage.gzt) r7
                android.widget.Button r0 = r6.g
                defpackage.has.a(r0)
                android.widget.Button r0 = r6.g
                uug r0 = defpackage.uui.c(r0)
                r0.a()
                guz r0 = r8.c
                has$b r0 = defpackage.has.a(r0)
                java.lang.String r1 = "click"
                has$d r0 = r0.a(r1)
                has$e r9 = r0.a(r9)
                android.widget.Button r0 = r6.g
                has$c r9 = r9.a(r0)
                r9.a()
                android.widget.Button r9 = r6.h
                uug r9 = defpackage.uui.c(r9)
                r9.a()
                guz r8 = r8.c
                has$b r8 = defpackage.has.a(r8)
                has$d r8 = r8.a(r1)
                has$e r7 = r8.a(r7)
                android.widget.Button r8 = r6.h
                has$c r7 = r7.a(r8)
                r7.a()
            L_0x0148:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rir.a.a(gzt, gum, gui$b):void");
        }
    }

    public final int b() {
        return R.id.home_podcast_banner;
    }

    public rir(rhu rhu, vsd vsd) {
        this.a = rhu;
        this.b = vsd;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.SPACED_VERTICALLY);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_podcast_banner_layout, viewGroup, false), this.b, this.a);
    }
}
