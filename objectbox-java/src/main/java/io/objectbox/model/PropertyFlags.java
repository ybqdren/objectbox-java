/*
 * Copyright 2022 ObjectBox Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// automatically generated by the FlatBuffers compiler, do not modify

package io.objectbox.model;

/**
 * Bit-flags defining the behavior of properties.
 * Note: Numbers indicate the bit position
 */
@SuppressWarnings("unused")
public final class PropertyFlags {
  private PropertyFlags() { }
  /**
   * 64 bit long property (internally unsigned) representing the ID of the entity.
   * May be combined with: NON_PRIMITIVE_TYPE, ID_MONOTONIC_SEQUENCE, ID_SELF_ASSIGNABLE.
   */
  public static final int ID = 1;
  /**
   * On languages like Java, a non-primitive type is used (aka wrapper types, allowing null)
   */
  public static final int NON_PRIMITIVE_TYPE = 2;
  /**
   * Unused yet
   */
  public static final int NOT_NULL = 4;
  public static final int INDEXED = 8;
  /**
   * Unused yet
   */
  public static final int RESERVED = 16;
  /**
   * Unique index
   */
  public static final int UNIQUE = 32;
  /**
   * Unused yet: Use a persisted sequence to enforce ID to rise monotonic (no ID reuse)
   */
  public static final int ID_MONOTONIC_SEQUENCE = 64;
  /**
   * Allow IDs to be assigned by the developer
   */
  public static final int ID_SELF_ASSIGNABLE = 128;
  /**
   * Unused yet
   */
  public static final int INDEX_PARTIAL_SKIP_NULL = 256;
  /**
   * Unused yet in user land.
   * Used internally by relations for 1) backlinks and 2) to clear references to deleted objects (required for ID reuse).
   */
  public static final int INDEX_PARTIAL_SKIP_ZERO = 512;
  /**
   * Virtual properties may not have a dedicated field in their entity class, e.g. target IDs of to-one relations
   */
  public static final int VIRTUAL = 1024;
  /**
   * Index uses a 32 bit hash instead of the value. 32 bit is the default hash size because:
   * they take less disk space, run well on 32 bit systems, and also run quite well on 64 bit systems
   * (especially for small to medium sized values).
   * and should be OK even with a few collisions.
   */
  public static final int INDEX_HASH = 2048;
  /**
   * Index uses a 64 bit hash instead of the value.
   * Recommended mostly for 64 bit machines with values longer than 200 bytes;
   * small values are faster with a 32 bit hash even on 64 bit machines.
   */
  public static final int INDEX_HASH64 = 4096;
  /**
   * Unused yet: While our default are signed ints, queries and indexes need do know signing info.
   * Note: Don't combine with ID (IDs are always unsigned internally).
   */
  public static final int UNSIGNED = 8192;
  /**
   * By defining an ID companion property, a special ID encoding scheme is activated involving this property.
   *
   * For Time Series IDs, a companion property of type Date or DateNano represents the exact timestamp.
   * (In the future, ID companion string properties may be added as another supported type).
   */
  public static final int ID_COMPANION = 16384;
  /**
   * Unique on-conflict strategy: the object being put replaces any existing conflicting object (deletes it).
   */
  public static final int UNIQUE_ON_CONFLICT_REPLACE = 32768;
  /**
   * If a date property has this flag (max. one per entity type), the date value specifies the time by which
   * the object expires, at which point it MAY be deleted. There's no strict guarantee when the deletion happens.
   * However, the deletion process can be triggered by an API call.
   */
  public static final int EXPIRATION_TIME = 65536;
}

