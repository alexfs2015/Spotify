package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.PageIndicator;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.ShelfGridRecyclerView;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ShelfView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qqw reason: default package */
public final class qqw extends ith<TasteOnboardingItem> {
    public final ShelfView a;
    private final a<TasteOnboardingItem> b;
    private final qqo c;
    private final qsb d;
    private final qqs e;

    public qqw(ShelfView shelfView, a<TasteOnboardingItem> aVar, qqo qqo, qsb qsb, qqs qqs) {
        super(shelfView);
        this.a = (ShelfView) fbp.a(shelfView);
        this.b = aVar;
        this.c = qqo;
        this.d = qsb;
        this.e = qqs;
        this.a.c.a((a) fbp.a(this.c));
        qth qth = new qth();
        ShelfView shelfView2 = this.a;
        shelfView2.e = qth;
        shelfView2.e.a((RecyclerView) shelfView2.c);
    }

    public final /* synthetic */ void a(Object obj, int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        this.a.b.setText(tasteOnboardingItem.name());
        this.c.a(tasteOnboardingItem.relatedItems());
        this.c.e = this.b;
        ShelfView shelfView = this.a;
        PageIndicator pageIndicator = shelfView.d;
        ShelfGridRecyclerView shelfGridRecyclerView = shelfView.c;
        qth qth = shelfView.e;
        pageIndicator.a = shelfGridRecyclerView;
        pageIndicator.b = qth;
        pageIndicator.b.b = pageIndicator;
        pageIndicator.invalidate();
        pageIndicator.requestLayout();
        shelfView.f = shelfView.d;
        this.a.b(-1 == i ? 0 : this.e.a[i]);
    }

    public final void y() {
        super.y();
        qqs qqs = this.e;
        int e2 = e();
        int computeHorizontalScrollOffset = this.a.c.computeHorizontalScrollOffset();
        if (-1 != e2) {
            qqs.a[e2] = computeHorizontalScrollOffset;
        }
    }
}
