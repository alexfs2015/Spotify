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

/* renamed from: mub reason: default package */
public final class mub extends defpackage.rev.a<a> {

    /* renamed from: mub$a */
    static class a extends defpackage.gui.c.a<RecyclerView> {
        private final gut b;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        public a(RecyclerView recyclerView, gut gut) {
            super(recyclerView);
            this.b = gut;
            recyclerView.a((androidx.recyclerview.widget.RecyclerView.a) this.b);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.b.a(gzt.children());
            this.b.e();
        }
    }

    public final int b() {
        return R.id.information_card_group;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE, Trait.SPACED_VERTICALLY);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        gut gut = new gut(gum);
        new oi().a(recyclerView);
        recyclerView.a((i) linearLayoutManager);
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.information_card_inset);
        int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.information_card_margin);
        recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.a((h) new mud(dimensionPixelSize2), -1);
        recyclerView.a((m) new mue());
        return new a(recyclerView, gut);
    }
}
