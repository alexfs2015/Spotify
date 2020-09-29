package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle.Event;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

public final class Recreator implements li {
    private final pr a;

    public Recreator(pr prVar) {
        this.a = prVar;
    }

    public final void a(lm lmVar, Event event) {
        Bundle bundle;
        if (event == Event.ON_CREATE) {
            lmVar.Y_().b(this);
            pp aO_ = this.a.aO_();
            String str = "androidx.savedstate.Restarter";
            if (aO_.b) {
                if (aO_.a != null) {
                    bundle = aO_.a.getBundle(str);
                    aO_.a.remove(str);
                    if (aO_.a.isEmpty()) {
                        aO_.a = null;
                    }
                } else {
                    bundle = null;
                }
                if (bundle != null) {
                    ArrayList stringArrayList = bundle.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        Iterator it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            try {
                                Class asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(a.class);
                                try {
                                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        declaredConstructor.newInstance(new Object[0]);
                                    } catch (Exception e) {
                                        StringBuilder sb = new StringBuilder("Failed to instantiate ");
                                        sb.append(str2);
                                        throw new RuntimeException(sb.toString(), e);
                                    }
                                } catch (NoSuchMethodException e2) {
                                    StringBuilder sb2 = new StringBuilder("Class");
                                    sb2.append(asSubclass.getSimpleName());
                                    sb2.append(" must have default constructor in order to be automatically recreated");
                                    throw new IllegalStateException(sb2.toString(), e2);
                                }
                            } catch (ClassNotFoundException e3) {
                                StringBuilder sb3 = new StringBuilder("Class ");
                                sb3.append(str2);
                                sb3.append(" wasn't found");
                                throw new RuntimeException(sb3.toString(), e3);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                return;
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
