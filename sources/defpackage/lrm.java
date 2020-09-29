package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.SortOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lrm reason: default package */
public final class lrm {
    private static final List<way> b;
    private static final way c = vkc.d;
    public final way a;

    static {
        ArrayList a2 = Lists.a();
        b = a2;
        a2.add(way.e().a("").a());
        b.add(vkc.b);
        b.add(vkc.c);
        b.add(vkc.e);
        b.add(c);
    }

    public lrm(vcb vcb) {
        Collection a2 = fcm.a((Collection<F>) b, (Function<? super F, T>) new Function<way, SortOption>() {
            public final /* synthetic */ Object apply(Object obj) {
                return lrm.b((way) obj);
            }
        });
        jva a3 = jva.a("spotify:playlists");
        this.a = juy.a(vcb.a(a3.h(), b(c), ImmutableList.a((Collection<? extends E>) Lists.a((Iterable<? extends E>) a2))));
    }

    /* access modifiers changed from: private */
    public static SortOption b(way way) {
        return new SortOption(way.a(), true).a(way.b());
    }
}
