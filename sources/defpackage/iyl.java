package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import org.json.JSONObject;

/* renamed from: iyl reason: default package */
public final class iyl implements iya {
    public final boolean a() {
        return true;
    }

    public final String b() {
        return "snapchat";
    }

    public final String c() {
        return "sc_stories";
    }

    public final Intent a(String str, Uri uri, String str2, String str3) {
        throw new IllegalArgumentException("SnapchatStoriesApi doesn't support background colors");
    }

    public final Intent a(String str, Optional<Uri> optional, Uri uri) {
        Intent intent = new Intent();
        intent.setDataAndType(Uri.parse("snapchat://creativekit/preview/1"), "image/*");
        intent.putExtra("CLIENT_ID", "44074368-586a-4d46-8116-9789cd7ad07c");
        if (optional.b()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uri", optional.c());
                intent.putExtra("sticker", jSONObject.toString());
            } catch (Exception e) {
                Logger.e(e.getMessage(), new Object[0]);
            }
        }
        intent.setPackage("com.snapchat.android");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("attachmentUrl", str);
        return intent;
    }

    public final boolean a(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setDataAndType(Uri.parse("snapchat://creativekit/preview/1"), "image/*");
        intent.setPackage("com.snapchat.android");
        if (packageManager.resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }
}
