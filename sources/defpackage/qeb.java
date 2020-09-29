package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: qeb reason: default package */
public final class qeb {
    public static qdy a(Context context, ViewGroup viewGroup) {
        fqb.b();
        frh a = frq.a(context, viewGroup, false);
        qdy qdy = new qdy(a.getView(), a);
        fqf.a(qdy);
        return qdy;
    }

    public static qec a(Context context, ViewGroup viewGroup, rka rka, jsz jsz, jug jug) {
        fqb.b();
        frh a = frq.a(context, viewGroup, false);
        qec qec = new qec(a.getView(), a, jug, rka, jsz);
        fqf.a(qec);
        return qec;
    }

    public static qee a(Context context, ViewGroup viewGroup, jug jug) {
        fqb.b();
        frh a = frq.a(context, viewGroup, false);
        qee qee = new qee(a.getView(), a, jug);
        fqf.a(qee);
        return qee;
    }

    public static qdz b(Context context, ViewGroup viewGroup) {
        fqb.b();
        frh a = frq.a(context, viewGroup, false);
        qdz qdz = new qdz(a.getView(), a);
        fqf.a(qdz);
        return qdz;
    }
}
