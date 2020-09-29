package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qib reason: default package */
public abstract class qib extends iqt<iqu<TasteOnboardingItem>, TasteOnboardingItem> {
    private static final int g = 2131429607;
    public a<TasteOnboardingItem> e;
    public PickerViewType f;

    /* access modifiers changed from: 0000 */
    public abstract void g(int i);

    public final void a(iqu<TasteOnboardingItem> iqu, int i) {
        super.a(iqu, i);
        gjd.a(iqu.o, (String) null, "intent-in-taste-onboarding-interaction-id-699");
    }

    public final long b(int i) {
        return (long) ((TasteOnboardingItem) f(i)).id().hashCode();
    }

    /* renamed from: a */
    public final void b(iqu<TasteOnboardingItem> iqu) {
        super.b(iqu);
        int e2 = iqu.e();
        if (e2 >= 0 && iqu.o.getTag(g) == null) {
            iqu.o.setTag(g, "impression_log_tag");
            g(e2);
        }
    }

    /* renamed from: b */
    public final void c(iqu<TasteOnboardingItem> iqu) {
        super.c(iqu);
        iqu.o.setTag(g, null);
    }

    public final PickerViewType a() {
        return (PickerViewType) fay.a(this.f);
    }
}
