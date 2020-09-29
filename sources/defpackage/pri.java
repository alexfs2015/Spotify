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

/* renamed from: pri reason: default package */
public final class pri {
    private final prj a;
    private final SpSharedPreferences<Object> b;
    private final ObjectMapper c;
    private final pry d;
    private final psl e;

    public pri(prj prj, SpSharedPreferences<Object> spSharedPreferences, rnf rnf, pry pry, psl psl) {
        this.a = prj;
        this.b = spSharedPreferences;
        this.c = rnf.a().a(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false).a();
        this.d = pry;
        this.e = psl;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(wsj wsj) {
        try {
            List list = (List) this.c.readValue(((wmg) wsj.b()).f(), (TypeReference) new TypeReference<List<prk>>() {
            });
            list.removeAll(Collections.singleton(null));
            return Observable.b(list);
        } catch (IOException unused) {
            return Observable.a(new Throwable(pse.b(wsj)));
        }
    }

    public final Observable<List<prk>> a() {
        return this.a.a(CC.a(this.b.a(psf.i, false))).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$pri$GReklD95eoFuQ2ysxcEV084556c.INSTANCE, false).c((Function<? super T, ? extends R>) $$Lambda$pri$PgBwQ_AQFWWgTz7MwqI5qQv1ivs.INSTANCE).a((ObservableTransformer<? super T, ? extends R>) this.e).g((Function<? super Observable<Throwable>, ? extends ObservableSource<?>>) this.d).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$pri$RAl98B2aJfv2KVa8wuEKhYKWwLM<Object,Object>(this), false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable c(wsj wsj) {
        if (!wsj.a.a()) {
            return Observable.a(new Throwable(pse.a(wsj)));
        }
        return Observable.b(wsj);
    }
}
