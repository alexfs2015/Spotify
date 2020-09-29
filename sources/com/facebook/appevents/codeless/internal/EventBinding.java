package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public final class EventBinding {
    public final String a;
    public final ActionType b;
    public final List<PathComponent> c;
    public final List<als> d;
    public final String e;
    private final MappingMethod f;
    private final String g;
    private final String h;
    private final String i;

    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    private EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, List<PathComponent> list, List<als> list2, String str3, String str4, String str5) {
        this.a = str;
        this.f = mappingMethod;
        this.b = actionType;
        this.g = str2;
        this.c = list;
        this.d = list2;
        this.h = str3;
        this.i = str4;
        this.e = str5;
    }

    private static EventBinding a(JSONObject jSONObject) {
        String string = jSONObject.getString("event_name");
        MappingMethod valueOf = MappingMethod.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        ActionType valueOf2 = ActionType.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(new PathComponent(jSONArray.getJSONObject(i2)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                arrayList2.add(new als(optJSONArray.getJSONObject(i3)));
            }
        }
        EventBinding eventBinding = new EventBinding(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
        return eventBinding;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.facebook.appevents.codeless.internal.EventBinding> a(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r2 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r1 >= r2) goto L_0x001e
            org.json.JSONObject r3 = r4.getJSONObject(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            com.facebook.appevents.codeless.internal.EventBinding r3 = a(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            r0.add(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.EventBinding.a(org.json.JSONArray):java.util.List");
    }
}
