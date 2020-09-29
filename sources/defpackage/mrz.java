package defpackage;

import android.os.Parcelable;
import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.List;

/* renamed from: mrz reason: default package */
public abstract class mrz implements Parcelable {

    /* renamed from: mrz$a */
    public interface a {
        a a(String str);

        a a(List<vle> list);

        mrz a();

        a b(String str);
    }

    public static mrz a(vld vld) {
        vlc a2 = vld.a();
        mrt mrt = new mrt(a2.a(), a2.getImageUri(), a2.b(), Lists.a((E[]) vld.getItems()), a2.g(), a2.k());
        return mrt;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract List<vle> d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract a g();

    public final HashMap<String, Integer> h() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < d().size(); i++) {
            hashMap.put(((vle) d().get(i)).d(), Integer.valueOf(i));
        }
        return hashMap;
    }
}
