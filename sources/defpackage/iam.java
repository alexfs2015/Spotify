package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Image;
import java.util.List;

/* renamed from: iam reason: default package */
public final class iam {
    private final iar a;

    public iam(iar iar) {
        this.a = iar;
    }

    public final ial a(Ad ad) {
        List images = ad.getImages();
        String advertiser = !TextUtils.isEmpty(ad.advertiser()) ? ad.advertiser() : this.a.a();
        String buttonText = !TextUtils.isEmpty(ad.getButtonText()) ? ad.getButtonText() : this.a.b();
        String str = "";
        if (!images.isEmpty()) {
            String url = ((Image) images.get(0)).getUrl();
            if (url != null) {
                str = url;
            }
        }
        return ial.a(ad.id(), str, advertiser, buttonText, ad.clickUrl());
    }
}
