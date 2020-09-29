package com.moat.analytics.mobile;

import java.lang.reflect.Field;

class bm {
    final Field[] a;
    final Object b;
    final /* synthetic */ bk c;

    bm(bk bkVar, Field[] fieldArr, Object obj) {
        this.c = bkVar;
        this.a = fieldArr;
        this.b = obj;
    }

    bm(bk bkVar, Field[] fieldArr, Field field, Object obj) {
        this.c = bkVar;
        Field[] fieldArr2 = new Field[(fieldArr.length + 1)];
        System.arraycopy(fieldArr, 0, fieldArr2, 0, fieldArr.length);
        fieldArr2[fieldArr.length] = field;
        this.a = fieldArr2;
        this.b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((bm) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
