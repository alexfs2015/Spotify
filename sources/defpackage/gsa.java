package defpackage;

import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.connect.model.GaiaDeviceCapability;
import com.spotify.mobile.android.connect.model.GaiaDeviceIncarnation;
import java.util.Collections;
import java.util.List;

/* renamed from: gsa reason: default package */
public final class gsa {
    public boolean a;
    public boolean b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public GaiaDeviceState i;
    public GaiaTypes j;
    public List<GaiaDeviceIncarnation> k;
    public String l;
    public String m;
    public boolean n;
    public List<GaiaDeviceCapability> o;
    private boolean p = false;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private long y;
    private boolean z;

    public gsa(String str, String str2, GaiaDeviceState gaiaDeviceState, GaiaTypes gaiaTypes) {
        this.f = str2;
        this.g = str2;
        this.h = str;
        this.i = gaiaDeviceState;
        this.j = gaiaTypes;
        this.q = false;
        this.r = false;
        this.s = false;
        this.a = true;
        this.t = false;
        this.b = true;
        this.u = false;
        this.v = false;
        this.w = false;
        this.c = true;
        this.x = false;
        this.n = true;
        this.z = false;
        this.y = 0;
        String str3 = "UNKNOWN";
        this.d = str3;
        this.e = str3;
        String str4 = "";
        this.l = str4;
        this.m = str4;
        this.k = Collections.emptyList();
        this.o = Collections.emptyList();
    }
}
