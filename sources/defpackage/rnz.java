package defpackage;

import com.spotify.music.libs.bluetooth.BluetoothCategorizer.CategorizerResponse;
import io.reactivex.Single;

/* renamed from: rnz reason: default package */
public interface rnz {
    @wtn(a = {"No-Webgate-Authentication: true"})
    @wti(a = "external-accessory-categorizer/v1/categorize/{name}")
    Single<CategorizerResponse> a(@wtv(a = "name") String str);
}
