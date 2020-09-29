package defpackage;

import com.google.common.base.Optional;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;

/* renamed from: pxv reason: default package */
public final class pxv implements pxt {
    private final pxw a;
    private final qbh b;
    private final SpSharedPreferences<Object> c;
    private final pxu d;

    public pxv(pxw pxw, qbh qbh, pxu pxu, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = pxw;
        this.b = qbh;
        this.d = pxu;
        this.c = spSharedPreferences;
    }

    /* access modifiers changed from: private */
    public Optional<ho<qag, pxx>> a(Optional<ho<String, pxx>> optional, List<qag> list) {
        qag qag;
        if (!optional.b()) {
            return Optional.e();
        }
        String str = (String) fbp.a(((ho) optional.c()).a);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                qag = null;
                break;
            }
            qag = (qag) it.next();
            if (qag.getTriggerString().equals(str)) {
                break;
            }
        }
        return qag == null ? Optional.e() : Optional.b(ho.a(qag, ((ho) optional.c()).b));
    }

    public final Observable<Optional<ho<qag, pxx>>> a(List<qag> list, String str, String str2, String str3, String str4, boolean z) {
        String str5 = str3;
        boolean a2 = this.c.a(qbb.i, false);
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            List<qag> list2 = list;
            strArr[i] = ((qag) list.get(i)).getTriggerString();
        }
        List<qag> list3 = list;
        return this.a.a(str, CC.a(a2), str4, str3, SpotifyLocale.a(), str2, z, strArr).d().c((Function<? super T, ? extends R>) new $$Lambda$pxv$eM4k0OEaEmsypRlT0c9su6kHnM<Object,Object>(str5)).a((ObservableTransformer<? super T, ? extends R>) this.b).a(this.d.a(str5), false).b((ObservableSource<? extends U>) Observable.b(list), (BiFunction<? super T, ? super U, ? extends R>) new $$Lambda$pxv$AANIokmXzkjQw1FP1NxByXBmY9k<Object,Object,Object>(this));
    }
}
