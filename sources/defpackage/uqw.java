package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.EntitySorting;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: uqw reason: default package */
public final class uqw extends EntitySorting {
    private static final b<Object, String> a = b.b("music_pages_sorting");

    public uqw(Context context, jvy jvy, rnf rnf) {
        super(context, jvy, rnf);
    }

    public final b<Object, String> a() {
        return a;
    }

    public final uqv a(jst jst, uqv uqv, ImmutableList<uqv> immutableList) {
        return uqv.a(a(jst.h(), uqv.a(), ImmutableList.a(fcl.a((Iterable<F>) immutableList, (Function<? super F, ? extends T>) $$Lambda$soeA_Gh8hpsN5yb58OhEQvvELtU.INSTANCE))));
    }
}
