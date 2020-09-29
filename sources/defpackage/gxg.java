package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.fqe;
import java.util.EnumSet;

/* renamed from: gxg reason: default package */
abstract class gxg<V extends fqe> implements gvl<View> {
    private final Class<V> a;
    private final EnumSet<Trait> b;

    /* access modifiers changed from: protected */
    public abstract V a(Context context, ViewGroup viewGroup, gum gum);

    /* access modifiers changed from: protected */
    public abstract void a(V v, gzt gzt, gum gum, b bVar);

    gxg(EnumSet<Trait> enumSet, Class<V> cls) {
        this.b = (EnumSet) fay.a(enumSet);
        this.a = (Class) fay.a(cls);
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        return a(viewGroup.getContext(), viewGroup, gum).getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        a((V) fqb.a(view, this.a), gzt, gum, bVar);
    }

    public void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        haq.a(fqb.a(view, this.a).getView(), gzt, aVar, iArr);
    }

    public EnumSet<Trait> a() {
        return this.b;
    }
}
