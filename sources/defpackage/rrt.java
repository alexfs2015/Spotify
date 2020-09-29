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

/* renamed from: rrt reason: default package */
public final class rrt extends defpackage.rnx.a<a> {
    private final rqw a;
    private final wgj b;

    /* renamed from: rrt$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final rqw b;
        private final wgj c;
        private final ImageView d;
        private final ImageView e;
        private final TextView f;
        private final Button g;
        private final Button h;

        protected a(View view, wgj wgj, rqw rqw) {
            super(view);
            this.b = rqw;
            this.c = wgj;
            this.d = (ImageView) view.findViewById(R.id.placeholder_image);
            this.e = (ImageView) view.findViewById(R.id.home_banner_main_image);
            this.f = (TextView) view.findViewById(R.id.home_banner_title);
            this.g = (Button) view.findViewById(R.id.home_banner_cta);
            this.h = (Button) view.findViewById(R.id.home_banner_dismiss);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(defpackage.hcm r7, defpackage.gwm r8, defpackage.gwi.b r9) {
            /*
                r6 = this;
                com.spotify.music.homecomponents.card.HomeCardViewBinder$CardSize r9 = com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize.MEDIUM
                rqw r0 = r6.b
                android.widget.ImageView r1 = r6.d
                r0.a(r1, r9)
                hcl r9 = r7.images()
                hcp r9 = r9.background()
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
                r1 = 2131231250(0x7f080212, float:1.8078576E38)
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                wgj r1 = r6.c
                wgr r9 = r1.a(r9)
                r9.a(r0)
                r9.b(r0)
                android.view.View r0 = r6.a
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131165653(0x7f0701d5, float:1.794553E38)
                int r0 = r0.getDimensionPixelSize(r1)
                float r0 = (float) r0
                android.widget.ImageView r1 = r6.e
                vfk r0 = defpackage.vgt.a(r0)
                wgx r0 = defpackage.vhj.a(r1, r0)
                r9.a(r0)
                hco r9 = r7.text()
                java.lang.String r0 = r9.title()
                boolean r0 = defpackage.fbo.a(r0)
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
                hcm r9 = (defpackage.hcm) r9
                hco r9 = r9.text()
                java.lang.String r9 = r9.title()
                java.util.List r4 = r7.children()
                java.lang.Object r4 = r4.get(r0)
                hcm r4 = (defpackage.hcm) r4
                hco r4 = r4.text()
                java.lang.String r4 = r4.title()
                boolean r5 = defpackage.fbo.a(r9)
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
                boolean r9 = defpackage.fbo.a(r4)
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
                hcm r9 = (defpackage.hcm) r9
                java.util.List r7 = r7.children()
                java.lang.Object r7 = r7.get(r0)
                hcm r7 = (defpackage.hcm) r7
                android.widget.Button r0 = r6.g
                defpackage.hdl.a(r0)
                android.widget.Button r0 = r6.g
                vfx r0 = defpackage.vfz.c(r0)
                r0.a()
                gwz r0 = r8.c
                hdl$b r0 = defpackage.hdl.a(r0)
                java.lang.String r1 = "click"
                hdl$d r0 = r0.a(r1)
                hdl$e r9 = r0.a(r9)
                android.widget.Button r0 = r6.g
                hdl$c r9 = r9.a(r0)
                r9.a()
                android.widget.Button r9 = r6.h
                vfx r9 = defpackage.vfz.c(r9)
                r9.a()
                gwz r8 = r8.c
                hdl$b r8 = defpackage.hdl.a(r8)
                hdl$d r8 = r8.a(r1)
                hdl$e r7 = r8.a(r7)
                android.widget.Button r8 = r6.h
                hdl$c r7 = r7.a(r8)
                r7.a()
            L_0x0148:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rrt.a.a(hcm, gwm, gwi$b):void");
        }
    }

    public rrt(rqw rqw, wgj wgj) {
        this.a = rqw;
        this.b = wgj;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.SPACED_VERTICALLY);
    }

    public final int b() {
        return R.id.home_podcast_banner;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_podcast_banner_layout, viewGroup, false), this.b, this.a);
    }
}
