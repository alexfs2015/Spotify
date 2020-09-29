package defpackage;

import android.os.Handler;
import com.bmwgroup.connected.car.app.ApplicationManager;
import com.bmwgroup.connected.car.app.feature.consumption.data.FuelType;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aeu reason: default package */
public final class aeu implements aet {
    /* access modifiers changed from: private */
    public static final agd a = agd.a("CarSdkRemoteInterface");
    private int b;

    /* access modifiers changed from: private */
    public static aga a(int[] iArr, afw afw) {
        aeq aeq = (aeq) afw.f();
        aga aga = null;
        if (aeq != null) {
            aga[] agaArr = (aga[]) aeq.a();
            if (agaArr != null && agaArr.length > iArr[1]) {
                aga = agaArr[iArr[1]];
            }
        } else {
            a.b("playlist == null", new Object[0]);
        }
        a.b("going to call onPlaylistItemClick(%d, %s)", Integer.valueOf(iArr[1]), aga);
        return aga;
    }

    static /* synthetic */ void a(aeu aeu, String str, int[] iArr, afy afy, afw afw) {
        a.b("PlayerScreenListenerId5 notification(%s)", str);
        if (str.contains("P:")) {
            afy.a(iArr[1]);
            return;
        }
        if (!str.equalsIgnoreCase("P$7002") && !str.equalsIgnoreCase("P$7001") && !str.equalsIgnoreCase("P$7003")) {
            if (str.contains("P$7004")) {
                l(str);
                return;
            }
            a(iArr, afw);
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

    private static List<Object> k(String str) {
        Map<String, List<Object>> map = ((adr) ApplicationManager.INSTANCE.mApplication).d;
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

    public final void a() {
        a.b("onPlay()", new Object[0]);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                acu e = SdkManager.INSTANCE.e();
                if (e instanceof acx) {
                    ((acx) e).a();
                }
            }
        });
        Map<String, List<Object>> map = ((adr) ApplicationManager.INSTANCE.mApplication).d;
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

    public final void a(final int i) {
        Map<String, List<Object>> map = ((adr) ApplicationManager.INSTANCE.mApplication).d;
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

    public final void a(int i, byte[] bArr) {
        agd agd = a;
        Object[] objArr = new Object[2];
        int i2 = 0;
        objArr[0] = Integer.valueOf(i);
        if (bArr != null) {
            i2 = bArr.length;
        }
        objArr[1] = Integer.valueOf(i2);
        agd.b("onTransferring(%d, %d)", objArr);
        List k = k("voicerecorder");
        if (k != null) {
            Iterator it = k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void a(int i, String[] strArr) {
        String str;
        ApplicationManager applicationManager = ApplicationManager.INSTANCE;
        agd agd = a;
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
        agd.a("onCDSUpdate( %d, %s)", objArr);
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
                                            new acv(doubleValue, doubleValue2, this.b);
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
                    new adu(intValue, intValue2, booleanValue);
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
                    new acv(doubleValue3, doubleValue4);
                }
            }
        }
    }

    public final void a(final String str) {
        a.b("onCreate(%s)", str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager sdkManager = SdkManager.INSTANCE;
                String str = str;
                SdkManager.b.a("onScreenCreate(%s)-> %s", str, sdkManager.mApplicationName);
                sdkManager.mCurrentIdent = str;
                String c = SdkManager.c(str);
                SdkManager.b.a("onScreenCreate(%s) parentIdent=%s", str, c);
                adp adp = (adp) sdkManager.a(str);
                acr acr = (acr) sdkManager.b(c);
                if (adp == null) {
                    SdkManager.b.a("addScreen(%s)-> %s", acr, sdkManager.mApplicationName);
                    adp = null;
                    if (acr instanceof afx) {
                        afx afx = (afx) acr;
                        acq d = sdkManager.d();
                        adp = afd.a ? new aen(d, afx) : new aej(d, afx);
                    } else if (acr instanceof afo) {
                        adp = new aec(sdkManager.d(), acr);
                    } else if (acr instanceof ade) {
                        adp = new adx(sdkManager.d(), acr);
                    } else if (acr instanceof adl) {
                        adp = new aea(sdkManager.d(), acr);
                    } else if (acr instanceof ado) {
                        adp = new aea(sdkManager.d(), acr);
                    } else if (acr instanceof adi) {
                        adp = new ady(sdkManager.d(), acr);
                    } else if (acr instanceof adc) {
                        adp = new adv(sdkManager.d(), acr);
                    } else if (acr instanceof agc) {
                        adp = new aer(sdkManager.d(), acr);
                    }
                    sdkManager.mScreens.push(adp);
                    sdkManager.a(SdkManager.INSTANCE.c(), adp);
                }
                SdkManager.b.a("onScreenCreate(%s) s=%s l=%s", str, adp, acr);
                if (acr != null) {
                    sdkManager.a().post(new Runnable(acr, adp) {
                        private /* synthetic */ acr a;
                        private /* synthetic */ adp b;

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

    public final void a(String str, final int i) {
        a.b("onInputResult(%s, %d)", str, Integer.valueOf(i));
        final ado ado = (ado) SdkManager.INSTANCE.b(str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
            }
        });
    }

    public final void a(String str, final String str2) {
        a.b("onInputResult(%s, %s)", str, str2);
        final adl adl = (adl) SdkManager.INSTANCE.b(str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
            }
        });
    }

    public final void a(String str, int[] iArr) {
        SdkManager.INSTANCE.b(str);
    }

    public final void a(final String[] strArr, final String[] strArr2) {
        a.b("onInit(isId5 = %s)", Boolean.valueOf(afd.a));
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
                adr adr = (adr) ApplicationManager.INSTANCE.mApplication;
                String[] strArr = strArr;
                String[] strArr2 = strArr2;
                adr.a.b("Feature availability set ", new Object[0]);
                if (strArr != null && strArr2 != null) {
                    if (strArr.length == strArr2.length) {
                        adr.e = new HashMap<>();
                        for (int i = 0; i < strArr.length; i++) {
                            adr.e.put(strArr[i], Boolean.valueOf(strArr2[i]));
                        }
                        return;
                    }
                    throw new RuntimeException("Feature availability map containes invalid values ( feature.length != availability.length)");
                }
            }
        });
    }

    public final void a(String[] strArr, String[] strArr2, boolean z) {
        afd.a = z;
        a(strArr, strArr2);
    }

    public final void b() {
        a.b("onPause()", new Object[0]);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                acu e = SdkManager.INSTANCE.e();
                if (e instanceof acx) {
                    ((acx) e).b();
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
                acr acr = (acr) sdkManager.b(c);
                SdkManager.b.a("onScreenEnter(%s) l=%s", str, acr);
                if (acr != null) {
                    sdkManager.a().post(new Runnable(acr) {
                        private /* synthetic */ acr a;

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

    public final void b(String str, final String str2) {
        a.b("onInput(%s, %s)", str, str2);
        final adz adz = (adz) SdkManager.INSTANCE.b(str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
            }
        });
    }

    public final void c() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                acu e = SdkManager.INSTANCE.e();
                if (e instanceof acx) {
                    ((acx) e).c();
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
                acr acr = (acr) sdkManager.b(str);
                SdkManager.b.a("onScreenExit(%s) l=%s", str, acr);
                sdkManager.mCurrentIdent = "";
                if (acr != null) {
                    sdkManager.a().post(new Runnable(acr) {
                        private /* synthetic */ acr a;

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

    public final void d() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                acu e = SdkManager.INSTANCE.e();
                if (e instanceof acx) {
                    ((acx) e).d();
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
                acr acr = (acr) sdkManager.b(str);
                adp adp = (adp) sdkManager.a(str);
                sdkManager.mCurrentIdent = "";
                SdkManager.b.a("onScreenDestroy(%s) s=%s l=%s", str, adp, acr);
                if (acr != null) {
                    sdkManager.a().post(new Runnable(acr, adp) {
                        private /* synthetic */ acr a;
                        private /* synthetic */ adp b;

                        {
                            this.a = r2;
                            this.b = r3;
                        }

                        public final void run() {
                            SdkManager.b.a("notifying listener.onDestroy()", new Object[0]);
                            this.a.c();
                            this.b.a((acr) null);
                        }
                    });
                } else {
                    SdkManager.b.c("onScreenDestroy(%s) - NO listener found for this id.", str);
                }
                SdkManager.b.a("removeScreen(%s)-> %s", adp, sdkManager.mApplicationName);
                boolean z = adp == sdkManager.d();
                if (adp != null && z) {
                    sdkManager.mScreens.pop();
                } else if (!z) {
                    SdkManager.b.c("removeScreen(%s) - NOT Active screen. ActiveScreen = %s", adp, sdkManager.d());
                }
                if (sdkManager.mIdentObjectMap.containsKey(str)) {
                    sdkManager.mIdentObjectMap.remove(str);
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

    public final void e(String str) {
        a.b("onWaitingAnimationCanceled(%s)", str);
        final acr acr = (acr) SdkManager.INSTANCE.b(str);
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
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

    public final void f(String str) {
        a.b("onClick( %s )", str);
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf == -1) {
            lastIndexOf = str.lastIndexOf(36);
        }
        if (lastIndexOf != -1) {
            final int[] a2 = afe.a(str);
            String substring = str.substring(0, a2[2]);
            final String substring2 = str.substring(0, a2[3]);
            final acp b2 = SdkManager.INSTANCE.b(substring);
            a.b("onClick(%s) parentIdent = %s, screenIdent = %s --> l = %s", str, substring, substring2, b2);
            if (b2 != null) {
                Handler a3 = SdkManager.INSTANCE.a();
                final String str2 = str;
                AnonymousClass11 r4 = new Runnable() {
                    public final void run() {
                        adp adp = (adp) SdkManager.INSTANCE.a(substring2);
                        adp.b(str2);
                        acp acp = b2;
                        if (!(acp instanceof afy) || !(adp instanceof afw)) {
                            acp acp2 = b2;
                            if (acp2 instanceof acs) {
                                ((acs) acp2).a(a2[1]);
                            } else if (acp2 instanceof adc) {
                                if (adp != null) {
                                    ((acy) adp).a(a2[1]);
                                }
                            } else if (acp2 instanceof afo) {
                                agi agi = null;
                                if (adp != null) {
                                    aeb aeb = (aeb) ((aec) adp).a(a2[0]);
                                    if (aeb != null) {
                                        agi[] a2 = aeb.a();
                                        if (a2 != null) {
                                            int length = a2.length;
                                            int[] iArr = a2;
                                            if (length > iArr[1]) {
                                                agi = a2[iArr[1]];
                                            }
                                        }
                                    }
                                }
                                ((afo) b2).a(agi);
                            } else {
                                aeu.a.b("No implementation for Listener type %s", b2.getClass().getSimpleName());
                            }
                        } else {
                            aeu.a(aeu.this, str2, a2, (afy) acp, (afw) adp);
                        }
                    }
                };
                a3.post(r4);
            }
        }
    }

    public final void g() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
            }
        });
    }

    public final void g(String str) {
        SdkManager.INSTANCE.b(str.substring(0, afe.a(str)[3]));
    }

    public final void h() {
        SdkManager.INSTANCE.a().post(new Runnable() {
            public final void run() {
                SdkManager.INSTANCE.e();
            }
        });
    }

    public final void h(String str) {
        a.b("onSelect( %s )", str);
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf == -1) {
            lastIndexOf = str.lastIndexOf(36);
        }
        if (lastIndexOf != -1) {
            final int[] a2 = afe.a(str);
            String substring = str.substring(0, a2[2]);
            final String substring2 = str.substring(0, a2[3]);
            final acp b2 = SdkManager.INSTANCE.b(substring);
            a.b("onSelect(%s) parentIdent = %s, screenIdent = %s --> l = %s", str, substring, substring2, b2);
            if (b2 != null) {
                Handler a3 = SdkManager.INSTANCE.a();
                final String str2 = str;
                AnonymousClass13 r4 = new Runnable() {
                    public final void run() {
                        adp adp = (adp) SdkManager.INSTANCE.a(substring2);
                        acp acp = b2;
                        if (!(acp instanceof afy) || !(adp instanceof afw)) {
                            aeu.a.b("No implementation for Listener type %s", b2.getClass().getSimpleName());
                            return;
                        }
                        aeu.a(a2, (afw) adp);
                    }
                };
                a3.post(r4);
            }
        }
    }

    public final void i() {
        Map<String, List<Object>> map = ((adr) ApplicationManager.INSTANCE.mApplication).d;
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
}
