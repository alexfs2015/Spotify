package defpackage;

import android.app.Activity;
import android.util.Log;
import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.List;

/* renamed from: amo reason: default package */
public abstract class amo<CONTENT, RESULT> {
    protected static final Object a = new Object();
    protected final Activity b;
    protected final amw c = null;
    protected int d;
    private List<a> e;

    /* renamed from: amo$a */
    public abstract class a {
        protected a() {
        }

        public abstract amh a(CONTENT content);

        public Object a() {
            return amo.a;
        }

        public abstract boolean a(CONTENT content, boolean z);
    }

    protected amo(Activity activity, int i) {
        anl.a((Object) activity, "activity");
        this.b = activity;
        this.d = i;
    }

    private amh b(CONTENT content, Object obj) {
        boolean z = obj == a;
        amh amh = null;
        if (this.e == null) {
            this.e = b();
        }
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a aVar = (a) it.next();
            if ((z || ank.a(aVar.a(), obj)) && aVar.a(content, true)) {
                try {
                    amh = aVar.a(content);
                    break;
                } catch (FacebookException e2) {
                    amh = c();
                    amn.a(amh, e2);
                }
            }
        }
        if (amh != null) {
            return amh;
        }
        amh c2 = c();
        amn.a(c2, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        return c2;
    }

    public final Activity a() {
        Activity activity = this.b;
        if (activity != null) {
            return activity;
        }
        amw amw = this.c;
        if (amw != null) {
            return amw.a();
        }
        return null;
    }

    public void a(CONTENT content) {
        a(content, a);
    }

    /* access modifiers changed from: protected */
    public void a(CONTENT content, Object obj) {
        amh b2 = b(content, obj);
        if (b2 != null) {
            amw amw = this.c;
            if (amw != null) {
                amw.a(b2.b, b2.c);
                amh.a(b2);
                return;
            }
            this.b.startActivityForResult(b2.b, b2.c);
            amh.a(b2);
            return;
        }
        String str = "No code path should ever result in a null appCall";
        Log.e("FacebookDialog", str);
        if (akq.c()) {
            throw new IllegalStateException(str);
        }
    }

    /* access modifiers changed from: protected */
    public abstract List<a> b();

    /* access modifiers changed from: protected */
    public abstract amh c();
}
