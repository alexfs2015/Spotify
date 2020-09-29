package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tpo reason: default package */
public final class tpo extends a<tpu> implements gkw {
    public final List<tpq> a = new ArrayList();
    private final LayoutInflater d;
    private tpu e;

    public tpo(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
        a(true);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new tpu(this.d.inflate(R.layout.driving_pivot_item, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(u uVar) {
        tpu tpu = (tpu) uVar;
        if (this.e == tpu) {
            this.e = null;
        }
        super.a(tpu);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        tpu tpu = (tpu) uVar;
        tpq tpq = (tpq) this.a.get(i);
        this.e = tpu;
        tpu.b.setText(tpq.c());
        tpu.c.setText(tpq.d());
        tpu.a.setText(tpq.c());
        if (!tpu.c.getText().toString().isEmpty()) {
            tpu.c.setVisibility(0);
            if (tpq.i() == PivotSubtitleIcon.DOWNLOADED) {
                View view = tpu.e;
                Context context = tpu.o.getContext();
                view.setBackground(tou.a(context, SpotifyIconV2.DOWNLOADED, tou.a(context, (int) R.dimen.std_16dp), (int) R.color.white));
                tpu.e.setVisibility(0);
            } else if (tpq.i() == PivotSubtitleIcon.SHUFFLE) {
                View view2 = tpu.e;
                Context context2 = tpu.o.getContext();
                view2.setBackground(tou.a(context2, SpotifyIconV2.SHUFFLE, tou.a(context2, (int) R.dimen.std_16dp), (int) R.color.white));
                tpu.e.setVisibility(0);
            } else {
                tpu.e.setVisibility(8);
            }
            tpu.b.setTextSize(2, 34.0f);
            tpu.a.setTextSize(2, 34.0f);
            return;
        }
        tpu.c.setVisibility(8);
        tpu.e.setVisibility(8);
        tpu.b.setTextSize(2, 40.0f);
        tpu.a.setTextSize(2, 40.0f);
    }

    public final void a(List<tpq> list) {
        this.a.clear();
        if (list != null) {
            this.a.addAll(list);
        }
        e();
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i) {
        return (long) ((tpq) this.a.get(i)).a().hashCode();
    }
}
