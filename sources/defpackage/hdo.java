package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: hdo reason: default package */
public class hdo<V extends View> implements gwi<V> {
    private final int a;

    protected hdo(int i) {
        this.a = i;
    }

    public final V a(ViewGroup viewGroup, gwm gwm) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(this.a, viewGroup, false);
    }

    public final void a(V v, hcm hcm, a<View> aVar, int... iArr) {
        hdj.a((View) v, hcm, aVar, iArr);
    }

    public final void a(V v, hcm hcm, gwm gwm, b bVar) {
    }
}
