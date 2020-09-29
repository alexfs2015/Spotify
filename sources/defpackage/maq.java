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

/* renamed from: maq reason: default package */
public final class maq extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjl, oog<maq> {
    private static final gbg<ChartEntryStatus> a = gbg.a(ChartEntryStatus.class);
    private Map<ChartEntryStatus, Drawable> d = new EnumMap(ChartEntryStatus.class);
    private final ood e;
    private final tkk<ooa> f;
    private final oob g;
    private List<uzb> h = Collections.emptyList();
    private ItemConfiguration i = ItemConfiguration.r().a();
    private boolean j;

    /* renamed from: maq$a */
    public interface a {
        maq a(tke tke, vti<jmf<ooa>> vti);
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    public maq(Context context, ood ood, defpackage.tkk.a<ooa> aVar, oob oob, tke tke, vti<jmf<ooa>> vti) {
        this.f = aVar.a(tke, vti);
        this.g = oob;
        this.e = ood;
        a(true);
        int a2 = uts.a(16.0f, context.getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.CHART_DOWN_16);
        spotifyIconDrawable.a(fr.c(context, R.color.charts_legend_arrow_down));
        spotifyIconDrawable.setBounds(0, 0, a2, a2);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIcon.CHART_UP_16);
        spotifyIconDrawable2.a(fr.c(context, R.color.charts_legend_arrow_up));
        spotifyIconDrawable2.setBounds(0, 0, a2, a2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new mav(context.getResources().getDimensionPixelSize(R.dimen.charts_chart_legend_icon_size)));
        shapeDrawable.getPaint().setColor(fr.c(context, R.color.charts_legend_circle));
        shapeDrawable.setBounds(0, 0, a2, a2);
        this.d.put(ChartEntryStatus.DOWN, spotifyIconDrawable);
        this.d.put(ChartEntryStatus.UP, spotifyIconDrawable2);
        this.d.put(ChartEntryStatus.NEW, shapeDrawable);
    }

    public final void a(List<uzb> list) {
        this.h = (List) fay.a(list);
        e();
    }

    public final int b() {
        return this.h.size();
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

    public final long b(int i2) {
        uzb uzb = (uzb) this.h.get(i2);
        long hashCode = (long) (hashCode() ^ uzb.getUri().hashCode());
        String d2 = uzb.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        fqb.b();
        return fqg.a(frq.c(viewGroup.getContext(), viewGroup, false));
    }

    public final void a(u uVar, int i2) {
        uzb uzb = (uzb) this.h.get(i2);
        uVar.o.getContext();
        u uVar2 = uVar;
        uzb uzb2 = uzb;
        this.f.a(uVar2, this.i, uzb2, oob.a(uzb, i2), this.e.a(uzb), this.j, i2);
        frn frn = (frn) fqb.a(uVar.o, frn.class);
        frn.a(Integer.parseInt((String) fay.a(uzb.c().get("current_pos"))));
        Optional b = a.b((String) fay.a(uzb.c().get("status")));
        if (b.b()) {
            frn.a((Drawable) this.d.get(b.c()));
        }
    }
}
