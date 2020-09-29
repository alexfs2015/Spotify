package defpackage;

import org.json.JSONObject;

/* renamed from: ecj reason: default package */
final class ecj implements cqy<ebu> {
    private final /* synthetic */ ebl a;
    private final /* synthetic */ Object b;
    private final /* synthetic */ cqt c;
    private final /* synthetic */ eci d;

    ecj(eci eci, ebl ebl, Object obj, cqt cqt) {
        this.d = eci;
        this.a = ebl;
        this.b = obj;
        this.c = cqt;
    }

    public final /* synthetic */ void a(Object obj) {
        ebu ebu = (ebu) obj;
        eci eci = this.d;
        ebl ebl = this.a;
        Object obj2 = this.b;
        cqt cqt = this.c;
        try {
            bkc.e();
            String a2 = cmu.a();
            bgm.o.a(a2, new ecl(eci, ebl, cqt));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a2);
            jSONObject.put("args", eci.b.a(obj2));
            ebu.b(eci.c, jSONObject);
        } catch (Exception e) {
            cqt.a(e);
            cml.a("Unable to invokeJavaScript", e);
            ebl.b();
        } catch (Throwable th) {
            ebl.b();
            throw th;
        }
    }
}
