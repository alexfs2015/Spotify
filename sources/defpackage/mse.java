package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.followfeed.network.models.FeedItemDataType;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mse reason: default package */
public final class mse implements Function<mrz, List<mrb>> {
    public final /* synthetic */ Object apply(Object obj) {
        List<msb> a = ((mrz) obj).a().a();
        ArrayList a2 = Lists.a();
        for (msb b : a) {
            List<mry> b2 = b.b();
            ArrayList a3 = Lists.a();
            for (mry mry : b2) {
                String str = "";
                if (mry.b() == FeedItemDataType.MUSIC_RELEASE) {
                    a aVar = new a();
                    List<msc> k = mry.k();
                    ArrayList a4 = Lists.a();
                    for (msc msc : k) {
                        a4.add(new a().b(msc.b()).a(msc.a()).a((List<mqw>) a(msc.c())).a());
                    }
                    a a5 = aVar.a((List<mre>) a4).e((String) mry.h().a(str)).c((String) mry.f().a(str)).d((String) mry.g().a(str)).a(mry.c());
                    Logger.b("Current date returned from backend: %s", (String) mry.d().a(str));
                    a3.add(a5.b("3 M AGO").a(((Boolean) mry.j().a(Boolean.FALSE)).booleanValue()).a(a(mry.e())).f((String) mry.i().a(str)).a(mry.a()).a());
                } else if (mry.b() == FeedItemDataType.FOLLOW_RECOMMENDATION) {
                    a3.add(new a().a(mry.a()).b((String) mry.l().a(str)).a(a(mry.e())).a());
                }
            }
            a2.addAll(a3);
        }
        return a2;
    }

    private static ImmutableList<mqw> a(List<mrr> list) {
        ArrayList a = Lists.a();
        for (mrr mrr : list) {
            a.add(new a().a(mrr.a()).b(mrr.b()).c(mrr.c()).a());
        }
        return ImmutableList.a((Collection<? extends E>) a);
    }
}
