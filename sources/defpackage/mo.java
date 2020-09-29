package defpackage;

import android.text.TextUtils;

/* renamed from: mo reason: default package */
class mo {

    /* renamed from: mo$a */
    static class a implements b {
        private String a;
        private int b;
        private int c;

        a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return (this.b == -1 || aVar.b == -1) ? TextUtils.equals(this.a, aVar.a) && this.c == aVar.c : TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            return hn.a(this.a, Integer.valueOf(this.c));
        }
    }

    static {
        boolean z = ml.a;
    }
}
