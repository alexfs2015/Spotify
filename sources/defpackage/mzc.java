package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: mzc reason: default package */
public final class mzc extends defpackage.rnx.a<a> {

    /* renamed from: mzc$a */
    static class a extends defpackage.gwi.c.a<RecyclerView> {
        private final gwt b;

        public a(RecyclerView recyclerView, gwt gwt) {
            super(recyclerView);
            this.b = gwt;
            recyclerView.a((androidx.recyclerview.widget.RecyclerView.a) this.b);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.a(hcm.children());
            this.b.e();
        }
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE, Trait.SPACED_VERTICALLY);
    }

    public final int b() {
        return R.id.information_card_group;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        gwt gwt = new gwt(gwm);
        new on().a(recyclerView);
        recyclerView.a((i) linearLayoutManager);
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.information_card_inset);
        int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.information_card_margin);
        recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.a((h) new mze(dimensionPixelSize2), -1);
        recyclerView.a((m) new mzf());
        return new a(recyclerView, gwt);
    }
}
