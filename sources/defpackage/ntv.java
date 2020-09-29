package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import com.spotify.music.R;
import com.spotify.music.features.homemix.models.HomeMixPlanType;

/* renamed from: ntv reason: default package */
public final class ntv {
    final ViewGroup a;
    final TextView b;
    final ntq c;
    private final TextView d = ((TextView) this.a.findViewById(R.id.home_mix_taste_viz_learn_more));
    private final boolean e;
    private final ntt f;
    private final View g = this.a.findViewById(R.id.home_mix_taste_viz_cta);

    public ntv(ntq ntq, ntt ntt, LayoutInflater layoutInflater, boolean z) {
        this.c = ntq;
        this.e = z;
        this.f = ntt;
        this.a = (ViewGroup) layoutInflater.inflate(R.layout.home_mix_taste_viz_view, null);
        RecyclerView recyclerView = (RecyclerView) this.a.findViewById(R.id.recycler_view);
        recyclerView.a((a) this.c);
        recyclerView.a((f) null);
        View findViewById = this.a.findViewById(R.id.action_button);
        findViewById.setOnClickListener(new $$Lambda$ntv$MEPHmNYKWP4mk05P0ly3Hi_1M8(this));
        this.b = (TextView) this.a.findViewById(R.id.home_mix_taste_viz_welcome);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f.a.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f.b(this.e);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f.a(this.e);
    }

    /* access modifiers changed from: 0000 */
    public void a(HomeMixPlanType homeMixPlanType, String str) {
        Context context = this.a.getContext();
        String a2 = homeMixPlanType.a(context);
        String string = context.getString(homeMixPlanType.mNameResId);
        if (this.e) {
            this.g.setVisibility(0);
            this.b.setText(context.getString(R.string.home_mix_view_taste_viz_welcome, new Object[]{a2}));
            this.d.setText(context.getString(R.string.home_mix_view_taste_viz_learn_more, new Object[]{a2}));
            this.d.setOnClickListener(new $$Lambda$ntv$YnygYiQroEbz8OxLHM1rbp6VHfI(this));
            return;
        }
        this.g.setVisibility(8);
        this.b.setText(context.getString(R.string.home_mix_view_taste_viz_top_genres, new Object[]{string, str}));
        this.d.setText(context.getString(R.string.home_mix_view_taste_viz_close));
        this.d.setOnClickListener(new $$Lambda$ntv$htUeoaTphHBqcdaw6GM0M1xMQkw(this));
    }
}
