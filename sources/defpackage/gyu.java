package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.header.backgrounds.HeaderGenericBackground.VisualStyle;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;
import java.util.EnumSet;
import java.util.List;

/* renamed from: gyu reason: default package */
public abstract class gyu<H extends GlueHeaderView> implements gxl<H> {
    final HubsGlueImageDelegate a;

    /* renamed from: gyu$a */
    public static final class a extends gyu<GlueHeaderView> {
        public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, 0);
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
            com.spotify.android.glue.patterns.header.headers.GlueHeaderView.a d = GlueHeaderView.d();
            d.b = VisualStyle.COLOR_ONLY;
            return d.a(viewGroup.getContext());
        }

        /* access modifiers changed from: protected */
        public final fvz a(GlueHeaderView glueHeaderView, hcm hcm) {
            fvz fvz;
            fwf fwf;
            gyu.super.a(glueHeaderView, hcm);
            String title = hcm.text().title();
            String subtitle = hcm.text().subtitle();
            String accessory = hcm.text().accessory();
            String description = hcm.text().description();
            if (title != null) {
                if (subtitle != null) {
                    if (accessory != null) {
                        fwh g = fvy.g(glueHeaderView);
                        g.c(accessory);
                        fwf = g;
                    } else {
                        fwf = fvy.f(glueHeaderView);
                    }
                    fwf.b(subtitle);
                    fvz = fwf;
                } else {
                    fvz = fvy.e(glueHeaderView);
                }
                fvz.a(title);
                return fvz;
            } else if (description != null) {
                fwj d = fvy.d(glueHeaderView);
                d.a(description);
                return d;
            } else {
                fwf f = fvy.f(glueHeaderView);
                f.a(null);
                f.b(null);
                return f;
            }
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            gyu.a((GlueHeaderView) view, hcm, aVar, iArr);
        }

        public final void a(final GlueHeaderView glueHeaderView, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gyu.super.a(glueHeaderView, hcm, gwm, bVar);
            hcp main = hcm.images().main();
            String str = null;
            String uri = main != null ? main.uri() : null;
            if (main != null) {
                str = main.placeholder();
            }
            List a = ((fxc) fbp.a(glueHeaderView.a.b)).a();
            fbp.a(!a.isEmpty());
            ImageView a2 = ((fvx) a.get(0)).a();
            this.a.a(a2);
            if (uri != null) {
                if (!fbn.a(uri, glueHeaderView.getTag(R.id.hub_glue_internal_tag_cover_art))) {
                    glueHeaderView.b(0);
                }
                this.a.b().a(uri).a(gyu.a(glueHeaderView.getContext(), str)).a(vhj.a(a2, (vha) new vha() {
                    public final void a(int i) {
                        glueHeaderView.b(i);
                    }
                }));
            } else if (main != null) {
                glueHeaderView.b(0);
                this.a.a(a2, str);
            }
            glueHeaderView.setTag(R.id.hub_glue_internal_tag_cover_art, uri);
            gwj.a(gwm, (View) a2, hcm);
        }
    }

    /* renamed from: gyu$b */
    public static final class b extends gyu<GlueHeaderView> {
        b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, 0);
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
            com.spotify.android.glue.patterns.header.headers.GlueHeaderView.a d = GlueHeaderView.d();
            d.a = R.attr.glueHeaderStyleReduced;
            GlueHeaderView a = d.a(viewGroup.getContext());
            vgl.c(viewGroup.getContext(), 16843499);
            gau.a(viewGroup.getContext().getResources());
            return a;
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            gyu.a((GlueHeaderView) view, hcm, aVar, iArr);
        }

        public final void a(GlueHeaderView glueHeaderView, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gyu.super.a(glueHeaderView, hcm, gwm, bVar);
            final hcp background = hcm.images().background();
            final String uri = background != null ? background.uri() : null;
            final String placeholder = background != null ? background.placeholder() : null;
            String string = hcm.custom().string("backgroundColor");
            final Integer valueOf = string != null ? Integer.valueOf(Color.parseColor(string)) : null;
            final GlueHeaderView glueHeaderView2 = glueHeaderView;
            AnonymousClass1 r0 = new fwt() {
                public final void a(fyf fyf) {
                    ImageView c2 = fyf.c();
                    b.this.a.a(c2);
                    Integer num = valueOf;
                    glueHeaderView2.b(num == null ? 0 : num.intValue());
                    if (uri != null) {
                        wgr a2 = b.this.a.b().a(uri).a(gyu.a(glueHeaderView2.getContext(), placeholder));
                        if (valueOf == null) {
                            a2.a(vhj.a(c2, (vha) new vha() {
                                public final void a(int i) {
                                    glueHeaderView2.b(i);
                                }
                            }));
                        } else {
                            a2.a(c2);
                        }
                    } else if (background != null) {
                        b.this.a.a(c2, placeholder);
                    }
                }
            };
            glueHeaderView.a((fwt) r0);
        }
    }

    /* renamed from: gyu$c */
    public static final class c extends gyu<GlueHeaderView> {
        public c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, 0);
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
            return GlueHeaderView.d().a(viewGroup.getContext());
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            gyu.a((GlueHeaderView) view, hcm, aVar, iArr);
        }

        public final void a(GlueHeaderView glueHeaderView, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gyu.super.a(glueHeaderView, hcm, gwm, bVar);
            hcp background = hcm.images().background();
            ImageView c = glueHeaderView.c();
            Uri parse = background != null ? Uri.parse(background.uri()) : Uri.EMPTY;
            c.setColorFilter(fr.c(c.getContext(), R.color.cat_black_40));
            if (!Uri.EMPTY.equals(parse)) {
                this.a.b().a(parse).a((int) R.color.cat_black_40).b((int) R.color.cat_black_40).a(c);
            } else {
                this.a.b().d(c);
            }
        }
    }

    private gyu(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    /* synthetic */ gyu(HubsGlueImageDelegate hubsGlueImageDelegate, byte b2) {
        this(hubsGlueImageDelegate);
    }

    static /* synthetic */ Drawable a(Context context, String str) {
        if (str == null) {
            return null;
        }
        return gaa.a(context, (SpotifyIconV2) defpackage.haq.a.a.a(str).a(SpotifyIconV2.TRACK), (float) vfj.b(64.0f, context.getResources()));
    }

    public static void a(H h, hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        if (iArr.length == 0) {
            hdj.a((View) h, hcm, aVar, iArr);
            return;
        }
        throw new UnsupportedOperationException("Actions on header children not yet implemented!");
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [fvz] */
    /* JADX WARNING: type inference failed for: r1v3, types: [fwj, fvz] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6, types: [fvz] */
    /* JADX WARNING: type inference failed for: r5v7, types: [fvz] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9, types: [fwl] */
    /* JADX WARNING: type inference failed for: r5v10, types: [fwl] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.fvz a(H r4, defpackage.hcm r5) {
        /*
            r3 = this;
            hco r0 = r5.text()
            java.lang.String r0 = r0.title()
            hco r1 = r5.text()
            java.lang.String r1 = r1.subtitle()
            hco r2 = r5.text()
            java.lang.String r2 = r2.accessory()
            hco r5 = r5.text()
            java.lang.String r5 = r5.description()
            if (r0 == 0) goto L_0x0049
            if (r1 == 0) goto L_0x0036
            if (r2 == 0) goto L_0x002e
            fwm r5 = defpackage.fvy.c(r4)
            r5.c(r2)
            goto L_0x0032
        L_0x002e:
            fwl r5 = defpackage.fvy.b(r4)
        L_0x0032:
            r5.b(r1)
            goto L_0x0045
        L_0x0036:
            if (r5 == 0) goto L_0x0041
            fwj r1 = defpackage.fvy.d(r4)
            r1.b(r5)
            r5 = r1
            goto L_0x0045
        L_0x0041:
            fvz r5 = defpackage.fvy.a(r4)
        L_0x0045:
            r5.a(r0)
            goto L_0x005f
        L_0x0049:
            if (r5 == 0) goto L_0x0054
            fwj r1 = defpackage.fvy.d(r4)
            r1.a(r5)
            r5 = r1
            goto L_0x005f
        L_0x0054:
            fwl r5 = defpackage.fvy.b(r4)
            r1 = 0
            r5.a(r1)
            r5.b(r1)
        L_0x005f:
            fws r4 = r4.a
            fsy r4 = r4.c
            if (r4 == 0) goto L_0x0068
            r4.a(r0)
        L_0x0068:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyu.a(com.spotify.android.glue.patterns.header.headers.GlueHeaderView, hcm):fvz");
    }

    public final EnumSet<Trait> a() {
        return EnumSet.noneOf(Trait.class);
    }

    public /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
        a((H) (GlueHeaderView) view, hcm, aVar, iArr);
    }

    public void a(H h, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        fxf.a(h, a(h, hcm));
        h.a(ftc.a(h.getContext(), h));
    }
}
