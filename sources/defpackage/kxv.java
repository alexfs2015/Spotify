package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.collection.played.PlayedStateService;

/* renamed from: kxv reason: default package */
public final class kxv {
    private final Context a;

    public kxv(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: 0000 */
    public final void a(String[] strArr, boolean z) {
        this.a.startService(a("PlayedStateService.action.PLAYED", strArr, z));
    }

    private Intent a(String str, String[] strArr, boolean z) {
        Intent intent = new Intent(this.a, PlayedStateService.class);
        intent.putExtra("uris", strArr);
        intent.putExtra("played", z);
        intent.setAction(str);
        return intent;
    }
}
