package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.fqy;
import java.util.EnumSet;

/* renamed from: gyo reason: default package */
abstract class gyo<V extends fqy> implements gxl<View> {
    private final Class<V> a;
    private final EnumSet<Trait> b;

    gyo(EnumSet<Trait> enumSet, Class<V> cls) {
        this.b = (EnumSet) fbp.a(enumSet);
        this.a = (Class) fbp.a(cls);
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        return a(viewGroup.getContext(), viewGroup, gwm).getView();
    }

    /* access modifiers changed from: protected */
    public abstract V a(Context context, ViewGroup viewGroup, gwm gwm);

    public EnumSet<Trait> a() {
        return this.b;
    }

    public void a(View view, hcm hcm, a<View> aVar, int... iArr) {
        a((V) fqv.a(view, this.a), hcm, aVar, iArr);
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        fqy a2 = fqv.a(view, this.a);
        a((V) a2, hcm, gwm, bVar);
        if (a2 instanceof fqx) {
            ((fqx) a2).a(gxt.a(hcm));
        }
        a2.getView().setEnabled(!gyr.a(hcm));
    }

    /* access modifiers changed from: protected */
    public void a(V v, hcm hcm, a<View> aVar, int... iArr) {
        hdj.a(v.getView(), hcm, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public abstract void a(V v, hcm hcm, gwm gwm, b bVar);
}
