package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.EntitySorting;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: vcb reason: default package */
public final class vcb extends EntitySorting {
    private static final b<Object, String> a = b.b("music_pages_sorting");

    public vcb(Context context, jyg jyg, rwl rwl) {
        super(context, jyg, rwl);
    }

    public final b<Object, String> a() {
        return a;
    }

    public final vca a(jva jva, vca vca, ImmutableList<vca> immutableList) {
        return vca.a(a(jva.h(), vca.a(), ImmutableList.a(fdd.a((Iterable<F>) immutableList, (Function<? super F, ? extends T>) $$Lambda$RI7fd977ZSrlaxH6Q7eSRWAcoqE.INSTANCE))));
    }
}
