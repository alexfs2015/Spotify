package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: qsj reason: default package */
public final class qsj implements qsf {
    private final qqc a;
    private final qss b;
    private final qrj c;
    private final qsd d;

    public qsj(qqc qqc, qss qss, qrj qrj, qsd qsd) {
        this.a = qqc;
        this.b = qss;
        this.c = qrj;
        this.d = qsd;
    }

    private static TasteOnboardingItem a(List<TasteOnboardingItem> list, final TasteOnboardingItem tasteOnboardingItem) {
        return (TasteOnboardingItem) fdd.e(list, new fbq<TasteOnboardingItem>() {
            public final /* synthetic */ boolean apply(Object obj) {
                TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
                if (tasteOnboardingItem == null) {
                    return false;
                }
                return tasteOnboardingItem.id().equals(((qur) fbp.a(tasteOnboardingItem.logging())).a());
            }
        });
    }

    private static TasteOnboardingItem a(List<TasteOnboardingItem> list, String str) {
        for (TasteOnboardingItem relatedItems : list) {
            Iterator it = relatedItems.relatedItems().iterator();
            while (true) {
                if (it.hasNext()) {
                    TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) it.next();
                    if (str.equals(tasteOnboardingItem.id())) {
                        return tasteOnboardingItem;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qrs a(TasteOnboardingItem tasteOnboardingItem, List list) {
        String id = tasteOnboardingItem.id();
        TasteOnboardingItem tasteOnboardingItem2 = (TasteOnboardingItem) fbp.a(a(this.c.a, id));
        TasteOnboardingItem tasteOnboardingItem3 = (TasteOnboardingItem) fbp.a(a(this.c.a, tasteOnboardingItem2));
        int a2 = qsy.a(tasteOnboardingItem3.relatedItems(), id);
        TasteOnboardingItem createWithExpanded = tasteOnboardingItem2.createWithExpanded(true);
        ArrayList arrayList = new ArrayList(tasteOnboardingItem3.relatedItems());
        arrayList.set(a2, createWithExpanded);
        arrayList.addAll(a2 + 1, list);
        TasteOnboardingItem createWithRelatedItems = tasteOnboardingItem3.createWithRelatedItems(arrayList);
        int a3 = qsy.a(this.c.a, tasteOnboardingItem3.id());
        c(a3, createWithRelatedItems);
        return new a().a(this.c.a).a((qsc) new a().a(a2).b(a3).a()).a();
    }

    private void b(int i, TasteOnboardingItem tasteOnboardingItem) {
        TasteOnboardingItem tasteOnboardingItem2 = (TasteOnboardingItem) fbp.a(a(this.c.a, tasteOnboardingItem));
        ArrayList arrayList = new ArrayList(tasteOnboardingItem2.relatedItems());
        arrayList.set(i, tasteOnboardingItem);
        c(qsy.a(this.c.a, tasteOnboardingItem2.id()), tasteOnboardingItem2.createWithRelatedItems(arrayList));
    }

    private void c(int i, TasteOnboardingItem tasteOnboardingItem) {
        this.c.a.set(i, tasteOnboardingItem);
    }

    public final Single<qrs> a(String str) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) fbp.a(a(this.c.a, str));
        return this.d.a(tasteOnboardingItem).f(new $$Lambda$qsj$sIgMezKTPHowYz0r6rdAQ1eyuao(this, tasteOnboardingItem));
    }

    public final qsg a(int i, TasteOnboardingItem tasteOnboardingItem) {
        if (!this.a.a(tasteOnboardingItem.id())) {
            boolean z = true;
            TasteOnboardingItem createWithLike = tasteOnboardingItem.createWithLike(true);
            b(i, createWithLike);
            String id = createWithLike.id();
            this.b.a(id).a(id);
            if (createWithLike.isExpanded() || tasteOnboardingItem.moreUri() == null) {
                z = false;
            }
            return new a().a(this.c.a).a(z).a();
        }
        TasteOnboardingItem createWithLike2 = tasteOnboardingItem.createWithLike(false);
        b(i, createWithLike2);
        String id2 = createWithLike2.id();
        this.b.a(id2).b(id2);
        return new a().a(this.c.a).a(false).a();
    }

    public final qsh a(TasteOnboardingItem tasteOnboardingItem) {
        TasteOnboardingItem a2 = a(this.c.a, tasteOnboardingItem.id());
        if (a2 == null) {
            String str = "search-result";
            if (!str.equals(((TasteOnboardingItem) this.c.a.get(0)).id())) {
                this.c.a.add(0, TasteOnboardingItem.create("search-result", "From Search", null, null, null, qur.e().a(str).b("search").a(), null, ""));
            }
            TasteOnboardingItem tasteOnboardingItem2 = (TasteOnboardingItem) this.c.a.get(0);
            ArrayList arrayList = new ArrayList(tasteOnboardingItem2.relatedItems());
            arrayList.add(0, tasteOnboardingItem);
            this.c.a.set(0, tasteOnboardingItem2.createWithRelatedItems(arrayList));
            return new a().a(tasteOnboardingItem).a((qsc) new a().a(0).b(0).a()).a(true).a();
        }
        TasteOnboardingItem tasteOnboardingItem3 = (TasteOnboardingItem) fbp.a(a(this.c.a, a2));
        return new a().a(a2).a((qsc) new a().a(qsy.a(tasteOnboardingItem3.relatedItems(), a2.id())).b(qsy.a(this.c.a, tasteOnboardingItem3.id())).a()).a(!this.a.a(a2.id())).a();
    }
}
