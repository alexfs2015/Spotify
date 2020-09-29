package defpackage;

import com.spotify.music.features.pushnotifications.inapppreference.model.Category;
import io.reactivex.Completable;
import io.reactivex.Observable;

/* renamed from: pkv reason: default package */
public interface pkv {
    @wtr(a = "notifs-preferences/v3/subscribe")
    Completable a(@wtw(a = "channel") String str, @wtw(a = "message_type") String str2);

    @wti(a = "notifs-preferences/v3/preferences")
    Observable<Category[]> a(@wtw(a = "locale") String str);

    @wtr(a = "notifs-preferences/v3/unsubscribe")
    Completable b(@wtw(a = "channel") String str, @wtw(a = "message_type") String str2);
}
