package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: mle reason: default package */
public final class mle implements gtw {
    public b a;
    public boolean b;
    private final mmf c;
    private final mmr d;
    private final mmt e;

    /* renamed from: mle$a */
    static class a extends u {
        final fsc a;

        public a(fsc fsc) {
            super(fsc.getView());
            this.a = fsc;
        }
    }

    /* renamed from: mle$b */
    public interface b {
        void click(String str);
    }

    /* renamed from: mle$c */
    static class c extends u {
        final fry a;

        public c(fry fry) {
            super(fry.getView());
            this.a = fry;
        }
    }

    public mle(mmf mmf, mmr mmr, mmt mmt) {
        this.c = mmf;
        this.d = mmr;
        this.e = mmt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.click(str);
        }
    }

    public final int a() {
        return this.b ? 22 : 21;
    }

    public final long a(int i) {
        return (long) "local_device".hashCode();
    }

    public final u a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (22 == i) {
            fqv.b();
            return new a(fsk.b(context, viewGroup, false));
        }
        fqv.b();
        return new c(fsk.b(context, viewGroup));
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
        cVar.o.setOnClickListener(new $$Lambda$mle$BUL6TpNtb1QYAgkptChBQHAv0G4(this, a2));
    }

    public final int b() {
        return (!this.c.b && !this.c.a.isEmpty()) ? 1 : 0;
    }

    public final int[] c() {
        return new int[]{22, 21};
    }
}
