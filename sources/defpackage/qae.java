package defpackage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: qae reason: default package */
public final class qae {
    private final qaf a;
    private final SpSharedPreferences<Object> b;
    private final ObjectMapper c;
    private final qau d;
    private final qbh e;

    public qae(qaf qaf, SpSharedPreferences<Object> spSharedPreferences, rwl rwl, qau qau, qbh qbh) {
        this.a = qaf;
        this.b = spSharedPreferences;
        this.c = rwl.a().a(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false).a();
        this.d = qau;
        this.e = qbh;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(xgo xgo) {
        try {
            List list = (List) this.c.readValue(((xam) xgo.b()).f(), (TypeReference) new TypeReference<List<qag>>() {
            });
            list.removeAll(Collections.singleton(null));
            return Observable.b(list);
        } catch (IOException unused) {
            return Observable.a(new Throwable(qba.b(xgo)));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable c(xgo xgo) {
        return !xgo.a.a() ? Observable.a(new Throwable(qba.a(xgo))) : Observable.b(xgo);
    }

    public final Observable<List<qag>> a() {
        return this.a.a(CC.a(this.b.a(qbb.i, false))).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$qae$N9eXH3kXdIQgFIWFIEq9pYgq0c8.INSTANCE, false).c((Function<? super T, ? extends R>) $$Lambda$qae$UjJCZqYS_QOH6chJsXV4lySH9LM.INSTANCE).a((ObservableTransformer<? super T, ? extends R>) this.e).g((Function<? super Observable<Throwable>, ? extends ObservableSource<?>>) this.d).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qae$hsYZZgdmMnbrhaTRoRkV6u7q3A0<Object,Object>(this), false);
    }
}
