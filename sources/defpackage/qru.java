package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: qru reason: default package */
public final class qru implements qsf {
    private final qqc a;
    private final qss b;
    private final qrj c;
    private final qsd d;

    public qru(qqc qqc, qss qss, qrj qrj, qsd qsd) {
        this.a = qqc;
        this.b = qss;
        this.c = qrj;
        this.d = qsd;
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
    public /* synthetic */ SingleSource a(TasteOnboardingItem tasteOnboardingItem, List list) {
        return Single.b(new a().a(this.c.a).a((qsc) new a().a(qsy.a(this.c.a, tasteOnboardingItem.id())).a()).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(TasteOnboardingItem tasteOnboardingItem, List list) {
        TasteOnboardingItem tasteOnboardingItem2 = (TasteOnboardingItem) fbp.a(a(this.c.a, tasteOnboardingItem.id()));
        int a2 = qsy.a(this.c.a, tasteOnboardingItem2.id());
        this.c.a.set(a2, tasteOnboardingItem2.createWithExpanded(true));
        this.c.a.addAll(a2 + 1, list);
    }

    public final Single<qrs> a(String str) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) fbp.a(a(this.c.a, str));
        return this.d.a(tasteOnboardingItem).b((Consumer<? super T>) new $$Lambda$qru$NUEYgSVaZm5FRjJ6HlMWpSvX4AI<Object>(this, tasteOnboardingItem)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$qru$djbY4UpbAE1oXW79NUDTqGRMOBA<Object,Object>(this, tasteOnboardingItem));
    }

    public final qsg a(int i, TasteOnboardingItem tasteOnboardingItem) {
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

    public final qsh a(TasteOnboardingItem tasteOnboardingItem) {
        TasteOnboardingItem a2 = a(this.c.a, tasteOnboardingItem.id());
        if (a2 == null) {
            this.c.a.add(0, tasteOnboardingItem);
            return new a().a(tasteOnboardingItem).a((qsc) new a().a(0).a()).a(true).a();
        }
        return new a().a(a2).a((qsc) new a().a(qsy.a(this.c.a, a2.id())).a()).a(!this.a.a(a2.id())).a();
    }
}
