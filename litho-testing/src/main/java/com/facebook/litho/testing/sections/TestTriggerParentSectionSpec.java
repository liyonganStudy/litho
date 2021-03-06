/*
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.testing.sections;

import com.facebook.litho.annotations.Prop;
import com.facebook.litho.sections.Children;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.annotations.GroupSectionSpec;
import com.facebook.litho.sections.annotations.OnCreateChildren;

@GroupSectionSpec
public class TestTriggerParentSectionSpec {

  @OnCreateChildren
  protected static Children onCreateChildren(SectionContext c, @Prop String childKey) {
    return Children.create().child(TestTriggerChildSection.create(c).key(childKey).build()).build();
  }
}
