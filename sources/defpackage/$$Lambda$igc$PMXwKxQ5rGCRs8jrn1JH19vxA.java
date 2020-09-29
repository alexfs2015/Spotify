package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: -$$Lambda$igc$PMXwK-xQ5rGCRs8jrn1-JH19vxA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$igc$PMXwKxQ5rGCRs8jrn1JH19vxA implements a {
    private final /* synthetic */ ka f$0;

    public /* synthetic */ $$Lambda$igc$PMXwKxQ5rGCRs8jrn1JH19vxA(ka kaVar) {
        this.f$0 = kaVar;
    }

    public final void onWebTokenUriReady(Uri uri) {
        this.f$0.startActivity(new Intent("android.intent.action.VIEW", uri));
    }
}
