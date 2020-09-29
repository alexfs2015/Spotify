package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pgt reason: default package */
public final class pgt extends a<pgx> implements gjl {
    private final pgw a;
    private final pgz d;
    private final List<pgy> e = new ArrayList(5);
    private final pgh f;

    public final int b() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void a(u uVar, int i) {
        ((pgx) uVar).a(this.e);
    }

    public pgt(pgw pgw, pgz pgz, pgh pgh) {
        this.a = pgw;
        this.d = pgz;
        this.f = pgh;
        this.e.add(new pgy(R.string.comparison_description_ad_interruptions, R.string.comparison_description_ad_free, R.drawable.ic_comparison_ad_interruptions, R.drawable.ic_comparison_ad_free));
        this.e.add(new pgy(R.string.comparison_description_shuffle_only, R.string.comparison_description_any_track, R.drawable.ic_comparison_shuffle_only, R.drawable.ic_comparison_on_demand));
        this.e.add(new pgy(R.string.comparison_description_limited_skips, R.string.comparison_description_unlimited_skips, R.drawable.ic_comparison_limited_skips, R.drawable.ic_comparison_unlimited_skips));
        this.e.add(new pgy(R.string.comparison_description_streaming_only, R.string.comparison_description_download_tracks, R.drawable.ic_comparison_streaming_only, R.drawable.ic_comparison_offline));
        this.e.add(new pgy(R.string.comparison_description_basic_audio, R.string.comparison_description_extreme_audio, R.drawable.ic_comparison_basic_audio, R.drawable.ic_comparison_extreme_audio));
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new pgx(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.free_vs_premium, viewGroup, false), this.a, this.d, this.f);
    }
}
