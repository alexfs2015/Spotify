package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: mgq reason: default package */
public final class mgq implements gru {
    public b a;
    public boolean b;
    private final mhr c;
    private final mid d;
    private final mif e;

    /* renamed from: mgq$a */
    static class a extends u {
        final fri a;

        public a(fri fri) {
            super(fri.getView());
            this.a = fri;
        }
    }

    /* renamed from: mgq$b */
    public interface b {
        void click(String str);
    }

    /* renamed from: mgq$c */
    static class c extends u {
        final fre a;

        public c(fre fre) {
            super(fre.getView());
            this.a = fre;
        }
    }

    public mgq(mhr mhr, mid mid, mif mif) {
        this.c = mhr;
        this.d = mid;
        this.e = mif;
    }

    public final u a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (22 == i) {
            fqb.b();
            return new a(frq.b(context, viewGroup, false));
        }
        fqb.b();
        return new c(frq.b(context, viewGroup));
    }

    public final void a(u uVar, int i) {
        if (uVar instanceof a) {
            a aVar = (a) uVar;
            Context context = aVar.o.getContext();
            aVar.a.a(true);
            aVar.a.a(this.e.a(false));
            aVar.a.b(this.e.a());
            aVar.a.d().setTextColor(fr.b(context, (int) R.color.txt_connect_picker_subtitle));
            int b2 = this.d.b();
            aVar.a.c().setPadding(b2, b2, b2, b2);
            aVar.a.c().setImageDrawable(this.d.a());
            return;
        }
        c cVar = (c) uVar;
        String a2 = this.e.a();
        cVar.a.a(a2);
        int b3 = this.d.b();
        cVar.a.c().setPadding(b3, b3, b3, b3);
        cVar.a.c().setImageDrawable(this.d.a());
        cVar.o.setOnClickListener(new $$Lambda$mgq$4NY9aIpgVM2x_3j8cdfk1bVyY(this, a2));
    }

    public final long a(int i) {
        return (long) "local_device".hashCode();
    }

    public final int b() {
        return (!this.c.b && !this.c.a.isEmpty()) ? 1 : 0;
    }

    public final int a() {
        return this.b ? 22 : 21;
    }

    public final int[] c() {
        return new int[]{22, 21};
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.click(str);
        }
    }
}
