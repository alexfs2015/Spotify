package com.spotify.mobile.android.spotlets.bixbyhomecards;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.music.R;
import io.reactivex.disposables.Disposables;

public class BixbyHomeCardService extends whv {
    public ioo a;
    public vwy b;
    public vwu c;
    private Notification d;

    /* renamed from: com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Request.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService$Request[] r0 = com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService$Request r1 = com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request.UPDATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService$Request r1 = com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request.ENABLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService$Request r1 = com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request.DISABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService$Request r1 = com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request.RECEIVE_EVENT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Request {
        UPDATE,
        ENABLE,
        DISABLE,
        RECEIVE_EVENT;
        
        /* access modifiers changed from: private */
        public static final Request[] e = null;

        static {
            e = values();
        }
    }

    private static int[] a(Intent intent) {
        String str = "drs_csai";
        int[] intArrayExtra = intent.getIntArrayExtra("card_ids");
        if (intArrayExtra != null) {
            return intArrayExtra;
        }
        Object[] objArr = {b(intent)};
        String str2 = "si miees/dtrf oCa%  so/drtnqru: sdte sx";
        throw new RuntimeException(String.format("Card ids doesn't exist for request: %s", objArr));
    }

    private static Request b(Intent intent) {
        int intExtra = intent.getIntExtra("request", -1);
        if (intExtra != -1) {
            return Request.e[intExtra];
        }
        String str = "es /oe ettnuisetRodsq/";
        throw new RuntimeException("Request doesn't exist");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.a.c.a();
    }

    public void onDestroy() {
        ioo ioo = this.a;
        ioo.a.b();
        hhf.a(ioo.c.c);
        ioo.d.a.a(Disposables.b());
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        vwy vwy = this.b;
        if (this.d == null) {
            String str = "ntaecbfiy_altdsohes_npp";
            c cVar = new c(this, "spotify_updates_channel");
            cVar.b((CharSequence) getString(R.string.bixby_notification_is_connected));
            cVar.a((int) R.drawable.icn_notification);
            this.d = cVar.b();
        }
        vwy.a(R.id.bixby_notification_id, this.d);
        this.c.b(intent);
        int i3 = AnonymousClass1.a[b(intent).ordinal()];
        int i4 = 0;
        if (i3 == 1) {
            int[] a2 = a(intent);
            int length = a2.length;
            while (i4 < length) {
                int i5 = a2[i4];
                ioo ioo = this.a;
                inq inq = (inq) ioo.e.get(i5);
                if (inq != null) {
                    inq.b = true;
                    if (inq.c != null) {
                        ioo.b.a(inq);
                    }
                }
                if (ioo.c.d) {
                    ioo.a.a();
                }
                i4++;
            }
        } else if (i3 == 2) {
            int[] a3 = a(intent);
            int length2 = a3.length;
            while (i4 < length2) {
                inq inq2 = (inq) this.a.e.get(a3[i4]);
                if (inq2 != null && !inq2.b) {
                    inq2.b = true;
                }
                i4++;
            }
        } else if (i3 == 3) {
            for (int i6 : a(intent)) {
                inq inq3 = (inq) this.a.e.get(i6);
                if (inq3 != null) {
                    inq3.b = false;
                }
            }
        } else if (i3 == 4) {
            String str2 = "ebtev";
            String stringExtra = intent.getStringExtra("event");
            if (stringExtra != null) {
                String str3 = "tdadc_i";
                int intExtra = intent.getIntExtra("card_id", -1);
                if (intExtra != -1) {
                    this.a.a(stringExtra, intExtra);
                } else {
                    Object[] objArr = {b(intent)};
                    String str4 = "d ds/ sapiiqten/Cfd tsurxtee%:so rroe ";
                    throw new RuntimeException(String.format("Card id doesn't exist for request: %s", objArr));
                }
            } else {
                throw new RuntimeException(String.format("event doesn't exist for request: %s", new Object[]{b(intent)}));
            }
        }
        this.b.a((int) R.id.bixby_notification_id);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        stopSelf();
        return true;
    }
}
