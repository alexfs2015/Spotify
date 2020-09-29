package defpackage;

import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: tlw reason: default package */
public final class tlw implements tum {
    private final defpackage.tsm.a a;

    /* renamed from: tlw$a */
    public static class a extends tuq {
        public OnClickListener a;
        public String b;
        public String c;
        public boolean d;
        public String e;
        public Runnable f;
    }

    /* renamed from: tlw$b */
    public static class b extends defpackage.tum.a {
        public final tsm a;

        public b(tsm tsm) {
            super(tsm.getView());
            this.a = tsm;
        }
    }

    public tlw(defpackage.tsm.a aVar) {
        this.a = aVar;
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        defpackage.tsm.a aVar = this.a;
        tsm tsm = new tsm(aVar.a, aVar.b, aVar.c, viewGroup, 0);
        return new b(tsm);
    }

    public final void a(tuq tuq, u uVar) {
        b bVar = (b) uVar;
        a aVar = (a) tuq;
        tsm tsm = bVar.a;
        tsm.d.setText(aVar.b);
        tsm tsm2 = bVar.a;
        tsm2.e.setText(aVar.c.toUpperCase(Locale.getDefault()));
        tsm tsm3 = bVar.a;
        jxb.a(tsm3.b.getContext(), tsm3.e, aVar.d);
        tsm tsm4 = bVar.a;
        String str = aVar.e;
        tsm4.f.d(tsm4.c);
        vsl a2 = tsm4.f.a(str).a(tsm4.h).b(tsm4.h).b(tsm4.g, tsm4.g).d().a((Object) tsm.a);
        ImageView imageView = tsm4.c;
        tsi tsi = tsm4.i;
        tsk tsk = (tsk) imageView.getTag(R.id.picasso_target);
        if (tsk == null) {
            tsk = new tsk(imageView, tsi);
            imageView.setTag(R.id.picasso_target, tsk);
        } else {
            tsk.a = tsi;
        }
        a2.a((vsr) tsk);
        tsm tsm5 = bVar.a;
        tsm5.b.setOnClickListener(aVar.a);
    }

    public final void a(tuq tuq) {
        Runnable a2 = ((a) tuq).f;
        if (a2 != null) {
            a2.run();
        }
    }
}
