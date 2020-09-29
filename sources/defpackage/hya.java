package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Image;
import java.util.List;

/* renamed from: hya reason: default package */
public final class hya {
    private final hyf a;

    public hya(hyf hyf) {
        this.a = hyf;
    }

    public final hxz a(Ad ad) {
        String str;
        String str2;
        List images = ad.getImages();
        if (!TextUtils.isEmpty(ad.advertiser())) {
            str = ad.advertiser();
        } else {
            str = this.a.a();
        }
        if (!TextUtils.isEmpty(ad.getButtonText())) {
            str2 = ad.getButtonText();
        } else {
            str2 = this.a.b();
        }
        String str3 = "";
        if (!images.isEmpty()) {
            String url = ((Image) images.get(0)).getUrl();
            if (url != null) {
                str3 = url;
            }
        }
        return hxz.a(ad.id(), str3, str, str2, ad.clickUrl());
    }
}
