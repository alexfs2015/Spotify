package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: qju reason: default package */
public final class qju {
    private static final Function<TasteOnboardingItem, Iterable<TasteOnboardingItem>> c = new Function<TasteOnboardingItem, Iterable<TasteOnboardingItem>>() {
        public final /* synthetic */ Object apply(Object obj) {
            TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
            if (tasteOnboardingItem.relatedItems().isEmpty()) {
                return Collections.singleton(tasteOnboardingItem);
            }
            return fbx.a((Iterable<? extends T>) Collections.singleton(tasteOnboardingItem), (Iterable<? extends T>) tasteOnboardingItem.relatedItems());
        }
    };
    private final qkt a;
    private final qja b;

    public qju(qkt qkt, qja qja) {
        this.a = qkt;
        this.b = qja;
    }

    public final Observable<List<TasteOnboardingItem>> a(TasteOnboardingItem tasteOnboardingItem) {
        return vun.b(this.a.a.resolve(qkt.a((String) fay.a(tasteOnboardingItem.moreUri())))).c((io.reactivex.functions.Function<? super T, ? extends R>) new $$Lambda$qju$rp3NScZ7FybQI6wieRs0s6h9Ntk<Object,Object>(this, tasteOnboardingItem));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(TasteOnboardingItem tasteOnboardingItem, RelatedArtistsResponse relatedArtistsResponse) {
        ArrayList<TasteOnboardingItem> a2 = Lists.a(fcl.b(relatedArtistsResponse.relatedArtists(), new $$Lambda$qju$xee3joXStPBRIdjyPplnkMYAc1o(ImmutableList.a(fbx.a((Iterable<E>) this.b.a).b(c).a()))));
        ArrayList a3 = Lists.a();
        for (TasteOnboardingItem tasteOnboardingItem2 : a2) {
            a3.add(tasteOnboardingItem2.createWithLogging(((qmj) fay.a(tasteOnboardingItem2.logging())).a(((qmj) fay.a(tasteOnboardingItem.logging())).a()).b(tasteOnboardingItem.id())));
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
}
