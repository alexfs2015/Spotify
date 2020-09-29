package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rqz reason: default package */
public final class rqz extends defpackage.rnx.a<a> {

    /* renamed from: rqz$a */
    public static class a extends defpackage.gwi.c.a<RecyclerView> {
        final LinearLayoutManager b;
        hcm c;
        b d;
        private final gwt e;

        a(ViewGroup viewGroup, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, gwt gwt) {
            super(recyclerView);
            ((RecyclerView) this.a).setNestedScrollingEnabled(viewGroup instanceof ih);
            this.b = (LinearLayoutManager) fbp.a(linearLayoutManager);
            LinearLayoutManager linearLayoutManager2 = this.b;
            linearLayoutManager2.b(0);
            ((RecyclerView) this.a).a((i) this.b);
            this.e = (gwt) fbp.a(gwt);
            ((RecyclerView) this.a).a((androidx.recyclerview.widget.RecyclerView.a) this.e, false);
            ((RecyclerView) this.a).a((m) new m() {
                public final void a(RecyclerView recyclerView, int i, int i2) {
                    hcm hcm = a.this.c;
                    b bVar = a.this.d;
                    if (hcm != null && bVar != null) {
                        bVar.a(hcm, a.this.b.d());
                    }
                }
            });
            ((RecyclerView) this.a).q = false;
            final int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.home_carousel_item_spacing);
            final int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(R.dimen.home_carouse_top_padding);
            ((RecyclerView) this.a).a((h) new h() {
                public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
                    int f = RecyclerView.f(view);
                    int t = a.this.b.t() - 1;
                    boolean a2 = vgi.a((View) recyclerView);
                    int i = dimensionPixelSize;
                    if (f != 0) {
                        i /= 2;
                    }
                    int i2 = f == t ? dimensionPixelSize : dimensionPixelSize / 2;
                    int i3 = a2 ? i2 : i;
                    int i4 = dimensionPixelSize2;
                    if (a2) {
                        i2 = i;
                    }
                    rect.set(i3, i4, i2, dimensionPixelSize2);
                }
            }, -1);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.c = hcm;
            this.d = bVar;
            this.e.a(hcm.children());
            this.b.a(this.d.a(hcm));
        }
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final int b() {
        return R.id.home_carousel;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(viewGroup, new RecyclerView(viewGroup.getContext()), new LinearLayoutManager(viewGroup.getContext()), new rqy(gwm));
    }
}
