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

/* renamed from: rhx reason: default package */
public final class rhx extends defpackage.rev.a<a> {

    /* renamed from: rhx$a */
    public static class a extends defpackage.gui.c.a<RecyclerView> {
        final LinearLayoutManager b;
        gzt c;
        b d;
        private final gut e;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        a(ViewGroup viewGroup, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, gut gut) {
            super(recyclerView);
            ((RecyclerView) this.a).setNestedScrollingEnabled(viewGroup instanceof ih);
            this.b = (LinearLayoutManager) fay.a(linearLayoutManager);
            LinearLayoutManager linearLayoutManager2 = this.b;
            linearLayoutManager2.b(0);
            ((RecyclerView) this.a).a((i) this.b);
            this.e = (gut) fay.a(gut);
            ((RecyclerView) this.a).a((androidx.recyclerview.widget.RecyclerView.a) this.e, false);
            ((RecyclerView) this.a).a((m) new m() {
                public final void a(RecyclerView recyclerView, int i, int i2) {
                    gzt gzt = a.this.c;
                    b bVar = a.this.d;
                    if (gzt != null && bVar != null) {
                        bVar.a(gzt, a.this.b.d());
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
                    boolean a2 = uur.a((View) recyclerView);
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

        public final void a(gzt gzt, gum gum, b bVar) {
            this.c = gzt;
            this.d = bVar;
            this.e.a(gzt.children());
            this.b.a(this.d.a(gzt));
        }
    }

    public final int b() {
        return R.id.home_carousel;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(viewGroup, new RecyclerView(viewGroup.getContext()), new LinearLayoutManager(viewGroup.getContext()), new rhw(gum));
    }
}
