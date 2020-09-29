package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.music.features.chart.model.ChartEntryStatus;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: met reason: default package */
public final class met extends androidx.recyclerview.widget.RecyclerView.a<u> implements gkw, ovm<met> {
    private static final gce<ChartEntryStatus> a = gce.a(ChartEntryStatus.class);
    private Map<ChartEntryStatus, Drawable> d = new EnumMap(ChartEntryStatus.class);
    private final ovj e;
    private final twc<ovg> f;
    private final ovh g;
    private List<vle> h = Collections.emptyList();
    private ItemConfiguration i = ItemConfiguration.r().a();
    private boolean j;

    /* renamed from: met$a */
    public interface a {
        met a(tvw tvw, who<jor<ovg>> who);
    }

    public met(Context context, ovj ovj, defpackage.twc.a<ovg> aVar, ovh ovh, tvw tvw, who<jor<ovg>> who) {
        this.f = aVar.a(tvw, who);
        this.g = ovh;
        this.e = ovj;
        a(true);
        int a2 = vfj.a(16.0f, context.getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.CHART_DOWN_16);
        spotifyIconDrawable.a(fr.c(context, R.color.charts_legend_arrow_down));
        spotifyIconDrawable.setBounds(0, 0, a2, a2);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIcon.CHART_UP_16);
        spotifyIconDrawable2.a(fr.c(context, R.color.charts_legend_arrow_up));
        spotifyIconDrawable2.setBounds(0, 0, a2, a2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new mey(context.getResources().getDimensionPixelSize(R.dimen.charts_chart_legend_icon_size)));
        shapeDrawable.getPaint().setColor(fr.c(context, R.color.charts_legend_circle));
        shapeDrawable.setBounds(0, 0, a2, a2);
        this.d.put(ChartEntryStatus.DOWN, spotifyIconDrawable);
        this.d.put(ChartEntryStatus.UP, spotifyIconDrawable2);
        this.d.put(ChartEntryStatus.NEW, shapeDrawable);
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        fqv.b();
        return fra.a(fsk.c(viewGroup.getContext(), viewGroup, false));
    }

    public final void a(u uVar, int i2) {
        vle vle = (vle) this.h.get(i2);
        uVar.o.getContext();
        u uVar2 = uVar;
        vle vle2 = vle;
        this.f.a(uVar2, this.i, vle2, ovh.a(vle, i2), this.e.a(vle), this.j, i2);
        fsh fsh = (fsh) fqv.a(uVar.o, fsh.class);
        fsh.a(Integer.parseInt((String) fbp.a(vle.c().get("current_pos"))));
        Optional b = a.b((String) fbp.a(vle.c().get("status")));
        if (b.b()) {
            fsh.a((Drawable) this.d.get(b.c()));
        }
    }

    public final void a(ItemConfiguration itemConfiguration) {
        if (this.i != itemConfiguration) {
            this.i = itemConfiguration;
            e();
        }
    }

    public final void a(String str, boolean z) {
        if (this.e.a(str) || this.j != z) {
            e();
        }
        this.j = z;
    }

    public final void a(List<vle> list) {
        this.h = (List) fbp.a(list);
        e();
    }

    public final int b() {
        return this.h.size();
    }

    public final long b(int i2) {
        vle vle = (vle) this.h.get(i2);
        long hashCode = (long) (hashCode() ^ vle.getUri().hashCode());
        String d2 = vle.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }
}
