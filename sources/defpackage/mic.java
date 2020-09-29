package defpackage;

/* renamed from: mic reason: default package */
public final class mic {
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(defpackage.hip r4, defpackage.gkw r5, android.view.KeyEvent r6, android.app.Activity r7, int r8) {
        /*
            java.lang.Class<mic> r8 = defpackage.mic.class
            monitor-enter(r8)
            boolean r0 = r4.d()     // Catch:{ all -> 0x0098 }
            r1 = 0
            if (r0 != 0) goto L_0x000c
            monitor-exit(r8)
            return r1
        L_0x000c:
            int r0 = r7.getVolumeControlStream()     // Catch:{ all -> 0x0098 }
            java.lang.Object r2 = r4.i()     // Catch:{ all -> 0x0098 }
            com.spotify.mobile.android.connect.ConnectManager r2 = (com.spotify.mobile.android.connect.ConnectManager) r2     // Catch:{ all -> 0x0098 }
            com.spotify.mobile.android.connect.model.ConnectDevice r2 = r2.q()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0023
            com.spotify.mobile.android.connect.model.Tech r3 = com.spotify.mobile.android.connect.model.Tech.of(r2)     // Catch:{ all -> 0x0098 }
            r3.isCast()     // Catch:{ all -> 0x0098 }
        L_0x0023:
            r3 = 3
            if (r0 == r3) goto L_0x0029
            r7.setVolumeControlStream(r3)     // Catch:{ all -> 0x0098 }
        L_0x0029:
            int r0 = r6.getAction()     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0095
            boolean r0 = r4.d()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r4.i()     // Catch:{ all -> 0x0098 }
            com.spotify.mobile.android.connect.ConnectManager r0 = (com.spotify.mobile.android.connect.ConnectManager) r0     // Catch:{ all -> 0x0098 }
            boolean r0 = r0.v()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r4.i()     // Catch:{ all -> 0x0098 }
            com.spotify.mobile.android.connect.ConnectManager r0 = (com.spotify.mobile.android.connect.ConnectManager) r0     // Catch:{ all -> 0x0098 }
            boolean r0 = r0.u()     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0095
            int r6 = r6.getKeyCode()     // Catch:{ all -> 0x0098 }
            r0 = 24
            if (r6 == r0) goto L_0x0060
            r0 = 25
            if (r6 == r0) goto L_0x005b
            r6 = 0
            goto L_0x0064
        L_0x005b:
            boolean r6 = r5.b()     // Catch:{ all -> 0x0098 }
            goto L_0x0064
        L_0x0060:
            boolean r6 = r5.a()     // Catch:{ all -> 0x0098 }
        L_0x0064:
            if (r6 == 0) goto L_0x0096
            if (r2 == 0) goto L_0x0096
            boolean r0 = r4.d()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r4.i()     // Catch:{ all -> 0x0098 }
            com.spotify.mobile.android.connect.ConnectManager r0 = (com.spotify.mobile.android.connect.ConnectManager) r0     // Catch:{ all -> 0x0098 }
            boolean r0 = r0.u()     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0086
            java.lang.Object r4 = r4.i()     // Catch:{ all -> 0x0098 }
            com.spotify.mobile.android.connect.ConnectManager r4 = (com.spotify.mobile.android.connect.ConnectManager) r4     // Catch:{ all -> 0x0098 }
            boolean r4 = r4.v()     // Catch:{ all -> 0x0098 }
            if (r4 == 0) goto L_0x0087
        L_0x0086:
            r1 = 1
        L_0x0087:
            if (r1 == 0) goto L_0x0096
            float r4 = r5.c()     // Catch:{ all -> 0x0098 }
            android.content.Intent r4 = com.spotify.music.features.connect.dialogs.VolumeWidgetActivity.a(r2, r4, r7)     // Catch:{ all -> 0x0098 }
            r7.startActivity(r4)     // Catch:{ all -> 0x0098 }
            goto L_0x0096
        L_0x0095:
            r6 = 0
        L_0x0096:
            monitor-exit(r8)
            return r6
        L_0x0098:
            r4 = move-exception
            monitor-exit(r8)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mic.a(hip, gkw, android.view.KeyEvent, android.app.Activity, int):boolean");
    }
}
