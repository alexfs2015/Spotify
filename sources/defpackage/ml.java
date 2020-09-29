package defpackage;

import android.app.Notification.Builder;
import android.app.Notification.MediaStyle;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build.VERSION;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.widget.RemoteViews;
import com.spotify.music.R;

/* renamed from: ml reason: default package */
public final class ml {

    /* renamed from: ml$a */
    public static class a extends e {
        public int[] c = null;
        public Token d;
        public PendingIntent e;
        private boolean f;

        public final a a(boolean z) {
            if (VERSION.SDK_INT < 21) {
                this.f = true;
            }
            return this;
        }

        public final void a(fh fhVar) {
            if (VERSION.SDK_INT >= 21) {
                Builder a = fhVar.a();
                MediaStyle mediaStyle = new MediaStyle();
                int[] iArr = this.c;
                if (iArr != null) {
                    mediaStyle.setShowActionsInCompactView(iArr);
                }
                Token token = this.d;
                if (token != null) {
                    mediaStyle.setMediaSession((MediaSession.Token) token.a);
                }
                a.setStyle(mediaStyle);
                return;
            }
            if (this.f) {
                fhVar.a().setOngoing(true);
            }
        }

        public final RemoteViews a() {
            int i;
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            RemoteViews a = a(false, R.layout.notification_template_media, true);
            int size = this.a.b.size();
            int[] iArr = this.c;
            if (iArr == null) {
                i = 0;
            } else {
                i = Math.min(iArr.length, 3);
            }
            a.removeAllViews(R.id.media_actions);
            if (i > 0) {
                int i2 = 0;
                while (i2 < i) {
                    if (i2 < size) {
                        a.addView(R.id.media_actions, a((defpackage.fi.a) this.a.b.get(this.c[i2])));
                        i2++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.f) {
                a.setViewVisibility(R.id.end_padder, 8);
                a.setViewVisibility(R.id.cancel_action, 0);
                a.setOnClickPendingIntent(R.id.cancel_action, this.e);
                a.setInt(R.id.cancel_action, "setAlpha", this.a.a.getResources().getInteger(R.integer.cancel_button_image_alpha));
            } else {
                a.setViewVisibility(R.id.end_padder, 0);
                a.setViewVisibility(R.id.cancel_action, 8);
            }
            return a;
        }

        public final RemoteViews b() {
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            int min = Math.min(this.a.b.size(), 5);
            RemoteViews a = a(false, min <= 3 ? R.layout.notification_template_big_media_narrow : R.layout.notification_template_big_media, false);
            a.removeAllViews(R.id.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    a.addView(R.id.media_actions, a((defpackage.fi.a) this.a.b.get(i)));
                }
            }
            if (this.f) {
                a.setViewVisibility(R.id.cancel_action, 0);
                a.setInt(R.id.cancel_action, "setAlpha", this.a.a.getResources().getInteger(R.integer.cancel_button_image_alpha));
                a.setOnClickPendingIntent(R.id.cancel_action, this.e);
            } else {
                a.setViewVisibility(R.id.cancel_action, 8);
            }
            return a;
        }

        private RemoteViews a(defpackage.fi.a aVar) {
            boolean z = aVar.i == null;
            RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), R.layout.notification_media_action);
            remoteViews.setImageViewResource(R.id.action0, aVar.g);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.action0, aVar.i);
            }
            if (VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(R.id.action0, aVar.h);
            }
            return remoteViews;
        }
    }
}
