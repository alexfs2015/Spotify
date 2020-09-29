package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;

/* renamed from: mez reason: default package */
public interface mez {
    @xhn(a = "chartview/v3/overview/android")
    Single<HubsJsonViewModel> a();

    @xhn(a = "chartview/v3/charts/{block}/android")
    Single<HubsJsonViewModel> a(@xia(a = "block") String str);
}
