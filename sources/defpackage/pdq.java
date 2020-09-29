package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import java.util.List;

/* renamed from: pdq reason: default package */
final class pdq implements pdp {
    private final gut a;
    private final gum b;
    private final iqs c;
    private final Context d;
    private RecyclerView e;

    public pdq(gut gut, gum gum, iqs iqs, Context context) {
        this.a = gut;
        this.b = gum;
        this.c = iqs;
        this.d = context;
    }

    public final void a(RecyclerView recyclerView) {
        this.e = recyclerView;
        recyclerView.a((a) this.a);
        recyclerView.a((i) gvt.b(this.d, this.b));
        recyclerView.q = true;
        recyclerView.setNestedScrollingEnabled(false);
        this.c.a(recyclerView);
    }

    public final void a(gzz gzz) {
        if (this.e != null) {
            if (gzz == null || gzz.body().isEmpty()) {
                this.e.setVisibility(8);
                return;
            }
            List body = gzz.body();
            this.e.setVisibility(0);
            this.a.a(body);
            this.a.e();
        }
    }
}
