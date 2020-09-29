package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tlt reason: default package */
public final class tlt implements tum {
    private final Context a;

    /* renamed from: tlt$a */
    public static class a extends tuq {
        public List<tsf> a = new ArrayList();
        public tse b;
    }

    /* renamed from: tlt$b */
    public static class b extends defpackage.tum.a {
        public final tsg a;

        public b(tsg tsg) {
            super(tsg.getView());
            this.a = tsg;
        }
    }

    public /* synthetic */ void a(tuq tuq) {
        CC.$default$a(this, tuq);
    }

    public tlt(Context context) {
        this.a = context;
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(tsg.a(this.a, viewGroup));
    }

    public final void a(tuq tuq, u uVar) {
        a aVar = (a) tuq;
        tsg tsg = ((b) uVar).a;
        List<tsf> list = aVar.a;
        tse tse = aVar.b;
        Context context = this.a;
        tsg.a.removeAllViews();
        for (tsf tsf : list) {
            tsd a2 = tsd.a(context);
            a2.a.setText(tsf.a());
            a2.a(tse, tsf.b());
            tsg.a.addView(a2.getView());
        }
    }
}
