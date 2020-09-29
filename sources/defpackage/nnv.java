package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import java.util.Collections;

/* renamed from: nnv reason: default package */
public abstract class nnv {
    public static final nnv a = new a().a(nnw.a).a((lbg) new defpackage.lbg.a()).a(new RecentlyPlayedItems(0, true, Collections.emptyList())).a();

    /* renamed from: nnv$a */
    public interface a {
        a a(RecentlyPlayedItems recentlyPlayedItems);

        a a(lbg lbg);

        a a(nnw nnw);

        nnv a();
    }

    public final nnv a(nnw nnw) {
        return d().a(nnw).a();
    }

    public abstract nnw a();

    public abstract lbg b();

    public abstract RecentlyPlayedItems c();

    public abstract a d();
}
