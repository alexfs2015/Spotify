package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {
    private static final ReferenceProperty NOT_REFEFERENCE_PROP = ReferenceProperty.managed("");
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final MapperConfig<?> _config;
    protected Linked<AnnotatedParameter> _ctorParameters;
    protected Linked<AnnotatedField> _fields;
    protected final boolean _forSerialization;
    protected Linked<AnnotatedMethod> _getters;
    protected final PropertyName _internalName;
    protected transient PropertyMetadata _metadata;
    protected final PropertyName _name;
    protected transient ReferenceProperty _referenceInfo;
    protected Linked<AnnotatedMethod> _setters;

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$10 reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access = new int[Access.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonProperty$Access[] r0 = com.fasterxml.jackson.annotation.JsonProperty.Access.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access = r0
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.READ_WRITE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass10.<clinit>():void");
        }
    }

    public static final class Linked<T> {
        public final boolean isMarkedIgnored;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final PropertyName name;
        public final Linked<T> next;
        public final T value;

        public Linked(T t, Linked<T> linked, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.value = t;
            this.next = linked;
            this.name = (propertyName == null || propertyName.isEmpty()) ? null : propertyName;
            if (z) {
                if (this.name == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                } else if (!propertyName.hasSimpleName()) {
                    z = false;
                }
            }
            this.isNameExplicit = z;
            this.isVisible = z2;
            this.isMarkedIgnored = z3;
        }

        /* access modifiers changed from: protected */
        public final Linked<T> append(Linked<T> linked) {
            Linked<T> linked2 = this.next;
            return linked2 == null ? withNext(linked) : withNext(linked2.append(linked));
        }

        public final String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", new Object[]{this.value.toString(), Boolean.valueOf(this.isVisible), Boolean.valueOf(this.isMarkedIgnored), Boolean.valueOf(this.isNameExplicit)});
            if (this.next == null) {
                return format;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(", ");
            sb.append(this.next.toString());
            return sb.toString();
        }

        public final Linked<T> trimByVisibility() {
            Linked<T> linked = this.next;
            if (linked == null) {
                return this;
            }
            Linked<T> trimByVisibility = linked.trimByVisibility();
            if (this.name != null) {
                return trimByVisibility.name == null ? withNext(null) : withNext(trimByVisibility);
            }
            if (trimByVisibility.name != null) {
                return trimByVisibility;
            }
            boolean z = this.isVisible;
            if (z == trimByVisibility.isVisible) {
                return withNext(trimByVisibility);
            }
            if (z) {
                trimByVisibility = withNext(null);
            }
            return trimByVisibility;
        }

        public final Linked<T> withNext(Linked<T> linked) {
            if (linked == this.next) {
                return this;
            }
            Linked linked2 = new Linked(this.value, linked, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
            return linked2;
        }

        public final Linked<T> withValue(T t) {
            if (t == this.value) {
                return this;
            }
            Linked linked = new Linked(t, this.next, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
            return linked;
        }

        public final Linked<T> withoutIgnored() {
            Linked linked = this;
            while (linked.isMarkedIgnored) {
                linked = linked.next;
                if (linked == null) {
                    return null;
                }
            }
            Linked<T> linked2 = linked.next;
            if (linked2 != null) {
                Linked<T> withoutIgnored = linked2.withoutIgnored();
                if (withoutIgnored != linked.next) {
                    linked = linked.withNext(withoutIgnored);
                }
            }
            return linked;
        }

        public final Linked<T> withoutNext() {
            if (this.next == null) {
                return this;
            }
            Linked linked = new Linked(this.value, null, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
            return linked;
        }

        public final Linked<T> withoutNonVisible() {
            Linked<T> linked = this.next;
            Linked<T> withoutNonVisible = linked == null ? null : linked.withoutNonVisible();
            return this.isVisible ? withNext(withoutNonVisible) : withoutNonVisible;
        }
    }

    public static class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {
        private Linked<T> next;

        public MemberIterator(Linked<T> linked) {
            this.next = linked;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        public T next() {
            Linked<T> linked = this.next;
            if (linked != null) {
                T t = (AnnotatedMember) linked.value;
                this.next = this.next.next;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    interface WithMember<T> {
        T withMember(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    protected POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName2;
        this._forSerialization = z;
    }

    protected POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this._config = pOJOPropertyBuilder._config;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = propertyName;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }

    private <T> boolean _anyExplicitNames(Linked<T> linked) {
        while (linked != null) {
            if (linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicits(Linked<T> linked) {
        while (linked != null) {
            if (linked.name != null && linked.name.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyIgnorals(Linked<T> linked) {
        while (linked != null) {
            if (linked.isMarkedIgnored) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyVisible(Linked<T> linked) {
        while (linked != null) {
            if (linked.isVisible) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T extends AnnotatedMember> Linked<T> _applyAnnotations(Linked<T> linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) ((AnnotatedMember) linked.value).withAnnotations(annotationMap);
        if (linked.next != null) {
            linked = linked.withNext(_applyAnnotations(linked.next, annotationMap));
        }
        return linked.withValue(annotatedMember);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<?>, code=com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked, for r12v0, types: [com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<?>, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _explode(java.util.Collection<com.fasterxml.jackson.databind.PropertyName> r10, java.util.Map<com.fasterxml.jackson.databind.PropertyName, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder> r11, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.Linked r12) {
        /*
            r9 = this;
            r0 = r12
        L_0x0001:
            if (r0 == 0) goto L_0x009b
            com.fasterxml.jackson.databind.PropertyName r7 = r0.name
            boolean r1 = r0.isNameExplicit
            if (r1 == 0) goto L_0x006e
            if (r7 != 0) goto L_0x000c
            goto L_0x006e
        L_0x000c:
            java.lang.Object r1 = r11.get(r7)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder r1 = (com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder) r1
            if (r1 != 0) goto L_0x0026
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder r8 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r9._config
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r9._annotationIntrospector
            boolean r4 = r9._forSerialization
            com.fasterxml.jackson.databind.PropertyName r5 = r9._internalName
            r1 = r8
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r11.put(r7, r8)
        L_0x0026:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedField> r2 = r9._fields
            if (r12 != r2) goto L_0x0033
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedField> r2 = r1._fields
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r2 = r0.withNext(r2)
            r1._fields = r2
            goto L_0x0072
        L_0x0033:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r2 = r9._getters
            if (r12 != r2) goto L_0x0040
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r2 = r1._getters
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r2 = r0.withNext(r2)
            r1._getters = r2
            goto L_0x0072
        L_0x0040:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r2 = r9._setters
            if (r12 != r2) goto L_0x004d
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r2 = r1._setters
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r2 = r0.withNext(r2)
            r1._setters = r2
            goto L_0x0072
        L_0x004d:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r2 = r9._ctorParameters
            if (r12 != r2) goto L_0x005a
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r2 = r1._ctorParameters
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r2 = r0.withNext(r2)
            r1._ctorParameters = r2
            goto L_0x0072
        L_0x005a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Internal error: mismatched accessors, property: "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x006e:
            boolean r1 = r0.isVisible
            if (r1 != 0) goto L_0x0075
        L_0x0072:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T> r0 = r0.next
            goto L_0x0001
        L_0x0075:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "Conflicting/ambiguous property name definitions (implicit name '"
            r12.<init>(r1)
            com.fasterxml.jackson.databind.PropertyName r1 = r9._name
            r12.append(r1)
            java.lang.String r1 = "'): found multiple explicit names: "
            r12.append(r1)
            r12.append(r10)
            java.lang.String r10 = ", but also implicit accessor: "
            r12.append(r10)
            r12.append(r0)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._explode(java.util.Collection, java.util.Map, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked):void");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<? extends com.fasterxml.jackson.databind.introspect.AnnotatedMember>, code=com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked, for r2v0, types: [com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<? extends com.fasterxml.jackson.databind.introspect.AnnotatedMember>, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Set<com.fasterxml.jackson.databind.PropertyName> _findExplicitNames(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.Linked r2, java.util.Set<com.fasterxml.jackson.databind.PropertyName> r3) {
        /*
            r1 = this;
        L_0x0000:
            if (r2 == 0) goto L_0x0019
            boolean r0 = r2.isNameExplicit
            if (r0 == 0) goto L_0x0016
            com.fasterxml.jackson.databind.PropertyName r0 = r2.name
            if (r0 == 0) goto L_0x0016
            if (r3 != 0) goto L_0x0011
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
        L_0x0011:
            com.fasterxml.jackson.databind.PropertyName r0 = r2.name
            r3.add(r0)
        L_0x0016:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T> r2 = r2.next
            goto L_0x0000
        L_0x0019:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._findExplicitNames(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked, java.util.Set):java.util.Set");
    }

    private <T extends AnnotatedMember> AnnotationMap _getAllAnnotations(Linked<T> linked) {
        AnnotationMap allAnnotations = ((AnnotatedMember) linked.value).getAllAnnotations();
        return linked.next != null ? AnnotationMap.merge(allAnnotations, _getAllAnnotations(linked.next)) : allAnnotations;
    }

    private AnnotationMap _mergeAnnotations(int i, Linked<? extends AnnotatedMember>... linkedArr) {
        AnnotationMap _getAllAnnotations = _getAllAnnotations(linkedArr[i]);
        do {
            i++;
            if (i >= linkedArr.length) {
                return _getAllAnnotations;
            }
        } while (linkedArr[i] == null);
        return AnnotationMap.merge(_getAllAnnotations, _mergeAnnotations(i, linkedArr));
    }

    private <T> Linked<T> _removeIgnored(Linked<T> linked) {
        return linked == null ? linked : linked.withoutIgnored();
    }

    private <T> Linked<T> _removeNonVisible(Linked<T> linked) {
        return linked == null ? linked : linked.withoutNonVisible();
    }

    private <T> Linked<T> _trimByVisibility(Linked<T> linked) {
        return linked == null ? linked : linked.trimByVisibility();
    }

    private static <T> Linked<T> merge(Linked<T> linked, Linked<T> linked2) {
        return linked == null ? linked2 : linked2 == null ? linked : linked.append(linked2);
    }

    /* access modifiers changed from: protected */
    public String _findDefaultValue() {
        return (String) fromMemberAnnotations(new WithMember<String>() {
            public String withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDefaultValue(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public String _findDescription() {
        return (String) fromMemberAnnotations(new WithMember<String>() {
            public String withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDescription(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public Integer _findIndex() {
        return (Integer) fromMemberAnnotations(new WithMember<Integer>() {
            public Integer withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyIndex(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public Boolean _findRequired() {
        return (Boolean) fromMemberAnnotations(new WithMember<Boolean>() {
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.hasRequiredMarker(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.PropertyMetadata _getSetterInfo(com.fasterxml.jackson.databind.PropertyMetadata r8) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r7.getPrimaryMember()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r1 = r7.getAccessor()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0076
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r7._annotationIntrospector
            if (r5 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0028
            java.lang.Boolean r5 = r5.findMergeInfo(r0)
            if (r5 == 0) goto L_0x0028
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L_0x0027
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r4 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForPropertyOverride(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withMergeInfo(r4)
        L_0x0027:
            r4 = 0
        L_0x0028:
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r7._annotationIntrospector
            com.fasterxml.jackson.annotation.JsonSetter$Value r0 = r5.findSetterInfo(r0)
            if (r0 == 0) goto L_0x0039
            com.fasterxml.jackson.annotation.Nulls r3 = r0.nonDefaultValueNulls()
            com.fasterxml.jackson.annotation.Nulls r0 = r0.nonDefaultContentNulls()
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            if (r4 != 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
            if (r0 != 0) goto L_0x0077
        L_0x0040:
            java.lang.Class r5 = r7.getRawPrimaryType()
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r6 = r7._config
            com.fasterxml.jackson.databind.cfg.ConfigOverride r5 = r6.getConfigOverride(r5)
            com.fasterxml.jackson.annotation.JsonSetter$Value r6 = r5.getSetterInfo()
            if (r6 == 0) goto L_0x005c
            if (r3 != 0) goto L_0x0056
            com.fasterxml.jackson.annotation.Nulls r3 = r6.nonDefaultValueNulls()
        L_0x0056:
            if (r0 != 0) goto L_0x005c
            com.fasterxml.jackson.annotation.Nulls r0 = r6.nonDefaultContentNulls()
        L_0x005c:
            if (r4 == 0) goto L_0x0077
            if (r1 == 0) goto L_0x0077
            java.lang.Boolean r5 = r5.getMergeable()
            if (r5 == 0) goto L_0x0077
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L_0x0074
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r4 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForTypeOverride(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withMergeInfo(r4)
        L_0x0074:
            r4 = 0
            goto L_0x0077
        L_0x0076:
            r0 = r3
        L_0x0077:
            if (r4 != 0) goto L_0x007d
            if (r3 == 0) goto L_0x007d
            if (r0 != 0) goto L_0x00a9
        L_0x007d:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r7._config
            com.fasterxml.jackson.annotation.JsonSetter$Value r2 = r2.getDefaultSetterInfo()
            if (r3 != 0) goto L_0x0089
            com.fasterxml.jackson.annotation.Nulls r3 = r2.nonDefaultValueNulls()
        L_0x0089:
            if (r0 != 0) goto L_0x008f
            com.fasterxml.jackson.annotation.Nulls r0 = r2.nonDefaultContentNulls()
        L_0x008f:
            if (r4 == 0) goto L_0x00a9
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r7._config
            java.lang.Boolean r2 = r2.getDefaultMergeable()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00a9
            if (r1 == 0) goto L_0x00a9
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r1 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForDefaults(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withMergeInfo(r1)
        L_0x00a9:
            if (r3 != 0) goto L_0x00ad
            if (r0 == 0) goto L_0x00b1
        L_0x00ad:
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withNulls(r3, r0)
        L_0x00b1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._getSetterInfo(com.fasterxml.jackson.databind.PropertyMetadata):com.fasterxml.jackson.databind.PropertyMetadata");
    }

    /* access modifiers changed from: protected */
    public int _getterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public int _setterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        return (!name.startsWith("set") || name.length() <= 3) ? 2 : 1;
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        this._fields = merge(this._fields, pOJOPropertyBuilder._fields);
        this._ctorParameters = merge(this._ctorParameters, pOJOPropertyBuilder._ctorParameters);
        this._getters = merge(this._getters, pOJOPropertyBuilder._getters);
        this._setters = merge(this._setters, pOJOPropertyBuilder._setters);
    }

    public void addCtor(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        Linked linked = new Linked(annotatedParameter, this._ctorParameters, propertyName, z, z2, z3);
        this._ctorParameters = linked;
    }

    public void addField(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        Linked linked = new Linked(annotatedField, this._fields, propertyName, z, z2, z3);
        this._fields = linked;
    }

    public void addGetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        Linked linked = new Linked(annotatedMethod, this._getters, propertyName, z, z2, z3);
        this._getters = linked;
    }

    public void addSetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        Linked linked = new Linked(annotatedMethod, this._setters, propertyName, z, z2, z3);
        this._setters = linked;
    }

    public boolean anyIgnorals() {
        return _anyIgnorals(this._fields) || _anyIgnorals(this._getters) || _anyIgnorals(this._setters) || _anyIgnorals(this._ctorParameters);
    }

    public boolean anyVisible() {
        return _anyVisible(this._fields) || _anyVisible(this._getters) || _anyVisible(this._setters) || _anyVisible(this._ctorParameters);
    }

    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    public boolean couldDeserialize() {
        return (this._ctorParameters == null && this._setters == null && this._fields == null) ? false : true;
    }

    public boolean couldSerialize() {
        return (this._getters == null && this._fields == null) ? false : true;
    }

    public Collection<POJOPropertyBuilder> explode(Collection<PropertyName> collection) {
        HashMap hashMap = new HashMap();
        _explode(collection, hashMap, this._fields);
        _explode(collection, hashMap, this._getters);
        _explode(collection, hashMap, this._setters);
        _explode(collection, hashMap, this._ctorParameters);
        return hashMap.values();
    }

    public Access findAccess() {
        return (Access) fromMemberAnnotationsExcept(new WithMember<Access>() {
            public Access withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyAccess(annotatedMember);
            }
        }, Access.AUTO);
    }

    public Set<PropertyName> findExplicitNames() {
        Set<PropertyName> _findExplicitNames = _findExplicitNames(this._ctorParameters, _findExplicitNames(this._setters, _findExplicitNames(this._getters, _findExplicitNames(this._fields, null))));
        return _findExplicitNames == null ? Collections.emptySet() : _findExplicitNames;
    }

    public Value findInclusion() {
        AnnotatedMember accessor = getAccessor();
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Value findPropertyInclusion = annotationIntrospector == null ? null : annotationIntrospector.findPropertyInclusion(accessor);
        return findPropertyInclusion == null ? Value.empty() : findPropertyInclusion;
    }

    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new WithMember<ObjectIdInfo>() {
            public ObjectIdInfo withMember(AnnotatedMember annotatedMember) {
                ObjectIdInfo findObjectIdInfo = POJOPropertyBuilder.this._annotationIntrospector.findObjectIdInfo(annotatedMember);
                return findObjectIdInfo != null ? POJOPropertyBuilder.this._annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo) : findObjectIdInfo;
            }
        });
    }

    public ReferenceProperty findReferenceType() {
        ReferenceProperty referenceProperty = this._referenceInfo;
        if (referenceProperty != null) {
            if (referenceProperty == NOT_REFEFERENCE_PROP) {
                referenceProperty = null;
            }
            return referenceProperty;
        }
        ReferenceProperty referenceProperty2 = (ReferenceProperty) fromMemberAnnotations(new WithMember<ReferenceProperty>() {
            public ReferenceProperty withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findReferenceType(annotatedMember);
            }
        });
        this._referenceInfo = referenceProperty2 == null ? NOT_REFEFERENCE_PROP : referenceProperty2;
        return referenceProperty2;
    }

    public Class<?>[] findViews() {
        return (Class[]) fromMemberAnnotations(new WithMember<Class<?>[]>() {
            public Class<?>[] withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findViews(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public <T> T fromMemberAnnotations(WithMember<T> withMember) {
        T t = null;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                t = withMember.withMember((AnnotatedMember) linked.value);
            }
        } else {
            Linked<AnnotatedParameter> linked2 = this._ctorParameters;
            if (linked2 != null) {
                t = withMember.withMember((AnnotatedMember) linked2.value);
            }
            if (t == null) {
                Linked<AnnotatedMethod> linked3 = this._setters;
                if (linked3 != null) {
                    t = withMember.withMember((AnnotatedMember) linked3.value);
                }
            }
        }
        if (t != null) {
            return t;
        }
        Linked<AnnotatedField> linked4 = this._fields;
        return linked4 != null ? withMember.withMember((AnnotatedMember) linked4.value) : t;
    }

    /* access modifiers changed from: protected */
    public <T> T fromMemberAnnotationsExcept(WithMember<T> withMember, T t) {
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                T withMember2 = withMember.withMember((AnnotatedMember) linked.value);
                if (!(withMember2 == null || withMember2 == t)) {
                    return withMember2;
                }
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                T withMember3 = withMember.withMember((AnnotatedMember) linked2.value);
                if (!(withMember3 == null || withMember3 == t)) {
                    return withMember3;
                }
            }
            Linked<AnnotatedParameter> linked3 = this._ctorParameters;
            if (linked3 != null) {
                T withMember4 = withMember.withMember((AnnotatedMember) linked3.value);
                if (!(withMember4 == null || withMember4 == t)) {
                    return withMember4;
                }
            }
            Linked<AnnotatedMethod> linked4 = this._setters;
            if (linked4 != null) {
                T withMember5 = withMember.withMember((AnnotatedMember) linked4.value);
                if (withMember5 == null || withMember5 == t) {
                    return null;
                }
                return withMember5;
            }
            return null;
        }
        Linked<AnnotatedParameter> linked5 = this._ctorParameters;
        if (linked5 != null) {
            T withMember6 = withMember.withMember((AnnotatedMember) linked5.value);
            if (!(withMember6 == null || withMember6 == t)) {
                return withMember6;
            }
        }
        Linked<AnnotatedMethod> linked6 = this._setters;
        if (linked6 != null) {
            T withMember7 = withMember.withMember((AnnotatedMember) linked6.value);
            if (!(withMember7 == null || withMember7 == t)) {
                return withMember7;
            }
        }
        Linked<AnnotatedField> linked7 = this._fields;
        if (linked7 != null) {
            T withMember8 = withMember.withMember((AnnotatedMember) linked7.value);
            if (!(withMember8 == null || withMember8 == t)) {
                return withMember8;
            }
        }
        Linked<AnnotatedMethod> linked8 = this._getters;
        if (linked8 != null) {
            T withMember9 = withMember.withMember((AnnotatedMember) linked8.value);
            if (withMember9 == null || withMember9 == t) {
                return null;
            }
            return withMember9;
        }
        return null;
    }

    public AnnotatedParameter getConstructorParameter() {
        Linked linked = this._ctorParameters;
        if (linked == null) {
            return null;
        }
        while (!(((AnnotatedParameter) linked.value).getOwner() instanceof AnnotatedConstructor)) {
            linked = linked.next;
            if (linked == null) {
                return (AnnotatedParameter) this._ctorParameters.value;
            }
        }
        return (AnnotatedParameter) linked.value;
    }

    public Iterator<AnnotatedParameter> getConstructorParameters() {
        Linked<AnnotatedParameter> linked = this._ctorParameters;
        return linked == null ? ClassUtil.emptyIterator() : new MemberIterator(linked);
    }

    public AnnotatedField getField() {
        Linked<AnnotatedField> linked = this._fields;
        if (linked == null) {
            return null;
        }
        AnnotatedField annotatedField = (AnnotatedField) linked.value;
        Linked<T> linked2 = this._fields.next;
        while (linked2 != null) {
            AnnotatedField annotatedField2 = (AnnotatedField) linked2.value;
            Class declaringClass = annotatedField.getDeclaringClass();
            Class declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
                linked2 = linked2.next;
            }
            StringBuilder sb = new StringBuilder("Multiple fields representing property \"");
            sb.append(getName());
            sb.append("\": ");
            sb.append(annotatedField.getFullName());
            sb.append(" vs ");
            sb.append(annotatedField2.getFullName());
            throw new IllegalArgumentException(sb.toString());
        }
        return annotatedField;
    }

    public PropertyName getFullName() {
        return this._name;
    }

    public AnnotatedMethod getGetter() {
        Linked linked = this._getters;
        if (linked == null) {
            return null;
        }
        Linked linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            int _getterPriority = _getterPriority((AnnotatedMethod) linked2.value);
            int _getterPriority2 = _getterPriority((AnnotatedMethod) linked.value);
            if (_getterPriority != _getterPriority2) {
                if (_getterPriority >= _getterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                StringBuilder sb = new StringBuilder("Conflicting getter definitions for property \"");
                sb.append(getName());
                sb.append("\": ");
                sb.append(((AnnotatedMethod) linked.value).getFullName());
                sb.append(" vs ");
                sb.append(((AnnotatedMethod) linked2.value).getFullName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this._getters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    public String getInternalName() {
        return this._internalName.getSimpleName();
    }

    public PropertyMetadata getMetadata() {
        if (this._metadata == null) {
            Boolean _findRequired = _findRequired();
            String _findDescription = _findDescription();
            Integer _findIndex = _findIndex();
            String _findDefaultValue = _findDefaultValue();
            if (_findRequired == null && _findIndex == null && _findDefaultValue == null) {
                PropertyMetadata propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                if (_findDescription != null) {
                    propertyMetadata = propertyMetadata.withDescription(_findDescription);
                }
                this._metadata = propertyMetadata;
            } else {
                this._metadata = PropertyMetadata.construct(_findRequired, _findDescription, _findIndex, _findDefaultValue);
            }
            if (!this._forSerialization) {
                this._metadata = _getSetterInfo(this._metadata);
            }
        }
        return this._metadata;
    }

    public String getName() {
        PropertyName propertyName = this._name;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        AnnotatedMember mutator = getMutator();
        if (mutator == null) {
            mutator = getAccessor();
        }
        return mutator;
    }

    public JavaType getPrimaryType() {
        if (this._forSerialization) {
            AnnotatedMethod getter = getGetter();
            if (getter != null) {
                return getter.getType();
            }
            AnnotatedField field = getField();
            return field == null ? TypeFactory.unknownType() : field.getType();
        }
        AnnotatedMember constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            AnnotatedMethod setter = getSetter();
            if (setter != null) {
                return setter.getParameterType(0);
            }
            constructorParameter = getField();
        }
        if (constructorParameter == null) {
            constructorParameter = getGetter();
            if (constructorParameter == null) {
                return TypeFactory.unknownType();
            }
        }
        return constructorParameter.getType();
    }

    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    public AnnotatedMethod getSetter() {
        Linked linked = this._setters;
        if (linked == null) {
            return null;
        }
        Linked linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) linked2.value;
            AnnotatedMethod annotatedMethod2 = (AnnotatedMethod) linked.value;
            int _setterPriority = _setterPriority(annotatedMethod);
            int _setterPriority2 = _setterPriority(annotatedMethod2);
            if (_setterPriority != _setterPriority2) {
                if (_setterPriority >= _setterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
                if (annotationIntrospector != null) {
                    AnnotatedMethod resolveSetterConflict = annotationIntrospector.resolveSetterConflict(this._config, annotatedMethod2, annotatedMethod);
                    if (resolveSetterConflict == annotatedMethod2) {
                        continue;
                        linked2 = linked2.next;
                    } else {
                        if (resolveSetterConflict != annotatedMethod) {
                        }
                        linked = linked2;
                        linked2 = linked2.next;
                    }
                }
                throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", new Object[]{getName(), ((AnnotatedMethod) linked.value).getFullName(), ((AnnotatedMethod) linked2.value).getFullName()}));
            }
        }
        this._setters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    public PropertyName getWrapperName() {
        AnnotatedMember primaryMember = getPrimaryMember();
        if (primaryMember != null) {
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            if (annotationIntrospector != null) {
                return annotationIntrospector.findWrapperName(primaryMember);
            }
        }
        return null;
    }

    public boolean hasConstructorParameter() {
        return this._ctorParameters != null;
    }

    public boolean hasField() {
        return this._fields != null;
    }

    public boolean hasGetter() {
        return this._getters != null;
    }

    public boolean hasName(PropertyName propertyName) {
        return this._name.equals(propertyName);
    }

    public boolean hasSetter() {
        return this._setters != null;
    }

    public boolean isExplicitlyIncluded() {
        return _anyExplicits(this._fields) || _anyExplicits(this._getters) || _anyExplicits(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    public boolean isExplicitlyNamed() {
        return _anyExplicitNames(this._fields) || _anyExplicitNames(this._getters) || _anyExplicitNames(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new WithMember<Boolean>() {
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.isTypeId(annotatedMember);
            }
        });
        return bool != null && bool.booleanValue();
    }

    public void mergeAnnotations(boolean z) {
        if (z) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                this._getters = _applyAnnotations(this._getters, _mergeAnnotations(0, linked, this._fields, this._ctorParameters, this._setters));
                return;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked2, this._ctorParameters, this._setters));
            }
        } else {
            Linked<AnnotatedParameter> linked3 = this._ctorParameters;
            if (linked3 != null) {
                this._ctorParameters = _applyAnnotations(this._ctorParameters, _mergeAnnotations(0, linked3, this._setters, this._fields, this._getters));
                return;
            }
            Linked<AnnotatedMethod> linked4 = this._setters;
            if (linked4 != null) {
                this._setters = _applyAnnotations(this._setters, _mergeAnnotations(0, linked4, this._fields, this._getters));
                return;
            }
            Linked<AnnotatedField> linked5 = this._fields;
            if (linked5 != null) {
                this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked5, this._getters));
            }
        }
    }

    public void removeConstructors() {
        this._ctorParameters = null;
    }

    public void removeIgnored() {
        this._fields = _removeIgnored(this._fields);
        this._getters = _removeIgnored(this._getters);
        this._setters = _removeIgnored(this._setters);
        this._ctorParameters = _removeIgnored(this._ctorParameters);
    }

    public Access removeNonVisible(boolean z) {
        Access findAccess = findAccess();
        if (findAccess == null) {
            findAccess = Access.AUTO;
        }
        int i = AnonymousClass10.$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[findAccess.ordinal()];
        if (i == 1) {
            this._setters = null;
            this._ctorParameters = null;
            if (!this._forSerialization) {
                this._fields = null;
            }
        } else if (i != 2) {
            if (i != 3) {
                this._getters = _removeNonVisible(this._getters);
                this._ctorParameters = _removeNonVisible(this._ctorParameters);
                if (!z || this._getters == null) {
                    this._fields = _removeNonVisible(this._fields);
                    this._setters = _removeNonVisible(this._setters);
                }
            } else {
                this._getters = null;
                if (this._forSerialization) {
                    this._fields = null;
                }
            }
        }
        return findAccess;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Property '");
        sb.append(this._name);
        sb.append("'; ctors: ");
        sb.append(this._ctorParameters);
        sb.append(", field(s): ");
        sb.append(this._fields);
        sb.append(", getter(s): ");
        sb.append(this._getters);
        sb.append(", setter(s): ");
        sb.append(this._setters);
        sb.append("]");
        return sb.toString();
    }

    public void trimByVisibility() {
        this._fields = _trimByVisibility(this._fields);
        this._getters = _trimByVisibility(this._getters);
        this._setters = _trimByVisibility(this._setters);
        this._ctorParameters = _trimByVisibility(this._ctorParameters);
    }

    public POJOPropertyBuilder withName(PropertyName propertyName) {
        return new POJOPropertyBuilder(this, propertyName);
    }

    public POJOPropertyBuilder withSimpleName(String str) {
        PropertyName withSimpleName = this._name.withSimpleName(str);
        return withSimpleName == this._name ? this : new POJOPropertyBuilder(this, withSimpleName);
    }
}
