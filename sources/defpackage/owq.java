package defpackage;

import android.content.Context;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: owq reason: default package */
final class owq {
    private final own a;
    private final int b;
    private final fqn c;
    private final rqb d;
    private final rof e;
    private final jty f;

    public owq(Context context, own own, fqn fqn, rqb rqb, rof rof, jty jty) {
        this.b = context.getResources().getInteger(R.integer.grid_columns);
        this.a = own;
        this.c = fqn;
        this.d = rqb;
        this.e = rof;
        this.f = jty;
    }

    public final Observable<hdb> a(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(10);
        linkedHashMap.put("signal", String.format("playlistURI:%s", new Object[]{str}));
        linkedHashMap.put("region", Locale.getDefault().getCountry());
        linkedHashMap.putAll(uql.a(this.c, this.b, this.f));
        return this.a.a(linkedHashMap, uql.a(this.c, this.d)).d().a(wit.a((c<T, R>) this.e, BackpressureStrategy.BUFFER)).c((Function<? super T, ? extends R>) $$Lambda$fTFxm5o26NIjOfCcbLQUyImMlds.INSTANCE);
    }
}
