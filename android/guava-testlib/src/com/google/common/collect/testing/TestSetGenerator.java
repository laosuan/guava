/*
 * Copyright (C) 2007 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.collect.testing;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Creates sets, containing sample elements, to be tested.
 *
 * @author Kevin Bourrillion
 */
@GwtCompatible
@NullMarked
public interface TestSetGenerator<E extends @Nullable Object> extends TestCollectionGenerator<E> {
  @Override
  Set<E> create(Object... elements);
}
