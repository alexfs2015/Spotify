package com.fasterxml.jackson.datatype.guava;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.datatype.guava.deser.GuavaOptionalDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HashCodeDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HashMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HostAndPortDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableBiMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableListDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedSetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.InternetDomainNameDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.LinkedHashMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.RangeDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.TreeMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.list.ArrayListMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.list.LinkedListMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.set.HashMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.set.LinkedHashMultimapDeserializer;
import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.BiMap;
import com.google.common.collect.BoundType;
import com.google.common.collect.EnumBiMap;
import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.EnumMultiset;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Range;
import com.google.common.collect.TreeMultimap;
import com.google.common.collect.TreeMultiset;
import com.google.common.hash.HashCode;
import com.google.common.net.HostAndPort;
import java.io.Serializable;

public class GuavaDeserializers extends Base implements Serializable {
    static final long serialVersionUID = 1;
    protected BoundType _defaultBoundType;

    public GuavaDeserializers() {
        this(null);
    }

    public GuavaDeserializers(BoundType boundType) {
        this._defaultBoundType = boundType;
    }

    public JsonDeserializer<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        Class rawClass = collectionType.getRawClass();
        if (ImmutableCollection.class.isAssignableFrom(rawClass)) {
            if (ImmutableList.class.isAssignableFrom(rawClass)) {
                return new ImmutableListDeserializer(collectionType, typeDeserializer, jsonDeserializer);
            }
            if (ImmutableMultiset.class.isAssignableFrom(rawClass)) {
                if (!ImmutableSortedMultiset.class.isAssignableFrom(rawClass)) {
                    return new ImmutableMultisetDeserializer(collectionType, typeDeserializer, jsonDeserializer);
                }
                requireCollectionOfComparableElements(collectionType, "ImmutableSortedMultiset");
                return new ImmutableSortedMultisetDeserializer(collectionType, typeDeserializer, jsonDeserializer);
            } else if (!ImmutableSet.class.isAssignableFrom(rawClass)) {
                return new ImmutableListDeserializer(collectionType, typeDeserializer, jsonDeserializer);
            } else {
                if (!ImmutableSortedSet.class.isAssignableFrom(rawClass)) {
                    return new ImmutableSetDeserializer(collectionType, typeDeserializer, jsonDeserializer);
                }
                requireCollectionOfComparableElements(collectionType, "ImmutableSortedSet");
                return new ImmutableSortedSetDeserializer(collectionType, typeDeserializer, jsonDeserializer);
            }
        } else if (!fcp.class.isAssignableFrom(rawClass)) {
            return null;
        } else {
            if (fcz.class.isAssignableFrom(rawClass)) {
                if (TreeMultiset.class.isAssignableFrom(rawClass)) {
                    return new TreeMultisetDeserializer(collectionType, typeDeserializer, jsonDeserializer);
                }
                return new TreeMultisetDeserializer(collectionType, typeDeserializer, jsonDeserializer);
            } else if (LinkedHashMultiset.class.isAssignableFrom(rawClass)) {
                return new LinkedHashMultisetDeserializer(collectionType, typeDeserializer, jsonDeserializer);
            } else {
                if (HashMultiset.class.isAssignableFrom(rawClass)) {
                    return new HashMultisetDeserializer(collectionType, typeDeserializer, jsonDeserializer);
                }
                EnumMultiset.class.isAssignableFrom(rawClass);
                return new HashMultisetDeserializer(collectionType, typeDeserializer, jsonDeserializer);
            }
        }
    }

    private void requireCollectionOfComparableElements(CollectionType collectionType, String str) {
        Class rawClass = collectionType.getContentType().getRawClass();
        if (!Comparable.class.isAssignableFrom(rawClass)) {
            StringBuilder sb = new StringBuilder("Can not handle ");
            sb.append(str);
            sb.append(" with elements that are not Comparable<?> (");
            sb.append(rawClass.getName());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public JsonDeserializer<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        Class rawClass = mapType.getRawClass();
        if (!ImmutableMap.class.isAssignableFrom(rawClass)) {
            if (BiMap.class.isAssignableFrom(rawClass)) {
                EnumBiMap.class.isAssignableFrom(rawClass);
                EnumHashBiMap.class.isAssignableFrom(rawClass);
                HashBiMap.class.isAssignableFrom(rawClass);
            }
            return null;
        } else if (ImmutableSortedMap.class.isAssignableFrom(rawClass)) {
            return new ImmutableSortedMapDeserializer(mapType, keyDeserializer, typeDeserializer, jsonDeserializer);
        } else {
            if (ImmutableBiMap.class.isAssignableFrom(rawClass)) {
                return new ImmutableBiMapDeserializer(mapType, keyDeserializer, typeDeserializer, jsonDeserializer);
            }
            return new ImmutableMapDeserializer(mapType, keyDeserializer, typeDeserializer, jsonDeserializer);
        }
    }

    public JsonDeserializer<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        Class rawClass = mapLikeType.getRawClass();
        if (fcm.class.isAssignableFrom(rawClass)) {
            ImmutableListMultimap.class.isAssignableFrom(rawClass);
            if (ArrayListMultimap.class.isAssignableFrom(rawClass)) {
                return new ArrayListMultimapDeserializer(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer);
            }
            if (LinkedListMultimap.class.isAssignableFrom(rawClass)) {
                return new LinkedListMultimapDeserializer(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer);
            }
            fbz.class.isAssignableFrom(rawClass);
            return new ArrayListMultimapDeserializer(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer);
        } else if (fcw.class.isAssignableFrom(rawClass)) {
            if (fdc.class.isAssignableFrom(rawClass)) {
                TreeMultimap.class.isAssignableFrom(rawClass);
                fcj.class.isAssignableFrom(rawClass);
            }
            if (ImmutableSetMultimap.class.isAssignableFrom(rawClass)) {
                return new LinkedHashMultimapDeserializer(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer);
            }
            if (HashMultimap.class.isAssignableFrom(rawClass)) {
                return new HashMultimapDeserializer(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer);
            }
            if (LinkedHashMultimap.class.isAssignableFrom(rawClass)) {
                return new LinkedHashMultimapDeserializer(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer);
            }
            fch.class.isAssignableFrom(rawClass);
            return new HashMultimapDeserializer(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer);
        } else if (fcn.class.isAssignableFrom(rawClass)) {
            return new LinkedListMultimapDeserializer(mapLikeType, keyDeserializer, typeDeserializer, jsonDeserializer);
        } else {
            fdd.class.isAssignableFrom(rawClass);
            return null;
        }
    }

    public JsonDeserializer<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        if (referenceType.hasRawClass(Optional.class)) {
            return new GuavaOptionalDeserializer(referenceType, null, typeDeserializer, jsonDeserializer);
        }
        return null;
    }

    public JsonDeserializer<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        if (javaType.hasRawClass(Range.class)) {
            return new RangeDeserializer(this._defaultBoundType, javaType);
        }
        if (javaType.hasRawClass(HostAndPort.class)) {
            return HostAndPortDeserializer.std;
        }
        if (javaType.hasRawClass(fdy.class)) {
            return InternetDomainNameDeserializer.std;
        }
        if (javaType.hasRawClass(HashCode.class)) {
            return HashCodeDeserializer.std;
        }
        return null;
    }
}
