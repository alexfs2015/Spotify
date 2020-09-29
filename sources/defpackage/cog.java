package defpackage;

import com.google.android.gms.internal.ads.zzae;

/* renamed from: cog reason: default package */
final class cog implements edt {
    private final /* synthetic */ String a;
    private final /* synthetic */ cok b;

    cog(String str, cok cok) {
        this.a = str;
        this.b = cok;
    }

    public final void a(zzae zzae) {
        String str = this.a;
        String zzae2 = zzae.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzae2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzae2);
        sb.toString();
        cpn.a(5);
        this.b.a(null);
    }
}
