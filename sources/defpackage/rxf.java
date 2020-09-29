package defpackage;

import com.spotify.music.libs.bluetooth.BluetoothCategorizer.CategorizerResponse;
import io.reactivex.Single;

/* renamed from: rxf reason: default package */
public interface rxf {
    @xhs(a = {"No-Webgate-Authentication: true"})
    @xhn(a = "external-accessory-categorizer/v1/categorize/{name}")
    Single<CategorizerResponse> a(@xia(a = "name") String str);
}
