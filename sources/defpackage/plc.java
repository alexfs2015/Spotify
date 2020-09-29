package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import java.util.List;

/* renamed from: plc reason: default package */
final class plc implements plb {
    private final gwt a;
    private final gwm b;
    private final itf c;
    private final Context d;
    private RecyclerView e;

    public plc(gwt gwt, gwm gwm, itf itf, Context context) {
        this.a = gwt;
        this.b = gwm;
        this.c = itf;
        this.d = context;
    }

    public final void a(RecyclerView recyclerView) {
        this.e = recyclerView;
        recyclerView.a((a) this.a);
        recyclerView.a((i) gxu.b(this.d, this.b));
        recyclerView.q = true;
        recyclerView.setNestedScrollingEnabled(false);
        this.c.a(recyclerView);
    }

    public final void a(hcs hcs) {
        if (this.e != null) {
            if (hcs == null || hcs.body().isEmpty()) {
                this.e.setVisibility(8);
                return;
            }
            List body = hcs.body();
            this.e.setVisibility(0);
            this.a.a(body);
            this.a.e();
        }
    }
}
