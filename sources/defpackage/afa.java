package defpackage;

import com.bmwgroup.connected.car.internal.remoting.res.CarRv1$1;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv1$2;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv1$3;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv1$4;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv1$5;
import java.util.Map;

/* renamed from: afa reason: default package */
public final class afa implements aey {
    private static Map<String, Integer> a = new CarRv1$4();

    static {
        agd.a("connected.car.core");
        new CarRv1$1();
        new CarRv1$2();
        new CarRv1$3();
        new CarRv1$5();
    }

    public final int a(String str) {
        Integer num = (Integer) a.get(str);
        if (num == null) {
            num = Integer.valueOf(0);
        }
        return num.intValue();
    }
}
