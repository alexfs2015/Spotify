package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;

/* renamed from: mcs reason: default package */
public interface mcs {
    @xhn(a = "hubview-mobile-v1/browse/{page}?platform=android")
    Single<HubsJsonViewModel> a(@xia(a = "page") String str, @xib(a = "client-timezone") String str2, @xib(a = "podcast") boolean z, @xib(a = "video") boolean z2, @xib(a = "locale") String str3, @xib(a = "signal") String str4, @xib(a = "offset") String str5);

    @xhn(a = "hubview-mobile-v1/browse/{page}?platform=android")
    Single<xgo<xam>> b(@xia(a = "page") String str, @xib(a = "client-timezone") String str2, @xib(a = "podcast") boolean z, @xib(a = "video") boolean z2, @xib(a = "locale") String str3, @xib(a = "signal") String str4, @xib(a = "offset") String str5);
}
