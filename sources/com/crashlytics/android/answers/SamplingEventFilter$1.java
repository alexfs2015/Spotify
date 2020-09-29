package com.crashlytics.android.answers;

import com.crashlytics.android.answers.SessionEvent.Type;
import java.util.HashSet;

public class SamplingEventFilter$1 extends HashSet<Type> {
    public SamplingEventFilter$1() {
        add(Type.START);
        add(Type.RESUME);
        add(Type.PAUSE);
        add(Type.STOP);
    }
}
