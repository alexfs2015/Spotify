package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.followfeed.network.models.FeedItemDataType;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mxf reason: default package */
public final class mxf implements Function<mwx, List<mvr>> {
    private static ImmutableList<mvm> a(List<mwo> list) {
        ArrayList a = Lists.a();
        for (mwo mwo : list) {
            a.add(new a().a(mwo.a()).b(mwo.b()).a(Optional.c(mwo.c())).a());
        }
        return ImmutableList.a((Collection<? extends E>) a);
    }

    public static List<mvr> a(mwx mwx) {
        List<mww> a = mwx.a().a();
        ArrayList a2 = Lists.a();
        ArrayList a3 = Lists.a();
        for (mww mww : a) {
            if (mww.b() == FeedItemDataType.MUSIC_RELEASE && mww.c() != null) {
                mwz c = mww.c();
                a aVar = new a();
                List<mxb> i = c.i();
                ArrayList a4 = Lists.a();
                if (i != null) {
                    for (mxb mxb : i) {
                        a4.add(new a().b(mxb.b()).a(mxb.a()).a((List<mvm>) a(mxb.c())).a());
                    }
                }
                a a5 = aVar.a((List<mvu>) a4).e(c.g()).c(c.b()).d(c.c()).a(Optional.c(c.d()));
                Logger.b("Current date returned from backend: %s", c.e().toString());
                a3.add(a5.b("3 M AGO").a(c.h()).a(a(c.f())).f(c.a()).a(mww.a()).a());
            } else if (mww.b() == FeedItemDataType.FOLLOW_RECOMMENDATION && mww.d() != null) {
                mwy d = mww.d();
                a3.add(new a().a(mww.a()).b(d.a()).a(a(d.b())).a());
            }
        }
        a2.addAll(a3);
        return a2;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return a((mwx) obj);
    }
}
