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

/* renamed from: tfe reason: default package */
public final class tfe extends a<tfk> implements gjl {
    public final List<tfg> a = new ArrayList();
    private final LayoutInflater d;
    private tfk e;

    public final /* bridge */ /* synthetic */ void a(u uVar) {
        tfk tfk = (tfk) uVar;
        if (this.e == tfk) {
            this.e = null;
        }
        super.a(tfk);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        tfk tfk = (tfk) uVar;
        tfg tfg = (tfg) this.a.get(i);
        this.e = tfk;
        tfk.b.setText(tfg.c());
        tfk.c.setText(tfg.d());
        tfk.a.setText(tfg.c());
        if (!tfk.c.getText().toString().isEmpty()) {
            tfk.c.setVisibility(0);
            if (tfg.i() == PivotSubtitleIcon.DOWNLOADED) {
                View view = tfk.e;
                Context context = tfk.o.getContext();
                view.setBackground(tek.a(context, SpotifyIconV2.DOWNLOADED, tek.a(context, (int) R.dimen.std_16dp), (int) R.color.white));
                tfk.e.setVisibility(0);
            } else if (tfg.i() == PivotSubtitleIcon.SHUFFLE) {
                View view2 = tfk.e;
                Context context2 = tfk.o.getContext();
                view2.setBackground(tek.a(context2, SpotifyIconV2.SHUFFLE, tek.a(context2, (int) R.dimen.std_16dp), (int) R.color.white));
                tfk.e.setVisibility(0);
            } else {
                tfk.e.setVisibility(8);
            }
            tfk.b.setTextSize(2, 34.0f);
            tfk.a.setTextSize(2, 34.0f);
            return;
        }
        tfk.c.setVisibility(8);
        tfk.e.setVisibility(8);
        tfk.b.setTextSize(2, 40.0f);
        tfk.a.setTextSize(2, 40.0f);
    }

    public tfe(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
        a(true);
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i) {
        return (long) ((tfg) this.a.get(i)).a().hashCode();
    }

    public final void a(List<tfg> list) {
        this.a.clear();
        if (list != null) {
            this.a.addAll(list);
        }
        e();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new tfk(this.d.inflate(R.layout.driving_pivot_item, viewGroup, false));
    }
}
