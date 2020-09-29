package defpackage;

import android.text.TextUtils;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.video.drm.DrmException;
import com.spotify.mobile.android.video.drm.DrmLicenseServerException;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.exception.ErrorType;
import java.util.UUID;

/* renamed from: kbr reason: default package */
public final class kbr implements ata {
    private static final xaf a = xaf.b("application/octet-stream");
    private static final xaf b = xaf.b("application/x-www-form-urlencoded");
    private final String c;
    private final xah d;

    public kbr(xah xah, String str) {
        this.d = xah;
        this.c = str;
    }

    public final byte[] a(UUID uuid, a aVar) {
        byte[] bArr = aVar.a;
        if (!DrmUtil.a.equals(uuid)) {
            throw new DrmException("Unsupported DRM scheme", ErrorType.ERROR_DRM_UNSUPPORTED_SCHEME);
        } else if (!TextUtils.isEmpty(this.c)) {
            xal b2 = xai.a(this.d, new a().a(this.c).a(Request.POST, xak.a(a, bArr)).a(), false).b();
            if (b2.c == 200) {
                return b2.g.e();
            }
            throw new DrmLicenseServerException(b2.c, b2.d);
        } else {
            throw new DrmException("No license server", ErrorType.ERROR_DRM_NO_LICENSE_SERVER);
        }
    }

    public final byte[] a(UUID uuid, c cVar) {
        String str = cVar.b;
        byte[] bArr = cVar.a;
        if (DrmUtil.a.equals(uuid)) {
            String str2 = "?";
            boolean contains = str.contains(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (contains) {
                str2 = "&";
            }
            sb.append(str2);
            sb.append("signedRequest=");
            sb.append(new String(bArr, fbi.c));
            return xai.a(this.d, new a().a(sb.toString()).a(Request.POST, xak.a(b, new byte[0])).a(), false).b().g.e();
        }
        throw new DrmException("Unsupported DRM scheme", ErrorType.ERROR_DRM_UNSUPPORTED_SCHEME);
    }
}
