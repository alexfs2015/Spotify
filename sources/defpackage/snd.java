package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: snd reason: default package */
public final class snd implements spt {
    private final Context a;
    private final boolean b;

    public snd(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    public final void a(sps sps) {
        sps.a(LinkType.DEBUG, "open the debug menu", (wuu<Intent, fpt, Intent>) new $$Lambda$snd$wen6qn48yJ4a_pFOZrRl_2BodA<Intent,fpt,Intent>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Intent a(Intent intent, fpt fpt) {
        if (!this.b) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(this.a, "com.spotify.android.spotlets.debugtools.DebugMenuActivity"));
        intent2.setData(intent.getData());
        intent2.putExtras(intent);
        return intent2;
    }
}
