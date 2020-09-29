package defpackage;

import android.os.Handler;
import com.bmwgroup.connected.car.app.ApplicationManager;
import com.bmwgroup.connected.car.app.feature.consumption.data.FuelType;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aeg reason: default package */
public final class aeg implements aef {
    /* access modifiers changed from: private */
    public static final afp a = afp.a("CarSdkRemoteInterface");
    private int b;

    public final void a(final String[] strArr, final String[] strArr2) {
        a.b("onInit(isId5 = %s)", Boolean.valueOf(aep.a));
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
                add add = (add) ApplicationManager.INSTANCE.mApplication;
                String[] strArr = strArr;
                String[] strArr2 = strArr2;
                add.a.b("Feature availability set ", new Object[0]);
                if (strArr != null && strArr2 != null) {
                    if (strArr.length == strArr2.length) {
                        add.e = new HashMap<>();
                        for (int i = 0; i < strArr.length; i++) {
                            add.e.put(strArr[i], Boolean.valueOf(strArr2[i]));
                        }
                        return;
                    }
                    throw new RuntimeException("Feature availability map containes invalid values ( feature.length != availability.length)");
                }
            }
        });
    }

    public final void a(String[] strArr, String[] strArr2, boolean z) {
        aep.a = z;
        a(strArr, strArr2);
    }

    public final void a() {
        a.b("onPlay()", new Object[0]);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                acg e = SdkManager.INSTANCE.e();
                if (e instanceof acj) {
                    ((acj) e).a();
                }
            }
        });
        Map<String, List<Object>> map = ((add) ApplicationManager.INSTANCE.mApplication).d;
        if (map != null) {
            List list = (List) map.get("instrumentcluster");
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    a.b("onPlay() - calling onRequestPlaylist of InstrumentClusterFeatureListener", new Object[0]);
                }
            }
        }
    }

    public final void b() {
        a.b("onPause()", new Object[0]);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                acg e = SdkManager.INSTANCE.e();
                if (e instanceof acj) {
                    ((acj) e).b();
                }
            }
        });
    }

    public final void c() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                acg e = SdkManager.INSTANCE.e();
                if (e instanceof acj) {
                    ((acj) e).c();
                }
            }
        });
    }

    public final void d() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                acg e = SdkManager.INSTANCE.e();
                if (e instanceof acj) {
                    ((acj) e).d();
                }
            }
        });
    }

    public final void e() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
            }
        });
    }

    public final void f() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
            }
        });
    }

    public final void g() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
            }
        });
    }

    public final void h() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
            }
        });
    }

    public final void a(final int i) {
        Map<String, List<Object>> map = ((add) ApplicationManager.INSTANCE.mApplication).d;
        if (map != null) {
            List list = (List) map.get("instrumentcluster");
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    a.b("onPlaylistClick(%s) - forwarding to featurelistener", Integer.valueOf(i));
                }
            }
        }
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
            }
        });
    }

    public final void i() {
        Map<String, List<Object>> map = ((add) ApplicationManager.INSTANCE.mApplication).d;
        if (map != null) {
            List list = (List) map.get("instrumentcluster");
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public final void a(final String str) {
        a.b("onCreate(%s)", str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                adb adb;
                SdkManager sdkManager = SdkManager.INSTANCE;
                String str = str;
                SdkManager.b.a("onScreenCreate(%s)-> %s", str, sdkManager.mApplicationName);
                sdkManager.mCurrentIdent = str;
                String c = SdkManager.c(str);
                SdkManager.b.a("onScreenCreate(%s) parentIdent=%s", str, c);
                adb adb2 = (adb) sdkManager.a(str);
                acd acd = (acd) sdkManager.b(c);
                if (adb2 == null) {
                    SdkManager.b.a("addScreen(%s)-> %s", acd, sdkManager.mApplicationName);
                    adb2 = null;
                    if (acd instanceof afj) {
                        afj afj = (afj) acd;
                        acc d = sdkManager.d();
                        if (aep.a) {
                            adb = new adz(d, afj);
                        } else {
                            adb = new adv(d, afj);
                        }
                        adb2 = adb;
                    } else if (acd instanceof afa) {
                        adb2 = new ado(sdkManager.d(), acd);
                    } else if (acd instanceof acq) {
                        adb2 = new adj(sdkManager.d(), acd);
                    } else if (acd instanceof acx) {
                        adb2 = new adm(sdkManager.d(), acd);
                    } else if (acd instanceof ada) {
                        adb2 = new adm(sdkManager.d(), acd);
                    } else if (acd instanceof acu) {
                        adb2 = new adk(sdkManager.d(), acd);
                    } else if (acd instanceof aco) {
                        adb2 = new adh(sdkManager.d(), acd);
                    } else if (acd instanceof afo) {
                        adb2 = new aed(sdkManager.d(), acd);
                    }
                    sdkManager.mScreens.push(adb2);
                    sdkManager.a(SdkManager.INSTANCE.c(), adb2);
                }
                SdkManager.b.a("onScreenCreate(%s) s=%s l=%s", str, adb2, acd);
                if (acd != null) {
                    sdkManager.a().post(new Runnable(acd, adb2) {
                        private /* synthetic */ acd a;
                        private /* synthetic */ adb b;

                        {
                            this.a = r2;
                            this.b = r3;
                        }

                        public final void run() {
                            SdkManager.b.a("notifying listener.onCreate()", new Object[0]);
                            this.a.a(this.b);
                        }
                    });
                }
            }
        });
    }

    public final void d(final String str) {
        a.b("onDestroy(%s)", str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager sdkManager = SdkManager.INSTANCE;
                String str = str;
                SdkManager.b.a("onScreenDestroy(%s)-> %s", str, sdkManager.mApplicationName);
                acd acd = (acd) sdkManager.b(str);
                adb adb = (adb) sdkManager.a(str);
                sdkManager.mCurrentIdent = "";
                SdkManager.b.a("onScreenDestroy(%s) s=%s l=%s", str, adb, acd);
                if (acd != null) {
                    sdkManager.a().post(new Runnable(acd, adb) {
                        private /* synthetic */ acd a;
                        private /* synthetic */ adb b;

                        {
                            this.a = r2;
                            this.b = r3;
                        }

                        public final void run() {
                            SdkManager.b.a("notifying listener.onDestroy()", new Object[0]);
                            this.a.c();
                            this.b.a((acd) null);
                        }
                    });
                } else {
                    SdkManager.b.c("onScreenDestroy(%s) - NO listener found for this id.", str);
                }
                SdkManager.b.a("removeScreen(%s)-> %s", adb, sdkManager.mApplicationName);
                boolean z = adb == sdkManager.d();
                if (adb != null && z) {
                    sdkManager.mScreens.pop();
                } else if (!z) {
                    SdkManager.b.c("removeScreen(%s) - NOT Active screen. ActiveScreen = %s", adb, sdkManager.d());
                }
                if (sdkManager.mIdentObjectMap.containsKey(str)) {
                    sdkManager.mIdentObjectMap.remove(str);
                }
            }
        });
    }

    public final void b(final String str) {
        a.b("onEnter(%s)", str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager sdkManager = SdkManager.INSTANCE;
                String str = str;
                SdkManager.b.a("onScreenEnter(%s)-> %s", str, sdkManager.mApplicationName);
                sdkManager.mCurrentIdent = str;
                String c = SdkManager.c(str);
                SdkManager.b.a("onScreenEnter(%s) parentIdent=%s", str, c);
                acd acd = (acd) sdkManager.b(c);
                SdkManager.b.a("onScreenEnter(%s) l=%s", str, acd);
                if (acd != null) {
                    sdkManager.a().post(new Runnable(acd) {
                        private /* synthetic */ acd a;

                        {
                            this.a = r2;
                        }

                        public final void run() {
                            SdkManager.b.a("notifying listener.onEnter()", new Object[0]);
                            this.a.a();
                        }
                    });
                }
            }
        });
    }

    public final void c(final String str) {
        a.b("onExit(%s)", str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager sdkManager = SdkManager.INSTANCE;
                String str = str;
                SdkManager.b.a("onScreenExit(%s)-> %s", str, sdkManager.mApplicationName);
                acd acd = (acd) sdkManager.b(str);
                SdkManager.b.a("onScreenExit(%s) l=%s", str, acd);
                sdkManager.mCurrentIdent = "";
                if (acd != null) {
                    sdkManager.a().post(new Runnable(acd) {
                        private /* synthetic */ acd a;

                        {
                            this.a = r2;
                        }

                        public final void run() {
                            SdkManager.b.a("notifying listener.onExit()", new Object[0]);
                            this.a.b();
                        }
                    });
                }
            }
        });
    }

    public final void e(String str) {
        a.b("onWaitingAnimationCanceled(%s)", str);
        final acd acd = (acd) SdkManager.INSTANCE.b(str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
            }
        });
    }

    public final void a(String str, final String str2) {
        a.b("onInputResult(%s, %s)", str, str2);
        final acx acx = (acx) SdkManager.INSTANCE.b(str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
            }
        });
    }

    public final void a(String str, final int i) {
        a.b("onInputResult(%s, %d)", str, Integer.valueOf(i));
        final ada ada = (ada) SdkManager.INSTANCE.b(str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
            }
        });
    }

    public final void b(String str, final String str2) {
        a.b("onInput(%s, %s)", str, str2);
        final adl adl = (adl) SdkManager.INSTANCE.b(str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
            }
        });
    }

    public final void f(String str) {
        a.b("onClick( %s )", str);
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf == -1) {
            lastIndexOf = str.lastIndexOf(36);
        }
        if (lastIndexOf != -1) {
            final int[] a2 = aeq.a(str);
            String substring = str.substring(0, a2[2]);
            final String substring2 = str.substring(0, a2[3]);
            final acb b2 = SdkManager.INSTANCE.b(substring);
            a.b("onClick(%s) parentIdent = %s, screenIdent = %s --> l = %s", str, substring, substring2, b2);
            if (b2 != null) {
                Handler a3 = SdkManager.INSTANCE.a();
                final String str2 = str;
                AnonymousClass11 r4 = new Runnable() {
                    public final void run() {
                        adb adb = (adb) SdkManager.INSTANCE.a(substring2);
                        adb.c(str2);
                        acb acb = b2;
                        if (!(acb instanceof afk) || !(adb instanceof afi)) {
                            acb acb2 = b2;
                            if (acb2 instanceof ace) {
                                ((ace) acb2).a(a2[1]);
                            } else if (acb2 instanceof aco) {
                                if (adb != null) {
                                    ((ack) adb).a(a2[1]);
                                }
                            } else if (acb2 instanceof afa) {
                                afu afu = null;
                                if (adb != null) {
                                    adn adn = (adn) ((ado) adb).a(a2[0]);
                                    if (adn != null) {
                                        afu[] a2 = adn.a();
                                        if (a2 != null) {
                                            int length = a2.length;
                                            int[] iArr = a2;
                                            if (length > iArr[1]) {
                                                afu = a2[iArr[1]];
                                            }
                                        }
                                    }
                                }
                                ((afa) b2).a(afu);
                            } else {
                                aeg.a.b("No implementation for Listener type %s", b2.getClass().getSimpleName());
                            }
                        } else {
                            aeg.a(aeg.this, str2, a2, (afk) acb, (afi) adb);
                        }
                    }
                };
                a3.post(r4);
            }
        }
    }

    public final void h(String str) {
        a.b("onSelect( %s )", str);
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf == -1) {
            lastIndexOf = str.lastIndexOf(36);
        }
        if (lastIndexOf != -1) {
            final int[] a2 = aeq.a(str);
            String substring = str.substring(0, a2[2]);
            final String substring2 = str.substring(0, a2[3]);
            final acb b2 = SdkManager.INSTANCE.b(substring);
            a.b("onSelect(%s) parentIdent = %s, screenIdent = %s --> l = %s", str, substring, substring2, b2);
            if (b2 != null) {
                Handler a3 = SdkManager.INSTANCE.a();
                final String str2 = str;
                AnonymousClass13 r4 = new Runnable() {
                    public final void run() {
                        adb adb = (adb) SdkManager.INSTANCE.a(substring2);
                        acb acb = b2;
                        if (!(acb instanceof afk) || !(adb instanceof afi)) {
                            aeg.a.b("No implementation for Listener type %s", b2.getClass().getSimpleName());
                            return;
                        }
                        aeg.a(a2, (afi) adb);
                    }
                };
                a3.post(r4);
            }
        }
    }

    public final void g(String str) {
        SdkManager.INSTANCE.b(str.substring(0, aeq.a(str)[3]));
    }

    public final void a(String str, int[] iArr) {
        SdkManager.INSTANCE.b(str);
    }

    public final void a(int i, String[] strArr) {
        String str;
        ApplicationManager applicationManager = ApplicationManager.INSTANCE;
        afp afp = a;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        if (strArr != null) {
            StringBuilder sb = new StringBuilder();
            if (strArr != null) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    sb.append(strArr[i2]);
                    if (i2 < strArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
            str = sb.toString();
        } else {
            str = "No value";
        }
        objArr[1] = str;
        afp.a("onCDSUpdate( %d, %s)", objArr);
        String str2 = "consumption";
        if (i == 47) {
            String j = j(strArr[2]);
            FuelType fuelType = FuelType.UNSPECIFIED;
            if (j != null) {
                if (j.startsWith("BENZINE")) {
                    FuelType fuelType2 = FuelType.PETROL;
                } else if (j.startsWith("DIESEL")) {
                    FuelType fuelType3 = FuelType.DIESEL;
                }
            }
            List k = k(str2);
            if (k != null) {
                Iterator it = k.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        } else if (i != 59) {
            if (i != 71) {
                if (i != 86) {
                    if (i != 61) {
                        if (i == 62) {
                            try {
                                if (strArr.length == 2) {
                                    String j2 = j(strArr[0]);
                                    String j3 = j(strArr[1]);
                                    a.a("CDS: Received CurrentPosition %s,%s", j2, j3);
                                    double doubleValue = Double.valueOf(j2).doubleValue();
                                    double doubleValue2 = Double.valueOf(j3).doubleValue();
                                    List k2 = k("geo.currentPosition");
                                    if (k2 != null) {
                                        Iterator it2 = k2.iterator();
                                        while (it2.hasNext()) {
                                            it2.next();
                                            new ach(doubleValue, doubleValue2, this.b);
                                        }
                                    }
                                }
                                return;
                            } catch (Exception e) {
                                Object[] objArr2 = {e.toString()};
                                a.a.d("Error occurred %s", objArr2);
                                return;
                            }
                        } else if (i == 92) {
                            Integer.valueOf(j(strArr[0])).intValue();
                            List k3 = k(str2);
                            if (k3 != null) {
                                Iterator it3 = k3.iterator();
                                while (it3.hasNext()) {
                                    it3.next();
                                }
                                return;
                            }
                        } else if (i == 93) {
                            Integer.valueOf(j(strArr[0])).intValue();
                            List k4 = k(str2);
                            if (k4 != null) {
                                Iterator it4 = k4.iterator();
                                while (it4.hasNext()) {
                                    it4.next();
                                }
                                return;
                            }
                        }
                    } else if (strArr.length == 3) {
                        String j4 = j(strArr[1]);
                        a.a("CDS: Recieved beqaring %s", j4);
                        this.b = Integer.valueOf(j4).intValue();
                        return;
                    } else {
                        this.b = 0;
                    }
                }
                return;
            }
            int intValue = Integer.valueOf(j(strArr[0])).intValue();
            int intValue2 = Integer.valueOf(j(strArr[1])).intValue();
            boolean booleanValue = Boolean.valueOf(j(strArr[2])).booleanValue();
            List k5 = k(str2);
            if (k5 != null) {
                Iterator it5 = k5.iterator();
                while (it5.hasNext()) {
                    it5.next();
                    new adg(intValue, intValue2, booleanValue);
                }
            }
        } else if (strArr.length == 2) {
            String j5 = j(strArr[0]);
            String j6 = j(strArr[1]);
            a.b("CDS: Received Final Destination %s,%s", j5, j6);
            double doubleValue3 = Double.valueOf(j5).doubleValue();
            double doubleValue4 = Double.valueOf(j6).doubleValue();
            List k6 = k("geo.finalDestination");
            if (k6 != null) {
                Iterator it6 = k6.iterator();
                while (it6.hasNext()) {
                    it6.next();
                    new ach(doubleValue3, doubleValue4);
                }
            }
        }
    }

    private static String j(String str) {
        if (str != null) {
            int indexOf = str.indexOf("=");
            if (indexOf != -1) {
                int i = indexOf + 1;
                if (i < str.length()) {
                    return str.substring(i);
                }
            }
        }
        return "";
    }

    public final void c(String str, String str2) {
        a.a("onRawCdsUpdate(%s, %s)", str, str2);
        List k = k("rawcds");
        if (k != null) {
            Iterator it = k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void i(final String str) {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
            }
        });
    }

    public final void j() {
        a.b("onRecording()", new Object[0]);
        List k = k("voicerecorder");
        if (k != null) {
            Iterator it = k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void a(int i, byte[] bArr) {
        afp afp = a;
        Object[] objArr = new Object[2];
        int i2 = 0;
        objArr[0] = Integer.valueOf(i);
        if (bArr != null) {
            i2 = bArr.length;
        }
        objArr[1] = Integer.valueOf(i2);
        afp.b("onTransferring(%d, %d)", objArr);
        List k = k("voicerecorder");
        if (k != null) {
            Iterator it = k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void k() {
        a.b("onTransferringDone()", new Object[0]);
        List k = k("voicerecorder");
        if (k != null) {
            Iterator it = k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void l() {
        a.b("onTransferringError()", new Object[0]);
        List k = k("voicerecorder");
        if (k != null) {
            Iterator it = k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private static List<Object> k(String str) {
        Map<String, List<Object>> map = ((add) ApplicationManager.INSTANCE.mApplication).d;
        if (map != null) {
            return (List) map.get(str);
        }
        return null;
    }

    private static int l(String str) {
        if (str == null) {
            return 0;
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return 0;
        }
        int i = indexOf + 1;
        if (str.length() <= i) {
            return 0;
        }
        try {
            return Integer.parseInt(str.substring(i));
        } catch (NumberFormatException unused) {
            a.c("%s ident can't be parse to get position as integer", str);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static afm a(int[] iArr, afi afi) {
        aec aec = (aec) afi.f();
        afm afm = null;
        if (aec != null) {
            afm[] afmArr = (afm[]) aec.a();
            if (afmArr != null && afmArr.length > iArr[1]) {
                afm = afmArr[iArr[1]];
            }
        } else {
            a.b("playlist == null", new Object[0]);
        }
        a.b("going to call onPlaylistItemClick(%d, %s)", Integer.valueOf(iArr[1]), afm);
        return afm;
    }

    static /* synthetic */ void a(aeg aeg, String str, int[] iArr, afk afk, afi afi) {
        a.b("PlayerScreenListenerId5 notification(%s)", str);
        if (str.contains("P:")) {
            afk.a(iArr[1]);
            return;
        }
        if (!str.equalsIgnoreCase("P$7002") && !str.equalsIgnoreCase("P$7001") && !str.equalsIgnoreCase("P$7003")) {
            if (str.contains("P$7004")) {
                l(str);
                return;
            }
            a(iArr, afi);
        }
    }
}
