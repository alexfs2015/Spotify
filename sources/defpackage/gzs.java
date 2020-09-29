package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsCarouselView;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: gzs reason: default package */
public final class gzs extends defpackage.gxl.a<a> {

    /* renamed from: gzs$a */
    static class a extends defpackage.gwi.c.a<RecyclerView> {
        final LinearLayoutManager b;
        hcm c;
        b d;
        private final gwt e;

        a(ViewGroup viewGroup, gwm gwm) {
            super(new HubsCarouselView(viewGroup.getContext()));
            ((RecyclerView) this.a).setNestedScrollingEnabled(viewGroup instanceof ih);
            this.b = new LinearLayoutManager(viewGroup.getContext());
            LinearLayoutManager linearLayoutManager = this.b;
            linearLayoutManager.b(0);
            final int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.hub_carousel_item_spacing);
            ((RecyclerView) this.a).a((i) this.b);
            ((RecyclerView) this.a).a((f) null);
            final boolean a = vgi.a((View) viewGroup);
            ((RecyclerView) this.a).a((h) new h() {
                public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null && layoutParams.width == -1 && layoutParams.height == -2) {
                        layoutParams.width = -2;
                        layoutParams.height = -1;
                    }
                    int f = RecyclerView.f(view);
                    rect.set(f == (a ? a.this.b.t() + -1 : 0) ? dimensionPixelSize : dimensionPixelSize / 2, 0, f == (a ? 0 : a.this.b.t() + -1) ? dimensionPixelSize : dimensionPixelSize / 2, 0);
                }
            }, -1);
            this.e = new gwt(new defpackage.gwm.a().a(gwm.a).a(gwm.b).a(gwm.d).b(gwm.e).a(gwm.f).a(gwm.g).a(gwm.i).a(gwm.j).a());
            ((RecyclerView) this.a).a((androidx.recyclerview.widget.RecyclerView.a) this.e, false);
            ((RecyclerView) this.a).a((m) new m() {
                public final void a(RecyclerView recyclerView, int i, int i2) {
                    if (a.this.c != null && a.this.d != null) {
                        a.this.d.a(a.this.c, a.this.b.d());
                    }
                }
            });
            ((RecyclerView) this.a).q = false;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a((RecyclerView) this.a, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            ((RecyclerView) this.a).f();
            this.c = hcm;
            this.d = bVar;
            this.e.a(hcm.children());
            Parcelable a = bVar.a(hcm);
            if (a != null) {
                this.b.a(a);
            } else {
                this.b.a(0, 0);
            }
            this.e.e();
        }
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE, Trait.SPACED_VERTICALLY);
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(viewGroup, gwm);
    }
}
