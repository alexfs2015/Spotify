package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: qsd reason: default package */
public final class qsd {
    private static final Function<TasteOnboardingItem, Iterable<TasteOnboardingItem>> c = $$Lambda$qsd$c2oRnyRO79JJDnBu1Ih4ERMDqvE.INSTANCE;
    private final qtb a;
    private final qrj b;

    public qsd(qtb qtb, qrj qrj) {
        this.a = qtb;
        this.b = qrj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(TasteOnboardingItem tasteOnboardingItem, RelatedArtistsResponse relatedArtistsResponse) {
        ArrayList<TasteOnboardingItem> a2 = Lists.a(fdd.b(relatedArtistsResponse.relatedArtists(), new $$Lambda$qsd$WNpFK8CPlCErdcgGITt4SUlJy_A(ImmutableList.a(fcp.a((Iterable<E>) this.b.a).b(c).a()))));
        ArrayList a3 = Lists.a();
        for (TasteOnboardingItem tasteOnboardingItem2 : a2) {
            a3.add(tasteOnboardingItem2.createWithLogging(((qur) fbp.a(tasteOnboardingItem2.logging())).a(((qur) fbp.a(tasteOnboardingItem.logging())).a()).b(tasteOnboardingItem.id())));
        }
        return a3.subList(0, Math.min(a3.size(), 6));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(List list, TasteOnboardingItem tasteOnboardingItem) {
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (tasteOnboardingItem.id().equals(((TasteOnboardingItem) it.next()).id())) {
                z = true;
                break;
            }
        }
        return !z;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable b(TasteOnboardingItem tasteOnboardingItem) {
        return tasteOnboardingItem.relatedItems().isEmpty() ? Collections.singleton(tasteOnboardingItem) : fcp.a(Collections.singleton(tasteOnboardingItem), tasteOnboardingItem.relatedItems());
    }

    public final Single<List<TasteOnboardingItem>> a(TasteOnboardingItem tasteOnboardingItem) {
        return this.a.a.b((String) fbp.a(tasteOnboardingItem.moreUri())).f(new $$Lambda$qsd$Hy8K7VnTTmFYf_L6YYH0eW7jylU(this, tasteOnboardingItem));
    }
}
