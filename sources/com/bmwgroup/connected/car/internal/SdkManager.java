package com.bmwgroup.connected.car.internal;

import android.os.Handler;
import java.util.Map;
import java.util.Stack;

public enum SdkManager {
    INSTANCE;
    
    public static final agd b = null;
    public String mApplicationName;
    public String mCurrentIdent;
    private Handler mHandler;
    public final Map<String, Object> mIdentObjectMap;
    private final Map<String, acp> mIdentTargetMap;
    private final Map<acp, String> mScreenIdentMap;
    public Stack<adp> mScreens;

    static {
        b = agd.a("connected.car.sdk");
    }

    public static String c(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return (str.contains("POP") || lastIndexOf == -1) ? str : str.substring(0, lastIndexOf);
    }

    public final Handler a() {
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        return this.mHandler;
    }

    public final Object a(String str) {
        return this.mIdentObjectMap.get(str);
    }

    public final String a(acr acr) {
        String str = "P";
        if (!(acr instanceof afy) && !(acr instanceof afx)) {
            str = acr instanceof adb ? "Bb" : acr instanceof ada ? "Bc" : acr instanceof acz ? "Bd" : acr instanceof adc ? "Ba" : acr instanceof ade ? "D" : acr instanceof afo ? "L" : acr instanceof adl ? "If" : acr instanceof ado ? "Is" : acr instanceof adj ? "Fa" : acr instanceof adg ? "Fb" : acr instanceof adh ? "Fc" : acr instanceof agc ? "POP" : null;
        }
        agd agd = b;
        Object[] objArr = new Object[3];
        objArr[0] = acr;
        objArr[1] = str == null ? "null" : str;
        objArr[2] = this.mApplicationName;
        agd.a("getScreenIdentForListener(%s) = %s -> %s", objArr);
        return str;
    }

    public final String a(String str, acp acp, boolean z) {
        String str2;
        b.a("putTarget(%s, %s)-> %s", str, acp, this.mApplicationName);
        this.mIdentTargetMap.put(str, acp);
        b.a("getIdentForListener(%s)-> %s", acp, this.mApplicationName);
        String str3 = (String) this.mScreenIdentMap.get(acp);
        if (acp != null && (acp instanceof acr)) {
            if (z) {
                this.mScreenIdentMap.put(acp, str);
                str2 = str;
            } else if (str3 == null) {
                if (str.isEmpty()) {
                    str2 = a((acr) acp);
                } else {
                    str2 = String.format("%s/%s", new Object[]{str, a((acr) acp)});
                }
                this.mScreenIdentMap.put(acp, str2);
            }
            this.mIdentTargetMap.put(str2, acp);
            b.a("putTarget(%s, %s) -> %s", str, acp, str2);
            return str2;
        }
        str2 = str3;
        this.mIdentTargetMap.put(str2, acp);
        b.a("putTarget(%s, %s) -> %s", str, acp, str2);
        return str2;
    }

    public final void a(String str, Object obj) {
        b.a("putObject(%s, %s)-> %s", str, obj, this.mApplicationName);
        this.mIdentObjectMap.put(str, obj);
    }

    public final acp b(String str) {
        b.a("getTargetForIdent(%s)-> %s", str, this.mApplicationName);
        return (acp) this.mIdentTargetMap.get(str);
    }

    public final void b() {
        b.a("reset() clearing mScreenIdentMap, mScreenListenerMap, mScreens -> %s", this.mApplicationName);
        this.mIdentObjectMap.clear();
        this.mIdentTargetMap.clear();
        this.mScreenIdentMap.clear();
        this.mScreens.clear();
        this.mCurrentIdent = "";
    }

    public final String c() {
        b.a("getCurrentIdent() -> %s -> %s", this.mCurrentIdent, this.mApplicationName);
        return this.mCurrentIdent;
    }

    public final acq d() {
        if (!this.mScreens.isEmpty()) {
            return (acq) this.mScreens.peek();
        }
        b.a("getActiveScreen() returns NULL", new Object[0]);
        return null;
    }

    public final acu e() {
        return (acu) b(this.mApplicationName);
    }
}
