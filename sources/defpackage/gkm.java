package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: gkm reason: default package */
public class gkm extends iqu<gkq> {
    private final a a;
    private final fqi b;

    private gkm(fqi fqi, a aVar) {
        super(fqi.getView());
        this.b = fqi;
        this.a = (a) fay.a(aVar);
    }

    public void a(gkq gkq, int i) {
        this.b.a(gkq.c());
        this.b.b(gkq.b());
        this.o.setOnClickListener(new $$Lambda$gkm$vrHnaLu9P10aX1SRiJeaRgznA8(this, gkq));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gkq gkq, View view) {
        if (e() != -1) {
            this.a.onItemClick(gkq);
        }
    }

    public gkm(ViewGroup viewGroup, a aVar) {
        fqb.c();
        fqj fqj = new fqj(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.glue_value_row, viewGroup, false));
        fqf.a(fqj);
        this((fqi) fqj, aVar);
    }
}
