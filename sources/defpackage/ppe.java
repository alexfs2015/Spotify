package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;

/* renamed from: ppe reason: default package */
public class ppe extends jor {
    public jrp T;
    private ppr U;
    private b<ppo, ppm> V;
    private a W;
    public rnf a;
    public pph b;

    /* renamed from: ppe$a */
    public interface a {
        void dismiss();
    }

    public static ppe a(prk prk, NoteMessage noteMessage) {
        ppe ppe = new ppe();
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", noteMessage);
        bundle.putParcelable("trigger", prk);
        ppe.g(bundle);
        return ppe;
    }

    public final void z() {
        super.z();
        this.V.c();
    }

    public final void A() {
        super.A();
        this.V.d();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ppo ppo;
        Context context = (Context) fay.a(n());
        if (this.U == null) {
            this.U = new ppr(layoutInflater, viewGroup, context.getResources().getDisplayMetrics().density, this.a.b());
        }
        if (jtc.c(context)) {
            ppr ppr = this.U;
            ppr.c.getLayoutParams().width = (int) (ppr.a * 400.0f);
        }
        Bundle bundle2 = (Bundle) fay.a(this.i);
        prk prk = (prk) bundle2.getParcelable("trigger");
        NoteMessage noteMessage = (NoteMessage) bundle2.getParcelable("message");
        fay.a(prk);
        fay.a(noteMessage);
        pph pph = this.b;
        b<ppo, ppm> bVar = this.V;
        if (bVar != null) {
            ppo = (ppo) bVar.e();
        } else {
            ppo = ppo.a(noteMessage, prk, this.T.c()).a();
        }
        this.V = kjt.a(pph.a(), ppo, kkd.a());
        this.V.a(this.U);
        a aVar = this.W;
        if (aVar != null) {
            this.U.d = aVar;
        }
        return this.U.b;
    }

    public final void a(a aVar) {
        ppr ppr = this.U;
        if (ppr != null) {
            ppr.d = aVar;
        }
        this.W = aVar;
    }

    public final void ax_() {
        super.ax_();
        this.V.b();
    }
}
