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

/* renamed from: tfz reason: default package */
public final class tfz extends iqr<a> implements gjl {
    private List<tfv> a = Collections.emptyList();
    private final defpackage.iqu.a<tfv> d;

    /* renamed from: tfz$a */
    public static class a extends iqu<tfv> {
        private final TextView a = ((TextView) this.o.findViewById(R.id.driving_voice_suggested_item_title));
        private final TextView b = ((TextView) this.o.findViewById(R.id.driving_voice_suggested_item_subtitle));
        private final ImageView c = ((ImageView) this.o.findViewById(R.id.driving_voice_suggested_item_coverart));
        private final ViewGroup d;
        private final Picasso e;
        private final defpackage.iqu.a<tfv> f;

        public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
            a((tfv) obj);
        }

        public a(ViewGroup viewGroup, defpackage.iqu.a<tfv> aVar, Picasso picasso) {
            super(a((int) R.layout.driving_voice_suggested_item, viewGroup));
            this.f = aVar;
            this.e = picasso;
            this.d = viewGroup;
        }

        public final void a(tfv tfv) {
            this.a.setText(tfv.a());
            this.b.setText(tfv.b());
            Picasso picasso = this.e;
            if (picasso != null) {
                picasso.a(tfv.c()).a((int) R.drawable.bg_placeholder_album).a(this.c);
            }
            this.o.setOnClickListener(new $$Lambda$tfz$a$_uxtpfbK9bnkdip7S0O1CPwWC4k(this, tfv));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(tfv tfv, View view) {
            int e2 = e();
            defpackage.iqu.a<tfv> aVar = this.f;
            if (aVar != null && e2 != -1) {
                aVar.onItemClick(e2, this.d, tfv);
            }
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) uVar).a((tfv) this.a.get(i));
    }

    public tfz(defpackage.iqu.a<tfv> aVar) {
        this.d = aVar;
        a(true);
    }

    public final int b() {
        if (this.a.size() > 3) {
            return 3;
        }
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.d, null);
    }
}
