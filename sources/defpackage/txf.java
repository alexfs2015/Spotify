package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: txf reason: default package */
public final class txf implements ugp {
    private final Context a;

    /* renamed from: txf$a */
    public static class a extends ugt {
        public List<uei> a = new ArrayList();
        public ueh b;
    }

    /* renamed from: txf$b */
    public static class b extends defpackage.ugp.a {
        public final uej a;

        public b(uej uej) {
            super(uej.getView());
            this.a = uej;
        }
    }

    public txf(Context context) {
        this.a = context;
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(uej.a(this.a, viewGroup));
    }

    public /* synthetic */ void a(ugt ugt) {
        CC.$default$a(this, ugt);
    }

    public final void a(ugt ugt, u uVar) {
        a aVar = (a) ugt;
        uej uej = ((b) uVar).a;
        List<uei> list = aVar.a;
        ueh ueh = aVar.b;
        Context context = this.a;
        uej.a.removeAllViews();
        for (uei uei : list) {
            ueg a2 = ueg.a(context);
            a2.a.setText(uei.a());
            a2.a(ueh, uei.b());
            uej.a.addView(a2.getView());
        }
    }
}
