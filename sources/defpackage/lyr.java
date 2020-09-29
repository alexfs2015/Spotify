package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;

/* renamed from: lyr reason: default package */
public interface lyr {
    @wti(a = "hubview-mobile-v1/browse/{page}?platform=android")
    Single<HubsJsonViewModel> a(@wtv(a = "page") String str, @wtw(a = "client-timezone") String str2, @wtw(a = "podcast") boolean z, @wtw(a = "video") boolean z2, @wtw(a = "locale") String str3, @wtw(a = "signal") String str4, @wtw(a = "offset") String str5);

    @wti(a = "hubview-mobile-v1/browse/{page}?platform=android")
    Single<wsj<wmg>> b(@wtv(a = "page") String str, @wtw(a = "client-timezone") String str2, @wtw(a = "podcast") boolean z, @wtw(a = "video") boolean z2, @wtw(a = "locale") String str3, @wtw(a = "signal") String str4, @wtw(a = "offset") String str5);
}
