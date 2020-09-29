package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Parcelable;
import com.google.common.base.Optional;

/* renamed from: jam reason: default package */
public final class jam implements jal {
    public final Intent a(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("image/png");
        intent.putExtra("interactive_asset_uri", uri);
        intent.putExtra("content_url", str);
        intent.putExtra("top_background_color", str2);
        intent.putExtra("bottom_background_color", str3);
        intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", "174829003346");
        return intent;
    }

    public final Intent a(String str, Optional<Uri> optional, Uri uri) {
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setDataAndType(uri, "image/png");
        if (optional.b()) {
            intent.putExtra("interactive_asset_uri", (Parcelable) optional.c());
        }
        intent.putExtra("content_url", str);
        intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", "174829003346");
        return intent;
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(PackageManager packageManager) {
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("image/*");
        intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", "174829003346");
        return packageManager.resolveActivity(intent, 0) != null;
    }

    public final String b() {
        return "facebook";
    }

    public final String c() {
        return "fb_stories";
    }
}
