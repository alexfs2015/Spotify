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

/* renamed from: gwi reason: default package */
public final class gwi extends defpackage.gvl.a<a> {

    /* renamed from: gwi$a */
    static class a extends defpackage.gui.c.a<RecyclerView> {
        final LinearLayoutManager b;
        gzt c;
        b d;
        private final gut e;

        a(ViewGroup viewGroup, gum gum) {
            super(new HubsCarouselView(viewGroup.getContext()));
            ((RecyclerView) this.a).setNestedScrollingEnabled(viewGroup instanceof ih);
            this.b = new LinearLayoutManager(viewGroup.getContext());
            LinearLayoutManager linearLayoutManager = this.b;
            linearLayoutManager.b(0);
            final int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.hub_carousel_item_spacing);
            ((RecyclerView) this.a).a((i) this.b);
            ((RecyclerView) this.a).a((f) null);
            final boolean a = uur.a((View) viewGroup);
            ((RecyclerView) this.a).a((h) new h() {
                public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null && layoutParams.width == -1 && layoutParams.height == -2) {
                        layoutParams.width = -2;
                        layoutParams.height = -1;
                    }
                    int f = RecyclerView.f(view);
                    int t = a.this.b.t() - 1;
                    int i = dimensionPixelSize;
                    if (f != 0) {
                        i /= 2;
                    }
                    int i2 = f == t ? dimensionPixelSize : dimensionPixelSize / 2;
                    int i3 = a ? i2 : i;
                    if (a) {
                        i2 = i;
                    }
                    rect.set(i3, 0, i2, 0);
                }
            }, -1);
            this.e = new gut(gum);
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

        public final void a(gzt gzt, gum gum, b bVar) {
            ((RecyclerView) this.a).f();
            this.c = gzt;
            this.d = bVar;
            this.e.a(gzt.children());
            Parcelable a = bVar.a(gzt);
            if (a != null) {
                this.b.a(a);
            } else {
                this.b.a(0, 0);
            }
            this.e.e();
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a((RecyclerView) this.a, aVar, iArr);
        }
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE, Trait.SPACED_VERTICALLY);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(viewGroup, gum);
    }
}
