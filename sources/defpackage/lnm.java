package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.SortOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lnm reason: default package */
public final class lnm {
    private static final List<vns> b;
    private static final vns c = uya.d;
    public final vns a;

    static {
        ArrayList a2 = Lists.a();
        b = a2;
        a2.add(vns.e().a("").a());
        b.add(uya.b);
        b.add(uya.c);
        b.add(uya.e);
        b.add(c);
    }

    public lnm(uqw uqw) {
        Collection a2 = fbv.a((Collection<F>) b, (Function<? super F, T>) new Function<vns, SortOption>() {
            public final /* synthetic */ Object apply(Object obj) {
                return lnm.b((vns) obj);
            }
        });
        jst a3 = jst.a("spotify:playlists");
        this.a = jsr.a(uqw.a(a3.h(), b(c), ImmutableList.a((Collection<? extends E>) Lists.a((Iterable<? extends E>) a2))));
    }

    /* access modifiers changed from: private */
    public static SortOption b(vns vns) {
        return new SortOption(vns.a(), true).a(vns.b());
    }
}
