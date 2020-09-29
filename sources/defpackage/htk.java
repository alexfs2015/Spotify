package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Response;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;

/* renamed from: htk reason: default package */
public interface htk {
    hpd a();

    Single<List<MediaBrowserItem>> a(String str, int i, int i2, String str2, Bundle bundle);

    void a(int i);

    Single<Response> b(String str, int i, int i2, String str2, Bundle bundle);

    void b();

    Observable<htp> c();
}
