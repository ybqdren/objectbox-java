/*
 * Copyright 2021 ObjectBox Ltd. All rights reserved.
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

import java.nio.*;
import java.lang.*;
import java.util.*;
import io.objectbox.flatbuffers.*;

@SuppressWarnings("unused")
public final class ModelEntity extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_8(); }
  public static ModelEntity getRootAsModelEntity(ByteBuffer _bb) { return getRootAsModelEntity(_bb, new ModelEntity()); }
  public static ModelEntity getRootAsModelEntity(ByteBuffer _bb, ModelEntity obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ModelEntity __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public io.objectbox.model.IdUid id() { return id(new io.objectbox.model.IdUid()); }
  public io.objectbox.model.IdUid id(io.objectbox.model.IdUid obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public io.objectbox.model.ModelProperty properties(int j) { return properties(new io.objectbox.model.ModelProperty(), j); }
  public io.objectbox.model.ModelProperty properties(io.objectbox.model.ModelProperty obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int propertiesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public io.objectbox.model.ModelProperty.Vector propertiesVector() { return propertiesVector(new io.objectbox.model.ModelProperty.Vector()); }
  public io.objectbox.model.ModelProperty.Vector propertiesVector(io.objectbox.model.ModelProperty.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public io.objectbox.model.IdUid lastPropertyId() { return lastPropertyId(new io.objectbox.model.IdUid()); }
  public io.objectbox.model.IdUid lastPropertyId(io.objectbox.model.IdUid obj) { int o = __offset(10); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public io.objectbox.model.ModelRelation relations(int j) { return relations(new io.objectbox.model.ModelRelation(), j); }
  public io.objectbox.model.ModelRelation relations(io.objectbox.model.ModelRelation obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int relationsLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public io.objectbox.model.ModelRelation.Vector relationsVector() { return relationsVector(new io.objectbox.model.ModelRelation.Vector()); }
  public io.objectbox.model.ModelRelation.Vector relationsVector(io.objectbox.model.ModelRelation.Vector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  /**
   * Can be language specific, e.g. if no-args constructor should be used
   */
  public long flags() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  /**
   * Secondary name ignored by core; e.g. may reference a binding specific name (e.g. Java class)
   */
  public String nameSecondary() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameSecondaryAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public ByteBuffer nameSecondaryInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 16, 1); }

  public static void startModelEntity(FlatBufferBuilder builder) { builder.startTable(7); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addStruct(0, idOffset, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addProperties(FlatBufferBuilder builder, int propertiesOffset) { builder.addOffset(2, propertiesOffset, 0); }
  public static int createPropertiesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPropertiesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addLastPropertyId(FlatBufferBuilder builder, int lastPropertyIdOffset) { builder.addStruct(3, lastPropertyIdOffset, 0); }
  public static void addRelations(FlatBufferBuilder builder, int relationsOffset) { builder.addOffset(4, relationsOffset, 0); }
  public static int createRelationsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRelationsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFlags(FlatBufferBuilder builder, long flags) { builder.addInt(5, (int) flags, (int) 0L); }
  public static void addNameSecondary(FlatBufferBuilder builder, int nameSecondaryOffset) { builder.addOffset(6, nameSecondaryOffset, 0); }
  public static int endModelEntity(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ModelEntity get(int j) { return get(new ModelEntity(), j); }
    public ModelEntity get(ModelEntity obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

