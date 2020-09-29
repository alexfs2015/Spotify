package defpackage;

import org.json.JSONObject;

/* renamed from: ebs reason: default package */
final class ebs implements cqh<ebd> {
    private final /* synthetic */ eau a;
    private final /* synthetic */ Object b;
    private final /* synthetic */ cqc c;
    private final /* synthetic */ ebr d;

    ebs(ebr ebr, eau eau, Object obj, cqc cqc) {
        this.d = ebr;
        this.a = eau;
        this.b = obj;
        this.c = cqc;
    }

    public final /* synthetic */ void a(Object obj) {
        ebd ebd = (ebd) obj;
        ebr ebr = this.d;
        eau eau = this.a;
        Object obj2 = this.b;
        cqc cqc = this.c;
        try {
            bjl.e();
            String a2 = cmd.a();
            bfv.o.a(a2, new ebu(ebr, eau, cqc));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a2);
            jSONObject.put("args", ebr.b.a(obj2));
            ebd.b(ebr.c, jSONObject);
        } catch (Exception e) {
            cqc.a(e);
            clu.a("Unable to invokeJavaScript", e);
            eau.b();
        } catch (Throwable th) {
            eau.b();
            throw th;
        }
    }
}
