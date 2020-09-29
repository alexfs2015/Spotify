package defpackage;

import com.bmwgroup.connected.car.internal.remoting.res.CarRv3$1;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv3$2;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv3$3;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv3$4;
import com.bmwgroup.connected.car.internal.remoting.res.CarRv3$5;
import java.util.Map;

/* renamed from: afc reason: default package */
public final class afc implements aey {
    private static Map<String, Integer> a = new CarRv3$4();

    static {
        agd.a("connected.car.core");
        new CarRv3$1();
        new CarRv3$2();
        new CarRv3$3();
        new CarRv3$5();
    }

    public final int a(String str) {
        Integer num = (Integer) a.get(str);
        if (num == null) {
            num = Integer.valueOf(0);
        }
        return num.intValue();
    }
}
