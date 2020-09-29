package defpackage;

import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* renamed from: bqa reason: default package */
public final class bqa implements bol {
    private final /* synthetic */ MediaNotificationService a;

    public bqa(MediaNotificationService mediaNotificationService) {
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
