package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import java.util.Collections;

/* renamed from: nhz reason: default package */
public abstract class nhz {
    public static final nhz a = new a().a(nia.a).a((kxx) new defpackage.kxx.a()).a(new RecentlyPlayedItems(0, true, Collections.emptyList())).a();

    /* renamed from: nhz$a */
    public interface a {
        a a(RecentlyPlayedItems recentlyPlayedItems);

        a a(kxx kxx);

        a a(nia nia);

        nhz a();
    }

    public abstract nia a();

    public abstract kxx b();

    public abstract RecentlyPlayedItems c();

    public abstract a d();

    public final nhz a(nia nia) {
        return d().a(nia).a();
    }
}
