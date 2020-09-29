package defpackage;

import com.spotify.music.features.languagepicker.model.AvailableLanguage;
import io.reactivex.CompletableSource;
import io.reactivex.SingleSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: npp reason: default package */
public final class npp implements npm {
    private final npn a;

    public npp(npn npn) {
        this.a = npn;
    }

    public final wud<List<npo>> a() {
        return wud.b(wuh.a(vun.a((SingleSource<T>) this.a.a())), wuh.a(vun.a((SingleSource<T>) this.a.b())), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$npp$PZSAUaDCxuMIGnYs7zAUinT4tk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static List<npo> a(List<AvailableLanguage> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (AvailableLanguage availableLanguage : list) {
            arrayList.add(npo.a(availableLanguage, list2.contains(availableLanguage.bcp47())));
        }
        return arrayList;
    }

    public final wub a(List<npo> list) {
        ArrayList arrayList = new ArrayList();
        for (npo npo : list) {
            if (npo.d()) {
                arrayList.add(npo.c());
            }
        }
        return vun.a((CompletableSource) this.a.a(arrayList)).a((wun<? super Throwable>) $$Lambda$npp$u6cneBSMD23NuRUf5qoerhPJb5A.INSTANCE);
    }
}
