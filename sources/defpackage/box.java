package defpackage;

import android.content.Context;

/* renamed from: box reason: default package */
public abstract class box {
    protected final Context a;
    protected final String b;
    final a c = new a(this, 0);

    /* renamed from: box$a */
    class a extends brj {
        private a() {
        }

        /* synthetic */ a(box box, byte b) {
            this();
        }

        public final cbi a(String str) {
            return box.this.a(str).i();
        }

        public final boolean a() {
            return box.this.a();
        }

        public final String b() {
            return box.this.b;
        }
    }

    protected box(Context context, String str) {
        this.a = ((Context) bxo.a(context)).getApplicationContext();
        this.b = bxo.a(str);
    }

    public abstract bou a(String str);

    public abstract boolean a();
}
