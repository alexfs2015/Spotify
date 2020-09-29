package defpackage;

import android.os.Parcelable;
import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.List;

/* renamed from: mng reason: default package */
public abstract class mng implements Parcelable {

    /* renamed from: mng$a */
    public interface a {
        a a(String str);

        a a(List<uzb> list);

        mng a();

        a b(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract List<uzb> d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract a g();

    public static mng a(uza uza) {
        uyz a2 = uza.a();
        mna mna = new mna(a2.a(), a2.getImageUri(), a2.b(), Lists.a((E[]) uza.getItems()), a2.g(), a2.k());
        return mna;
    }

    public final HashMap<String, Integer> h() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < d().size(); i++) {
            hashMap.put(((uzb) d().get(i)).d(), Integer.valueOf(i));
        }
        return hashMap;
    }
}
