package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.cast.framework.media.MediaNotificationService.a;

/* renamed from: bpi reason: default package */
public final class bpi implements eiv {
    private final /* synthetic */ a a;
    private final /* synthetic */ MediaNotificationService b;

    public bpi(MediaNotificationService mediaNotificationService, a aVar) {
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
