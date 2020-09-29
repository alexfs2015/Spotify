package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@cey
/* renamed from: ckn reason: default package */
final class ckn {
    static final Map<String, String> a;
    final Context b;
    final List<String> c;
    final cjz d;

    static {
        HashMap hashMap = new HashMap();
        if (bzo.g()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        a = hashMap;
    }

    ckn(Context context, List<String> list, cjz cjz) {
        this.b = context;
        this.c = list;
        this.d = cjz;
    }
}
