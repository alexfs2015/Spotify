package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.music.R;
import com.spotify.music.libs.search.transition.FindSearchFieldView;

/* renamed from: mdr reason: default package */
public final class mdr extends gwh implements mdq {
    private final Context a;
    private final boolean b;
    private final RecyclerView c;
    private final GlueHeaderLayout d;
    private final RecyclerView e;
    private final ViewGroup f;
    private final b g;
    private final lyx h;
    private hcs i;
    private gxb j;
    private final mdn k;

    /* renamed from: mdr$a */
    static class a extends defpackage.gwr.a {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                defpackage.gwr.a aVar = (defpackage.gwr.a) defpackage.gwr.a.CREATOR.createFromParcel(parcel);
                return new a(aVar.a, aVar.b, parcel.readParcelable(a.class.getClassLoader()), juo.a(parcel));
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        public final Parcelable c;
        public final boolean d;

        public a(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
            super(parcelable, parcelable2);
            this.c = parcelable3;
            this.d = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
            juo.a(parcel, this.d);
        }
    }

    /* renamed from: mdr$b */
    static class b {
        final String a;

        public b(String str) {
            this.a = str;
        }
    }

    public mdr(gwm gwm, Context context, rok rok, boolean z, mbu mbu, mdn mdn, b bVar, lyx lyx) {
        fbp.a(gwm);
        this.a = (Context) fbp.a(context);
        this.b = z;
        this.k = (mdn) fbp.a(mdn);
        this.g = (b) fbp.a(bVar);
        this.h = (lyx) fbp.a(lyx);
        GridLayoutManager b2 = gxu.b(context, gwm);
        RecyclerView a2 = a(context);
        a2.a((i) b2);
        a2.setId(R.id.glue_header_layout_recycler);
        this.c = a2;
        this.c.a((m) mbu);
        RecyclerView recyclerView = this.c;
        GlueHeaderLayout glueHeaderLayout = new GlueHeaderLayout(context);
        glueHeaderLayout.e((View) recyclerView);
        glueHeaderLayout.a(false);
        this.d = glueHeaderLayout;
        RecyclerView b3 = b(context);
        b3.setId(R.id.hub_glue_header_layout_overlays);
        this.e = b3;
        GlueHeaderLayout glueHeaderLayout2 = this.d;
        RecyclerView recyclerView2 = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.hub_glue_header_layout_container);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        frameLayout.addView(glueHeaderLayout2, layoutParams);
        frameLayout.addView(recyclerView2, layoutParams);
        this.f = frameLayout;
        rok.a(this.c);
        rok.a(this.e);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(gxb gxb) {
        View a2 = gxb.a((ViewGroup) this.d);
        this.d.e = ftc.a(this.a);
        if (a2 instanceof GlueHeaderViewV2) {
            GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) a2;
            this.d.a(glueHeaderViewV2, new GlueHeaderV2Behavior(), false);
            this.d.a(false);
            if (glueHeaderViewV2.getId() == -1) {
                glueHeaderViewV2.setId(R.id.glue_header_layout_header);
            }
        }
        GlueHeaderLayout glueHeaderLayout = this.d;
        b bVar = this.g;
        hcs hcs = this.i;
        String str = null;
        if (hcs != null) {
            hcm header = hcs.header();
            str = header != null ? header.text().title() : hcs.title();
        }
        if (fbo.a(str)) {
            str = bVar.a;
        }
        glueHeaderLayout.a((CharSequence) str);
        this.k.a(this.d, (hcm) this.j.e.b());
        ez.a((Activity) this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.d.b(false);
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            ((i) fbp.a(this.c.d())).a(aVar.a);
            ((i) fbp.a(this.e.d())).a(aVar.b);
            if (aVar.c != null) {
                this.d.onRestoreInstanceState(aVar.c);
            }
            if (f() && aVar.d) {
                this.d.post(new $$Lambda$mdr$JNhdXAU_JdWe4kOeatgSPiZNOGo(this));
            }
        }
    }

    public final void a(fzn fzn) {
        mdn mdn = this.k;
        mdn.a = fzn;
        mdn.a(this.d, (hcm) this.j.e.b());
    }

    public final void a(gxb gxb) {
        super.a(gxb);
        this.j = gxb;
        gxb.a((c) new $$Lambda$mdr$yB9PvggXHCo3q3ZBhIJCHBcFI6E(this, gxb));
    }

    public final void a(hcs hcs) {
        this.i = (hcs) fbp.a(hcs);
        a(this.e, !hcs.overlays().isEmpty());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (((r3 == null || (androidx.recyclerview.widget.RecyclerView.e(r3) == 0 && ((androidx.recyclerview.widget.RecyclerView.i) defpackage.fbp.a(r0.d())).l(r3) == 0)) ? false : true) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable b() {
        /*
            r5 = this;
            boolean r0 = r5.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002a
            androidx.recyclerview.widget.RecyclerView r0 = r5.c
            android.view.View r3 = r0.getChildAt(r2)
            if (r3 == 0) goto L_0x0026
            int r4 = androidx.recyclerview.widget.RecyclerView.e(r3)
            if (r4 != 0) goto L_0x0024
            androidx.recyclerview.widget.RecyclerView$i r0 = r0.d()
            java.lang.Object r0 = defpackage.fbp.a(r0)
            androidx.recyclerview.widget.RecyclerView$i r0 = (androidx.recyclerview.widget.RecyclerView.i) r0
            int r0 = r0.l(r3)
            if (r0 == 0) goto L_0x0026
        L_0x0024:
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            mdr$a r0 = new mdr$a
            androidx.recyclerview.widget.RecyclerView r2 = r5.c
            androidx.recyclerview.widget.RecyclerView$i r2 = r2.d()
            java.lang.Object r2 = defpackage.fbp.a(r2)
            androidx.recyclerview.widget.RecyclerView$i r2 = (androidx.recyclerview.widget.RecyclerView.i) r2
            android.os.Parcelable r2 = r2.d()
            androidx.recyclerview.widget.RecyclerView r3 = r5.e
            androidx.recyclerview.widget.RecyclerView$i r3 = r3.d()
            java.lang.Object r3 = defpackage.fbp.a(r3)
            androidx.recyclerview.widget.RecyclerView$i r3 = (androidx.recyclerview.widget.RecyclerView.i) r3
            android.os.Parcelable r3 = r3.d()
            com.spotify.android.glue.patterns.header.GlueHeaderLayout r4 = r5.d
            android.os.Parcelable r4 = r4.onSaveInstanceState()
            r0.<init>(r2, r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdr.b():android.os.Parcelable");
    }

    public final RecyclerView c() {
        return this.c;
    }

    public final RecyclerView d() {
        return this.e;
    }

    public final View e() {
        return (View) fbp.a(this.f);
    }

    public final boolean f() {
        return this.d.e(true) instanceof GlueHeaderViewV2;
    }

    public final void g() {
        FindSearchFieldView findSearchFieldView = (FindSearchFieldView) e().findViewById(R.id.find_search_field);
        if (findSearchFieldView != null) {
            this.h.a(lzp.a(srp.a((View) findSearchFieldView), findSearchFieldView.a(), findSearchFieldView.b()));
        }
    }
}
