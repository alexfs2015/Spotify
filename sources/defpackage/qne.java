package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: qne reason: default package */
public final class qne {
    public static qnb a(Context context, ViewGroup viewGroup) {
        fqv.b();
        fsb a = fsk.a(context, viewGroup, false);
        qnb qnb = new qnb(a.getView(), a);
        fqz.a(qnb);
        return qnb;
    }

    public static qnf a(Context context, ViewGroup viewGroup, rtg rtg, jvf jvf, jwo jwo) {
        fqv.b();
        fsb a = fsk.a(context, viewGroup, false);
        qnf qnf = new qnf(a.getView(), a, jwo, rtg, jvf);
        fqz.a(qnf);
        return qnf;
    }

    public static qnh a(Context context, ViewGroup viewGroup, jwo jwo) {
        fqv.b();
        fsb a = fsk.a(context, viewGroup, false);
        qnh qnh = new qnh(a.getView(), a, jwo);
        fqz.a(qnh);
        return qnh;
    }

    public static qnc b(Context context, ViewGroup viewGroup) {
        fqv.b();
        fsb a = fsk.a(context, viewGroup, false);
        qnc qnc = new qnc(a.getView(), a);
        fqz.a(qnc);
        return qnc;
    }
}
