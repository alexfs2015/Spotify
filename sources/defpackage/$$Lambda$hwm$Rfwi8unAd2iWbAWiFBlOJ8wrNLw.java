package defpackage;

import io.reactivex.functions.BiFunction;
import java.util.Locale;

/* renamed from: -$$Lambda$hwm$Rfwi8unAd2iWbAWiFBlOJ8wrNLw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hwm$Rfwi8unAd2iWbAWiFBlOJ8wrNLw implements BiFunction {
    public static final /* synthetic */ $$Lambda$hwm$Rfwi8unAd2iWbAWiFBlOJ8wrNLw INSTANCE = new $$Lambda$hwm$Rfwi8unAd2iWbAWiFBlOJ8wrNLw();

    private /* synthetic */ $$Lambda$hwm$Rfwi8unAd2iWbAWiFBlOJ8wrNLw() {
    }

    public final Object apply(Object obj, Object obj2) {
        return String.format(Locale.getDefault(), "observableValues:{state:%s, activeDevice:%s}", new Object[]{(String) obj, (String) obj2});
    }
}
