package defpackage;

import com.bmwgroup.connected.car.internal.remoting.res.CarRv2$1;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv2$2;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv2$3;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv2$4;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv2$5;
import java.util.Map;

/* renamed from: afb reason: default package */
public final class afb implements aey {
    private static Map<String, Integer> a = new CarRv2$4();

    static {
        agd.a("connected.car.core");
        new CarRv2$1();
        new CarRv2$2();
        new CarRv2$3();
        new CarRv2$5();
    }

    public final int a(String str) {
        Integer num = (Integer) a.get(str);
        if (num == null) {
            num = Integer.valueOf(0);
        }
        return num.intValue();
    }
}
