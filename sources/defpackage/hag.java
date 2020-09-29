package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: hag reason: default package */
public final class hag implements gxl<GlueHeaderView> {
    final HubsGlueImageDelegate a;

    public hag(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        a d = GlueHeaderView.d();
        d.a = R.attr.glueHeaderStyleReduced;
        GlueHeaderView a2 = d.a(viewGroup.getContext());
        vgl.c(viewGroup.getContext(), 16843499);
        gau.a(viewGroup.getContext().getResources());
        a2.a(ftc.a(a2.getContext(), a2));
        return a2;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.noneOf(Trait.class);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
        hdj.a((View) (GlueHeaderView) view, hcm, aVar, iArr);
    }

    public final /* synthetic */ void a(View view, final hcm hcm, gwm gwm, b bVar) {
        fvz fvz;
        final GlueHeaderView glueHeaderView = (GlueHeaderView) view;
        boolean z = true;
        Assertion.a(hcm.text().title() != null, "title is missing");
        Assertion.a(hcm.images().background() != null, "background image not set");
        String title = hcm.text().title();
        String subtitle = hcm.text().subtitle();
        if (subtitle != null) {
            fwl b = fvy.b(glueHeaderView);
            b.b(subtitle);
            fvz = b;
        } else {
            fvz = fvy.a(glueHeaderView);
        }
        fvz.a(title);
        fsy fsy = glueHeaderView.a.c;
        if (fsy == null) {
            z = false;
        }
        Assertion.a("toolbar not set", z);
        fsy.a((CharSequence) title);
        fxf.a(glueHeaderView, fvz);
        glueHeaderView.a((fwt) new fwt() {
            public final void a(fyf fyf) {
                ImageView c2 = fyf.c();
                hag.this.a.a(c2);
                glueHeaderView.b(0);
                hcp background = hcm.images().background();
                if (background != null) {
                    String placeholder = background.placeholder();
                    String uri = background.uri();
                    if (uri != null) {
                        Context context = glueHeaderView.getContext();
                        hag.this.a.b().a(uri).a(placeholder == null ? null : gaa.a(context, (SpotifyIconV2) a.a.a(placeholder).a(SpotifyIconV2.TRACK), (float) vfj.b(64.0f, context.getResources()))).a(vhj.a(c2, (vha) new vha() {
                            public final void a(int i) {
                                glueHeaderView.b(i);
                            }
                        }));
                        return;
                    }
                    hag.this.a.a(c2, placeholder);
                }
            }
        });
    }
}
