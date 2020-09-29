package defpackage;

/* renamed from: ahm reason: default package */
public final class ahm {
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    private String k;

    public ahm(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }

    public final String toString() {
        if (this.k == null) {
            StringBuilder sb = new StringBuilder("appBundleId=");
            sb.append(this.a);
            sb.append(", executionId=");
            sb.append(this.b);
            sb.append(", installationId=");
            sb.append(this.c);
            sb.append(", limitAdTrackingEnabled=");
            sb.append(this.d);
            sb.append(", betaDeviceToken=");
            sb.append(this.e);
            sb.append(", buildId=");
            sb.append(this.f);
            sb.append(", osVersion=");
            sb.append(this.g);
            sb.append(", deviceModel=");
            sb.append(this.h);
            sb.append(", appVersionCode=");
            sb.append(this.i);
            sb.append(", appVersionName=");
            sb.append(this.j);
            this.k = sb.toString();
        }
        return this.k;
    }
}
