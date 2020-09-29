package defpackage;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fj reason: default package */
final class fj implements fh {
    private final Builder a;
    private final c b;
    private RemoteViews c;
    private RemoteViews d;
    private final List<Bundle> e = new ArrayList();
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    fj(c cVar) {
        this.b = cVar;
        if (VERSION.SDK_INT >= 26) {
            this.a = new Builder(cVar.a, cVar.t);
        } else {
            this.a = new Builder(cVar.a);
        }
        Notification notification = cVar.w;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.d).setContentText(cVar.e).setContentInfo(null).setContentIntent(cVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(cVar.g).setNumber(0).setProgress(cVar.l, cVar.m, cVar.n);
        if (VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.a.setSubText(cVar.k).setUsesChronometer(false).setPriority(cVar.h);
            Iterator it = cVar.b.iterator();
            while (it.hasNext()) {
                a((a) it.next());
            }
            if (cVar.q != null) {
                this.f.putAll(cVar.q);
            }
            if (VERSION.SDK_INT < 20 && cVar.o) {
                this.f.putBoolean("android.support.localOnly", true);
            }
            this.c = null;
            this.d = null;
        }
        if (VERSION.SDK_INT >= 19) {
            this.a.setShowWhen(cVar.i);
            if (VERSION.SDK_INT < 21 && cVar.x != null && !cVar.x.isEmpty()) {
                this.f.putStringArray("android.people", (String[]) cVar.x.toArray(new String[cVar.x.size()]));
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(cVar.o).setGroup(null).setGroupSummary(false).setSortKey(null);
            this.g = 0;
        }
        if (VERSION.SDK_INT >= 21) {
            this.a.setCategory(cVar.p).setColor(cVar.r).setVisibility(cVar.s).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = cVar.x.iterator();
            while (it2.hasNext()) {
                this.a.addPerson((String) it2.next());
            }
            this.h = null;
            if (cVar.c.size() > 0) {
                String str = "android.car.EXTENSIONS";
                Bundle bundle = cVar.a().getBundle(str);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = new Bundle();
                for (int i = 0; i < cVar.c.size(); i++) {
                    bundle2.putBundle(Integer.toString(i), fk.a((a) cVar.c.get(i)));
                }
                bundle.putBundle("invisible_actions", bundle2);
                cVar.a().putBundle(str, bundle);
                this.f.putBundle(str, bundle);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.a.setExtras(cVar.q).setRemoteInputHistory(null);
        }
        if (VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(0).setShortcutId(null).setTimeoutAfter(0).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(cVar.t)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    private static void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    private void a(a aVar) {
        if (VERSION.SDK_INT >= 20) {
            Action.Builder builder = new Action.Builder(aVar.g, aVar.h, aVar.i);
            if (aVar.b != null) {
                for (RemoteInput addRemoteInput : fm.a(aVar.b)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.a != null ? new Bundle(aVar.a) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.d);
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.d);
            }
            bundle.putInt("android.support.action.semanticAction", aVar.f);
            if (VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.f);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.e);
            builder.addExtras(bundle);
            this.a.addAction(builder.build());
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            this.e.add(fk.a(this.a, aVar));
        }
    }

    public final Builder a() {
        return this.a;
    }

    public final Notification b() {
        Notification notification;
        e eVar = this.b.j;
        if (eVar != null) {
            eVar.a((fh) this);
        }
        RemoteViews a2 = eVar != null ? eVar.a() : null;
        if (VERSION.SDK_INT >= 26) {
            notification = this.a.build();
        } else if (VERSION.SDK_INT >= 24) {
            notification = this.a.build();
            if (this.g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.g != 2)) {
                    a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.g == 1) {
                    a(notification);
                }
            }
        } else if (VERSION.SDK_INT >= 21) {
            this.a.setExtras(this.f);
            notification = this.a.build();
            RemoteViews remoteViews = this.c;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.d;
            if (remoteViews2 != null) {
                notification.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.h;
            if (remoteViews3 != null) {
                notification.headsUpContentView = remoteViews3;
            }
            if (this.g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.g != 2)) {
                    a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.g == 1) {
                    a(notification);
                }
            }
        } else if (VERSION.SDK_INT >= 20) {
            this.a.setExtras(this.f);
            notification = this.a.build();
            RemoteViews remoteViews4 = this.c;
            if (remoteViews4 != null) {
                notification.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.d;
            if (remoteViews5 != null) {
                notification.bigContentView = remoteViews5;
            }
            if (this.g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.g != 2)) {
                    a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.g == 1) {
                    a(notification);
                }
            }
        } else {
            String str = "android.support.actionExtras";
            if (VERSION.SDK_INT >= 19) {
                SparseArray a3 = fk.a(this.e);
                if (a3 != null) {
                    this.f.putSparseParcelableArray(str, a3);
                }
                this.a.setExtras(this.f);
                notification = this.a.build();
                RemoteViews remoteViews6 = this.c;
                if (remoteViews6 != null) {
                    notification.contentView = remoteViews6;
                }
                RemoteViews remoteViews7 = this.d;
                if (remoteViews7 != null) {
                    notification.bigContentView = remoteViews7;
                }
            } else if (VERSION.SDK_INT >= 16) {
                notification = this.a.build();
                Bundle a4 = fi.a(notification);
                Bundle bundle = new Bundle(this.f);
                for (String str2 : this.f.keySet()) {
                    if (a4.containsKey(str2)) {
                        bundle.remove(str2);
                    }
                }
                a4.putAll(bundle);
                SparseArray a5 = fk.a(this.e);
                if (a5 != null) {
                    fi.a(notification).putSparseParcelableArray(str, a5);
                }
                RemoteViews remoteViews8 = this.c;
                if (remoteViews8 != null) {
                    notification.contentView = remoteViews8;
                }
                RemoteViews remoteViews9 = this.d;
                if (remoteViews9 != null) {
                    notification.bigContentView = remoteViews9;
                }
            } else {
                notification = this.a.getNotification();
            }
        }
        if (a2 != null) {
            notification.contentView = a2;
        }
        if (VERSION.SDK_INT >= 16 && eVar != null) {
            RemoteViews b2 = eVar.b();
            if (b2 != null) {
                notification.bigContentView = b2;
            }
        }
        int i = VERSION.SDK_INT;
        if (VERSION.SDK_INT >= 16 && eVar != null) {
            fi.a(notification);
        }
        return notification;
    }
}
