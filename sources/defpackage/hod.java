package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.RestrictedMediaAction;
import java.util.Map;

/* renamed from: hod reason: default package */
public interface hod {
    wud<PlayerState> a();

    void a(int i);

    void a(int i, String str, PlayerQueue playerQueue, ActionCallback actionCallback);

    void a(long j, ActionCallback actionCallback);

    void a(PlayerContext playerContext, PlayOptions playOptions, String str, ActionCallback actionCallback);

    void a(String str);

    void a(String str, PlayOptions playOptions, String str2, ActionCallback actionCallback);

    void a(String str, PlayOptions playOptions, Map<String, String> map, String str2, ActionCallback actionCallback);

    void a(String str, ActionCallback actionCallback);

    PlayerState b();

    void b(String str);

    void b(String str, ActionCallback actionCallback);

    wud<RestrictedMediaAction> c();

    void c(String str);

    void c(String str, ActionCallback actionCallback);

    wud<Integer> d();

    void d(String str);

    void d(String str, ActionCallback actionCallback);

    void e(String str);

    void f(String str);
}
