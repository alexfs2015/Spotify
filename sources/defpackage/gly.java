package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: gly reason: default package */
public class gly extends ith<gmc> {
    private final a a;
    private final frc b;

    public gly(ViewGroup viewGroup, a aVar) {
        fqv.c();
        frd frd = new frd(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.glue_value_row, viewGroup, false));
        fqz.a(frd);
        this((frc) frd, aVar);
    }

    private gly(frc frc, a aVar) {
        super(frc.getView());
        this.b = frc;
        this.a = (a) fbp.a(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gmc gmc, View view) {
        if (e() != -1) {
            this.a.onItemClick(gmc);
        }
    }

    public void a(gmc gmc, int i) {
        this.b.a(gmc.c());
        this.b.b(gmc.b());
        this.o.setOnClickListener(new $$Lambda$gly$U0eLQZjJQu8HzSzLZeyClQdDx8(this, gmc));
    }
}
