package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qql reason: default package */
public abstract class qql extends itg<ith<TasteOnboardingItem>, TasteOnboardingItem> {
    private static final int g = 2131429601;
    public a<TasteOnboardingItem> e;
    public PickerViewType f;

    public final PickerViewType a() {
        return (PickerViewType) fbp.a(this.f);
    }

    /* renamed from: a */
    public final void b(ith<TasteOnboardingItem> ith) {
        super.b(ith);
        int e2 = ith.e();
        if (e2 >= 0 && ith.o.getTag(g) == null) {
            ith.o.setTag(g, "impression_log_tag");
            g(e2);
        }
    }

    public final void a(ith<TasteOnboardingItem> ith, int i) {
        super.a(ith, i);
        gko.a(ith.o, (String) null, "intent-in-taste-onboarding-interaction-id-699");
    }

    public final long b(int i) {
        return (long) ((TasteOnboardingItem) f(i)).id().hashCode();
    }

    /* renamed from: b */
    public final void c(ith<TasteOnboardingItem> ith) {
        super.c(ith);
        ith.o.setTag(g, null);
    }

    /* access modifiers changed from: 0000 */
    public abstract void g(int i);
}
