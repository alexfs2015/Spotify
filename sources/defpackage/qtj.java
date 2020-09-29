package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.GridRecyclerView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: qtj reason: default package */
public final class qtj extends ConstraintLayout implements qrb {
    private final a b;
    private final qra c;
    private GridRecyclerView d = ((GridRecyclerView) findViewById(R.id.recycler_view));
    private qql e;

    public qtj(Context context, a aVar, qra qra) {
        super(context);
        inflate(getContext(), R.layout.taste_picker_grid_view, this);
        setId(R.id.picker_view);
        this.b = aVar;
        this.c = qra;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, View view, TasteOnboardingItem tasteOnboardingItem) {
        this.b.a(i, tasteOnboardingItem, gkr.a(view));
        this.c.g();
    }

    public final void a(TasteOnboardingItem tasteOnboardingItem) {
        this.b.a(tasteOnboardingItem);
    }

    public final void a(List<TasteOnboardingItem> list) {
        this.e.a(list);
    }

    public final void a(qql qql) {
        this.e = qql;
        this.e.e = new $$Lambda$qtj$WeccWoIeo748cRmFX7LbF8PHvrY(this);
        this.d.a((a) qql);
    }

    public final void a(qsc qsc) {
        qsc.b(this.d);
    }

    public final void aJ_() {
        setVisibility(0);
    }

    public final void b() {
        setVisibility(8);
    }

    public final void b(qsc qsc) {
        qsc.a(this.d);
    }

    public final void c() {
        this.d.setLayoutAnimation(null);
    }

    public final View d() {
        return this;
    }
}
