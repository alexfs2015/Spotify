package defpackage;

import com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties;
import com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties.DontLockWhenInCarView;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: tns reason: default package */
public final class tns {
    public tov a;
    public Disposable b = Disposables.a();
    private final gwb c;
    private final AndroidLibsNowplayingDrivingProperties d;

    /* renamed from: tns$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[DontLockWhenInCarView.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties$DontLockWhenInCarView[] r0 = com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties.DontLockWhenInCarView.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties$DontLockWhenInCarView r1 = com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties.DontLockWhenInCarView.ALWAYS_PREVENT_LOCKING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties$DontLockWhenInCarView r1 = com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties.DontLockWhenInCarView.PREVENT_LOCKING_WHEN_CHARGING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties$DontLockWhenInCarView r1 = com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties.DontLockWhenInCarView.DONT_PREVENT_LOCKING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tns.AnonymousClass1.<clinit>():void");
        }
    }

    public tns(gwb gwb, AndroidLibsNowplayingDrivingProperties androidLibsNowplayingDrivingProperties) {
        this.c = gwb;
        this.d = androidLibsNowplayingDrivingProperties;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        int i = AnonymousClass1.a[this.d.a().ordinal()];
        if (i == 1) {
            booleanValue = true;
        } else if (i != 2) {
            booleanValue = false;
        }
        if (booleanValue) {
            this.a.a(true);
        } else {
            this.a.a(false);
        }
    }

    public final void a(tov tov) {
        this.a = tov;
        this.b = this.c.a().a((Consumer<? super T>) new $$Lambda$tns$6vsyEQ0qPYEvhIWZZGJqopP2UEA<Object>(this), (Consumer<? super Throwable>) $$Lambda$tns$8fJs7RCkxYsBOB4yw4GKPhfrGs.INSTANCE);
    }
}
