package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;

/* renamed from: de reason: default package */
public final class de {
    public final Intent a;
    private Bundle b;

    /* renamed from: de$a */
    public static final class a {
        private final Intent a;
        private ArrayList<Bundle> b;
        private Bundle c;
        private ArrayList<Bundle> d;
        private boolean e;

        public a() {
            this(null);
        }

        public a(dg dgVar) {
            this.a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = true;
            if (dgVar != null) {
                this.a.setPackage(dgVar.b.getPackageName());
            }
            Bundle bundle = new Bundle();
            if (dgVar != null) {
                iBinder = dgVar.a.asBinder();
            }
            fd.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            this.a.putExtras(bundle);
        }

        public final a a(int i) {
            this.a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
            return this;
        }

        public final a a(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        public final de a() {
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
            return new de(this.a, null);
        }
    }

    de(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public final void a(Context context, Uri uri) {
        this.a.setData(uri);
        fr.a(context, this.a, this.b);
    }
}
