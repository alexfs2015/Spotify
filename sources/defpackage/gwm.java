package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.fqe;
import java.util.EnumSet;

/* renamed from: gwm reason: default package */
abstract class gwm<V extends fqe> implements gvl<View> {
    private final Class<V> a;
    private final EnumSet<Trait> b;

    /* access modifiers changed from: protected */
    public abstract V a(Context context, ViewGroup viewGroup, gum gum);

    /* access modifiers changed from: protected */
    public abstract void a(V v, gzt gzt, gum gum, b bVar);

    gwm(EnumSet<Trait> enumSet, Class<V> cls) {
        this.b = (EnumSet) fay.a(enumSet);
        this.a = (Class) fay.a(cls);
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        return a(viewGroup.getContext(), viewGroup, gum).getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        fqe a2 = fqb.a(view, this.a);
        a((V) a2, gzt, gum, bVar);
        if (a2 instanceof fqd) {
            ((fqd) a2).a(gvs.a(gzt));
        }
        a2.getView().setEnabled(!gwo.a(gzt));
    }

    public void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        a((V) fqb.a(view, this.a), gzt, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public void a(V v, gzt gzt, a<View> aVar, int... iArr) {
        haq.a(v.getView(), gzt, aVar, iArr);
    }

    public EnumSet<Trait> a() {
        return this.b;
    }
}
