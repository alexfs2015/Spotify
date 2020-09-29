package defpackage;

import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* renamed from: bpj reason: default package */
public final class bpj implements bnu {
    private final /* synthetic */ MediaNotificationService a;

    public bpj(MediaNotificationService mediaNotificationService) {
        this.a = mediaNotificationService;
    }

    public final void a() {
        this.a.stopForeground(true);
    }

    public final void b() {
        if (this.a.p != null) {
            MediaNotificationService mediaNotificationService = this.a;
            mediaNotificationService.startForeground(1, mediaNotificationService.p);
            return;
        }
        this.a.stopForeground(true);
    }
}
