package defpackage;

import android.content.Context;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: opk reason: default package */
final class opk {
    private final oph a;
    private final int b;
    private final fpt c;
    private final rgz d;
    private final rfd e;
    private final jro f;

    public opk(Context context, oph oph, fpt fpt, rgz rgz, rfd rfd, jro jro) {
        this.b = context.getResources().getInteger(R.integer.grid_columns);
        this.a = oph;
        this.c = fpt;
        this.d = rgz;
        this.e = rfd;
        this.f = jro;
    }

    public final Observable<hai> a(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(10);
        linkedHashMap.put("signal", String.format("playlistURI:%s", new Object[]{str}));
        linkedHashMap.put("region", Locale.getDefault().getCountry());
        linkedHashMap.putAll(udq.a(this.c, this.b, this.f));
        return this.a.a(linkedHashMap, udq.a(this.c, this.d)).d().a(vun.a((c<T, R>) this.e, BackpressureStrategy.BUFFER)).c((Function<? super T, ? extends R>) $$Lambda$1jCBrVg09y9v8jvsN02TQNtt5M0.INSTANCE);
    }
}
