package com.bmwgroup.connected.car.internal;

import android.os.Handler;
import java.util.Map;
import java.util.Stack;

public enum SdkManager {
    INSTANCE;
    
    public static final afp b = null;
    public String mApplicationName;
    public String mCurrentIdent;
    private Handler mHandler;
    public final Map<String, Object> mIdentObjectMap;
    private final Map<String, acb> mIdentTargetMap;
    private final Map<acb, String> mScreenIdentMap;
    public Stack<adb> mScreens;

    static {
        b = afp.a("connected.car.sdk");
    }

    public final Handler a() {
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        return this.mHandler;
    }

    public final void b() {
        b.a("reset() clearing mScreenIdentMap, mScreenListenerMap, mScreens -> %s", this.mApplicationName);
        this.mIdentObjectMap.clear();
        this.mIdentTargetMap.clear();
        this.mScreenIdentMap.clear();
        this.mScreens.clear();
        this.mCurrentIdent = "";
    }

    public final void a(String str, Object obj) {
        b.a("putObject(%s, %s)-> %s", str, obj, this.mApplicationName);
        this.mIdentObjectMap.put(str, obj);
    }

    public final Object a(String str) {
        return this.mIdentObjectMap.get(str);
    }

    public final String a(String str, acb acb, boolean z) {
        String str2;
        b.a("putTarget(%s, %s)-> %s", str, acb, this.mApplicationName);
        this.mIdentTargetMap.put(str, acb);
        b.a("getIdentForListener(%s)-> %s", acb, this.mApplicationName);
        String str3 = (String) this.mScreenIdentMap.get(acb);
        if (acb != null && (acb instanceof acd)) {
            if (z) {
                this.mScreenIdentMap.put(acb, str);
                str2 = str;
            } else if (str3 == null) {
                if (str.isEmpty()) {
                    str2 = a((acd) acb);
                } else {
                    str2 = String.format("%s/%s", new Object[]{str, a((acd) acb)});
                }
                this.mScreenIdentMap.put(acb, str2);
            }
            this.mIdentTargetMap.put(str2, acb);
            b.a("putTarget(%s, %s) -> %s", str, acb, str2);
            return str2;
        }
        str2 = str3;
        this.mIdentTargetMap.put(str2, acb);
        b.a("putTarget(%s, %s) -> %s", str, acb, str2);
        return str2;
    }

    public final acb b(String str) {
        b.a("getTargetForIdent(%s)-> %s", str, this.mApplicationName);
        return (acb) this.mIdentTargetMap.get(str);
    }

    public final String c() {
        b.a("getCurrentIdent() -> %s -> %s", this.mCurrentIdent, this.mApplicationName);
        return this.mCurrentIdent;
    }

    public final acc d() {
        if (!this.mScreens.isEmpty()) {
            return (acc) this.mScreens.peek();
        }
        b.a("getActiveScreen() returns NULL", new Object[0]);
        return null;
    }

    public static String c(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return (str.contains("POP") || lastIndexOf == -1) ? str : str.substring(0, lastIndexOf);
    }

    public final String a(acd acd) {
        String str = "P";
        if (!(acd instanceof afk) && !(acd instanceof afj)) {
            str = acd instanceof acn ? "Bb" : acd instanceof acm ? "Bc" : acd instanceof acl ? "Bd" : acd instanceof aco ? "Ba" : acd instanceof acq ? "D" : acd instanceof afa ? "L" : acd instanceof acx ? "If" : acd instanceof ada ? "Is" : acd instanceof acv ? "Fa" : acd instanceof acs ? "Fb" : acd instanceof act ? "Fc" : acd instanceof afo ? "POP" : null;
        }
        afp afp = b;
        Object[] objArr = new Object[3];
        objArr[0] = acd;
        objArr[1] = str == null ? "null" : str;
        objArr[2] = this.mApplicationName;
        afp.a("getScreenIdentForListener(%s) = %s -> %s", objArr);
        return str;
    }

    public final acg e() {
        return (acg) b(this.mApplicationName);
    }
}
