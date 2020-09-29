package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: qhm reason: default package */
public final class qhm extends a<u> implements gjl {
    final Picasso a;
    private final List<qhk> d;
    private final a e;

    public qhm(List<qhk> list, Picasso picasso, a aVar) {
        this.d = list;
        this.a = picasso;
        this.e = aVar;
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (i == R.layout.list_result_page_header) {
            return new qhl(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }
        if (i == R.layout.list_entity_page_header) {
            return new qhi(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }
        if (i == 1251) {
            return new qhj(viewGroup);
        }
        throw new IllegalArgumentException("Unknown view type");
    }

    public final void a(final u uVar, int i) {
        ((qhk) this.d.get(i)).a((gcs<c>) new gcs<c>() {
            public final /* synthetic */ void accept(Object obj) {
                ((qhl) uVar).a.setText(((c) obj).a);
            }
        }, (gcs<b>) new gcs<b>() {
            public final /* synthetic */ void accept(Object obj) {
                b bVar = (b) obj;
                qhj qhj = (qhj) uVar;
                Picasso picasso = qhm.this.a;
                qhf qhf = bVar.a;
                fri fri = (fri) fqf.a(qhj.o, fri.class);
                fri.a(qhf.c());
                fri.b(qhf.d());
                qgd.a(picasso, qhj.o.getContext(), fri.c(), qhf.a(), qhf.b());
                SpotifyIconView i = fzz.i(qhj.o.getContext());
                i.a(SpotifyIconV2.PLAY);
                i.a(fr.c(qhj.o.getContext(), R.color.white));
                fri.a(i);
            }
        }, (gcs<a>) new gcs<a>() {
            public final /* synthetic */ void accept(Object obj) {
                a aVar = (a) obj;
                qhi qhi = (qhi) uVar;
                Picasso picasso = qhm.this.a;
                qhf qhf = aVar.a;
                fri fri = (fri) fqf.a(qhi.a, fri.class);
                fri.a(true);
                fri.a(qhf.c());
                fri.b(qhf.d());
                qgd.a(picasso, qhi.a.getContext(), fri.c(), qhf.a(), qhf.b());
                SpotifyIconView i = fzz.i(qhi.o.getContext());
                i.a(SpotifyIconV2.CHEVRON_RIGHT);
                fri.a(i);
            }
        });
        uVar.o.setOnClickListener(new $$Lambda$qhm$64lvY0opgi5GvmQYyV1HbvwzN0(this, uVar));
    }

    public final int a(int i) {
        return ((Integer) ((qhk) this.d.get(i)).a((gct<c, R_>) $$Lambda$Z2xEXjGVEYNESgubp_Sbc0pfoe0.INSTANCE, (gct<b, R_>) $$Lambda$7LrEc3Pqy8N7prS0JFYY9EvGVE.INSTANCE, (gct<a, R_>) $$Lambda$ptloc1A_tbtduQK5UrLofprhAUM.INSTANCE)).intValue();
    }

    public final int b() {
        return this.d.size();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(u uVar, View view) {
        int e2 = uVar.e();
        if (e2 != -1) {
            a aVar = this.e;
            qhk qhk = (qhk) this.d.get(e2);
            if (uVar instanceof qhj) {
                e2--;
            }
            aVar.a(qhk, e2);
        }
    }
}
