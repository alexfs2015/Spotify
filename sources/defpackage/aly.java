package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.appevents.internal.SubscriptionType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aly reason: default package */
class aly {
    private static final String a = aly.class.getCanonicalName();
    private static final HashMap<String, Method> b = new HashMap<>();
    private static final HashMap<String, Class<?>> c = new HashMap<>();
    private static final String d = akq.g().getPackageName();
    private static final SharedPreferences e = akq.g().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences f = akq.g().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    private static final SharedPreferences g = akq.g().getSharedPreferences("com.facebook.internal.PURCHASE_SUBS", 0);

    aly() {
    }

    private static SubscriptionType a(Context context, String str, Object obj) {
        SubscriptionType subscriptionType;
        String str2 = "autoRenewing";
        String str3 = "purchaseToken";
        SubscriptionType subscriptionType2 = null;
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("productId");
            String string2 = g.getString(string, "");
            JSONObject jSONObject2 = string2.isEmpty() ? new JSONObject() : new JSONObject(string2);
            if (!jSONObject2.optString(str3).equals(jSONObject.get(str3))) {
                if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) < 86400) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(string);
                    String str4 = (String) a(context, arrayList, obj, true).get(string);
                    if (str4 != null) {
                        String optString = new JSONObject(str4).optString("freeTrialPeriod");
                        if (optString != null) {
                            if (!optString.isEmpty()) {
                                subscriptionType = SubscriptionType.START_TRIAL;
                                subscriptionType2 = subscriptionType;
                            }
                        }
                        subscriptionType = SubscriptionType.SUBSCRIBE;
                        subscriptionType2 = subscriptionType;
                    }
                }
                if (subscriptionType2 == null) {
                    subscriptionType2 = SubscriptionType.HEARTBEAT;
                }
            }
            if (subscriptionType2 == null && !string2.isEmpty()) {
                boolean z = jSONObject2.getBoolean(str2);
                boolean z2 = jSONObject.getBoolean(str2);
                if (!z2 && z) {
                    subscriptionType2 = SubscriptionType.CANCEL;
                } else if (!z && z2) {
                    subscriptionType2 = SubscriptionType.RESTORE;
                }
            }
            String str5 = "LAST_LOGGED_TIME_SEC";
            if (subscriptionType2 == null) {
                if (!string2.isEmpty()) {
                    subscriptionType2 = currentTimeMillis - jSONObject2.getLong(str5) > 43200 ? SubscriptionType.HEARTBEAT : SubscriptionType.DUPLICATED;
                }
            }
            if (subscriptionType2 != SubscriptionType.DUPLICATED) {
                jSONObject.put(str5, currentTimeMillis);
                g.edit().putString(string, jSONObject.toString()).apply();
            }
            return subscriptionType2;
        } catch (JSONException e2) {
            Log.e(a, "parsing purchase failure: ", e2);
            return SubscriptionType.UNKNOWN;
        }
    }

    private static Boolean a(Context context, Object obj, String str) {
        if (obj == null) {
            return Boolean.FALSE;
        }
        boolean z = false;
        Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{Integer.valueOf(3), d, str});
        if (a2 != null && ((Integer) a2).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static Class<?> a(Context context, String str) {
        Class<?> cls = (Class) c.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            c.put(str, cls);
        } catch (ClassNotFoundException e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is not available, please add ");
            sb.append(str);
            sb.append(" to the project.");
            Log.e(str2, sb.toString(), e2);
        }
        return cls;
    }

    public static Object a(Context context, IBinder iBinder) {
        return a(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    private static Object a(Context context, String str, String str2, Object obj, Object[] objArr) {
        return a(context, str, str2, obj, objArr, new HashSet());
    }

    private static Object a(Context context, String str, String str2, Object obj, Object[] objArr, Set<Integer> set) {
        Class a2 = a(context, str);
        if (a2 == null) {
            set.add(Integer.valueOf(1));
            return null;
        }
        Method a3 = a(a2, str2);
        if (a3 == null) {
            set.add(Integer.valueOf(2));
            return null;
        } else if (obj != null) {
            try {
                return a3.invoke(a2.cast(obj), objArr);
            } catch (IllegalAccessException unused) {
                set.add(Integer.valueOf(4));
                return null;
            } catch (InvocationTargetException unused2) {
                set.add(Integer.valueOf(5));
                return null;
            }
        } else {
            set.add(Integer.valueOf(3));
            return null;
        }
    }

    private static Method a(Class<?> cls, String str) {
        Method method = (Method) b.get(str);
        if (method != null) {
            return method;
        }
        Class[] clsArr = null;
        char c2 = 65535;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                clsArr = new Class[]{IBinder.class};
            } else if (c2 == 1) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
            } else if (c2 == 2) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class};
            } else if (c2 == 3) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
            } else if (c2 == 4) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
            }
            method = cls.getDeclaredMethod(str, clsArr);
            b.put(str, method);
        } catch (NoSuchMethodException e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(".");
            sb.append(str);
            sb.append(" method not found");
            Log.e(str2, sb.toString(), e2);
        }
        return method;
    }

    public static ArrayList<String> a(Context context, Object obj) {
        return a(b(context, obj, "inapp"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067 A[EDGE_INSN: B:21:0x0067->B:17:0x0067 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<java.lang.String> a(android.content.Context r12, java.lang.Object r13, java.lang.String r14, java.util.Set<java.lang.Integer> r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r13 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.Boolean r1 = a(r12, r13, r14)
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L_0x0072
            r1 = 0
            r3 = r1
            r4 = 0
        L_0x0016:
            r5 = 4
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r10[r2] = r6
            r6 = 1
            java.lang.String r7 = d
            r10[r6] = r7
            r6 = 2
            r10[r6] = r14
            r10[r5] = r3
            java.lang.String r7 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r8 = "getPurchases"
            r6 = r12
            r9 = r13
            r11 = r15
            java.lang.Object r3 = a(r6, r7, r8, r9, r10, r11)
            r5 = 30
            if (r3 == 0) goto L_0x005a
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r6 = "RESPONSE_CODE"
            int r6 = r3.getInt(r6)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r6 = r3.getStringArrayList(r6)
            if (r6 == 0) goto L_0x0067
            int r7 = r6.size()
            int r4 = r4 + r7
            r0.addAll(r6)
            java.lang.String r6 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r6)
            goto L_0x0063
        L_0x005a:
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r15.add(r3)
        L_0x0062:
            r3 = r1
        L_0x0063:
            if (r4 >= r5) goto L_0x0067
            if (r3 != 0) goto L_0x0016
        L_0x0067:
            if (r4 < r5) goto L_0x0079
            r12 = 6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r15.add(r12)
            goto L_0x0079
        L_0x0072:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r15.add(r12)
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aly.a(android.content.Context, java.lang.Object, java.lang.String, java.util.Set):java.util.ArrayList");
    }

    static ArrayList<String> a(Context context, Object obj, Set<Integer> set) {
        ArrayList<String> arrayList = new ArrayList<>();
        Map all = g.getAll();
        if (all.isEmpty()) {
            return arrayList;
        }
        ArrayList a2 = a(context, obj, "subs", set);
        HashSet hashSet = new HashSet();
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(new JSONObject((String) it.next()).getString("productId"));
            } catch (JSONException e2) {
                Log.e(a, "Error parsing purchase json", e2);
            }
        }
        HashSet<String> hashSet2 = new HashSet<>();
        for (Entry key : all.entrySet()) {
            String str = (String) key.getKey();
            if (!hashSet.contains(str)) {
                hashSet2.add(str);
            }
        }
        Editor edit = g.edit();
        for (String str2 : hashSet2) {
            String str3 = "";
            String string = g.getString(str2, str3);
            edit.remove(str2);
            if (!string.isEmpty()) {
                arrayList.add(g.getString(str2, str3));
            }
        }
        edit.apply();
        return arrayList;
    }

    private static ArrayList<String> a(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Editor edit = f.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!f.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                }
            } catch (JSONException e2) {
                Log.e(a, "parsing purchase failure: ", e2);
            }
        }
        edit.apply();
        return arrayList2;
    }

    public static Map<String, String> a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String string = e.getString(str, null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(str, split[1]);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (!hashMap.containsKey(str2)) {
                arrayList2.add(str2);
            }
        }
        hashMap.putAll(b(context, arrayList2, obj, z));
        return hashMap;
    }

    public static void a() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String str = "LAST_CLEARED_TIME";
        long j = e.getLong(str, 0);
        if (j == 0) {
            e.edit().putLong(str, currentTimeMillis).apply();
            return;
        }
        if (currentTimeMillis - j > 604800) {
            e.edit().clear().putLong(str, currentTimeMillis).apply();
        }
    }

    private static void a(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Editor edit = e.edit();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            sb.append(";");
            sb.append((String) entry.getValue());
            edit.putString(str, sb.toString());
        }
        edit.apply();
    }

    private static ArrayList<String> b(Context context, Object obj, String str) {
        return a(context, obj, str, (Set<Integer>) new HashSet<Integer>());
    }

    public static Map<String, SubscriptionType> b(Context context, Object obj) {
        HashMap hashMap = new HashMap();
        Iterator it = b(context, obj, "subs").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            SubscriptionType a2 = a(context, str, obj);
            if (!(a2 == SubscriptionType.DUPLICATED || a2 == SubscriptionType.UNKNOWN)) {
                hashMap.put(str, a2);
            }
        }
        return hashMap;
    }

    private static Map<String, String> b(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(3);
            objArr[1] = d;
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (a2 != null) {
                Bundle bundle2 = (Bundle) a2;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            hashMap.put(arrayList.get(i), stringArrayList.get(i));
                        }
                    }
                    a((Map<String, String>) hashMap);
                }
            }
        }
        return hashMap;
    }

    public static ArrayList<String> c(Context context, Object obj) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj == null) {
            return arrayList;
        }
        Class a2 = a(context, "com.android.vending.billing.IInAppBillingService");
        return (a2 == null || a(a2, "getPurchaseHistory") == null) ? arrayList : a(c(context, obj, "inapp"));
    }

    private static ArrayList<String> c(Context context, Object obj, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (a(context, obj, str).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            Object obj2 = null;
            int i = 0;
            do {
                Context context2 = context;
                Object a2 = a(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{Integer.valueOf(6), d, str, obj2, new Bundle()});
                if (a2 != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) a2;
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        Iterator it = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST").iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str2 = (String) it.next();
                            try {
                                if (currentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / 1000) > 1200) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                arrayList.add(str2);
                                i++;
                            } catch (JSONException e2) {
                                Log.e(a, "parsing purchase failure: ", e2);
                            }
                        }
                        obj2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i >= 30 || obj2 == null) {
                            break;
                        }
                    }
                }
                obj2 = null;
            } while (!bool.booleanValue());
        }
        return arrayList;
    }
}
