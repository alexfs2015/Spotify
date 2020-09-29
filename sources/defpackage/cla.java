package defpackage;

import org.json.JSONObject;

@cey
/* renamed from: cla reason: default package */
public final class cla {
    public final cfu a;
    public final cfy b;
    public final ebz c;
    public final dpc d;
    public final int e;
    public final long f;
    public final long g;
    public final JSONObject h;
    public final dnh i;
    public final boolean j;

    public cla(cfu cfu, cfy cfy, int i2, long j2, long j3, dnl dnl) {
        this.a = cfu;
        this.b = cfy;
        this.c = null;
        this.d = null;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = null;
        this.i = new dnh(dnl);
        this.j = false;
    }

    public cla(cfu cfu, cfy cfy, ebz ebz, dpc dpc, int i2, long j2, long j3, JSONObject jSONObject, dnh dnh, Boolean bool) {
        this.a = cfu;
        this.b = cfy;
        this.c = ebz;
        this.d = dpc;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = jSONObject;
        this.i = dnh;
        boolean z = bool != null ? bool.booleanValue() : coe.a(cfu.c);
        this.j = z;
    }
}
