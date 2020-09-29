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

/* renamed from: poz reason: default package */
public final class poz implements pox {
    private final ppa a;
    private final psl b;
    private final SpSharedPreferences<Object> c;
    private final poy d;

    public poz(ppa ppa, psl psl, poy poy, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = ppa;
        this.b = psl;
        this.d = poy;
        this.c = spSharedPreferences;
    }

    /* access modifiers changed from: private */
    public Optional<ho<prk, ppb>> a(Optional<ho<String, ppb>> optional, List<prk> list) {
        prk prk;
        if (!optional.b()) {
            return Optional.e();
        }
        String str = (String) fay.a(((ho) optional.c()).a);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                prk = null;
                break;
            }
            prk = (prk) it.next();
            if (prk.getTriggerString().equals(str)) {
                break;
            }
        }
        if (prk == null) {
            return Optional.e();
        }
        return Optional.b(ho.a(prk, ((ho) optional.c()).b));
    }

    public final Observable<Optional<ho<prk, ppb>>> a(List<prk> list, String str, String str2, String str3, String str4, boolean z) {
        String str5 = str3;
        boolean a2 = this.c.a(psf.i, false);
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            List<prk> list2 = list;
            strArr[i] = ((prk) list.get(i)).getTriggerString();
        }
        List<prk> list3 = list;
        return this.a.a(str, CC.a(a2), str4, str3, SpotifyLocale.a(), str2, z, strArr).d().c((Function<? super T, ? extends R>) new $$Lambda$poz$e2rfXp5P64ne5vMcOIArOxjsC0<Object,Object>(str5)).a((ObservableTransformer<? super T, ? extends R>) this.b).a(this.d.a(str5), false).b((ObservableSource<? extends U>) Observable.b(list), (BiFunction<? super T, ? super U, ? extends R>) new $$Lambda$poz$Cwmj61ItrdPuSzjGBIPEj7g0nU<Object,Object,Object>(this));
    }
}
