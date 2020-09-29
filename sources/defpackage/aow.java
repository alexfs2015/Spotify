package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.a;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.widget.LikeView.ObjectType;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aow reason: default package */
public final class aow {
    private static amh a(int i, Intent intent) {
        UUID a = anf.a(intent);
        if (a == null) {
            return null;
        }
        return amh.a(a, i);
    }

    public static Bundle a(apa apa, UUID uuid) {
        if (apa != null) {
            aoz aoz = apa.c;
            if (aoz != null) {
                Bundle bundle = new Bundle();
                ArrayList arrayList = new ArrayList();
                for (String str : aoz.a.keySet()) {
                    Object obj = aoz.a.get(str);
                    Uri uri = obj instanceof Uri ? (Uri) obj : null;
                    Object obj2 = aoz.a.get(str);
                    a a = a(uuid, uri, obj2 instanceof Bitmap ? (Bitmap) obj2 : null);
                    arrayList.add(a);
                    bundle.putString(str, a.b);
                }
                ane.a((Collection<a>) arrayList);
                return bundle;
            }
        }
        return null;
    }

    public static Pair<String, String> a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str.length() > i) {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
                return new Pair<>(str2, str);
            }
        }
        str2 = null;
        return new Pair<>(str2, str);
    }

    private static a a(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return ane.a(uuid, bitmap);
        }
        if (uri != null) {
            return ane.a(uuid, uri);
        }
        return null;
    }

    static /* synthetic */ a a(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap = null;
        if (shareMedia instanceof apn) {
            apn apn = (apn) shareMedia;
            bitmap = apn.b;
            uri = apn.c;
        } else {
            uri = shareMedia instanceof apq ? ((apq) shareMedia).b : null;
        }
        return a(uuid, uri, bitmap);
    }

    public static ObjectType a(ObjectType objectType, ObjectType objectType2) {
        if (objectType == objectType2) {
            return objectType;
        }
        if (objectType == ObjectType.UNKNOWN) {
            return objectType2;
        }
        if (objectType2 == ObjectType.UNKNOWN) {
            return objectType;
        }
        return null;
    }

    public static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        int lastIndexOf = uri2.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        return uri2.substring(lastIndexOf);
    }

    public static List<String> a(apo apo, final UUID uuid) {
        if (apo != null) {
            List<apn> list = apo.a;
            if (list != null) {
                List a = ank.a(list, (b<T, K>) new b<apn, a>() {
                    public final /* bridge */ /* synthetic */ Object a(Object obj) {
                        return aow.a(uuid, (ShareMedia) (apn) obj);
                    }
                });
                List<String> a2 = ank.a(a, (b<T, K>) new b<a, String>() {
                    public final /* bridge */ /* synthetic */ Object a(Object obj) {
                        return ((a) obj).b;
                    }
                });
                ane.a((Collection<a>) a);
                return a2;
            }
        }
        return null;
    }

    private static JSONArray a(JSONArray jSONArray, boolean z) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    public static JSONObject a(apk apk) {
        return aos.a(apk.a, (a) new a() {
            public final JSONObject a(apn apn) {
                Uri uri = apn.c;
                if (ank.b(uri)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", uri.toString());
                        return jSONObject;
                    } catch (JSONException e) {
                        throw new FacebookException("Unable to attach images", (Throwable) e);
                    }
                } else {
                    throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
                }
            }
        });
    }

    public static JSONObject a(final UUID uuid, apk apk) {
        apj apj = apk.a;
        final ArrayList arrayList = new ArrayList();
        JSONObject a = aos.a(apj, (a) new a() {
            public final JSONObject a(apn apn) {
                a a2 = aow.a(uuid, (ShareMedia) apn);
                if (a2 == null) {
                    return null;
                }
                arrayList.add(a2);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a2.b);
                    if (apn.d) {
                        jSONObject.put("user_generated", true);
                    }
                    return jSONObject;
                } catch (JSONException e) {
                    throw new FacebookException("Unable to attach images", (Throwable) e);
                }
            }
        });
        ane.a((Collection<a>) arrayList);
        if (apk.j != null) {
            String str = "place";
            if (ank.a(a.optString(str))) {
                a.put(str, apk.j);
            }
        }
        if (apk.i != null) {
            String str2 = "tags";
            JSONArray optJSONArray = a.optJSONArray(str2);
            Set hashSet = optJSONArray == null ? new HashSet() : ank.b(optJSONArray);
            for (String add : apk.i) {
                hashSet.add(add);
            }
            a.put(str2, new JSONArray(hashSet));
        }
        return a;
    }

    public static JSONObject a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = a((JSONArray) obj, true);
                }
                Pair a = a(string);
                String str = (String) a.first;
                String str2 = (String) a.second;
                if (z) {
                    if (str == null || !str.equals("fbsdk")) {
                        if (str != null) {
                            if (!str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    public static void a(final int i) {
        CallbackManagerImpl.a(i, new a() {
            public final boolean a(int i, Intent intent) {
                return aow.a(i, i, intent, new aot(null, null) {
                    private /* synthetic */ ako a;

                    {
                        this.a = r2;
                    }

                    public final void a(amh amh) {
                        aow.a(this.a);
                    }

                    public final void a(amh amh, Bundle bundle) {
                        String str;
                        if (bundle != null) {
                            String str2 = "completionGesture";
                            String string = bundle.containsKey(str2) ? bundle.getString(str2) : bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
                            if (string == null || "post".equalsIgnoreCase(string)) {
                                String str3 = "postId";
                                if (bundle.containsKey(str3)) {
                                    str = bundle.getString(str3);
                                } else {
                                    String str4 = "com.facebook.platform.extra.POST_ID";
                                    str = bundle.containsKey(str4) ? bundle.getString(str4) : bundle.getString("post_id");
                                }
                                ako ako = this.a;
                                aow.a("succeeded", (String) null);
                                if (ako != null) {
                                    ako.a(new a(str));
                                }
                            } else if ("cancel".equalsIgnoreCase(string)) {
                                aow.a(this.a);
                            } else {
                                aow.a(this.a, new FacebookException("UnknownError"));
                            }
                        }
                    }

                    public final void a(amh amh, FacebookException facebookException) {
                        aow.a(this.a, facebookException);
                    }
                });
            }
        });
    }

    static void a(ako<a> ako) {
        a("cancelled", (String) null);
        if (ako != null) {
            ako.a();
        }
    }

    static void a(ako<a> ako, FacebookException facebookException) {
        a(LogMessage.SEVERITY_ERROR, facebookException.getMessage());
        if (ako != null) {
            ako.a(facebookException);
        }
    }

    static void a(String str, String str2) {
        alk alk = new alk(akq.g());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        alk.b("fb_share_dialog_result", bundle);
    }

    public static boolean a(int i, int i2, Intent intent, aot aot) {
        amh a = a(i, intent);
        if (a == null) {
            return false;
        }
        ane.a(a.a);
        if (aot == null) {
            return true;
        }
        FacebookException a2 = anf.a(anf.d(intent));
        if (a2 == null) {
            aot.a(a, anf.c(intent));
        } else if (a2 instanceof FacebookOperationCanceledException) {
            aot.a(a);
        } else {
            aot.a(a, a2);
        }
        return true;
    }
}
