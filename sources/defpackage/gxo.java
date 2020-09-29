package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

/* renamed from: gxo reason: default package */
public final class gxo implements gvl<GlueHeaderView> {
    final HubsGlueImageDelegate a;

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
        haq.a((View) (GlueHeaderView) view, gzt, aVar, iArr);
    }

    public final /* synthetic */ void a(View view, final gzt gzt, gum gum, b bVar) {
        fvf fvf;
        final GlueHeaderView glueHeaderView = (GlueHeaderView) view;
        boolean z = true;
        Assertion.a(gzt.text().title() != null, "title is missing");
        Assertion.a(gzt.images().background() != null, "background image not set");
        String title = gzt.text().title();
        String subtitle = gzt.text().subtitle();
        if (subtitle != null) {
            fvr b = fve.b(glueHeaderView);
            b.b(subtitle);
            fvf = b;
        } else {
            fvf = fve.a(glueHeaderView);
        }
        fvf.a(title);
        fse fse = glueHeaderView.a.c;
        if (fse == null) {
            z = false;
        }
        Assertion.a("toolbar not set", z);
        fse.a((CharSequence) title);
        fwl.a(glueHeaderView, fvf);
        glueHeaderView.a((fvz) new fvz() {
            public final void a(fxl fxl) {
                Drawable drawable;
                ImageView c2 = fxl.c();
                gxo.this.a.a(c2);
                glueHeaderView.b(0);
                gzw background = gzt.images().background();
                if (background != null) {
                    String placeholder = background.placeholder();
                    String uri = background.uri();
                    if (uri != null) {
                        Context context = glueHeaderView.getContext();
                        if (placeholder == null) {
                            drawable = null;
                        } else {
                            drawable = fzg.a(context, (SpotifyIconV2) a.a.a(placeholder).a(SpotifyIconV2.TRACK), (float) uts.b(64.0f, context.getResources()));
                        }
                        gxo.this.a.b().a(uri).a(drawable).a(uvt.a(c2, (uvj) new uvj() {
                            public final void a(int i) {
                                glueHeaderView.b(i);
                            }
                        }));
                        return;
                    }
                    gxo.this.a.a(c2, placeholder);
                }
            }
        });
    }

    public gxo(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.noneOf(Trait.class);
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
        a d = GlueHeaderView.d();
        d.a = R.attr.glueHeaderStyleReduced;
        GlueHeaderView a2 = d.a(viewGroup.getContext());
        uuu.c(viewGroup.getContext(), 16843499);
        gaa.a(viewGroup.getContext().getResources());
        a2.a(fsi.a(a2.getContext(), a2));
        return a2;
    }
}
