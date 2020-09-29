package defpackage;

import android.content.Context;

/* renamed from: bog reason: default package */
public abstract class bog {
    protected final Context a;
    protected final String b;
    final a c = new a(this, 0);

    /* renamed from: bog$a */
    class a extends bqs {
        private a() {
        }

        public final car a(String str) {
            return bog.this.a(str).i();
        }

        public final boolean a() {
            return bog.this.a();
        }

        public final String b() {
            return bog.this.b;
        }

        /* synthetic */ a(bog bog, byte b) {
            this();
        }
    }

    protected bog(Context context, String str) {
        this.a = ((Context) bwx.a(context)).getApplicationContext();
        this.b = bwx.a(str);
    }

    public abstract bod a(String str);

    public abstract boolean a();
}
