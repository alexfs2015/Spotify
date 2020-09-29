package com.spotify.mobile.android.waze.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum WazeTransportDrivingDirection {
    NONE,
    TURN_LEFT,
    TURN_RIGHT,
    KEEP_LEFT,
    KEEP_RIGHT,
    CONTINUE_STRAIGHT,
    ROUNDABOUT_ENTER,
    ROUNDABOUT_EXIT,
    ROUNDABOUT_LEFT,
    ROUNDABOUT_EXIT_LEFT,
    ROUNDABOUT_STRAIGHT,
    ROUNDABOUT_EXIT_STRAIGHT,
    ROUNDABOUT_RIGHT,
    ROUNDABOUT_EXIT_RIGHT,
    ROUNDABOUT_U,
    ROUNDABOUT_EXIT_U,
    APPROACHING_DESTINATION,
    EXIT_LEFT,
    EXIT_RIGHT,
    WAYPOINT_DELAY,
    U_TURN,
    NAV_INSTR_COUNT;
    
    public static final List<WazeTransportDrivingDirection> w = null;

    /* renamed from: com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection[] r0 = com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection r1 = com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection.ROUNDABOUT_ENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection r1 = com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection.ROUNDABOUT_EXIT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        w = Collections.unmodifiableList(Arrays.asList(values()));
    }

    public static boolean a(WazeTransportDrivingDirection wazeTransportDrivingDirection) {
        int i = AnonymousClass1.a[wazeTransportDrivingDirection.ordinal()];
        return i == 1 || i == 2;
    }

    public static boolean a(int i) {
        return i >= 0 && i < w.size();
    }
}
