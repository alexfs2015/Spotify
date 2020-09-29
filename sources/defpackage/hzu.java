package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.AdSettingsModel;
import io.reactivex.Observable;

/* renamed from: hzu reason: default package */
public interface hzu {
    Observable<AdSettingsModel> a(String str);

    Observable<Response> a(String str, String str2, String str3);

    Observable<Response> a(String str, String str2, boolean z);

    Observable<Response> a(String str, boolean z);
}
