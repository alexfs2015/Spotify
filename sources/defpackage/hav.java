package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: hav reason: default package */
public class hav<V extends View> implements gui<V> {
    private final int a;

    public final void a(V v, gzt gzt, gum gum, b bVar) {
    }

    protected hav(int i) {
        this.a = i;
    }

    public final V a(ViewGroup viewGroup, gum gum) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(this.a, viewGroup, false);
    }

    public final void a(V v, gzt gzt, a<View> aVar, int... iArr) {
        haq.a((View) v, gzt, aVar, iArr);
    }
}
