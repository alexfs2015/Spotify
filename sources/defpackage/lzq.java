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

/* renamed from: lzq reason: default package */
public final class lzq extends guh implements lzp {
    private final Context a;
    private final boolean b;
    private final RecyclerView c;
    private final GlueHeaderLayout d;
    private final RecyclerView e;
    private final ViewGroup f;
    private final b g;
    private final luy h;
    private gzz i;
    private gvb j;
    private final lzm k;

    /* renamed from: lzq$a */
    static class a extends defpackage.gur.a {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                defpackage.gur.a aVar = (defpackage.gur.a) defpackage.gur.a.CREATOR.createFromParcel(parcel);
                return new a(aVar.a, aVar.b, parcel.readParcelable(a.class.getClassLoader()), jse.a(parcel));
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
            jse.a(parcel, this.d);
        }
    }

    /* renamed from: lzq$b */
    static class b {
        final String a;

        public b(String str) {
            this.a = str;
        }
    }

    public lzq(gum gum, Context context, rfi rfi, boolean z, lxt lxt, lzm lzm, b bVar, luy luy) {
        fay.a(gum);
        this.a = (Context) fay.a(context);
        this.b = z;
        this.k = (lzm) fay.a(lzm);
        this.g = (b) fay.a(bVar);
        this.h = (luy) fay.a(luy);
        GridLayoutManager b2 = gvt.b(context, gum);
        RecyclerView a2 = a(context);
        a2.a((i) b2);
        a2.setId(R.id.glue_header_layout_recycler);
        this.c = a2;
        this.c.a((m) lxt);
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
        rfi.a(this.c);
        rfi.a(this.e);
    }

    public final void a(gvb gvb) {
        super.a(gvb);
        this.j = gvb;
        gvb.a((c) new $$Lambda$lzq$tdD4ICklfk4Y1DRLy6WUDikW0vY(this, gvb));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(gvb gvb) {
        String str;
        View a2 = gvb.a((ViewGroup) this.d);
        this.d.e = fsi.a(this.a);
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
        gzz gzz = this.i;
        String str2 = null;
        if (gzz != null) {
            gzt header = gzz.header();
            if (header != null) {
                str = header.text().title();
            } else {
                str = gzz.title();
            }
            str2 = str;
        }
        if (fax.a(str2)) {
            str2 = bVar.a;
        }
        glueHeaderLayout.a((CharSequence) str2);
        this.k.a(this.d, (gzt) this.j.e.b());
        ez.a((Activity) this.a);
    }

    public final void a(gzz gzz) {
        this.i = (gzz) fay.a(gzz);
        a(this.e, !gzz.overlays().isEmpty());
    }

    public final View e() {
        return (View) fay.a(this.f);
    }

    public final boolean f() {
        return this.d.e(true) instanceof GlueHeaderViewV2;
    }

    public final void a(fyt fyt) {
        lzm lzm = this.k;
        lzm.a = fyt;
        lzm.a(this.d, (gzt) this.j.e.b());
    }

    public final void g() {
        FindSearchFieldView findSearchFieldView = (FindSearchFieldView) e().findViewById(R.id.find_search_field);
        if (findSearchFieldView != null) {
            this.h.a(lvq.a(shi.a((View) findSearchFieldView), findSearchFieldView.a(), findSearchFieldView.b()));
        }
    }

    public final RecyclerView c() {
        return this.c;
    }

    public final RecyclerView d() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (((r3 == null || (androidx.recyclerview.widget.RecyclerView.e(r3) == 0 && ((androidx.recyclerview.widget.RecyclerView.i) defpackage.fay.a(r0.d())).l(r3) == 0)) ? false : true) != false) goto L_0x002b;
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
            java.lang.Object r0 = defpackage.fay.a(r0)
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
            lzq$a r0 = new lzq$a
            androidx.recyclerview.widget.RecyclerView r2 = r5.c
            androidx.recyclerview.widget.RecyclerView$i r2 = r2.d()
            java.lang.Object r2 = defpackage.fay.a(r2)
            androidx.recyclerview.widget.RecyclerView$i r2 = (androidx.recyclerview.widget.RecyclerView.i) r2
            android.os.Parcelable r2 = r2.d()
            androidx.recyclerview.widget.RecyclerView r3 = r5.e
            androidx.recyclerview.widget.RecyclerView$i r3 = r3.d()
            java.lang.Object r3 = defpackage.fay.a(r3)
            androidx.recyclerview.widget.RecyclerView$i r3 = (androidx.recyclerview.widget.RecyclerView.i) r3
            android.os.Parcelable r3 = r3.d()
            com.spotify.android.glue.patterns.header.GlueHeaderLayout r4 = r5.d
            android.os.Parcelable r4 = r4.onSaveInstanceState()
            r0.<init>(r2, r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzq.b():android.os.Parcelable");
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            ((i) fay.a(this.c.d())).a(aVar.a);
            ((i) fay.a(this.e.d())).a(aVar.b);
            if (aVar.c != null) {
                this.d.onRestoreInstanceState(aVar.c);
            }
            if (f() && aVar.d) {
                this.d.post(new $$Lambda$lzq$QeCsbOiyIN3ZrI36_l8idSdYMhU(this));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.d.b(false);
    }
}
