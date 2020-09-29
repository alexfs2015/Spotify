package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: sxk reason: default package */
public final class sxk implements taa {
    private final Context a;
    private final boolean b;

    public sxk(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Intent a(Intent intent, fqn fqn) {
        if (!this.b) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(this.a, "com.spotify.android.spotlets.debugtools.DebugMenuActivity"));
        intent2.setData(intent.getData());
        intent2.putExtras(intent);
        return intent2;
    }

    public final void a(szz szz) {
        szz.a(LinkType.DEBUG, "open the debug menu", (xiz<Intent, fqn, Intent>) new $$Lambda$sxk$tKl6GxQsNzbyT1ysKO3_DNsB0og<Intent,fqn,Intent>(this));
    }
}
