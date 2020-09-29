package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;

/* renamed from: pya reason: default package */
public class pya extends jrd {
    public jtz T;
    private pyn U;
    private b<pyk, pyi> V;
    private a W;
    public rwl a;
    public pyd b;

    /* renamed from: pya$a */
    public interface a {
        void dismiss();
    }

    public static pya a(qag qag, NoteMessage noteMessage) {
        pya pya = new pya();
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", noteMessage);
        bundle.putParcelable("trigger", qag);
        pya.g(bundle);
        return pya;
    }

    public final void A() {
        super.A();
        this.V.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = (Context) fbp.a(n());
        if (this.U == null) {
            this.U = new pyn(layoutInflater, viewGroup, context.getResources().getDisplayMetrics().density, this.a.b());
        }
        if (jvi.c(context)) {
            pyn pyn = this.U;
            pyn.c.getLayoutParams().width = (int) (pyn.a * 400.0f);
        }
        Bundle bundle2 = (Bundle) fbp.a(this.i);
        qag qag = (qag) bundle2.getParcelable("trigger");
        NoteMessage noteMessage = (NoteMessage) bundle2.getParcelable("message");
        fbp.a(qag);
        fbp.a(noteMessage);
        pyd pyd = this.b;
        b<pyk, pyi> bVar = this.V;
        this.V = knc.a(pyd.a(), bVar != null ? (pyk) bVar.e() : pyk.a(noteMessage, qag, this.T.c()).a(), knm.a());
        this.V.a(this.U);
        a aVar = this.W;
        if (aVar != null) {
            this.U.d = aVar;
        }
        return this.U.b;
    }

    public final void a(a aVar) {
        pyn pyn = this.U;
        if (pyn != null) {
            pyn.d = aVar;
        }
        this.W = aVar;
    }

    public final void aw_() {
        super.aw_();
        this.V.b();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public final void z() {
        super.z();
        this.V.c();
    }
}
