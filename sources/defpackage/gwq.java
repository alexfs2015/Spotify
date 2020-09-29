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

/* renamed from: gwq reason: default package */
public abstract class gwq<H extends GlueHeaderView> implements gvl<H> {
    final HubsGlueImageDelegate a;

    /* renamed from: gwq$a */
    public static final class a extends gwq<GlueHeaderView> {
        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
            gwq.a((GlueHeaderView) view, gzt, aVar, iArr);
        }

        public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, 0);
        }

        /* access modifiers changed from: protected */
        public final fvf a(GlueHeaderView glueHeaderView, gzt gzt) {
            fvf fvf;
            fvl fvl;
            gwq.super.a(glueHeaderView, gzt);
            String title = gzt.text().title();
            String subtitle = gzt.text().subtitle();
            String accessory = gzt.text().accessory();
            String description = gzt.text().description();
            if (title != null) {
                if (subtitle != null) {
                    if (accessory != null) {
                        fvn g = fve.g(glueHeaderView);
                        g.c(accessory);
                        fvl = g;
                    } else {
                        fvl = fve.f(glueHeaderView);
                    }
                    fvl.b(subtitle);
                    fvf = fvl;
                } else {
                    fvf = fve.e(glueHeaderView);
                }
                fvf.a(title);
                return fvf;
            } else if (description != null) {
                fvp d = fve.d(glueHeaderView);
                d.a(description);
                return d;
            } else {
                fvl f = fve.f(glueHeaderView);
                f.a(null);
                f.b(null);
                return f;
            }
        }

        public final void a(final GlueHeaderView glueHeaderView, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwq.super.a(glueHeaderView, gzt, gum, bVar);
            gzw main = gzt.images().main();
            String str = null;
            String uri = main != null ? main.uri() : null;
            if (main != null) {
                str = main.placeholder();
            }
            List a = ((fwi) fay.a(glueHeaderView.a.b)).a();
            fay.a(!a.isEmpty());
            ImageView a2 = ((fvd) a.get(0)).a();
            this.a.a(a2);
            if (uri != null) {
                if (!faw.a(uri, glueHeaderView.getTag(R.id.hub_glue_internal_tag_cover_art))) {
                    glueHeaderView.b(0);
                }
                this.a.b().a(uri).a(gwq.a(glueHeaderView.getContext(), str)).a(uvt.a(a2, (uvj) new uvj() {
                    public final void a(int i) {
                        glueHeaderView.b(i);
                    }
                }));
            } else if (main != null) {
                glueHeaderView.b(0);
                this.a.a(a2, str);
            }
            glueHeaderView.setTag(R.id.hub_glue_internal_tag_cover_art, uri);
            guj.a(gum, (View) a2, gzt);
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
            com.spotify.android.glue.patterns.header.headers.GlueHeaderView.a d = GlueHeaderView.d();
            d.b = VisualStyle.COLOR_ONLY;
            return d.a(viewGroup.getContext());
        }
    }

    /* renamed from: gwq$b */
    public static final class b extends gwq<GlueHeaderView> {
        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
            gwq.a((GlueHeaderView) view, gzt, aVar, iArr);
        }

        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, 0);
        }

        public final void a(GlueHeaderView glueHeaderView, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwq.super.a(glueHeaderView, gzt, gum, bVar);
            final gzw background = gzt.images().background();
            final String uri = background != null ? background.uri() : null;
            final String placeholder = background != null ? background.placeholder() : null;
            String string = gzt.custom().string("backgroundColor");
            final Integer valueOf = string != null ? Integer.valueOf(Color.parseColor(string)) : null;
            final GlueHeaderView glueHeaderView2 = glueHeaderView;
            AnonymousClass1 r0 = new fvz() {
                public final void a(fxl fxl) {
                    ImageView c2 = fxl.c();
                    b.this.a.a(c2);
                    Integer num = valueOf;
                    glueHeaderView2.b(num == null ? 0 : num.intValue());
                    if (uri != null) {
                        vsl a2 = b.this.a.b().a(uri).a(gwq.a(glueHeaderView2.getContext(), placeholder));
                        if (valueOf == null) {
                            a2.a(uvt.a(c2, (uvj) new uvj() {
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
            glueHeaderView.a((fvz) r0);
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
            com.spotify.android.glue.patterns.header.headers.GlueHeaderView.a d = GlueHeaderView.d();
            d.a = R.attr.glueHeaderStyleReduced;
            GlueHeaderView a = d.a(viewGroup.getContext());
            uuu.c(viewGroup.getContext(), 16843499);
            gaa.a(viewGroup.getContext().getResources());
            return a;
        }
    }

    /* renamed from: gwq$c */
    public static final class c extends gwq<GlueHeaderView> {
        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
            gwq.a((GlueHeaderView) view, gzt, aVar, iArr);
        }

        public c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, 0);
        }

        public final void a(GlueHeaderView glueHeaderView, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwq.super.a(glueHeaderView, gzt, gum, bVar);
            gzw background = gzt.images().background();
            ImageView c = glueHeaderView.c();
            Uri parse = background != null ? Uri.parse(background.uri()) : Uri.EMPTY;
            c.setColorFilter(fr.c(c.getContext(), R.color.cat_black_40));
            if (!Uri.EMPTY.equals(parse)) {
                this.a.b().a(parse).a((int) R.color.cat_black_40).b((int) R.color.cat_black_40).a(c);
            } else {
                this.a.b().d(c);
            }
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
            return GlueHeaderView.d().a(viewGroup.getContext());
        }
    }

    /* synthetic */ gwq(HubsGlueImageDelegate hubsGlueImageDelegate, byte b2) {
        this(hubsGlueImageDelegate);
    }

    public /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
        a((H) (GlueHeaderView) view, gzt, aVar, iArr);
    }

    private gwq(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.noneOf(Trait.class);
    }

    public void a(H h, gzt gzt, gum gum, defpackage.gui.b bVar) {
        fwl.a(h, a(h, gzt));
        h.a(fsi.a(h.getContext(), h));
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [fvf] */
    /* JADX WARNING: type inference failed for: r1v3, types: [fvp, fvf] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6, types: [fvf] */
    /* JADX WARNING: type inference failed for: r5v7, types: [fvf] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9, types: [fvr] */
    /* JADX WARNING: type inference failed for: r5v10, types: [fvr] */
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
    public defpackage.fvf a(H r4, defpackage.gzt r5) {
        /*
            r3 = this;
            gzv r0 = r5.text()
            java.lang.String r0 = r0.title()
            gzv r1 = r5.text()
            java.lang.String r1 = r1.subtitle()
            gzv r2 = r5.text()
            java.lang.String r2 = r2.accessory()
            gzv r5 = r5.text()
            java.lang.String r5 = r5.description()
            if (r0 == 0) goto L_0x0049
            if (r1 == 0) goto L_0x0036
            if (r2 == 0) goto L_0x002e
            fvs r5 = defpackage.fve.c(r4)
            r5.c(r2)
            goto L_0x0032
        L_0x002e:
            fvr r5 = defpackage.fve.b(r4)
        L_0x0032:
            r5.b(r1)
            goto L_0x0045
        L_0x0036:
            if (r5 == 0) goto L_0x0041
            fvp r1 = defpackage.fve.d(r4)
            r1.b(r5)
            r5 = r1
            goto L_0x0045
        L_0x0041:
            fvf r5 = defpackage.fve.a(r4)
        L_0x0045:
            r5.a(r0)
            goto L_0x005f
        L_0x0049:
            if (r5 == 0) goto L_0x0054
            fvp r1 = defpackage.fve.d(r4)
            r1.a(r5)
            r5 = r1
            goto L_0x005f
        L_0x0054:
            fvr r5 = defpackage.fve.b(r4)
            r1 = 0
            r5.a(r1)
            r5.b(r1)
        L_0x005f:
            fvy r4 = r4.a
            fse r4 = r4.c
            if (r4 == 0) goto L_0x0068
            r4.a(r0)
        L_0x0068:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwq.a(com.spotify.android.glue.patterns.header.headers.GlueHeaderView, gzt):fvf");
    }

    public static void a(H h, gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        if (iArr.length == 0) {
            haq.a((View) h, gzt, aVar, iArr);
            return;
        }
        throw new UnsupportedOperationException("Actions on header children not yet implemented!");
    }

    static /* synthetic */ Drawable a(Context context, String str) {
        if (str == null) {
            return null;
        }
        return fzg.a(context, (SpotifyIconV2) defpackage.gxx.a.a.a(str).a(SpotifyIconV2.TRACK), (float) uts.b(64.0f, context.getResources()));
    }
}
