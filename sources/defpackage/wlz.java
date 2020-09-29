package defpackage;

/* renamed from: wlz reason: default package */
final class wlz implements wmj {
    wlz() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wmh a(defpackage.wjx r27, org.json.JSONObject r28) {
        /*
            r26 = this;
            r0 = r28
            r1 = 0
            java.lang.String r2 = "settings_version"
            int r12 = r0.optInt(r2, r1)
            r2 = 3600(0xe10, float:5.045E-42)
            java.lang.String r3 = "cache_duration"
            int r13 = r0.optInt(r3, r2)
            java.lang.String r3 = "app"
            org.json.JSONObject r3 = r0.getJSONObject(r3)
            java.lang.String r4 = "identifier"
            java.lang.String r15 = r3.getString(r4)
            java.lang.String r4 = "status"
            java.lang.String r16 = r3.getString(r4)
            java.lang.String r4 = "url"
            java.lang.String r17 = r3.getString(r4)
            java.lang.String r5 = "reports_url"
            java.lang.String r18 = r3.getString(r5)
            java.lang.String r5 = "ndk_reports_url"
            java.lang.String r19 = r3.getString(r5)
            java.lang.String r5 = "update_required"
            boolean r20 = r3.optBoolean(r5, r1)
            java.lang.String r5 = "icon"
            boolean r6 = r3.has(r5)
            if (r6 == 0) goto L_0x006b
            org.json.JSONObject r6 = r3.getJSONObject(r5)
            java.lang.String r7 = "hash"
            boolean r6 = r6.has(r7)
            if (r6 == 0) goto L_0x006b
            org.json.JSONObject r3 = r3.getJSONObject(r5)
            java.lang.String r5 = r3.getString(r7)
            java.lang.String r6 = "width"
            int r6 = r3.getInt(r6)
            java.lang.String r7 = "height"
            int r3 = r3.getInt(r7)
            wlr r7 = new wlr
            r7.<init>(r5, r6, r3)
            r21 = r7
            goto L_0x006e
        L_0x006b:
            r3 = 0
            r21 = r3
        L_0x006e:
            wlt r6 = new wlt
            r14 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r3 = "session"
            org.json.JSONObject r3 = r0.getJSONObject(r3)
            r5 = 64000(0xfa00, float:8.9683E-41)
            java.lang.String r7 = "log_buffer_size"
            int r15 = r3.optInt(r7, r5)
            r5 = 8
            java.lang.String r7 = "max_chained_exception_depth"
            int r16 = r3.optInt(r7, r5)
            r5 = 64
            java.lang.String r7 = "max_custom_exception_events"
            int r17 = r3.optInt(r7, r5)
            java.lang.String r7 = "max_custom_key_value_pairs"
            int r18 = r3.optInt(r7, r5)
            r5 = 255(0xff, float:3.57E-43)
            java.lang.String r7 = "identifier_mask"
            int r19 = r3.optInt(r7, r5)
            java.lang.String r5 = "send_session_without_crash"
            boolean r20 = r3.optBoolean(r5, r1)
            r5 = 4
            java.lang.String r7 = "max_complete_sessions_count"
            int r21 = r3.optInt(r7, r5)
            wme r7 = new wme
            r14 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r3 = "prompt"
            org.json.JSONObject r3 = r0.getJSONObject(r3)
            java.lang.String r5 = "title"
            java.lang.String r8 = "Send Crash Report?"
            java.lang.String r15 = r3.optString(r5, r8)
            java.lang.String r5 = "message"
            java.lang.String r8 = "Looks like we crashed! Please help us fix the problem by sending a crash report."
            java.lang.String r16 = r3.optString(r5, r8)
            java.lang.String r5 = "send_button_title"
            java.lang.String r8 = "Send"
            java.lang.String r17 = r3.optString(r5, r8)
            r5 = 1
            java.lang.String r8 = "show_cancel_button"
            boolean r18 = r3.optBoolean(r8, r5)
            java.lang.String r8 = "cancel_button_title"
            java.lang.String r9 = "Don't Send"
            java.lang.String r19 = r3.optString(r8, r9)
            java.lang.String r8 = "show_always_send_button"
            boolean r20 = r3.optBoolean(r8, r5)
            java.lang.String r8 = "always_send_button_title"
            java.lang.String r9 = "Always Send"
            java.lang.String r21 = r3.optString(r8, r9)
            wmd r8 = new wmd
            r14 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r3 = "features"
            org.json.JSONObject r3 = r0.getJSONObject(r3)
            java.lang.String r9 = "prompt_enabled"
            boolean r15 = r3.optBoolean(r9, r1)
            java.lang.String r9 = "collect_logged_exceptions"
            boolean r16 = r3.optBoolean(r9, r5)
            java.lang.String r9 = "collect_reports"
            boolean r17 = r3.optBoolean(r9, r5)
            java.lang.String r9 = "collect_analytics"
            boolean r18 = r3.optBoolean(r9, r1)
            java.lang.String r9 = "firebase_crashlytics_enabled"
            boolean r19 = r3.optBoolean(r9, r1)
            wmb r9 = new wmb
            r14 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            java.lang.String r3 = "analytics"
            org.json.JSONObject r3 = r0.getJSONObject(r3)
            java.lang.String r10 = "http://="
            java.lang.String r15 = r3.optString(r4, r10)
            r4 = 600(0x258, float:8.41E-43)
            java.lang.String r10 = "flush_interval_secs"
            int r16 = r3.optInt(r10, r4)
            r4 = 8000(0x1f40, float:1.121E-41)
            java.lang.String r10 = "max_byte_size_per_file"
            int r17 = r3.optInt(r10, r4)
            java.lang.String r4 = "max_file_count_per_send"
            int r18 = r3.optInt(r4, r5)
            r4 = 100
            java.lang.String r10 = "max_pending_send_file_count"
            int r19 = r3.optInt(r10, r4)
            java.lang.String r4 = "forward_to_google_analytics"
            boolean r20 = r3.optBoolean(r4, r1)
            java.lang.String r4 = "include_purchase_events_in_forwarded_events"
            boolean r21 = r3.optBoolean(r4, r1)
            java.lang.String r1 = "track_custom_events"
            boolean r22 = r3.optBoolean(r1, r5)
            java.lang.String r1 = "track_predefined_events"
            boolean r23 = r3.optBoolean(r1, r5)
            java.lang.String r1 = "sampling_rate"
            int r24 = r3.optInt(r1, r5)
            java.lang.String r1 = "flush_on_background"
            boolean r25 = r3.optBoolean(r1, r5)
            wlq r1 = new wlq
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r3 = "beta"
            org.json.JSONObject r3 = r0.getJSONObject(r3)
            java.lang.String r4 = defpackage.wmi.a
            java.lang.String r5 = "update_endpoint"
            java.lang.String r4 = r3.optString(r5, r4)
            java.lang.String r5 = "update_suspend_duration"
            int r2 = r3.optInt(r5, r2)
            wlu r11 = new wlu
            r11.<init>(r4, r2)
            long r2 = (long) r13
            java.lang.String r4 = "expires_at"
            boolean r5 = r0.has(r4)
            if (r5 == 0) goto L_0x019b
            long r2 = r0.getLong(r4)
            r4 = r2
            goto L_0x01a4
        L_0x019b:
            long r4 = r27.a()
            r14 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r14
            long r4 = r4 + r2
        L_0x01a4:
            wmh r0 = new wmh
            r3 = r0
            r10 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlz.a(wjx, org.json.JSONObject):wmh");
    }
}
