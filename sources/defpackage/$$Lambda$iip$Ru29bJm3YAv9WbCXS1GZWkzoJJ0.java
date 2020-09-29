package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: -$$Lambda$iip$Ru29bJm3YAv9WbCXS1GZWkzoJJ0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$iip$Ru29bJm3YAv9WbCXS1GZWkzoJJ0 implements a {
    private final /* synthetic */ kf f$0;

    public /* synthetic */ $$Lambda$iip$Ru29bJm3YAv9WbCXS1GZWkzoJJ0(kf kfVar) {
        this.f$0 = kfVar;
    }

    public final void onWebTokenUriReady(Uri uri) {
        this.f$0.startActivity(new Intent("android.intent.action.VIEW", uri));
    }
}
