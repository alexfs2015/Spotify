package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@cfp
/* renamed from: cle reason: default package */
final class cle {
    static final Map<String, String> a;
    final Context b;
    final List<String> c;
    final ckq d;

    static {
        HashMap hashMap = new HashMap();
        if (caf.g()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        a = hashMap;
    }

    cle(Context context, List<String> list, ckq ckq) {
        this.b = context;
        this.c = list;
        this.d = ckq;
    }
}
