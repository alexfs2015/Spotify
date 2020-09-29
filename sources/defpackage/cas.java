package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: cas reason: default package */
public final class cas<T> extends a {
    private final T a;

    private cas(T t) {
        this.a = t;
    }

    public static <T> car a(T t) {
        return new cas(t);
    }

    public static <T> T a(car car) {
        if (car instanceof cas) {
            return ((cas) car).a;
        }
        IBinder asBinder = car.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
