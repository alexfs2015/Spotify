package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;

/* renamed from: maw reason: default package */
public interface maw {
    @wti(a = "chartview/v3/overview/android")
    Single<HubsJsonViewModel> a();

    @wti(a = "chartview/v3/charts/{block}/android")
    Single<HubsJsonViewModel> a(@wtv(a = "block") String str);
}
