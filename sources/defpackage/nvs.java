package defpackage;

import com.spotify.music.features.languagepicker.model.AvailableLanguage;
import io.reactivex.CompletableSource;
import io.reactivex.SingleSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nvs reason: default package */
public final class nvs implements nvp {
    private final nvq a;

    public nvs(nvq nvq) {
        this.a = nvq;
    }

    /* access modifiers changed from: private */
    public static List<nvr> a(List<AvailableLanguage> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (AvailableLanguage availableLanguage : list) {
            arrayList.add(nvr.a(availableLanguage, list2.contains(availableLanguage.bcp47())));
        }
        return arrayList;
    }

    public final xig a(List<nvr> list) {
        ArrayList arrayList = new ArrayList();
        for (nvr nvr : list) {
            if (nvr.d()) {
                arrayList.add(nvr.c());
            }
        }
        return wit.a((CompletableSource) this.a.a(arrayList)).a((xis<? super Throwable>) $$Lambda$nvs$QNqEsHSqpCDzqr4lTwN9UO6t0nw.INSTANCE);
    }

    public final xii<List<nvr>> a() {
        return xii.b(xim.a(wit.a((SingleSource<T>) this.a.a())), xim.a(wit.a((SingleSource<T>) this.a.b())), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$nvs$I_MTwpVthyRdeYSjFzOZ1Vk5qSE.INSTANCE);
    }
}
