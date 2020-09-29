package defpackage;

import com.google.common.collect.Lists;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: msh reason: default package */
public abstract class msh implements msd {

    /* renamed from: msh$a */
    public interface a {
        a a(String str);

        msh a();

        a b(String str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource b(vjj vjj) {
        return !fbo.a(b()) ? vjj.a(a(), b()) : Completable.a();
    }

    public static a c() {
        return new a();
    }

    public final Completable a(vjj vjj) {
        return Completable.a((Callable<? extends CompletableSource>) new $$Lambda$msh$KxKroEk9NAp_nwL9hDS0yFhG0w<Object>(this, vjj));
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public final mrz a(mrz mrz) {
        return fbo.a(b()) ? mrz : mrz.g().a(b()).a();
    }

    public final void a(List<msd> list) {
        mrx mrx = new mrx(a(), b());
        Iterator it = Lists.a((Iterable<? extends E>) list).iterator();
        while (it.hasNext()) {
            msd msd = (msd) it.next();
            if (msd instanceof msh) {
                list.remove(msd);
            }
        }
        if (!fbo.a(b())) {
            list.add(mrx);
        }
    }

    /* access modifiers changed from: protected */
    public abstract String b();
}
