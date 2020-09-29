package defpackage;

import android.app.Activity;
import android.util.Log;
import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.List;

/* renamed from: ama reason: default package */
public abstract class ama<CONTENT, RESULT> {
    protected static final Object a = new Object();
    protected final Activity b;
    protected final ami c = null;
    protected int d;
    private List<a> e;

    /* renamed from: ama$a */
    public abstract class a {
        public abstract alt a(CONTENT content);

        public abstract boolean a(CONTENT content, boolean z);

        protected a() {
        }

        public Object a() {
            return ama.a;
        }
    }

    /* access modifiers changed from: protected */
    public abstract List<a> b();

    /* access modifiers changed from: protected */
    public abstract alt c();

    protected ama(Activity activity, int i) {
        amx.a((Object) activity, "activity");
        this.b = activity;
        this.d = i;
    }

    public void a(CONTENT content) {
        a(content, a);
    }

    /* access modifiers changed from: protected */
    public void a(CONTENT content, Object obj) {
        alt b2 = b(content, obj);
        if (b2 != null) {
            ami ami = this.c;
            if (ami != null) {
                ami.a(b2.b, b2.c);
                alt.a(b2);
                return;
            }
            this.b.startActivityForResult(b2.b, b2.c);
            alt.a(b2);
            return;
        }
        String str = "No code path should ever result in a null appCall";
        Log.e("FacebookDialog", str);
        if (akc.c()) {
            throw new IllegalStateException(str);
        }
    }

    public final Activity a() {
        Activity activity = this.b;
        if (activity != null) {
            return activity;
        }
        ami ami = this.c;
        if (ami != null) {
            return ami.a();
        }
        return null;
    }

    private alt b(CONTENT content, Object obj) {
        boolean z = obj == a;
        alt alt = null;
        if (this.e == null) {
            this.e = b();
        }
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a aVar = (a) it.next();
            if ((z || amw.a(aVar.a(), obj)) && aVar.a(content, true)) {
                try {
                    alt = aVar.a(content);
                    break;
                } catch (FacebookException e2) {
                    alt = c();
                    alz.a(alt, e2);
                }
            }
        }
        if (alt != null) {
            return alt;
        }
        alt c2 = c();
        alz.a(c2, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        return c2;
    }
}
