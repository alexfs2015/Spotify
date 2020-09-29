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

/* renamed from: qqa reason: default package */
public final class qqa extends a<u> implements gkw {
    final Picasso a;
    private final List<qpy> d;
    private final a e;

    public qqa(List<qpy> list, Picasso picasso, a aVar) {
        this.d = list;
        this.a = picasso;
        this.e = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(u uVar, View view) {
        int e2 = uVar.e();
        if (e2 != -1) {
            a aVar = this.e;
            qpy qpy = (qpy) this.d.get(e2);
            if (uVar instanceof qpx) {
                e2--;
            }
            aVar.a(qpy, e2);
        }
    }

    public final int a(int i) {
        return ((Integer) ((qpy) this.d.get(i)).a((gee<c, R_>) $$Lambda$8EJrzagakc7ZxNt2bFHzmalj8Y.INSTANCE, (gee<b, R_>) $$Lambda$HL5YJTKGQk9a2ACJ17ETLqEfnp4.INSTANCE, (gee<a, R_>) $$Lambda$7a2cIRJNwFIAKVJdT30tEL83704.INSTANCE)).intValue();
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (i == R.layout.list_result_page_header) {
            return new qpz(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }
        if (i == R.layout.list_entity_page_header) {
            return new qpw(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }
        if (i == 1251) {
            return new qpx(viewGroup);
        }
        throw new IllegalArgumentException("Unknown view type");
    }

    public final void a(final u uVar, int i) {
        ((qpy) this.d.get(i)).a((ged<c>) new ged<c>() {
            public final /* synthetic */ void accept(Object obj) {
                ((qpz) uVar).a.setText(((c) obj).a);
            }
        }, (ged<b>) new ged<b>() {
            public final /* synthetic */ void accept(Object obj) {
                b bVar = (b) obj;
                qpx qpx = (qpx) uVar;
                Picasso picasso = qqa.this.a;
                qpt qpt = bVar.a;
                fsc fsc = (fsc) fqz.a(qpx.o, fsc.class);
                fsc.a(qpt.c());
                fsc.b(qpt.d());
                qor.a(picasso, qpx.o.getContext(), fsc.c(), qpt.a(), qpt.b());
                SpotifyIconView i = gat.i(qpx.o.getContext());
                i.a(SpotifyIconV2.PLAY);
                i.a(fr.c(qpx.o.getContext(), R.color.white));
                fsc.a(i);
            }
        }, (ged<a>) new ged<a>() {
            public final /* synthetic */ void accept(Object obj) {
                a aVar = (a) obj;
                qpw qpw = (qpw) uVar;
                Picasso picasso = qqa.this.a;
                qpt qpt = aVar.a;
                fsc fsc = (fsc) fqz.a(qpw.a, fsc.class);
                fsc.a(true);
                fsc.a(qpt.c());
                fsc.b(qpt.d());
                qor.a(picasso, qpw.a.getContext(), fsc.c(), qpt.a(), qpt.b());
                SpotifyIconView i = gat.i(qpw.o.getContext());
                i.a(SpotifyIconV2.CHEVRON_RIGHT);
                fsc.a(i);
            }
        });
        uVar.o.setOnClickListener(new $$Lambda$qqa$6K86zC8u9I6ls8IC6hxAQ4YnCY4(this, uVar));
    }

    public final int b() {
        return this.d.size();
    }
}
