package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: jwo reason: default package */
public final class jwo {
    private static boolean a(Field field, Class<?> cls) {
        if (Collection.class.isAssignableFrom(field.getType())) {
            Type[] actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
            if (actualTypeArguments != null && actualTypeArguments.length > 0) {
                return cls.isAssignableFrom((Class) actualTypeArguments[0]);
            }
        }
        return false;
    }

    public static void a(Object obj, Bundle bundle) {
        Field[] declaredFields;
        boolean[] zArr;
        int[] iArr;
        double[] dArr;
        long[] jArr;
        float[] fArr;
        Class cls = fay.a(obj).getClass();
        do {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(jwn.class)) {
                    StringBuilder sb = new StringBuilder("SAVED_STATE_");
                    sb.append(cls.getSimpleName());
                    sb.append('_');
                    sb.append(field.getName());
                    String sb2 = sb.toString();
                    Class type = field.getType();
                    boolean isAccessible = field.isAccessible();
                    field.setAccessible(true);
                    try {
                        Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            if (!type.equals(Boolean[].class)) {
                                if (!type.equals(boolean[].class)) {
                                    if (!type.equals(Integer[].class)) {
                                        if (!type.equals(int[].class)) {
                                            if (!type.equals(Double[].class)) {
                                                if (!type.equals(double[].class)) {
                                                    if (!type.equals(Long[].class)) {
                                                        if (!type.equals(long[].class)) {
                                                            if (!type.equals(Float[].class)) {
                                                                if (!type.equals(float[].class)) {
                                                                    if (type.equals(String[].class)) {
                                                                        bundle.putStringArray(sb2, (String[]) obj2);
                                                                    } else if (type.equals(ArrayList.class) && a(field, String.class)) {
                                                                        bundle.putStringArrayList(sb2, (ArrayList) obj2);
                                                                    } else if (Parcelable[].class.isAssignableFrom(type)) {
                                                                        bundle.putParcelableArray(sb2, (Parcelable[]) obj2);
                                                                    } else if (!type.equals(ArrayList.class) || !a(field, Parcelable.class)) {
                                                                        if (!type.equals(Boolean.class)) {
                                                                            if (!type.equals(Boolean.TYPE)) {
                                                                                if (!type.equals(Integer.class)) {
                                                                                    if (!type.equals(Integer.TYPE)) {
                                                                                        if (!type.equals(Double.class)) {
                                                                                            if (!type.equals(Double.TYPE)) {
                                                                                                if (!type.equals(Long.class)) {
                                                                                                    if (!type.equals(Long.TYPE)) {
                                                                                                        if (!type.equals(Float.class)) {
                                                                                                            if (!type.equals(Float.TYPE)) {
                                                                                                                if (type.equals(String.class)) {
                                                                                                                    bundle.putString(sb2, (String) obj2);
                                                                                                                } else if (Parcelable.class.isAssignableFrom(type)) {
                                                                                                                    bundle.putParcelable(sb2, (Parcelable) obj2);
                                                                                                                } else if (Serializable.class.isAssignableFrom(type)) {
                                                                                                                    bundle.putSerializable(sb2, (Serializable) obj2);
                                                                                                                } else {
                                                                                                                    StringBuilder sb3 = new StringBuilder("Unsupported states ");
                                                                                                                    sb3.append(field.getName());
                                                                                                                    throw new AssertionError(sb3.toString());
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        bundle.putFloat(sb2, ((Float) obj2).floatValue());
                                                                                                    }
                                                                                                }
                                                                                                bundle.putLong(sb2, ((Long) obj2).longValue());
                                                                                            }
                                                                                        }
                                                                                        bundle.putDouble(sb2, ((Double) obj2).doubleValue());
                                                                                    }
                                                                                }
                                                                                bundle.putInt(sb2, ((Integer) obj2).intValue());
                                                                            }
                                                                        }
                                                                        bundle.putBoolean(sb2, ((Boolean) obj2).booleanValue());
                                                                    } else {
                                                                        bundle.putParcelableArrayList(sb2, (ArrayList) obj2);
                                                                    }
                                                                }
                                                            }
                                                            if (type.getComponentType().isPrimitive()) {
                                                                fArr = (float[]) obj2;
                                                            } else {
                                                                fArr = wpi.a((Float[]) obj2);
                                                            }
                                                            bundle.putFloatArray(sb2, fArr);
                                                        }
                                                    }
                                                    if (type.getComponentType().isPrimitive()) {
                                                        jArr = (long[]) obj2;
                                                    } else {
                                                        jArr = wpi.a((Long[]) obj2);
                                                    }
                                                    bundle.putLongArray(sb2, jArr);
                                                }
                                            }
                                            if (type.getComponentType().isPrimitive()) {
                                                dArr = (double[]) obj2;
                                            } else {
                                                dArr = wpi.a((Double[]) obj2);
                                            }
                                            bundle.putDoubleArray(sb2, dArr);
                                        }
                                    }
                                    if (type.getComponentType().isPrimitive()) {
                                        iArr = (int[]) obj2;
                                    } else {
                                        iArr = wpi.a((Integer[]) obj2);
                                    }
                                    bundle.putIntArray(sb2, iArr);
                                }
                            }
                            if (type.getComponentType().isPrimitive()) {
                                zArr = (boolean[]) obj2;
                            } else {
                                zArr = wpi.a((Boolean[]) obj2);
                            }
                            bundle.putBooleanArray(sb2, zArr);
                        }
                        field.setAccessible(isAccessible);
                    } catch (IllegalAccessException e) {
                        StringBuilder sb4 = new StringBuilder("Problems saving states ");
                        sb4.append(field.getName());
                        sb4.append(':');
                        sb4.append(e.getMessage());
                        throw new AssertionError(sb4.toString());
                    } catch (Throwable th) {
                        field.setAccessible(isAccessible);
                        throw th;
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (!"java.lang.Object".equals(cls.getName()));
    }

    public static boolean b(Object obj, Bundle bundle) {
        Field[] declaredFields;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (bundle == null) {
            return false;
        }
        bundle.setClassLoader(obj.getClass().getClassLoader());
        Class cls = fay.a(obj).getClass();
        do {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(jwn.class)) {
                    StringBuilder sb = new StringBuilder("SAVED_STATE_");
                    sb.append(cls.getSimpleName());
                    sb.append('_');
                    sb.append(field.getName());
                    String sb2 = sb.toString();
                    Class type = field.getType();
                    boolean isAccessible = field.isAccessible();
                    field.setAccessible(true);
                    try {
                        Object obj7 = bundle.get(sb2);
                        if (obj7 != null) {
                            if (!type.equals(Boolean[].class)) {
                                if (!type.equals(boolean[].class)) {
                                    if (!type.equals(Integer[].class)) {
                                        if (!type.equals(int[].class)) {
                                            if (!type.equals(Double[].class)) {
                                                if (!type.equals(double[].class)) {
                                                    if (!type.equals(Long[].class)) {
                                                        if (!type.equals(long[].class)) {
                                                            if (!type.equals(Float[].class)) {
                                                                if (!type.equals(float[].class)) {
                                                                    if (type.equals(String[].class)) {
                                                                        field.set(obj, bundle.getStringArray(sb2));
                                                                    } else if (type.equals(ArrayList.class) && a(field, String.class)) {
                                                                        field.set(obj, bundle.getStringArrayList(sb2));
                                                                    } else if (Parcelable[].class.isAssignableFrom(type)) {
                                                                        field.set(obj, bundle.getParcelableArray(sb2));
                                                                    } else if (type.equals(ArrayList.class) && a(field, Parcelable.class)) {
                                                                        field.set(obj, bundle.getParcelableArrayList(sb2));
                                                                    } else if (type.equals(Boolean.TYPE)) {
                                                                        field.setBoolean(obj, ((Boolean) obj7).booleanValue());
                                                                    } else if (type.equals(Integer.TYPE)) {
                                                                        field.setInt(obj, ((Integer) obj7).intValue());
                                                                    } else if (type.equals(Double.TYPE)) {
                                                                        field.setDouble(obj, ((Double) obj7).doubleValue());
                                                                    } else if (type.equals(Long.TYPE)) {
                                                                        field.setLong(obj, ((Long) obj7).longValue());
                                                                    } else if (type.equals(Float.TYPE)) {
                                                                        field.setFloat(obj, ((Float) obj7).floatValue());
                                                                    } else if (Parcelable.class.isAssignableFrom(type)) {
                                                                        field.set(obj, bundle.getParcelable(sb2));
                                                                    } else if (Serializable.class.isAssignableFrom(type)) {
                                                                        field.set(obj, bundle.getSerializable(sb2));
                                                                    } else {
                                                                        field.set(obj, obj7);
                                                                    }
                                                                }
                                                            }
                                                            if (type.getComponentType().isPrimitive()) {
                                                                obj6 = (float[]) obj7;
                                                            } else {
                                                                obj6 = wpi.a((float[]) obj7);
                                                            }
                                                            field.set(obj, obj6);
                                                        }
                                                    }
                                                    if (type.getComponentType().isPrimitive()) {
                                                        obj5 = (long[]) obj7;
                                                    } else {
                                                        obj5 = wpi.a((long[]) obj7);
                                                    }
                                                    field.set(obj, obj5);
                                                }
                                            }
                                            if (type.getComponentType().isPrimitive()) {
                                                obj4 = (double[]) obj7;
                                            } else {
                                                obj4 = wpi.a((double[]) obj7);
                                            }
                                            field.set(obj, obj4);
                                        }
                                    }
                                    if (type.getComponentType().isPrimitive()) {
                                        obj3 = (int[]) obj7;
                                    } else {
                                        obj3 = wpi.a((int[]) obj7);
                                    }
                                    field.set(obj, obj3);
                                }
                            }
                            if (type.getComponentType().isPrimitive()) {
                                obj2 = (boolean[]) obj7;
                            } else {
                                obj2 = wpi.a((boolean[]) obj7);
                            }
                            field.set(obj, obj2);
                        }
                        field.setAccessible(isAccessible);
                    } catch (IllegalAccessException e) {
                        StringBuilder sb3 = new StringBuilder("Problems loading states ");
                        sb3.append(field.getName());
                        sb3.append(':');
                        sb3.append(e.getMessage());
                        throw new AssertionError(sb3.toString());
                    } catch (Throwable th) {
                        field.setAccessible(isAccessible);
                        throw th;
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (!"java.lang.Object".equals(cls.getName()));
        return true;
    }
}
