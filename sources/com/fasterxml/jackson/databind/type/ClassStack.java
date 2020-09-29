package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.ArrayList;
import java.util.Iterator;

public final class ClassStack {
    protected final Class<?> _current;
    protected final ClassStack _parent;
    private ArrayList<ResolvedRecursiveType> _selfRefs;

    public ClassStack(Class<?> cls) {
        this(null, cls);
    }

    private ClassStack(ClassStack classStack, Class<?> cls) {
        this._parent = classStack;
        this._current = cls;
    }

    public final ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public final void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        if (this._selfRefs == null) {
            this._selfRefs = new ArrayList<>();
        }
        this._selfRefs.add(resolvedRecursiveType);
    }

    public final void resolveSelfReferences(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ResolvedRecursiveType) it.next()).setReference(javaType);
            }
        }
    }

    public final ClassStack find(Class<?> cls) {
        if (this._current == cls) {
            return this;
        }
        for (ClassStack classStack = this._parent; classStack != null; classStack = classStack._parent) {
            if (classStack._current == cls) {
                return classStack;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        sb.append(arrayList == null ? Ad.DEFAULT_SKIPPABLE_AD_DELAY : String.valueOf(arrayList.size()));
        sb.append(')');
        for (ClassStack classStack = this; classStack != null; classStack = classStack._parent) {
            sb.append(' ');
            sb.append(classStack._current.getName());
        }
        sb.append(']');
        return sb.toString();
    }
}
