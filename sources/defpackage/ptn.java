package defpackage;

import com.spotify.music.features.pushnotifications.inapppreference.model.Category;
import io.reactivex.Completable;
import io.reactivex.Observable;

/* renamed from: ptn reason: default package */
public interface ptn {
    @xhw(a = "notifs-preferences/v3/subscribe")
    Completable a(@xib(a = "channel") String str, @xib(a = "message_type") String str2);

    @xhn(a = "notifs-preferences/v3/preferences")
    Observable<Category[]> a(@xib(a = "locale") String str);

    @xhw(a = "notifs-preferences/v3/unsubscribe")
    Completable b(@xib(a = "channel") String str, @xib(a = "message_type") String str2);
}
