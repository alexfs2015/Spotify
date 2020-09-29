package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.fqy;
import java.util.EnumSet;

/* renamed from: gzu reason: default package */
abstract class gzu<V extends fqy> implements gxl<View> {
    private final Class<V> a;
    private final EnumSet<Trait> b;

    gzu(EnumSet<Trait> enumSet, Class<V> cls) {
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
        hdj.a(fqv.a(view, this.a).getView(), hcm, aVar, iArr);
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        a((V) fqv.a(view, this.a), hcm, gwm, bVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a(V v, hcm hcm, gwm gwm, b bVar);
}
