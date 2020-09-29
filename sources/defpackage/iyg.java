package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Parcelable;
import com.google.common.base.Optional;

/* renamed from: iyg reason: default package */
public final class iyg implements iya {
    public final boolean a() {
        return false;
    }

    public final String b() {
        return "instagram";
    }

    public final String c() {
        return "ig_stories";
    }

    public final Intent a(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/png");
        intent.putExtra("interactive_asset_uri", uri);
        intent.putExtra("content_url", str);
        intent.putExtra("top_background_color", str2);
        intent.putExtra("bottom_background_color", str3);
        return intent;
    }

    public final Intent a(String str, Optional<Uri> optional, Uri uri) {
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setDataAndType(uri, "image/png");
        if (optional.b()) {
            intent.putExtra("interactive_asset_uri", (Parcelable) optional.c());
        }
        intent.putExtra("content_url", str);
        return intent;
    }

    public final boolean a(PackageManager packageManager) {
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/*");
        if (packageManager.resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }
}
