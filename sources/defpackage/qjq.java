package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: qjq reason: default package */
public final class qjq implements qjp {
    private final qja a;
    private final qkq b;

    private static int a(int i, int i2) {
        if (i > 6) {
            return 6;
        }
        return i;
    }

    public qjq(qja qja, qkq qkq) {
        this.a = qja;
        this.b = qkq;
    }

    public final Single<qjk> a(TasteOnboardingItem tasteOnboardingItem) {
        if ((tasteOnboardingItem.relatedItems().size() >= 6) || fax.a(tasteOnboardingItem.moreUri())) {
            return b(tasteOnboardingItem);
        }
        return this.b.a.a((String) fay.a(tasteOnboardingItem.moreUri())).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$qjq$XWxCWWYmCjDZvQ69lRxulHSRk0U<Object,Object>(this, tasteOnboardingItem));
    }

    private Single<qjk> b(TasteOnboardingItem tasteOnboardingItem) {
        TasteOnboardingItem createWithRelatedItems = tasteOnboardingItem.createWithRelatedItems(a(tasteOnboardingItem.relatedItems()));
        List b2 = b(createWithRelatedItems.relatedItems());
        return Single.b(new a().a(ImmutableList.a((Collection<? extends E>) a(b2, tasteOnboardingItem.id()))).a(d(a(createWithRelatedItems, b2))).a());
    }

    private List<TasteOnboardingItem> a(List<TasteOnboardingItem> list) {
        return Lists.a(fcl.b(list, new $$Lambda$qjq$0oBfXc8eVLxi9UZ9F2CTgBre1Aw(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean e(TasteOnboardingItem tasteOnboardingItem) {
        boolean z;
        Iterator it = this.a.a.iterator();
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

    private static List<TasteOnboardingItem> b(List<TasteOnboardingItem> list) {
        return list.subList(0, a(list.size(), 6));
    }

    private TasteOnboardingItem a(TasteOnboardingItem tasteOnboardingItem, List<TasteOnboardingItem> list) {
        ArrayList arrayList = new ArrayList(tasteOnboardingItem.relatedItems());
        arrayList.subList(0, list.size()).clear();
        TasteOnboardingItem createWithRelatedItems = tasteOnboardingItem.createWithRelatedItems(arrayList);
        c(createWithRelatedItems);
        return createWithRelatedItems;
    }

    private static List<TasteOnboardingItem> a(List<TasteOnboardingItem> list, String str) {
        ArrayList a2 = Lists.a();
        for (TasteOnboardingItem tasteOnboardingItem : list) {
            StringBuilder sb = new StringBuilder("more-");
            sb.append(str);
            a2.add(tasteOnboardingItem.createWithLogging(((qmj) fay.a(tasteOnboardingItem.logging())).a(sb.toString()).b(str)));
        }
        return a2;
    }

    private void c(TasteOnboardingItem tasteOnboardingItem) {
        this.a.a.set(a(tasteOnboardingItem.id()), tasteOnboardingItem);
    }

    private static boolean d(TasteOnboardingItem tasteOnboardingItem) {
        return tasteOnboardingItem.relatedItems().isEmpty() && fax.a(tasteOnboardingItem.moreUri());
    }

    private int a(String str) {
        List<TasteOnboardingItem> list = this.a.a;
        for (int i = 0; i < list.size(); i++) {
            if (((TasteOnboardingItem) list.get(i)).id().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(TasteOnboardingItem tasteOnboardingItem, ArtistPickerResponse artistPickerResponse) {
        TasteOnboardingItem tasteOnboardingItem2 = (TasteOnboardingItem) artistPickerResponse.items().get(0);
        ArrayList arrayList = new ArrayList(tasteOnboardingItem.relatedItems());
        arrayList.addAll(tasteOnboardingItem2.relatedItems());
        TasteOnboardingItem createWithRelatedItems = tasteOnboardingItem.createWithMoreUri(tasteOnboardingItem2.moreUri()).createWithRelatedItems(arrayList);
        c(createWithRelatedItems);
        return b(createWithRelatedItems);
    }
}
