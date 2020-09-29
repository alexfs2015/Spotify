package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.LinearRecyclerView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: qtl reason: default package */
public final class qtl extends ConstraintLayout implements qrb {
    private final a b;
    private final qra c;
    private LinearRecyclerView d = ((LinearRecyclerView) findViewById(R.id.recycler_view));
    private qql e;

    public qtl(Context context, a aVar, qra qra) {
        super(context);
        inflate(getContext(), R.layout.taste_picker_shelf_view, this);
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
        this.e.e = new $$Lambda$qtl$y1JZDfDqMBAZzTZ5TJF0mAdT4HA(this);
        this.d.a((a) qql);
    }

    public final void a(qsc qsc) {
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
    }

    public final View d() {
        return this;
    }
}
