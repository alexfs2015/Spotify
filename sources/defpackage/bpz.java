package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.cast.framework.media.MediaNotificationService.a;

/* renamed from: bpz reason: default package */
public final class bpz implements ejm {
    private final /* synthetic */ a a;
    private final /* synthetic */ MediaNotificationService b;

    public bpz(MediaNotificationService mediaNotificationService, a aVar) {
        this.b = mediaNotificationService;
        this.a = aVar;
    }

    public final void a(Bitmap bitmap) {
        a aVar = this.a;
        aVar.b = bitmap;
        this.b.o = aVar;
        this.b.b();
    }
}
