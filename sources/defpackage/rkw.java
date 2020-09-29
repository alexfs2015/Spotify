package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import java.util.List;

/* renamed from: rkw reason: default package */
public final class rkw extends androidx.recyclerview.widget.RecyclerView.a<c> implements gkw {
    final b a;
    public List<defpackage.rkm.b> d = Lists.a();

    /* renamed from: rkw$a */
    class a extends c {
        public a(ViewGroup viewGroup) {
            super(rkz.a(viewGroup.getContext(), viewGroup).getView());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(defpackage.rkm.b bVar, int i, View view) {
            rkw.this.a.onOptionClicked(bVar, i);
        }

        public final void a(defpackage.rkm.b bVar, int i) {
            rla rla = (rla) fqz.a(this.o, rla.class);
            rla.a(bVar.c());
            if (bVar.f()) {
                rla.a(SpotifyIconV2.CHECK);
            } else {
                rla.a();
            }
            this.o.setOnClickListener(new $$Lambda$rkw$a$uIsGikDJeb1mlryDy06c8ICPo(this, bVar, i));
        }
    }

    /* renamed from: rkw$b */
    public interface b {
        void onOptionClicked(defpackage.rkm.b bVar, int i);
    }

    /* renamed from: rkw$c */
    public static class c extends u {
        public c(View view) {
            super(view);
        }
    }

    public rkw(b bVar) {
        this.a = bVar;
        a(true);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) ((c) uVar)).a((defpackage.rkm.b) this.d.get(i), i);
    }

    public final int b() {
        return this.d.size();
    }

    public final long b(int i) {
        return (long) ((defpackage.rkm.b) this.d.get(i)).a().hashCode();
    }
}
