package defpackage;

import com.google.common.collect.Lists;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: mno reason: default package */
public abstract class mno implements mnk {

    /* renamed from: mno$a */
    public interface a {
        a a(String str);

        mno a();

        a b(String str);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract String b();

    public final void a(List<mnk> list) {
        mne mne = new mne(a(), b());
        Iterator it = Lists.a((Iterable<? extends E>) list).iterator();
        while (it.hasNext()) {
            mnk mnk = (mnk) it.next();
            if (mnk instanceof mno) {
                list.remove(mnk);
            }
        }
        if (!fax.a(b())) {
            list.add(mne);
        }
    }

    public final mng a(mng mng) {
        return fax.a(b()) ? mng : mng.g().a(b()).a();
    }

    public final Completable a(uxh uxh) {
        return Completable.a((Callable<? extends CompletableSource>) new $$Lambda$mno$pmFVK7pGSWM7ctuxjyHgo3br28<Object>(this, uxh));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource b(uxh uxh) {
        if (!fax.a(b())) {
            return uxh.a(a(), b());
        }
        return Completable.a();
    }

    public static a c() {
        return new a();
    }
}
