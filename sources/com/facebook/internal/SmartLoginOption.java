package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    private static EnumSet<SmartLoginOption> d;
    private final long mValue;

    static {
        d = EnumSet.allOf(SmartLoginOption.class);
    }

    public static EnumSet<SmartLoginOption> a(long j) {
        EnumSet<SmartLoginOption> noneOf = EnumSet.noneOf(SmartLoginOption.class);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
            if ((smartLoginOption.mValue & j) != 0) {
                noneOf.add(smartLoginOption);
            }
        }
        return noneOf;
    }

    private SmartLoginOption(long j) {
        this.mValue = j;
    }
}
