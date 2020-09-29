package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;

public class MultiInstanceInvalidationService extends Service {
    int a = 0;
    final dw<String> b = new dw<>();
    final RemoteCallbackList<ou> c = new RemoteCallbackList<ou>() {
        public final /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
            MultiInstanceInvalidationService.this.b.a(((Integer) obj).intValue());
        }
    };
    private final a d = new a() {
        public final int a(ou ouVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i;
                if (MultiInstanceInvalidationService.this.c.register(ouVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.b.c(i, str);
                    return i;
                }
                MultiInstanceInvalidationService.this.a--;
                return 0;
            }
        }

        public final void a(ou ouVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.c) {
                MultiInstanceInvalidationService.this.c.unregister(ouVar);
                MultiInstanceInvalidationService.this.b.a(i);
            }
        }

        public final void a(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.c) {
                String str = (String) MultiInstanceInvalidationService.this.b.a(i, null);
                if (str != null) {
                    int beginBroadcast = MultiInstanceInvalidationService.this.c.beginBroadcast();
                    int i2 = 0;
                    while (i2 < beginBroadcast) {
                        try {
                            int intValue = ((Integer) MultiInstanceInvalidationService.this.c.getBroadcastCookie(i2)).intValue();
                            String str2 = (String) MultiInstanceInvalidationService.this.b.a(intValue, null);
                            if (i != intValue && str.equals(str2)) {
                                try {
                                    ((ou) MultiInstanceInvalidationService.this.c.getBroadcastItem(i2)).a(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i2++;
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.c.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.c.finishBroadcast();
                }
            }
        }
    };

    public IBinder onBind(Intent intent) {
        return this.d;
    }
}
