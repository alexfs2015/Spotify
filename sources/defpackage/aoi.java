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

/* renamed from: aoi reason: default package */
public final class aoi {
    public static boolean a(int i, int i2, Intent intent, aof aof) {
        alt a = a(i, intent);
        if (a == null) {
            return false;
        }
        amq.a(a.a);
        if (aof == null) {
            return true;
        }
        FacebookException a2 = amr.a(amr.d(intent));
        if (a2 == null) {
            aof.a(a, amr.c(intent));
        } else if (a2 instanceof FacebookOperationCanceledException) {
            aof.a(a);
        } else {
            aof.a(a, a2);
        }
        return true;
    }

    private static alt a(int i, Intent intent) {
        UUID a = amr.a(intent);
        if (a == null) {
            return null;
        }
        return alt.a(a, i);
    }

    public static void a(final int i) {
        CallbackManagerImpl.a(i, new a() {
            public final boolean a(int i, Intent intent) {
                return aoi.a(i, i, intent, new aof(null, null) {
                    private /* synthetic */ aka a;

                    {
                        this.a = r2;
                    }

                    public final void a(alt alt) {
                        aoi.a(this.a);
                    }

                    public final void a(alt alt, FacebookException facebookException) {
                        aoi.a(this.a, facebookException);
                    }

                    public final void a(alt alt, Bundle bundle) {
                        String str;
                        String str2;
                        if (bundle != null) {
                            String str3 = "completionGesture";
                            if (bundle.containsKey(str3)) {
                                str = bundle.getString(str3);
                            } else {
                                str = bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
                            }
                            if (str == null || "post".equalsIgnoreCase(str)) {
                                String str4 = "postId";
                                if (bundle.containsKey(str4)) {
                                    str2 = bundle.getString(str4);
                                } else {
                                    String str5 = "com.facebook.platform.extra.POST_ID";
                                    if (bundle.containsKey(str5)) {
                                        str2 = bundle.getString(str5);
                                    } else {
                                        str2 = bundle.getString("post_id");
                                    }
                                }
                                aka aka = this.a;
                                aoi.a("succeeded", (String) null);
                                if (aka != null) {
                                    aka.a(new a(str2));
                                }
                            } else if ("cancel".equalsIgnoreCase(str)) {
                                aoi.a(this.a);
                            } else {
                                aoi.a(this.a, new FacebookException("UnknownError"));
                            }
                        }
                    }
                });
            }
        });
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
            return amq.a(uuid, bitmap);
        }
        if (uri != null) {
            return amq.a(uuid, uri);
        }
        return null;
    }

    static void a(aka<a> aka) {
        a("cancelled", (String) null);
        if (aka != null) {
            aka.a();
        }
    }

    static void a(aka<a> aka, FacebookException facebookException) {
        a(LogMessage.SEVERITY_ERROR, facebookException.getMessage());
        if (aka != null) {
            aka.a(facebookException);
        }
    }

    static void a(String str, String str2) {
        akw akw = new akw(akc.g());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        akw.b("fb_share_dialog_result", bundle);
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

    public static List<String> a(apa apa, final UUID uuid) {
        if (apa != null) {
            List<aoz> list = apa.a;
            if (list != null) {
                List a = amw.a(list, (b<T, K>) new b<aoz, a>() {
                    public final /* bridge */ /* synthetic */ Object a(Object obj) {
                        return aoi.a(uuid, (ShareMedia) (aoz) obj);
                    }
                });
                List<String> a2 = amw.a(a, (b<T, K>) new b<a, String>() {
                    public final /* bridge */ /* synthetic */ Object a(Object obj) {
                        return ((a) obj).b;
                    }
                });
                amq.a((Collection<a>) a);
                return a2;
            }
        }
        return null;
    }

    public static Bundle a(aom aom, UUID uuid) {
        Uri uri;
        Bitmap bitmap;
        if (aom != null) {
            aol aol = aom.c;
            if (aol != null) {
                Bundle bundle = new Bundle();
                ArrayList arrayList = new ArrayList();
                for (String str : aol.a.keySet()) {
                    Object obj = aol.a.get(str);
                    if (obj instanceof Uri) {
                        uri = (Uri) obj;
                    } else {
                        uri = null;
                    }
                    Object obj2 = aol.a.get(str);
                    if (obj2 instanceof Bitmap) {
                        bitmap = (Bitmap) obj2;
                    } else {
                        bitmap = null;
                    }
                    a a = a(uuid, uri, bitmap);
                    arrayList.add(a);
                    bundle.putString(str, a.b);
                }
                amq.a((Collection<a>) arrayList);
                return bundle;
            }
        }
        return null;
    }

    public static JSONObject a(final UUID uuid, aow aow) {
        Set set;
        aov aov = aow.a;
        final ArrayList arrayList = new ArrayList();
        JSONObject a = aoe.a(aov, (a) new a() {
            public final JSONObject a(aoz aoz) {
                a a2 = aoi.a(uuid, (ShareMedia) aoz);
                if (a2 == null) {
                    return null;
                }
                arrayList.add(a2);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a2.b);
                    if (aoz.d) {
                        jSONObject.put("user_generated", true);
                    }
                    return jSONObject;
                } catch (JSONException e) {
                    throw new FacebookException("Unable to attach images", (Throwable) e);
                }
            }
        });
        amq.a((Collection<a>) arrayList);
        if (aow.j != null) {
            String str = "place";
            if (amw.a(a.optString(str))) {
                a.put(str, aow.j);
            }
        }
        if (aow.i != null) {
            String str2 = "tags";
            JSONArray optJSONArray = a.optJSONArray(str2);
            if (optJSONArray == null) {
                set = new HashSet();
            } else {
                set = amw.b(optJSONArray);
            }
            for (String add : aow.i) {
                set.add(add);
            }
            a.put(str2, new JSONArray(set));
        }
        return a;
    }

    public static JSONObject a(aow aow) {
        return aoe.a(aow.a, (a) new a() {
            public final JSONObject a(aoz aoz) {
                Uri uri = aoz.c;
                if (amw.b(uri)) {
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

    static /* synthetic */ a a(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap = null;
        if (shareMedia instanceof aoz) {
            aoz aoz = (aoz) shareMedia;
            bitmap = aoz.b;
            uri = aoz.c;
        } else if (shareMedia instanceof apc) {
            uri = ((apc) shareMedia).b;
        } else {
            uri = null;
        }
        return a(uuid, uri, bitmap);
    }
}
