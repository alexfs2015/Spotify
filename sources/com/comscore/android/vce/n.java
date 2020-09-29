package com.comscore.android.vce;

class n {
    String a = "";

    n() {
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\"");
        sb.append(str);
        sb.append("\":");
        sb.append(i);
        sb.append(",");
        this.a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\"");
        sb.append(str);
        sb.append("\":{\"x\":");
        sb.append(i);
        sb.append(",\"y\":");
        sb.append(i2);
        sb.append("},");
        this.a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\"");
        sb.append(str);
        sb.append("\":\"");
        sb.append(str2);
        sb.append("\",");
        this.a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\"");
        sb.append(str);
        sb.append("\":{\"y\":");
        sb.append(str3);
        sb.append(",\"x\":");
        sb.append(str2);
        sb.append("},");
        this.a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("{");
        this.a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void b(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\"");
        sb.append(str);
        sb.append("\":{\"w\":");
        sb.append(i);
        sb.append(",\"h\":");
        sb.append(i2);
        sb.append("},");
        this.a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.a.endsWith(",")) {
            String str = this.a;
            this.a = str.substring(0, str.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("}");
        this.a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void c(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\"");
        sb.append(str);
        sb.append("\":{\"t\":");
        sb.append(i);
        sb.append(",\"b\":");
        sb.append(i2);
        sb.append("},");
        this.a = sb.toString();
    }
}
