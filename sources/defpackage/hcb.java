package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.c;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.d;
import com.spotify.mobile.android.util.ui.Lifecycle;
import com.spotify.music.R;

/* renamed from: hcb reason: default package */
public final class hcb extends gwh {
    final Context a;
    final GlueHeaderLayout b;
    final hby c;
    final Fragment d;
    gxb e;
    final boolean f;
    final boolean g;
    hcs h;
    private final ViewGroup i;
    private final GridLayoutManager j;
    private final RecyclerView k;
    private final RecyclerView l;
    private final HeaderPolicy m;
    private final int n;
    private final int o;

    /* renamed from: hcb$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[HeaderPolicy.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories$HeaderPolicy[] r0 = com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories$HeaderPolicy r1 = com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy.SPLIT_LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories$HeaderPolicy r1 = com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy.ALWAYS_ON_TOP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories$HeaderPolicy r1 = com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy.SPLIT_ON_DEMAND     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories$HeaderPolicy r1 = com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy.PORTRAIT_ONLY     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hcb.AnonymousClass4.<clinit>():void");
        }
    }

    /* renamed from: hcb$a */
    public static final class a implements c {
        private final d b;
        private final sso c;

        private a(d dVar, sso sso) {
            this.b = dVar;
            this.c = sso;
        }

        public static a a(d dVar, sso sso) {
            return new a(dVar, sso);
        }

        public final gwr a(gwm gwm, Context context) {
            return a(gwm, context, a);
        }

        public final gwr a(gwm gwm, Context context, m mVar) {
            hcb hcb = new hcb(context, gwm, this.b, this.c, mVar, 0);
            return hcb;
        }
    }

    private hcb(Context context, gwm gwm, d dVar, final sso sso, m mVar) {
        this.h = hdb.EMPTY;
        fbp.a(dVar);
        this.a = (Context) fbp.a(context);
        this.m = (HeaderPolicy) fbp.a(dVar.b);
        this.d = dVar.a;
        Fragment fragment = this.d;
        boolean z = true;
        this.f = fragment != null && ToolbarConfig.a(this.a, fragment);
        if (dVar.d != null && !dVar.d.booleanValue()) {
            z = false;
        }
        this.g = z;
        this.k = a(context);
        this.k.setId(R.id.glue_header_layout_recycler);
        this.j = gxu.b(context, gwm);
        this.o = this.j.a;
        this.k.a((i) this.j);
        this.k.a((m) fbp.a(mVar));
        this.l = b(context);
        this.l.setId(R.id.hub_glue_header_layout_overlays);
        this.b = new GlueHeaderLayout(context);
        this.b.a(this.f);
        this.b.e((View) this.k);
        g();
        this.c = new hby(gwm);
        this.i = new FrameLayout(context);
        this.i.setLayoutParams(new LayoutParams(-1, -1));
        this.i.setId(R.id.hub_glue_header_layout_container);
        this.i.addView(this.b, -1, -1);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        if (this.f) {
            this.n = gav.b(context);
            layoutParams.topMargin = this.n;
        } else {
            this.n = 0;
        }
        this.i.addView(this.l, layoutParams);
        com.spotify.mobile.android.util.ui.Lifecycle.a aVar = dVar.c;
        if (aVar != null) {
            aVar.a(new Lifecycle.c() {
                public final void a(Menu menu) {
                    if (hcb.this.e == null) {
                        return;
                    }
                    if ((hcb.this.d == null || hcb.this.d.u()) && jvi.b(hcb.this.a)) {
                        hcb.this.c.a(fzv.a(hcb.this.a, menu, sso), (hcm) hcb.this.e.e.b(), (ViewGroup) hcb.this.b);
                    }
                }
            });
        }
    }

