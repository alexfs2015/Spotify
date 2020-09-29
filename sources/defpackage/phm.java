package defpackage;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.music.R;
import com.spotify.music.features.premiumdestination.view.RecyclerViewItemIndicator;

/* renamed from: phm reason: default package */
public final class phm extends defpackage.reu.a<b> {

    /* renamed from: phm$a */
    static class a extends h {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            int e = RecyclerView.e(view);
            boolean a2 = uur.a((View) recyclerView);
            int measuredWidth = (recyclerView.getMeasuredWidth() - view.getLayoutParams().width) / 2;
            if (e == 0) {
                if (a2) {
                    rect.set(this.b, 0, measuredWidth, 0);
                } else {
                    rect.set(measuredWidth, 0, this.b, 0);
                }
            } else if (e == ((androidx.recyclerview.widget.RecyclerView.a) fay.a(recyclerView.c())).b() - 1) {
                if (a2) {
                    rect.set(measuredWidth, 0, this.a, 0);
                } else {
                    rect.set(this.a, 0, measuredWidth, 0);
                }
            } else if (a2) {
                rect.set(this.b, 0, this.a, 0);
            } else {
                rect.set(this.a, 0, this.b, 0);
            }
        }
    }

    /* renamed from: phm$b */
    static class b extends defpackage.gui.c.a<ViewGroup> {
        private final gut b;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected b(ViewGroup viewGroup, gut gut, int i) {
            super(viewGroup);
            this.b = gut;
            RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view);
            viewGroup.getContext();
            recyclerView.a((i) new LinearLayoutManager(0, false));
            oi oiVar = new oi();
            oiVar.a(recyclerView);
            recyclerView.a((h) new a(i, i), -1);
            recyclerView.a((androidx.recyclerview.widget.RecyclerView.a) this.b);
            RecyclerViewItemIndicator recyclerViewItemIndicator = (RecyclerViewItemIndicator) viewGroup.findViewById(R.id.recycler_view_indicator);
            recyclerViewItemIndicator.a = recyclerView;
            recyclerViewItemIndicator.c = oiVar;
            recyclerViewItemIndicator.a.a(recyclerViewItemIndicator.b);
            recyclerViewItemIndicator.invalidate();
        }

        public final void a(gzt gzt, gum gum, defpackage.gui.b bVar) {
            this.b.a(gzt.children());
            this.b.e();
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_carousel;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new b((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.premium_page_carousel, viewGroup, false), new gut(gum), viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.spacing_value_card));
    }
}
