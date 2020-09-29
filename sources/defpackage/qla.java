package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.GridRecyclerView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: qla reason: default package */
public final class qla extends ConstraintLayout implements qir {
    private final a b;
    private final qiq c;
    private GridRecyclerView d = ((GridRecyclerView) findViewById(R.id.recycler_view));
    private qib e;

    public final View d() {
        return this;
    }

    public qla(Context context, a aVar, qiq qiq) {
        super(context);
        inflate(getContext(), R.layout.taste_picker_grid_view, this);
        setId(R.id.picker_view);
        this.b = aVar;
        this.c = qiq;
    }

    public final void a(qib qib) {
        this.e = qib;
        this.e.e = new $$Lambda$qla$cYxXzM0nI0WcrpqufsyGDZZ9XK0(this);
        this.d.a((a) qib);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, View view, TasteOnboardingItem tasteOnboardingItem) {
        this.b.a(i, tasteOnboardingItem, gjg.a(view));
        this.c.g();
    }

    public final void a(List<TasteOnboardingItem> list) {
        this.e.a(list);
    }

    public final void a(TasteOnboardingItem tasteOnboardingItem) {
        this.b.a(tasteOnboardingItem);
    }

    public final void a(qjt qjt) {
        qjt.b(this.d);
    }

    public final void b(qjt qjt) {
        qjt.a(this.d);
    }

    public final void aL_() {
        setVisibility(0);
    }

    public final void b() {
        setVisibility(8);
    }

    public final void c() {
        this.d.setLayoutAnimation(null);
    }
}
