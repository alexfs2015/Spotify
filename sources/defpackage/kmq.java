package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: kmq reason: default package */
final class kmq {
    private final Context a;

    kmq(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: 0000 */
    public final kmp a(PartnerType partnerType) {
        if (partnerType == PartnerType.GOOGLE_MAPS) {
            return kmp.a(this.a.getString(R.string.maps_back_banner_header_googlemaps), this.a.getString(R.string.maps_back_banner_subtitle_googlemaps), (Drawable) fay.a(this.a.getResources().getDrawable(R.drawable.app_logo_googlemaps)), "GMM");
        }
        if (partnerType == PartnerType.WAZE) {
            return kmp.a(this.a.getString(R.string.maps_back_banner_header_waze), null, (Drawable) fay.a(this.a.getResources().getDrawable(R.drawable.app_logo_waze)), "WAZE");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(partnerType);
        sb.append("not implemented");
        throw new IllegalArgumentException(sb.toString());
    }
}
