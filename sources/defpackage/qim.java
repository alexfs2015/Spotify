package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.PageIndicator;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.ShelfGridRecyclerView;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ShelfView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qim reason: default package */
public final class qim extends iqu<TasteOnboardingItem> {
    public final ShelfView a;
    private final a<TasteOnboardingItem> b;
    private final qie c;
    private final qjs d;
    private final qii e;

    public final /* synthetic */ void a(Object obj, int i) {
        int i2;
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        this.a.b.setText(tasteOnboardingItem.name());
        this.c.a(tasteOnboardingItem.relatedItems());
        this.c.e = this.b;
        ShelfView shelfView = this.a;
        PageIndicator pageIndicator = shelfView.d;
        ShelfGridRecyclerView shelfGridRecyclerView = shelfView.c;
        qky qky = shelfView.e;
        pageIndicator.a = shelfGridRecyclerView;
        pageIndicator.b = qky;
        pageIndicator.b.b = pageIndicator;
        pageIndicator.invalidate();
        pageIndicator.requestLayout();
        shelfView.f = shelfView.d;
        ShelfView shelfView2 = this.a;
        qii qii = this.e;
        if (-1 == i) {
            i2 = 0;
        } else {
            i2 = qii.a[i];
        }
        shelfView2.b(i2);
    }

    public qim(ShelfView shelfView, a<TasteOnboardingItem> aVar, qie qie, qjs qjs, qii qii) {
        super(shelfView);
        this.a = (ShelfView) fay.a(shelfView);
        this.b = aVar;
        this.c = qie;
        this.d = qjs;
        this.e = qii;
        this.a.c.a((a) fay.a(this.c));
        qky qky = new qky();
        ShelfView shelfView2 = this.a;
        shelfView2.e = qky;
        shelfView2.e.a((RecyclerView) shelfView2.c);
    }

    public final void x() {
        super.x();
        qii qii = this.e;
        int e2 = e();
        int computeHorizontalScrollOffset = this.a.c.computeHorizontalScrollOffset();
        if (-1 != e2) {
            qii.a[e2] = computeHorizontalScrollOffset;
        }
    }
}
