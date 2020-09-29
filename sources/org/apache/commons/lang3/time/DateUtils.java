package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Date;

public final class DateUtils {
    private static final int[][] a = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};

    enum ModifyType {
        TRUNCATE,
        ROUND,
        CEILING
    }

    public static boolean a(Date date, Date date2) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date2);
        if (instance != null && instance2 != null) {
            return instance.get(0) == instance2.get(0) && instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Date b(Date date, int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        ModifyType modifyType = ModifyType.TRUNCATE;
        if (instance.get(1) <= 280000000) {
            Date time = instance.getTime();
            long time2 = time.getTime();
            int i2 = instance.get(14);
            if (ModifyType.TRUNCATE == modifyType || i2 < 500) {
                time2 -= (long) i2;
            }
            int i3 = instance.get(13);
            if (ModifyType.TRUNCATE == modifyType || i3 < 30) {
                time2 -= ((long) i3) * 1000;
            }
            int i4 = instance.get(12);
            if (ModifyType.TRUNCATE == modifyType || i4 < 30) {
                time2 -= ((long) i4) * 60000;
            }
            if (time.getTime() != time2) {
                time.setTime(time2);
                instance.setTime(time);
            }
            int[][] iArr = a;
            boolean z = false;
            for (int i5 = 0; i5 < 8; i5++) {
                int[] iArr2 = iArr[i5];
                for (int i6 : iArr2) {
                    if (i6 == 5) {
                        if (modifyType == ModifyType.CEILING || (modifyType == ModifyType.ROUND && z)) {
                            instance.add(iArr2[0], 1);
                        }
                        return instance.getTime();
                    }
                }
                int actualMinimum = instance.getActualMinimum(iArr2[0]);
                int i7 = instance.get(iArr2[0]) - actualMinimum;
                z = i7 > (instance.getActualMaximum(iArr2[0]) - actualMinimum) / 2;
                if (i7 != 0) {
                    instance.set(iArr2[0], instance.get(iArr2[0]) - i7);
                }
            }
            StringBuilder sb = new StringBuilder("The field ");
            sb.append(5);
            sb.append(" is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
        throw new ArithmeticException("Calendar value too large for accurate calculations");
    }

    public static Date a(Date date, int i) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.add(5, -7);
            return instance.getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }
}
