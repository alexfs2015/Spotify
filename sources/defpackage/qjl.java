package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: qjl reason: default package */
public final class qjl implements qjw {
    private final qho a;
    private final qkj b;
    private final qja c;
    private final qju d;

    public qjl(qho qho, qkj qkj, qja qja, qju qju) {
        this.a = qho;
        this.b = qkj;
        this.c = qja;
        this.d = qju;
    }

    public final qjx a(int i, TasteOnboardingItem tasteOnboardingItem) {
        if (!this.a.a(tasteOnboardingItem.id())) {
            boolean z = true;
            TasteOnboardingItem createWithLike = tasteOnboardingItem.createWithLike(true);
            this.c.a.set(i, createWithLike);
            String id = createWithLike.id();
            this.b.a(id).a(id);
            if (createWithLike.isExpanded() || tasteOnboardingItem.moreUri() == null) {
                z = false;
            }
            return new a().a(this.c.a).a(z).a();
        }
        TasteOnboardingItem createWithLike2 = tasteOnboardingItem.createWithLike(false);
        this.c.a.set(i, createWithLike2);
        String id2 = createWithLike2.id();
        this.b.a(id2).b(id2);
        return new a().a(this.c.a).a(false).a();
    }

    public final qjy a(TasteOnboardingItem tasteOnboardingItem) {
        TasteOnboardingItem a2 = a(this.c.a, tasteOnboardingItem.id());
        if (a2 == null) {
            this.c.a.add(0, tasteOnboardingItem);
            return new a().a(tasteOnboardingItem).a((qjt) new a().a(0).a()).a(true).a();
        }
        return new a().a(a2).a((qjt) new a().a(qkp.a(this.c.a, a2.id())).a()).a(!this.a.a(a2.id())).a();
    }

    public final Observable<qjj> a(String str) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) fay.a(a(this.c.a, str));
        return this.d.a(tasteOnboardingItem).b((Consumer<? super T>) new $$Lambda$qjl$VR1bgvRuIavsyyQdUYDmKxiCOA<Object>(this, tasteOnboardingItem)).h(new $$Lambda$qjl$7r2REd1Qi9SrwSAI_R2yJ_K0Wfc(this, tasteOnboardingItem));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(TasteOnboardingItem tasteOnboardingItem, List list) {
        TasteOnboardingItem tasteOnboardingItem2 = (TasteOnboardingItem) fay.a(a(this.c.a, tasteOnboardingItem.id()));
        int a2 = qkp.a(this.c.a, tasteOnboardingItem2.id());
        this.c.a.set(a2, tasteOnboardingItem2.createWithExpanded(true));
        this.c.a.addAll(a2 + 1, list);
    }

    private static TasteOnboardingItem a(List<TasteOnboardingItem> list, String str) {
        for (TasteOnboardingItem tasteOnboardingItem : list) {
            if (str.equals(tasteOnboardingItem.id())) {
                return tasteOnboardingItem;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(TasteOnboardingItem tasteOnboardingItem, List list) {
        return Observable.b(new a().a(this.c.a).a((qjt) new a().a(qkp.a(this.c.a, tasteOnboardingItem.id())).a()).a());
    }
}
