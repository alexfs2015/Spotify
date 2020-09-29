package defpackage;

import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import defpackage.ith;

/* renamed from: qtq reason: default package */
public abstract class qtq<T extends ith<D>, D extends TasteOnboardingItem> extends itg<T, D> implements gkw {
    private static final Object f = new Object();
    private static final int g = R.id.item_impression;
    public a<D> e;

    /* renamed from: a */
    public final void b(T t) {
        super.b(t);
        int e2 = t.e();
        if (e2 >= 0 && t.o.getTag(g) == null) {
            t.o.setTag(g, f);
            g(e2);
        }
    }

    public final void a(T t, int i) {
        super.a(t, i);
        gko.a(t.o, (String) null, "intent-in-taste-onboarding-interaction-id-699");
    }

    /* renamed from: b */
    public final void c(T t) {
        super.c(t);
        t.o.setTag(g, null);
    }

    /* access modifiers changed from: protected */
    public abstract void g(int i);
}