    /* synthetic */ hcb(Context context, gwm gwm, d dVar, sso sso, m mVar, byte b2) {
        this(context, gwm, dVar, sso, mVar);
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof hbz) {
            hbz hbz = (hbz) parcelable;
            ((i) fbp.a(this.k.d())).a(hbz.a);
            ((i) fbp.a(this.l.d())).a(hbz.b);
            if (hbz.c != null) {
                this.b.onRestoreInstanceState(hbz.c);
            }
            if (hbz.d) {
                this.b.post(new Runnable() {
                    public final void run() {
                        if (!hcb.this.b.d) {
                            hcb.this.b.b(false);
                        }
                    }
                });
            }
        }
    }

    public final void a(final gxb gxb) {
        this.e = gxb;
        gxb.a((c) new c() {
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00fc  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onChanged() {
                /*
                    r8 = this;
                    hcb r0 = defpackage.hcb.this
                    gxb r1 = r2
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r2 = r0.b
                    android.view.View r1 = r1.a(r2)
                    boolean r2 = r0.f()
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L_0x00c2
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r2 = r0.b
                    android.view.View r2 = r2.e(r3)
                    if (r2 == r1) goto L_0x00c5
                    hcs r2 = r0.h
                    java.lang.String r2 = r2.title()
                    java.lang.String r5 = ""
                    java.lang.Object r2 = defpackage.jvi.a(r2, r5)
                    java.lang.String r2 = (java.lang.String) r2
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r6 = r0.b
                    android.content.Context r7 = r0.a
                    fyh r7 = defpackage.ftc.a(r7)
                    r6.e = r7
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r6 = r0.b
                    r6.a(r2)
                    if (r1 == 0) goto L_0x0046
                    int r6 = r1.getId()
                    r7 = -1
                    if (r6 != r7) goto L_0x0046
                    r6 = 2131428272(0x7f0b03b0, float:1.8478184E38)
                    r1.setId(r6)
                L_0x0046:
                    boolean r6 = r1 instanceof com.spotify.android.glue.patterns.header.headers.GlueHeaderView
                    if (r6 == 0) goto L_0x005c
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r2 = r0.b
                    com.spotify.android.glue.patterns.header.headers.GlueHeaderView r1 = (com.spotify.android.glue.patterns.header.headers.GlueHeaderView) r1
                    com.spotify.android.glue.patterns.header.behavior.GlueHeaderBehavior r5 = new com.spotify.android.glue.patterns.header.behavior.GlueHeaderBehavior
                    r5.<init>()
                    r2.a(r1, r5, r4)
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r0 = r0.b
                    r0.a(r4)
                    goto L_0x00c5
                L_0x005c:
                    boolean r6 = r1 instanceof com.spotify.android.glue.patterns.prettylist.PrettyHeaderView
                    if (r6 == 0) goto L_0x00ac
                    com.spotify.android.glue.patterns.prettylist.PrettyHeaderView r1 = (com.spotify.android.glue.patterns.prettylist.PrettyHeaderView) r1
                    android.content.Context r6 = r0.a
                    fyh r6 = defpackage.ftc.a(r6)
                    boolean r7 = r0.f
                    if (r7 == 0) goto L_0x0075
                    android.content.Context r7 = r1.getContext()
                    int r7 = defpackage.gav.b(r7)
                    goto L_0x0076
                L_0x0075:
                    r7 = 0
                L_0x0076:
                    r1.b(r3)
                    r1.b(r7)
                    r1.a(r6)
                    hcs r7 = r0.h
                    hcm r7 = r7.header()
                    java.lang.Object r7 = defpackage.fbp.a(r7)
                    hcm r7 = (defpackage.hcm) r7
                    hco r7 = r7.text()
                    java.lang.String r7 = r7.title()
                    if (r7 == 0) goto L_0x0096
                    r5 = r7
                L_0x0096:
                    r1.a(r5)
                    r6.a(r2)
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r2 = r0.b
                    com.spotify.android.glue.patterns.header.behavior.LegacyHeaderBehavior r5 = new com.spotify.android.glue.patterns.header.behavior.LegacyHeaderBehavior
                    r5.<init>()
                    r2.a(r1, r5, r4)
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r0 = r0.b
                    r0.a(r4)
                    goto L_0x00c5
                L_0x00ac:
                    boolean r2 = r1 instanceof com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2
                    if (r2 == 0) goto L_0x00c2
                    com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2 r1 = (com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2) r1
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r2 = r0.b
                    com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior r5 = new com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior
                    r5.<init>()
                    r2.a(r1, r5, r4)
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r0 = r0.b
                    r0.a(r4)
                    goto L_0x00c5
                L_0x00c2:
                    r0.g()
                L_0x00c5:
                    hcb r0 = defpackage.hcb.this
                    gxb r1 = r2
                    gwn<hcm, hcm> r1 = r1.e
                    java.lang.Object r1 = r1.b()
                    hcm r1 = (defpackage.hcm) r1
                    android.content.Context r2 = r0.a
                    boolean r2 = defpackage.jvi.b(r2)
                    if (r2 == 0) goto L_0x00de
                    boolean r2 = r0.g
                    if (r2 == 0) goto L_0x00de
                    r4 = 1
                L_0x00de:
                    if (r4 != 0) goto L_0x00f4
                    boolean r2 = r0.f()
                    if (r2 == 0) goto L_0x00f4
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r2 = r0.b
                    hby r4 = r0.c
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r0 = r0.b
                    android.view.View r0 = r4.a(r1, r0)
                    r2.a(r0, r3)
                    return
                L_0x00f4:
                    com.spotify.android.glue.patterns.header.GlueHeaderLayout r1 = r0.b
                    r2 = 0
                    r1.d(r2)
                    if (r4 == 0) goto L_0x011e
                    androidx.fragment.app.Fragment r1 = r0.d
                    if (r1 == 0) goto L_0x0111
                    androidx.fragment.app.Fragment r1 = r0.d
                    r1.c(r3)
                    androidx.fragment.app.Fragment r0 = r0.d
                    kf r0 = r0.p()
                    if (r0 == 0) goto L_0x0110
                    r0.invalidateOptionsMenu()
                L_0x0110:
                    return
                L_0x0111:
                    android.content.Context r1 = r0.a
                    boolean r1 = r1 instanceof android.app.Activity
                    if (r1 == 0) goto L_0x011e
                    android.content.Context r0 = r0.a
                    android.app.Activity r0 = (android.app.Activity) r0
                    defpackage.ez.a(r0)
                L_0x011e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hcb.AnonymousClass2.onChanged():void");
            }
        });
    }

    public final void a(hcs hcs) {
        this.h = (hcs) fbp.a(hcs);
        boolean z = true;
        a(this.l, hcs.overlays().size() > 0);
        GlueHeaderLayout glueHeaderLayout = this.b;
        if (!f() || !jvi.b(this.a) || (this.m != HeaderPolicy.SPLIT_LANDSCAPE && (this.m != HeaderPolicy.SPLIT_ON_DEMAND || !gyh.a(this.h)))) {
            z = false;
        }
        glueHeaderLayout.d = z;
        if (this.b.d) {
            this.j.e_(Math.max(2, this.o / 3));
        } else {
            this.j.e_(this.o);
        }
    }

    public final void a(int... iArr) {
        if (iArr.length > 0) {
            if (iArr[0] == 0) {
                this.b.d(false);
            } else {
                this.b.b(false);
            }
        }
        super.a(iArr);
    }

    public final Parcelable b() {
        return new hbz(((i) fbp.a(this.k.d())).d(), ((i) fbp.a(this.l.d())).d(), this.b.onSaveInstanceState(), hcd.a(this.k));
    }

    public final RecyclerView c() {
        return this.k;
    }

    public final RecyclerView d() {
        return this.l;
    }

    public final View e() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        if (this.h.header() == null) {
            return false;
        }
        int i2 = AnonymousClass4.a[this.m.ordinal()];
        if (!(i2 == 1 || i2 == 2)) {
            return i2 != 3 ? jvi.a(this.a) : jvi.a(this.a) || gyh.a(this.h);
        }
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        this.b.a(new GlueNoHeaderView(this.a), new GlueNoHeaderBehavior(), true);
        this.b.a(this.f);
    }
}
