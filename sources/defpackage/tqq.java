package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

/* renamed from: tqq reason: default package */
public final class tqq extends ite<a> implements gkw {
    private List<tqm> a = Collections.emptyList();
    private final defpackage.ith.a<tqm> d;

    /* renamed from: tqq$a */
    public static class a extends ith<tqm> {
        private final TextView a = ((TextView) this.o.findViewById(R.id.driving_voice_suggested_item_title));
        private final TextView b = ((TextView) this.o.findViewById(R.id.driving_voice_suggested_item_subtitle));
        private final ImageView c = ((ImageView) this.o.findViewById(R.id.driving_voice_suggested_item_coverart));
        private final ViewGroup d;
        private final Picasso e;
        private final defpackage.ith.a<tqm> f;

        public a(ViewGroup viewGroup, defpackage.ith.a<tqm> aVar, Picasso picasso) {
            super(a((int) R.layout.driving_voice_suggested_item, viewGroup));
            this.f = aVar;
            this.e = picasso;
            this.d = viewGroup;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(tqm tqm, View view) {
            int e2 = e();
            defpackage.ith.a<tqm> aVar = this.f;
            if (aVar != null && e2 != -1) {
                aVar.onItemClick(e2, this.d, tqm);
            }
        }

        public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
            a((tqm) obj);
        }

        public final void a(tqm tqm) {
            this.a.setText(tqm.a());
            this.b.setText(tqm.b());
            Picasso picasso = this.e;
            if (picasso != null) {
                picasso.a(tqm.c()).a((int) R.drawable.bg_placeholder_album).a(this.c);
            }
            this.o.setOnClickListener(new $$Lambda$tqq$a$FVlEPNTEi1Kmk26LH2PZRi9pups(this, tqm));
        }
    }

    public tqq(defpackage.ith.a<tqm> aVar) {
        this.d = aVar;
        a(true);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.d, null);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) uVar).a((tqm) this.a.get(i));
    }

    public final int b() {
        if (this.a.size() > 3) {
            return 3;
        }
        return this.a.size();
    }
}
